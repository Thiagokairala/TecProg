/**
 * Class: ResetDao
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
 * This class is to basicaly drop some tables to the system be able to update then.
 * 
 */
package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao extends ConnectionFactory {

	public Dao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	/**
	 * Method that deletes all rows from the tables listed and create CONNECTION
	 * with the same, in order to update the system.
	 * 
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 * @throws ClassNotFoundException
	 *             if the database is off.
	 */
	public static void truncateTables() throws SQLException,
			ClassNotFoundException {
		Dao dao = new Dao();

		String sql1 = "truncate table datas";
		String sql2 = "truncate table ranking";
		String sql3 = "truncate table sessao";

		PreparedStatement stmt1 = ConnectionFactory.getConexao()
				.prepareStatement(sql1);
		PreparedStatement stmt2 = ConnectionFactory.getConexao()
				.prepareStatement(sql2);
		PreparedStatement stmt3 = ConnectionFactory.getConexao()
				.prepareStatement(sql3);

		stmt1.execute();
		stmt2.execute();
		stmt3.execute();
	}
}
