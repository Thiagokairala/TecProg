<!--  
FILE: TrackPoliticalParty.jsp.

AUTHORS: 
Thiago Ramires Kairala
Thabata Helen Macedo Granja
Eduardo Brasil Martins
Jo�o Guilherme Santana Araruna
Nilton Cesar Campos Araruna
Rafael Fazzolino Pinto Barbosa
Bruno Contessotto Bragan�a Pinheiro

DATE: 27/03/2014

LICENSE:
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="br.com.MDSGPP.ChamadaParlamentar.util.Language;"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<style type="text/css">
			<jsp:include page="FolhaParaHeader.css"/>
			<jsp:include page="FolhaParaTudo.css"/>
			<jsp:include page="FolhaParaPrincipal.css"/>
			<jsp:include page="FolhaParaBody.css"/>
			<jsp:include page="FolhaParaFooter.css"/>
			<jsp:include page="FolhaParaAuxiliar.css"/>
			<jsp:include page="FolhaParaAcompanharPartido.css"/>
		</style>
		
		<title>Chamada Parlamentar</title>
	</head>
	<body>
		<%if(Language.getLanguage().equals("english")) { %>
			<fmt:setBundle basename="br.com.MDSGPP.ChamadaParlamentar.internalization.Internalization_En"/>
		<%} %>
		<div id = "tudo">
			<div id = "topo">
				<jsp:include page='Header.jsp'/>
			</div><!-- Fim da div topo -->
			
			<div id = "arrumar">
				<div id = "principal">
					<div id="autoComplete">
						<form name ="selecaoPartido" id = "selecaoPartido" 
					                              action ="partidoRecebido" method= "POST">
					        <p>Digite o nome do partido:
								<input type="text" name="nome" id="nome" list="partido"
													autocomplete="off" />
					
								<datalist id="partido">
									<c:forEach var="Partido" items="${lista}">
										<c:forEach var="partido" items="${Partido }">
											<option value="${partido}">
										</c:forEach>
									</c:forEach> 
								</datalist>
											
								<input type=image src="pesquisa_lupa.png" id="lupa">
							</p>
						</form>
					</div><!-- fim da div autocomplet -->				
				</div><!-- fim da id principal -->
			</div><!-- fim da div arrumar -->
			<div id="rodape">
				<jsp:include page = 'Footer.html'/>
			</div> <!-- Fim da div rodap� -->
		</div><!--fim da div tudo-->
	</body>
</html>