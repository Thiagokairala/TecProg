/**
 * Class: PoliticalPartyDao
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
 * This class is to connect the system with the table party of the database. 
 */
package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class PartidoDao extends ConnectionFactory {

	private final int UM = 1;
	private final int DOIS = 2;

	public PartidoDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	/**
	 * Method that adds the parties at the table party.
	 * 
	 * @param lista
	 *            is an ArrayList containing the political parties.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 */
	public void adicionarPartidoNaTable(ArrayList<Partidos> lista)
			throws SQLException {
		String sql = "insert into partido(sigla, nomePartido)values(?, ?)";

		PreparedStatement stmt = getConexao().prepareStatement(sql);

		for (int i = 0; i < lista.size(); i++) {
			stmt.setString(UM, lista.get(i).getSigla());
			stmt.setString(DOIS, lista.get(i).getNomePartido());

			stmt.execute();
		}

		stmt.close();
	}

	/**
	 * Method that search the parties at the table party.
	 * 
	 * @return an ArrayList containing the political party.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 */
	public ArrayList<ArrayList<String>> pegarPartidos() throws SQLException {

		ArrayList<ArrayList<String>> listaPassar = new ArrayList<ArrayList<String>>();

		String sql = "Select * from partido";

		PreparedStatement stmt = getConexao().prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			ArrayList<String> adicionar = new ArrayList<String>();
			adicionar.add(rs.getString("sigla"));
			adicionar.add(rs.getString("nomePartido"));
			listaPassar.add(adicionar);
		}

		return listaPassar;
	}

}
