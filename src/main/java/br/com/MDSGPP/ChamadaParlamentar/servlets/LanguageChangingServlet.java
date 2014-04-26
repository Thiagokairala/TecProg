package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.util.Language;

public class LanguageChangingServlet extends HttpServlet {

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String language = request.getParameter("language");

		Language.setLanguage(language);
		
		Language languageToPass = new Language();
		
		request.setAttribute("language", languageToPass);
	}

}
