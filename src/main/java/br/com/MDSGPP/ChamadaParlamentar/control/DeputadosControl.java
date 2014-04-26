/**
 * Class: DeputyControl
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @author Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
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
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public final class DeputadosControl {

	/**
	 * Method creates a .
	 * 
	 * @return the name of the deputies.
	 * @throws ClassNotFoundException. if the database is off.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 */
	public static ArrayList<String> getDeputados()
			throws ClassNotFoundException, SQLException {

		DeputadoDao deputado;
		deputado = new DeputadoDao();

		return deputado.getNomesDeputados();
	}

	/**
	 * Method that check if deputies exists.
	 * 
	 * @param nome
	 *            is the name of deputies.
	 * @return a list of deputies
	 * @throws ClassNotFoundException. if the database is off.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 */
	public static Deputados verificaExistencia(String nome)
			throws ClassNotFoundException, SQLException {
		Deputados deputado = null;

		DeputadoDao deputadoDao = new DeputadoDao();
		ArrayList<Deputados> lista = deputadoDao.getDeputados();

		for (int i = 0; i < lista.size(); i++) {
			if ((lista.get(i).getNomeCivilDoParlamentar()
					.equalsIgnoreCase(nome))
					|| lista.get(i).getNomeDeTratamentoDoParlamentar()
							.equalsIgnoreCase(nome)) {

				deputado = lista.get(i);
			}
		}

		return deputado;
	}
}
