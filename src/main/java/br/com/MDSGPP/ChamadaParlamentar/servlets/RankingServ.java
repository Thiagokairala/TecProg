/**
 * Class: RankingServlet
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class is the servlet that is going call for a the ranking and
 * cast it to the jsp page.
 */
package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class RankingServ extends javax.servlet.http.HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * This is the only method of the servlet, it is going to call for an
     * ranking and then it sends the ranking to the jsp page or it goes for an
     * error page.
     */
    protected void service(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	Ranking ranking = null;
	RequestDispatcher rd = null;
	final String rankingPage = "/Ranking.jsp";
	final String erro = "/Erro.jsp";

	try {
	    ranking = RankingControl.passarRankingTop5();
	    request.setAttribute("ranking", ranking);
	    rd = request.getRequestDispatcher(rankingPage);

	} catch (ClassNotFoundException e) {
	    rd = request.getRequestDispatcher(erro);
	} catch (SQLException e) {
	    rd = request.getRequestDispatcher(erro);
	}

	rd.forward(request, response);
    }
}
