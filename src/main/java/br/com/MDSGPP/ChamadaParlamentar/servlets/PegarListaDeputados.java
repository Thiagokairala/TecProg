/**
 * Class: RetrieveDeputyList
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
 * This is the class that is going to allow the autoComplete on the
 * classes that needs to enter deputy.
 */
package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl;

public class PegarListaDeputados extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * This is the only method on the servlet, its responsibility is to retrieve
	 * all the deputies name and sends it to the jsp page on an
	 * {@link ArrayList} of {@link String}, so there can be an auto complete on
	 * it.
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			ArrayList<String> lista = DeputadosControl.getDeputados();
			request.setAttribute("lista", lista);
			rd = request.getRequestDispatcher("/AcompanharParlamentar.jsp");
		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("/Erro.jsp");
		} catch (SQLException e) {
			rd = request.getRequestDispatcher("/Erro.jsp");
		}

		rd.forward(request, response);
	}
}
