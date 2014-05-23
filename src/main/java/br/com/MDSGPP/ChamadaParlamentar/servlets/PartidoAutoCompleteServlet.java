/**
 * Class: PartyAutoCompleteServlet
 * Date: march 27 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Class that generates the auto complete party.
 */
package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.PartidoControl;

public class PartidoAutoCompleteServlet extends javax.servlet.http.HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * This is the only method of the servlet, its supposed to get all the
     * political party from the database so the jsp can generate an auto
     * complete with then.
     */
    protected void service(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher rd = null;

	final String acompanharPartido = "AcompanharPartido.jsp";
	final String erro = "Erro.jsp";

	try {
	    ArrayList<ArrayList<String>> listaAutoComplete = PartidoControl
		    .passarListaPartidos();

	    request.setAttribute("lista", listaAutoComplete);

	    rd = request.getRequestDispatcher(acompanharPartido);

	} catch (ClassNotFoundException e) {
	    rd = request.getRequestDispatcher(erro);
	} catch (SQLException e) {
	    rd = request.getRequestDispatcher(erro);
	}

	rd.forward(request, response);
    }
}
