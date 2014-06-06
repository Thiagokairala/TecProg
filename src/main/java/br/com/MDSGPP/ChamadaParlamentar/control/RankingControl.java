/**
 * Class: RankingControl
 * 
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Class to interact with DAO and view and process the data to provide the functionalities of the system. 
 */
package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.RankingDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaRankingException;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;
import br.com.MDSGPP.ChamadaParlamentar.util.LimparLista;

public final class RankingControl {
	private static final int TAMANHO_RANKINGS = 5;

	/**
	 * This method is to generate the ranking.
	 * 
	 * @param lista
	 *            {@link ArrayList} of {@link Estatistica}, is the list of the
	 *            statistics of all the deputies, having data or not.
	 * @return returns the ranking.
	 * @throws ListaRankingException
	 */
	public static Ranking gerarRanking(ArrayList<Estatistica> lista)
			throws ListaRankingException {
		final int empty = 0;

		Ranking ranking = new Ranking();
		try {
			ArrayList<ArrayList<Estatistica>> recebido = LimparLista
					.limparLista(lista);
			ArrayList<Estatistica> removidos = recebido.get(1);
			ArrayList<Estatistica> melhores = new ArrayList<Estatistica>();
			ArrayList<Estatistica> piores = new ArrayList<Estatistica>();

			ArrayList<Estatistica> listaRecebida = recebido.get(0);

			if (listaRecebida.size() == empty) {
				throw new ListaRankingException();
			}
			ArrayList<Estatistica> listaOrdenada = ordenacao(listaRecebida);

			final int lastPosition = lista.size() - 1;

			for (int i = 0; i < TAMANHO_RANKINGS; i++) {
				melhores.add(lista.get(i));
				piores.add(lista.get(lastPosition - i));
			}

			ranking.setMelhores(melhores);
			ranking.setPiores(piores);
			ranking.setLista(listaOrdenada);
			ranking.setRemovidos(removidos);

		} catch (NullPointerException e) {
			throw new ListaRankingException();
		}

		return ranking;
	}

	/**
	 * This method is to get an {@link ArrayList} of {@link Deputados} and
	 * calculate the statistics to all of then, if there is no data, it marks
	 * it.
	 * 
	 * @param lista
	 *            {@link ArrayList} of {@link Deputados} its the list with all
	 *            the deputies.
	 * @return returns an {@link ArrayList} of {@link Estatistica} from de
	 *         calculations.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws ListaRankingException
	 * @throws ListaVaziaException
	 */
	public static ArrayList<Estatistica> gerarListaEstatistica(
			ArrayList<Deputados> lista) throws ClassNotFoundException,
			SQLException, ListaRankingException, ListaVaziaException {

		final int firstElement = 0;
		try {
			ArrayList<Estatistica> devolver = new ArrayList<Estatistica>();
			String nome = EstatisticaControl.arrumarNomePesquisa(lista
					.get(firstElement));

			devolver.add(EstatisticaControl.gerarEstatisticas(nome));

			int totalSessao = Integer.parseInt(devolver.get(firstElement)
					.getTotalSessao());

			for (int i = 0; i < lista.size(); i++) {
				nome = EstatisticaControl.arrumarNomePesquisa(lista.get(i));

				try {
					devolver.add(EstatisticaControl.gerarEstatisticas(nome,
							totalSessao));
				} catch (ListaVaziaException e) {
					Estatistica estatistica = new Estatistica();
					estatistica.setNome(nome);
					devolver.add(estatistica);
				}
			}
			return devolver;
		} catch (IndexOutOfBoundsException e) {
			throw new ListaRankingException();
		}
	}

	/**
	 * This method generates the ranking top 5, taking the best and the worst.
	 * 
	 * @return returns an {@link Ranking} with the 5 top and 5 worst.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Ranking passarRankingTop5() throws ClassNotFoundException,
			SQLException {
		final int sizeOfRanking = 5;
		RankingDao rankingDao = new RankingDao();
		Ranking ranking = rankingDao.retornaRanking();
		ArrayList<Estatistica> melhores = new ArrayList<Estatistica>();
		ArrayList<Estatistica> piores = new ArrayList<Estatistica>();

		ranking.setLista(ordenacao(ranking.getLista()));

		final int lastPosition = ranking.getLista().size() - 1;

		for (int i = 0; i < sizeOfRanking; i++) {
			melhores.add(ranking.getLista().get(i));
			piores.add(ranking.getLista().get(lastPosition - i));
		}
		ranking.setMelhores(melhores);
		ranking.setPiores(piores);
		return ranking;
	}

	/**
	 * This method is suposed to sort the ranking, we are using here
	 * <b>insertion sort</b>.
	 * 
	 * @param lista
	 *            {@link ArrayList} of {@link Estatistica}, unsorted list.
	 * @return returns an {@link ArrayList} of {@link Estatistica} with the
	 *         sorted list.
	 */
	public static ArrayList<Estatistica> ordenacao(ArrayList<Estatistica> lista) {

		if (lista.size() > 1) {
			int size = lista.size();

			ArrayList<Estatistica> left = new ArrayList<Estatistica>();
			ArrayList<Estatistica> right = new ArrayList<Estatistica>();

			for (int i = 0; i < size / 2; i++) {
				left.add(lista.get(i));
			}

			for (int i = size / 2; i < size; i++) {
				right.add(lista.get(i));
			}

			left = ordenacao(left);
			right = ordenacao(right);

			ArrayList<Estatistica> returnList = merge(left, right);
			return returnList;
		} else {
			return lista;
		}
	}

	public static ArrayList<Estatistica> merge(ArrayList<Estatistica> left,
			ArrayList<Estatistica> right) {

		if (left.isEmpty()) {
			return right;
		} else {
			if (right.isEmpty()) {
				return left;
			} else {
				int contFirstArray = 0;
				int contSecondArray = 0;
				ArrayList<Estatistica> arrayToReturn = new ArrayList<Estatistica>();

				int total = left.size() + right.size();

				for (int i = 0; i < total; i++) {
					if (contFirstArray == left.size()) {
						arrayToReturn = dumpRestOfTheList(arrayToReturn, right,
								contSecondArray, i, total);

						return arrayToReturn;
					} else {
						if (contSecondArray == right.size()) {
							arrayToReturn = dumpRestOfTheList(arrayToReturn,
									left, contFirstArray, i, total);

							return arrayToReturn;

						} else {
							if (isRight(left, right, contFirstArray,
									contSecondArray)) {
								arrayToReturn.add(left.get(contFirstArray));
								contFirstArray++;
							} else {
								arrayToReturn.add(right.get(contSecondArray));
								contSecondArray++;
							}
						}
					}

				}

				return arrayToReturn;
			}
		}

	}

	private static ArrayList<Estatistica> dumpRestOfTheList(
			ArrayList<Estatistica> arrayToReturn, ArrayList<Estatistica> right,
			int contSecondArray, int i, int total) {
		for (int j = i; j < total; j++) {
			arrayToReturn.add(right.get(contSecondArray));

			contSecondArray++;
		}
		return arrayToReturn;
	}

	private static boolean isRight(ArrayList<Estatistica> left,
			ArrayList<Estatistica> right, int contFirstArray,
			int contSecondArray) {
		int first = Integer
				.parseInt(left.get(contFirstArray).getNumeroSessao());

		int second = Integer.parseInt(right.get(contSecondArray)
				.getNumeroSessao());

		if (first < second) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * This method generates the full ranking.
	 * 
	 * @return returns a {@link Ranking} object having all the deputies.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Ranking passarRankingCompleto() throws SQLException,
			ClassNotFoundException {
		RankingDao rankingDao = new RankingDao();
		Ranking ranking = rankingDao.retornaRanking();

		ArrayList<Estatistica> listaOrdenada = ordenacao(ranking.getLista());
		ranking.setLista(listaOrdenada);

		return ranking;
	}
}