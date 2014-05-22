/**
 * Class: SecondDeputyServlet.
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This class is the servlet responsible to gather information for the user to compare
 * two different deputies, the first comes from the last jsp page, and the other
 * the system got to calculate using the name.
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
import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSqlInjection;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class SegundoParlamentarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * This is the only method in the servlet, it is responsible to get the data
	 * of the second deputy and calculate the statistics of it, returning both
	 * deputy to the jsp page or it goes to the error jsp.
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nomePrimeiroParlamentar = request
				.getParameter("primeiroParlamentar");
		nomePrimeiroParlamentar = nomePrimeiroParlamentar.split("-")[0];

		String nomeSegundoParlamentar = request.getParameter("nome");
		Deputados primeiroDeputado = null;
		Deputados segundoDeputado = null;
		RequestDispatcher rd = null;

		if (ExceptionSqlInjection.testeSqlInjection(nomeSegundoParlamentar)) {
			try {
				primeiroDeputado = DeputadosControl
						.verificaExistencia(nomePrimeiroParlamentar);
				segundoDeputado = DeputadosControl
						.verificaExistencia(nomeSegundoParlamentar);

				if (segundoDeputado != null) {
					Estatistica estatisticaPrimeiro = EstatisticaControl
							.gerarEstatisticas(EstatisticaControl
									.arrumarNomePesquisa(primeiroDeputado));

					Estatistica estatisticaSegundo = EstatisticaControl
							.gerarEstatisticas(EstatisticaControl
									.arrumarNomePesquisa(segundoDeputado));
					ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
					lista.add(estatisticaPrimeiro);
					lista.add(estatisticaSegundo);

					double presencaPrimeiro = Math
							.ceil(((Double.parseDouble(estatisticaPrimeiro
									.getNumeroSessao())) / (Double
									.parseDouble(estatisticaPrimeiro
											.getTotalSessao()))) * 100);
					String presencaPassar1 = Double.toString(presencaPrimeiro);

					double presencaSegundo = Math
							.ceil(((Double.parseDouble(estatisticaSegundo
									.getNumeroSessao())) / (Double
									.parseDouble(estatisticaSegundo
											.getTotalSessao()))) * 100);
					String presencaPassar2 = Double.toString(presencaSegundo);

					ArrayList<String> listaNomes = new ArrayList<String>();
					listaNomes.add(estatisticaPrimeiro.getNome());
					listaNomes.add(estatisticaSegundo.getNome());
					listaNomes.add("Total");

					request.setAttribute("lista", listaNomes);
					request.setAttribute("nomePrimeiro",
							estatisticaPrimeiro.getNome());
					request.setAttribute("presencaPrimeiro", presencaPassar1);
					request.setAttribute("presencaSegundo", presencaPassar2);
					request.setAttribute("estatisticaPrimeiro",
							estatisticaPrimeiro);
					request.setAttribute("estatisticaSegundo",
							estatisticaSegundo);

					rd = request
							.getRequestDispatcher("/MostrarComparacaoDeputados.jsp");
				} else {
					rd = request
							.getRequestDispatcher("/DeputadoNaoEncontrado.jsp");
				}
			} catch (ClassNotFoundException e1) {
				rd = request.getRequestDispatcher("/Erro.jsp");
			} catch (SQLException e) {
				rd = request.getRequestDispatcher("/Erro.jsp");
			} catch (NumberFormatException e) {
				rd = request.getRequestDispatcher("/DadosNaoDisponiveis.jsp");
			} catch (ListaVaziaException e) {
				rd = request.getRequestDispatcher("/DadosNaoDisponiveis.jsp");
			}
		} else {
			rd = request.getRequestDispatcher("SqlDetectado.jsp");
		}

		rd.forward(request, response);

	}
}
