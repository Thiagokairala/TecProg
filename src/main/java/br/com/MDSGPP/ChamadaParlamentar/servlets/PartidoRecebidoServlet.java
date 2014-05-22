/**
 * Class: partyReceivedServlet
 * Date: march 27 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This is the class that will receive the parties of the servlet
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

import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaPartidoControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSqlInjection;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.EstatisticaPartido;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class PartidoRecebidoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * This is the only method of the servlet, its supposed to receive the name
	 * of the political party from the jsp and use it to process and generate to
	 * data that the user wants.
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;

		String nomePartido = request.getParameter("nome");

		if (ExceptionSqlInjection.testeSqlInjection(nomePartido)) {
			try {
				EstatisticaPartido estatistica = EstatisticaPartidoControl
						.gerarEstatisticaPartido(nomePartido);

				ArrayList<Estatistica> semDados = estatistica.getPartido()
						.getDeputadosSemDados();

				Partidos partido = estatistica.getPartido();

				int quantosSemDados = partido.getDeputadosSemDados().size();

				request.setAttribute("numeroSemDados", quantosSemDados);
				request.setAttribute("semDados", semDados);
				request.setAttribute("estatisticaPartido", estatistica);
				request.setAttribute("partido", partido);
				rd = request.getRequestDispatcher("MostrarPartido.jsp");

			} catch (ClassNotFoundException e) {
				rd = request.getRequestDispatcher("Erro.jp");
			} catch (SQLException e) {
				rd = request.getRequestDispatcher("Erro.jp");
			} catch (NullPointerException e) {
				rd = request.getRequestDispatcher("PartidoNaoEncontrado.jsp");
			} catch (ListaVaziaException e) {
				rd = request.getRequestDispatcher("PartidoNaoEncontrado.jsp");
				e.printStackTrace();
			}
		} else {
			rd = request.getRequestDispatcher("SqlDetectado.jsp");
		}

		rd.forward(request, response);
	}
}
