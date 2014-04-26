/**
 * Class: ConnectioFactoryDao
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
 * This class is the connection factory, it is responsable to initiate connectivity
 * from the system and the database.
 * 
 */
package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection conexao;

	/**
	 * Empty constructor, only to initialize the object.
	 */
	public ConnectionFactory() {

	}

	/**
	 * Method that checks if the database connection exists, if not it creates
	 * the connection and returns it.
	 * 
	 * @returns the connection with the database.
	 * @throws ClassNotFoundException
	 *             if the database is off.
	 * @throws SQLException
	 *             if miss spelled SQL is entered.
	 */
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		if (ConnectionFactory.conexao == null) {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionFactory.conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost/chamada", "root", "12345");
		}
		return ConnectionFactory.conexao;
	}

	/**
	 * Getter of connection, <b>deprecated</b>.
	 * 
	 * @return connection
	 */
	public static Connection getConexao() {
		return conexao;
	}
}
