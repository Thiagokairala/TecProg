/**
 * Class: DeputyDao
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class is to gather information from the table deputy of the database and
 * treat it to return to the system.
 */
package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class DeputadoDao extends ConnectionFactory {

	private static final int UM = 1;
	private static final int DOIS = 2;
	private static final int TRES = 3;
	private static final int QUATRO = 4;
	private static final int CINCO = 5;
	private static final int SEIS = 6;
	private static final int SETE = 7;
	private static final int OITO = 8;
	private static final int NOVE = 9;
	private static final int DEZ = 10;
	private static final int ONZE = 11;
	private static final int DOZE = 12;

	/**
	 * This is the constructor, it is supposed to initialize the object and
	 * start the connection with de database
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public DeputadoDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	/**
	 * This method is supposed to add an ArrayList of deputies to the database.
	 * 
	 * @param deputados
	 *            {@link ArrayList} of {@link Deputados}, that contain all the
	 *            deputies from the webservice.
	 * @throws SQLException
	 */
	public void adicionaDeputado(ArrayList<Deputados> deputados)
			throws SQLException {
		String sql = "insert into deputado(idParlamentar, matricula, ideCadastro, "
				+ "nomeCivil, nomeDeTratamento, sexo, uf, partido"
				+ ", numeroDoGabinete, anexo, telefone, email)"
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement stmt = getConexao().prepareStatement(sql);
		for (int i = 0; i < deputados.size(); i++) {

			stmt.setInt(UM, deputados.get(i).getIdDoParlamentar());
			stmt.setInt(DOIS, deputados.get(i).getMatricula());
			stmt.setInt(TRES, deputados.get(i).getIdeCadastro());
			stmt.setString(QUATRO, deputados.get(i).getNomeCivilDoParlamentar());
			stmt.setString(CINCO, deputados.get(i)
					.getNomeDeTratamentoDoParlamentar());
			stmt.setString(SEIS, deputados.get(i).getSexo());
			stmt.setString(SETE, deputados.get(i).getUf());
			stmt.setString(OITO, deputados.get(i).getPartido());
			stmt.setString(NOVE, deputados.get(i).getNumeroDoGabinete());
			stmt.setString(DEZ, deputados.get(i).getAnexo());
			stmt.setString(ONZE, deputados.get(i).getTelefone());
			stmt.setString(DOZE, deputados.get(i).getEmail());

			stmt.execute();

		}
		stmt.close();
	}

	/**
	 * This method is supposed to catch all the name of the deputies.
	 * 
	 * @return returns an {@link ArrayList} of {@link String} with the name of
	 *         all deputies civil and treatment.
	 * @throws SQLException
	 */
	public ArrayList<String> getNomesDeputados() throws SQLException {
		String sql = "Select * from deputado";

		ArrayList<String> lista = new ArrayList<String>();

		PreparedStatement stmt = ConnectionFactory.getConexao()
				.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			String nomeCivil = rs.getString("nomeCivil");
			String nomeTratamento = rs.getString("nomeDeTratamento");
			lista.add(nomeCivil);
			lista.add(nomeTratamento);
		}

		rs.close();
		stmt.close();

		return lista;

	}

	/**
	 * This method is to get the registration of all the deputies.
	 * 
	 * @return returns an {@link ArrayList} of {@link Integer} with the
	 *         registration.
	 * @throws SQLException
	 */
	public ArrayList<Integer> getMatriculaDeputados() throws SQLException {
		// criando o comando sql, procura como buscar uma linha especifica...
		String sql = "Select * from deputado";

		ArrayList<Integer> lista = new ArrayList<Integer>();

		// criando o prepared statement q é o que vai conetar com o banco
		PreparedStatement stmt = ConnectionFactory.getConexao()
				.prepareStatement(sql);
		// executando o stmt para buscar os dados
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			lista.add(rs.getInt("matricula"));
		}

		rs.close();
		return lista;
	}

	/**
	 * This method is to retrieve all deputies with all attributes of the
	 * object.
	 * 
	 * @return returns an {@link ArrayList} of {@link Deputados} with all the
	 *         deputies.
	 * @throws SQLException
	 */
	public ArrayList<Deputados> getDeputados() throws SQLException {
		String sql = "Select * from deputado";
		ArrayList<Deputados> lista = new ArrayList<Deputados>();

		PreparedStatement stmt = ConnectionFactory.getConexao()
				.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Deputados deputado = new Deputados();

			deputado.setIdDoParlamentar(rs.getInt("idParlamentar"));
			deputado.setMatricula(rs.getInt("matricula"));
			deputado.setIdeCadastro(rs.getInt("ideCadastro"));
			deputado.setNomeCivilDoParlamentar(rs.getString("nomeCivil"));
			deputado.setNomeDeTratamentoDoParlamentar(rs
					.getString("nomeDeTratamento"));
			deputado.setSexo(rs.getString("sexo"));
			deputado.setUf(rs.getString("uf"));
			deputado.setPartido(rs.getString("partido"));
			deputado.setNumeroDoGabinete(rs.getString("numeroDoGabinete"));
			deputado.setAnexo(rs.getString("anexo"));
			deputado.setTelefone(rs.getString("telefone"));
			deputado.setEmail(rs.getString("email"));

			lista.add(deputado);
		}

		rs.close();
		return lista;
	}
}
