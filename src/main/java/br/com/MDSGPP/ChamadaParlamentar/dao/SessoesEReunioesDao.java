/**
 * Class: SessionsAndMeetingsDao
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class is supposed to gather data from the database and return it to the system.
 * 
 */
package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class SessoesEReunioesDao extends ConnectionFactory {

	/**
	 * Constructor to the class, it only initializate the connection with the
	 * database.
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public SessoesEReunioesDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	/**
	 * Method to insert the database table all the meetings and their respective
	 * dates.
	 * 
	 * @param insert
	 *            {@link ArrayList} of {@link String} including the sessions and
	 *            dates, first session and then its date, exemple, 0 is the
	 *            session, 1 is it respective date.
	 * @throws SQLException
	 * @throws MalformedURLException
	 * @throws ServiceException
	 */
	public void adcionarDataNaTable(ArrayList<String> insert)
			throws SQLException, MalformedURLException, ServiceException {

		for (int i = 0; i < insert.size(); i = i + 2) {
			String sql = "insert into datas(datas, sessao) values(?, ?)";

			PreparedStatement stmt;

			stmt = getConexao().prepareStatement(sql);
			stmt.setString(1, insert.get(i));
			stmt.setString(2, insert.get(i + 1));

			stmt.execute();
			stmt.close();
		}
	}

	/**
	 * Method to include the deputies that were present on all the sessions.
	 * 
	 * @param insert
	 *            {@link ArrayList} of {@link String}, containing the id of the
	 *            session and the name of deputy, example, if 0 is id, 1 is
	 *            name, and so it goes on.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws MalformedURLException
	 * @throws ServiceException
	 */
	public void adcionarSessaoNaTable(ArrayList<String> insert)
			throws SQLException, ClassNotFoundException, MalformedURLException,
			ServiceException {

		String sql = "insert into sessao(idSessoes, deputadoPresente)values(?,?)";
		PreparedStatement stmt = getConexao().prepareStatement(sql);

		for (int i = 0; i < insert.size(); i = i + 2) {
			stmt.setString(1, insert.get(i));
			stmt.setString(2, insert.get(i + 1));

			stmt.execute();
		}
		stmt.close();
	}

	/**
	 * Method to gather the number of sessions that are stored in the database.
	 * 
	 * @return returns the total number of sessions.
	 * @throws SQLException
	 */
	public int passarNumeroDeSessoes() throws SQLException {
		String sql = "select * from datas";

		PreparedStatement stmt = ConnectionFactory.getConexao()
				.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		int i = 0;

		while (rs.next()) {
			i++;
		}

		rs.close();
		return i;
	}

	/**
	 * Method to return all the sessions to the system.
	 * 
	 * @return returns an {@link ArrayList} of {@link SessoesEReunioes}.
	 * @throws SQLException
	 * @throws DataFormatoErradoException
	 */
	public ArrayList<SessoesEReunioes> pegarSessoes() throws SQLException,
			DataFormatoErradoException {
		String sql = "Select * from datas";

		PreparedStatement stmt = ConnectionFactory.getConexao()
				.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		ArrayList<SessoesEReunioes> lista = new ArrayList<SessoesEReunioes>();

		while (rs.next()) {
			SessoesEReunioes sessao = new SessoesEReunioes();
			sessao.setData(rs.getString("datas"));
			lista.add(sessao);
		}

		return lista;
	}

	/**
	 * Method to find sessions by the description of it.
	 * 
	 * @param descricao
	 *            String, the description of the session to look up at the
	 *            dataBase.
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<String> procurarSessao(String descricao)
			throws SQLException {
		String sql = "select * from sessao where idSessoes LIKE ?";

		PreparedStatement stmt = ConnectionFactory.getConexao()
				.prepareStatement(sql);

		stmt.setString(1, descricao);
		ResultSet rs = stmt.executeQuery();

		ArrayList<String> lista = new ArrayList<String>();

		while (rs.next()) {
			lista.add(rs.getString("deputadoPresente"));
		}

		rs.close();
		return lista;
	}

	/**
	 * Method to return all the sessions that happened on an specific day.
	 * 
	 * @param data
	 *            String, contains the date.
	 * @return Return an Day object.
	 * @throws SQLException
	 */
	public Dia procuraDia(String data) throws SQLException {
		Dia dia = new Dia();
		String sql = "select * from datas where datas LIKE ?";

		PreparedStatement stmt = getConexao().prepareStatement(sql);
		stmt.setString(1, data);
		ResultSet rs = stmt.executeQuery();
		ArrayList<SessoesEReunioes> lista = new ArrayList<SessoesEReunioes>();

		while (rs.next()) {
			SessoesEReunioes sessoes = new SessoesEReunioes();
			sessoes.setDescricao(rs.getString("sessao"));
			sessoes.setDescricaoCompleta(sessoes.getDescricao());
			lista.add(sessoes);
		}

		dia.setListaSessoes(lista);
		rs.close();
		return dia;
	}
}
