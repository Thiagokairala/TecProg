/**
 * Class: SessionsAndMeetingsServlet
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class is the servlet that is going call for all days and return then
 * on a {@link ArrayList} of {@link Dia} to the jsp page or it is going to
 * trigger the error page.
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

import org.apache.axis.types.Day;

import br.com.MDSGPP.ChamadaParlamentar.control.DiaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class SessoesEReunioesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * This is the only method of the servlet, its supose to generate an
	 * {@link ArrayList} with all the {@link Day} objects on the bank, so the
	 * user can select one.
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) {
		RequestDispatcher rd = null;

		try {
			int pagina = 1;
			int datasPorPagina = 10;

			if (request.getParameter("pagina") != null) {
				pagina = Integer.parseInt(request.getParameter("pagina"));
			}

			ArrayList<Dia> dia = DiaControl.getDias();

			int numeroDatas = dia.size();

			int noDePaginas = ((int) Math.ceil(numeroDatas * 1.0
					/ datasPorPagina)) - 1;

			ArrayList<Dia> diaPassar = DiaControl.getListaCerta(pagina - 1,
					datasPorPagina, dia);

			request.setAttribute("noDePaginas", noDePaginas);
			request.setAttribute("paginaAtual", pagina);
			request.setAttribute("dias", diaPassar);
			request.setAttribute("diasAuto", dia);

			rd = request.getRequestDispatcher("AcompanharSessao.jsp");
		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		} catch (SQLException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		} catch (DataFormatoErradoException e) {
			rd = request.getRequestDispatcher("FormatoErrado.jsp");
		}

		try {

			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
