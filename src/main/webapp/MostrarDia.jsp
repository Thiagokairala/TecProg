<!--  
FILE: ShowDay.jsp.

AUTHORS: 
Thiago Ramires Kairala
Thabata Helen Macedo Granja
Eduardo Brasil Martins
João Guilherme Santana Araruna
Nilton Cesar Campos Araruna
Rafael Fazzolino Pinto Barbosa
Bruno Contessotto Bragança Pinheiro

DATE: 27/03/2014

LICENSE:
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<style type="text/css">
			<jsp:include page="FolhaParaHeader.css"/>
			<jsp:include page="FolhaParaTudo.css"/>
			<jsp:include page="FolhaParaBody.css"/>
			<jsp:include page="FolhaParaFooter.css"/>
			<jsp:include page="FolhaParaMostrarDia.css"/>
		</style>
		<title>Chamada Parlamentar</title>
	</head>
	<body>
		<div id = "tudo">
			<div id = "topo">
				<jsp:include page='Header.jsp'/>
			</div><!-- Fim da div topo -->
			
			<h1>DATA: ${dia.data }</h1>
			
			<c:if test="${dia.numeroSessoes ==1 }">
				<h2>Sessão:</h2>
			</c:if>
			
			<c:if test="${dia.numeroSessoes>1 }">
				<h2>Sessões:</h2>
			</c:if>
			
			<div id = "mostra">
				<c:forEach var="sessao" items="${dia.listaSessoes}">
					<td>
						<a href="sessaoPorNome?descricao=${sessao.descricaoCompleta}">
						${sessao.descricao }</a>
					</td>
				</c:forEach>
			</div><!-- Fim da div mostra -->
			
			<div id="rodape">
				<jsp:include page = 'Footer.html'/>
			</div> <!-- Fim da div rodapé -->
		</div><!--fim da div tudo-->		
	</body>
</html>