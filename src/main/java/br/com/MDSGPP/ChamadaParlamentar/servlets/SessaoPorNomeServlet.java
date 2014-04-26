/**
 * Class: SessionsByNameServlet.
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @author Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
 * Date: march 26 2014.
 * 
 * This class is the servlet that is going call for a specific session that
 * matches with the name given, and then redirects to the right jsp page.
 */
package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.SessoesEReunioesControl;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class SessaoPorNomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * This method is the only method of the servlet, it's responsible to get
	 * the session asked for the user and send the request to the right jsp
	 * page.
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		SessoesEReunioes sessao = new SessoesEReunioes();

		String descricao = request.getParameter("descricao");
		try {
			int pagina = 1;
			int deputadosPorPagina = 20;

			if (request.getParameter("pagina") != null) {
				pagina = Integer.parseInt(request.getParameter("pagina"));
			}
			sessao = SessoesEReunioesControl.passarSessao(descricao);

			if (sessao.getDeputadosPresentes().size() != 0) {

				int numeroDeputados = sessao.getDeputadosPresentes().size();
				int noDePaginas = ((int) Math.ceil(numeroDeputados * 1.0
						/ deputadosPorPagina)) - 1;

				sessao.setDeputadosPresentes(SessoesEReunioesControl
						.arrumarListaDeputados(pagina - 1, deputadosPorPagina,
								sessao.getDeputadosPresentes()));

				request.setAttribute("quantosDeputados", numeroDeputados);
				request.setAttribute("noDePaginas", noDePaginas);
				request.setAttribute("paginaAtual", pagina);
				request.setAttribute("sessao", sessao);
				rd = request.getRequestDispatcher("SessaoPorNome.jsp");
			} else {
				rd = request.getRequestDispatcher("SessaoNaoEncontrada.jsp");
			}
		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		} catch (SQLException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		}

		rd.forward(request, response);

	}
}
