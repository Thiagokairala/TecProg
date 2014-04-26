/**
 * Class: ArrangeNameServlet
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @author Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
 * Date: march 27 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class solves the problem of incorrect name.
 */
package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArrumarNomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * This is the only method of the servlet, its suppose to correct the name,
	 * so it can be used to make search on the database.
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;

		String nome = request.getParameter("nome");
		nome = nome.split("-")[0];

		rd = request.getRequestDispatcher("parlamentarRecebido?nome=" + nome);
		rd.forward(request, response);
	}
}
