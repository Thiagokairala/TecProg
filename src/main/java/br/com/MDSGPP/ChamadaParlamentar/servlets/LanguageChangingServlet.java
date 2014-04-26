package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.util.Language;

public class LanguageChangingServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String language = request.getParameter("language");

		Language.setLanguage(language);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		rd.forward(request, response);
	}

}
