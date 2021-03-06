/**
 * Class: CleanList
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @author Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
 * Date: march 26 2014.
 * 
 * This class is the based to wipe the deputies that have no data of how many
 * sessions have attended to. 
 */
package br.com.MDSGPP.ChamadaParlamentar.util;

import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public final class LimparLista {

	/**
	 * This method is supposed to separate the deputies that have no data from
	 * the ones who does.
	 * 
	 * @param lista
	 *            {@link ArrayList} of {@link Estatistica}, this parameter is
	 *            the list with all the statistics of the deputies, having data
	 *            or not.
	 * @return This method returns an {@link ArrayList} of {@link ArrayList} of
	 *         {@link Estatistica}, the first dimension of it, is an
	 *         {@link ArrayList} with the deputies that have data, the second is
	 *         the deputies that has no data due to corrupted data or any other
	 *         reason.
	 */
	public static ArrayList<ArrayList<Estatistica>> limparLista(
			ArrayList<Estatistica> lista) {
		ArrayList<ArrayList<Estatistica>> passar = new ArrayList<ArrayList<Estatistica>>();
		ArrayList<Estatistica> removidos = new ArrayList<Estatistica>();
		for (int i = 0; i < lista.size(); i++) {
			i = anlyseOneItem(lista, passar, removidos, i);

		}
		passar.add(lista);
		passar.add(removidos);
		return passar;
	}

	/**
	 * This method analyze to see if one item must go to removed or to the list.
	 * 
	 * @param lista
	 *            it is the list with all the statistics.
	 * @param passar
	 *            it is the list of the ones that are ok.
	 * @param removidos
	 *            it is the list of the ones that has no data.
	 * @param i
	 *            it is the place where to search the statistic.
	 * @return returns the i to control where it is.
	 */
	private static int anlyseOneItem(ArrayList<Estatistica> lista,
			ArrayList<ArrayList<Estatistica>> passar,
			ArrayList<Estatistica> removidos, int i) {
		try {
			Integer.parseInt(lista.get(i).getNumeroSessao());
		} catch (NumberFormatException e) {
			removidos.add(lista.get(i));
			lista.remove(i);
			i--;
		}
		return i;

	}
}
