/**
 * Class: PoliticalPartyControl
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

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.PartidoDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;
import br.com.MDSGPP.ChamadaParlamentar.util.LimparLista;

public final class PartidoControl {
	
	private final static int zero = 0;
	private final static int um = 1;
	/**
	 * Method that bridges the gap between the Dao and Model about the parties.
	 * 
	 * @return lista, is the object of the model Partidos.
	 * @throws ClassNotFoundException
	 *             if the database is off.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 */
	public static ArrayList<ArrayList<String>> passarListaPartidos()
			throws ClassNotFoundException, SQLException {
		ArrayList<ArrayList<String>> lista = new PartidoDao().pegarPartidos();
		return lista;
	}

	/**
	 * Method that check if the partie exists.
	 * 
	 * @param partido
	 * @throws ClassNotFoundException
	 *             if the database is off.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 * @return 'listaComDados' with the data of the party.
	 */
	public static ArrayList<String> verificaExistencia(String partido)
			throws ClassNotFoundException, SQLException {

		ArrayList<ArrayList<String>> listaComDados = passarListaPartidos();

		for (int i = zero; i < listaComDados.size(); i++) {
			if (listaComDados.get(i).get(zero).equalsIgnoreCase(partido)
					|| listaComDados.get(i).get(um).equalsIgnoreCase(partido)) {
				return listaComDados.get(i);
			}
		}
		return null;
	}

	/**
	 * Method that show the deputies of a party.
	 * 
	 * @param nomePartido
	 * @throws ClassNotFoundException
	 *             if the database is off.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 * @return 'partido' with the deputies of a party.
	 */
	public static Partidos passarPartido(String nomePartido)
			throws ClassNotFoundException, SQLException {
		Partidos partido = new Partidos();
		partido.setDeputadosDoPartido(null);

		ArrayList<String> nomePartidoCerto = verificaExistencia(nomePartido);

		ArrayList<Deputados> todosDeputados = new DeputadoDao().getDeputados();
		ArrayList<Deputados> deputadosDoPartido = new ArrayList<Deputados>();

		if (nomePartidoCerto != null) {
			for (int i = zero; i < todosDeputados.size(); i++) {
				if (nomePartidoCerto.get(zero).equalsIgnoreCase(
						todosDeputados.get(i).getPartido())) {
					deputadosDoPartido.add(todosDeputados.get(i));
				}
			}

			partido.setSigla(nomePartidoCerto.get(zero));
			partido.setNomePartido(nomePartidoCerto.get(um));
			partido.setDeputadosDoPartido(deputadosDoPartido);
		}

		return partido;
	}

	/**
	 * Method that show the parties statistics according with number of the
	 * deputies.
	 * 
	 * @param nome
	 *            .
	 * @throws ClassNotFoundException
	 *             if the database is off.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 * @throws ListaVaziaException
	 *             if ArrayList is empty.
	 * @return 'partido' with the statistics of the parties.
	 */
	public static Partidos gerarEstatisticaDoPartido(String nome)
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		Partidos partido = passarPartido(nome);

		ArrayList<Estatistica> estatisticas = new ArrayList<Estatistica>();

		try {
			for (int i = zero; i < partido.getDeputadosDoPartido().size(); i++) {
				Estatistica estatistica = new Estatistica();
				try {
					estatistica = EstatisticaControl
							.gerarEstatisticas(EstatisticaControl
									.arrumarNomePesquisa(partido
											.getDeputadosDoPartido().get(i)));
				} catch (ListaVaziaException e) {
					estatistica.setNome(EstatisticaControl
							.arrumarNomePesquisa(partido
									.getDeputadosDoPartido().get(i)));
				}
				estatisticas.add(estatistica);
			}
		} catch (NullPointerException e) {
			throw new ListaVaziaException();
		}

		partido.setEstatisticaDosDeputados(estatisticas);

		return partido;
	}

	/**
	 * Method that show the deputies of parties and their especifications.
	 * 
	 * @param nome
	 * @throws ClassNotFoundException
	 *             if the database is off.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 * @throws ListaVaziaException
	 *             if ArrayList is empty.
	 * @return 'partido' with the deputies of parties and their especifications.
	 */
	public static Partidos passarPartidoComDadosCompletos(String nome)
			throws ClassNotFoundException, SQLException, ListaVaziaException {

		Partidos partido;
		partido = gerarEstatisticaDoPartido(nome);

		ArrayList<ArrayList<Estatistica>> listaRecebida = LimparLista
				.limparLista(partido.getEstatisticaDosDeputados());

		partido.setEstatisticaDosDeputados(listaRecebida.get(zero));
		partido.setDeputadosSemDados(listaRecebida.get(um));

		return partido;
	}

}
