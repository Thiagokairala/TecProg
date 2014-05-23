/**
 * Class: SessionsByDateServlet
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class is the servlet that is going call for a day, and evaluate 
 * if the date is valid or not and then call the right jsp page.
 */
package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.DiaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.exception.DataNaoEncontradaException;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSqlInjection;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class SessoesPorData extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * This is the only method of the class, is the method to connect the
     * servlet with de jsp page.
     */
    protected void service(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher rd = null;

	final String showDay = "/MostrarDia.jsp";
	final String erro = "/Erro.jsp";
	final String wrongFormat = "/FormatoErrado.jsp";
	final String dateNotFound = "/DataNaoEncontrada.jsp";

	String data = request.getParameter("datas");
	if (ExceptionSqlInjection.testeSqlInjection(data)) {
	    try {
		new DiaControl();
		Dia dia = DiaControl.passarData(data);

		try {
		    dia.getListaSessoes().size();
		} catch (NullPointerException e1) {
		    throw new DataNaoEncontradaException();
		}

		request.setAttribute("dia", dia);
		rd = request.getRequestDispatcher(showDay);

	    } catch (ClassNotFoundException e) {
		rd = request.getRequestDispatcher(erro);
	    } catch (SQLException e) {
		rd = request.getRequestDispatcher(erro);
	    } catch (DataFormatoErradoException e) {
		rd = request.getRequestDispatcher(wrongFormat);
	    } catch (DataNaoEncontradaException e) {
		rd = request.getRequestDispatcher(dateNotFound);
	    } catch (ListaVaziaException e) {
		rd = request.getRequestDispatcher(dateNotFound);
	    }
	} else {
	    rd = request.getRequestDispatcher("sqlDetectado.jsp");
	}

	rd.forward(request, response);

    }
}
