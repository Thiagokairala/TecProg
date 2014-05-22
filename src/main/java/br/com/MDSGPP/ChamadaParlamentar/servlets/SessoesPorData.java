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
		rd = request.getRequestDispatcher("/MostrarDia.jsp");

	    } catch (ClassNotFoundException e) {
		rd = request.getRequestDispatcher("/Erro.jsp");
	    } catch (SQLException e) {
		rd = request.getRequestDispatcher("/Erro.jsp");
	    } catch (DataFormatoErradoException e) {
		rd = request.getRequestDispatcher("/FormatoErrado.jsp");
	    } catch (DataNaoEncontradaException e) {
		rd = request.getRequestDispatcher("/DataNaoEncontrada.jsp");
	    } catch (ListaVaziaException e) {
		rd = request.getRequestDispatcher("/DataNaoEncontrada.jsp");
	    }
	} else {
	    rd = request.getRequestDispatcher("SqlDetectado.jsp");
	}

	rd.forward(request, response);

    }
}
