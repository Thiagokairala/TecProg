/**
 * Class: deputyReceived
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
 * This class received the deputy.
 */
package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl;
import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSqlInjection;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class ParlamentarRecebido extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * This is the only method on the servlet, its supposed to receive the
	 * deputy from the jsp and then gather the data the user wants to see.
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");

		Deputados deputado = null;
		RequestDispatcher rd = null;

		if (ExceptionSqlInjection.testeSqlInjection(nome)) {
			try {
				int pagina = 1;
				int sessoesPorPagina = 15;

				if (request.getParameter("pagina") != null) {
					pagina = Integer.parseInt(request.getParameter("pagina"));
					nome = nome.split("-")[0];
				}
				deputado = DeputadosControl.verificaExistencia(nome);

				if (deputado != null) {
					ArrayList<String> lista = DeputadosControl.getDeputados();
					Estatistica estatistica = EstatisticaControl
							.gerarEstatisticas(EstatisticaControl
									.arrumarNomePesquisa(deputado));

					int numeroSessoes = estatistica.getLista().size();
					int noDePaginas = ((int) Math.ceil(numeroSessoes * 1.0
							/ sessoesPorPagina)) - 1;

					double presenca = Math
							.ceil(((Double.parseDouble(estatistica
									.getNumeroSessao())) / (Double
									.parseDouble(estatistica.getTotalSessao()))) * 100);
					String presencaPassar = Double.toString(presenca);

					estatistica.setLista(EstatisticaControl.passarListaCerta(
							pagina - 1, sessoesPorPagina,
							estatistica.getLista()));

					request.setAttribute("presenca", presencaPassar);
					request.setAttribute("noDePaginas", noDePaginas);
					request.setAttribute("paginaAtual", pagina);
					request.setAttribute("lista", lista);
					request.setAttribute("estatistica", estatistica);
					rd = request
							.getRequestDispatcher("/MostrarEstatisticaDeputado.jsp");

				} else {
					rd = request
							.getRequestDispatcher("/DeputadoNaoEncontrado.jsp");
				}
			} catch (ClassNotFoundException e1) {
				rd = request.getRequestDispatcher("/Erro.jsp");
			} catch (SQLException e) {
				rd = request.getRequestDispatcher("/Erro.jsp");
			} catch (IndexOutOfBoundsException e) {
				rd = request.getRequestDispatcher("/DeputadoNaoEncontrado.jsp");
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