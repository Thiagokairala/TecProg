/**
 * Class: RankingDao
 * Date: march 26 2014.
 *
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This class is supposed to gather data from the database and return it to the system.
 * 
 */
package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class RankingDao extends ConnectionFactory {

    /**
     * Constructor to the class, it only initializate the connection with the
     * database.
     * 
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public RankingDao() throws ClassNotFoundException, SQLException {
	new ConnectionFactory().getConnection();
    }

    /**
     * Method to insert the database table the ranking with the members name,
     * percentage of attendance and number of sessions that the member has
     * participated.
     * 
     * @param ranking
     *            {@link Ranking} including the members name, percentage of
     *            attendance and number of sessions, first is the name and then
     *            it´s percentage and sessions number, example, Carlos is the
     *            name, 50 is the respective percentage and 9 is the respective
     *            sessions number.
     * @throws SQLException
     * @throws MalformedURLException
     * @throws ServiceException
     */
    public void adicionarRankingNaTable(Ranking ranking) throws SQLException {
	final int nomeParlamentar = 1;
	final int porcentagem = 2;
	final int numeroSessoes = 3;

	String sql = "insert into ranking(nomeParlamentar, porcentagem, numeroSessoes)values (?, ?, ?)";
	PreparedStatement stmt = ConnectionFactory.getConexao()
		.prepareStatement(sql);

	for (int i = 0; i < ranking.getLista().size(); i++) {
	    try {
		stmt.setString(nomeParlamentar, ranking.getLista().get(i)
			.getNome());
		stmt.setString(porcentagem, ranking.getLista().get(i)
			.getPorcentagem());
		stmt.setString(numeroSessoes, ranking.getLista().get(i)
			.getNumeroSessao());

		stmt.execute();
	    } catch (MySQLIntegrityConstraintViolationException e) {
		System.out.println(ranking.getLista().get(i).getNome());
	    }
	}
	for (int i = 0; i < ranking.getRemovidos().size(); i++) {
	    stmt.setString(1, ranking.getRemovidos().get(i).getNome());
	    stmt.setString(2, "semDados");
	    stmt.execute();
	}

	stmt.close();
    }

    /**
     * Method to return the ranking according the percentage of the members
     * attendance.
     * 
     * @return returns an {@link ArrayList} of {@link Estatistica}.
     * @throws SQLException
     * @throws DataFormatoErradoException
     */
    public Ranking retornaRanking() throws SQLException {
	Ranking ranking = new Ranking();
	final String colunaNomeParlamentar = "nomeParlamentar";
	final String colunaPorcentagem = "porcentagem";
	final String colunaNumeroSessoes = "numeroSessoes";
	
	ArrayList<Estatistica> removidos = new ArrayList<Estatistica>();
	ArrayList<Estatistica> lista = new ArrayList<Estatistica>();

	String sql = "Select * from ranking";

	PreparedStatement stmt = ConnectionFactory.getConexao()
		.prepareStatement(sql);
	ResultSet rs = stmt.executeQuery();

	while (rs.next()) {
	    Estatistica estatistica = new Estatistica();
	    estatistica.setNome(rs.getString(colunaNomeParlamentar));
	    if (rs.getString(colunaPorcentagem).equalsIgnoreCase("semDados")) {
		removidos.add(estatistica);
	    } else {
		estatistica.setPorcentagem(rs.getString(colunaPorcentagem));
		estatistica.setNumeroSessao(rs.getString(colunaNumeroSessoes));
		lista.add(estatistica);
	    }
	}

	ranking.setLista(lista);
	ranking.setRemovidos(removidos);
	return ranking;
    }
}
