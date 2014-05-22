/**
 * Class: DayControl
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

import br.com.MDSGPP.ChamadaParlamentar.dao.DiaDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public final class DiaControl {

	/**
	 * This method is going to get all the sessions that happened.
	 * 
	 * @return returns an {@link ArrayList} of {@link Dia} containing the
	 *         sessions by chronological order.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DataFormatoErradoException
	 */
	public static ArrayList<Dia> getDias() throws ClassNotFoundException,
			SQLException, DataFormatoErradoException {
		ArrayList<Dia> lista;
		DiaDao diaDao = new DiaDao();

		lista = diaDao.buscarTodasDescricoes();

		ArrayList<Dia> listaInverter = new ArrayList<Dia>();

		for (int i = 0; i < lista.size(); i++) {
			listaInverter.add(lista.get(lista.size() - 1 - i));
		}

		return listaInverter;
	}

	/**
	 * This method is supposed to give the right list for each page.
	 * 
	 * @param pagina
	 *            Integer, the index of the page the user is in.
	 * @param datasPorPagina
	 *            Integer, how many dates in each page.
	 * @param dia
	 *            {@link ArrayList} of {@link Dia} containing all the sessions.
	 * @return returns an {@link ArrayList} of {@link Dia} containing the number
	 *         of sessions that are supposed to be in each page.
	 */
	public static ArrayList<Dia> getListaCerta(int pagina, int datasPorPagina,
			ArrayList<Dia> dia) {
		ArrayList<Dia> listaPassar = new ArrayList<Dia>();

		for (int i = 0; i < datasPorPagina; i++) {
			if (pagina == 0) {
				listaPassar.add(dia.get(i));
			} else {
				if (i + (pagina * datasPorPagina) < dia.size()) {
					listaPassar.add(dia.get(i + (pagina * datasPorPagina)));
				}
			}
		}

		return listaPassar;
	}

	/**
	 * This method is to take all the sessions that happened on one specific
	 * day.
	 * 
	 * @param data
	 *            String, containing the date to search.
	 * @return returns the a {@link Dia} object containing all sessions on that
	 *         day.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DataFormatoErradoException
	 * @throws ListaVaziaException
	 */
	public static Dia passarData(String data) throws ClassNotFoundException,
			SQLException, DataFormatoErradoException, ListaVaziaException {

		Dia dia = null;
		dia = new SessoesEReunioesDao().procuraDia(data);
		dia.setData(data);

		if (dia.getListaSessoes().size() == 0) {
			throw new ListaVaziaException();
		}

		return dia;
	}
}
