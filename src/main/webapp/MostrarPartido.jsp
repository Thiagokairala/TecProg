<!--  
FILE: ShowPoliticalParty.jsp.

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
			<jsp:include page="FolhaParaMostrarPartido.css"/>
		</style>
		<title>Chamada Parlamentar</title>
	</head>
	
	<body>
		<div id = "tudo">
			<div id = "topo">
				<jsp:include page='Header.jsp'/>
			</div><!-- Fim da div topo -->
			
			<div id = "arrumar">
				<div id = "principal">
					<h1>${partido.nomePartido } - ${partido.sigla }</h1>
				
					<h2>Média de presença: ${estatisticaPartido.porcentagem }%</h2>
					
					<c:forEach var = "deputado" items="${partido.estatisticaDosDeputados}">
						<td>
							<a href="arrumarNome?nome=${deputado.nome }"> ${deputado.nome} -  ${deputado.porcentagem }<br>
								<br></a>
						</td>
					</c:forEach>
				</div><!-- fim da id principal -->
				
				<div id="semDados">	
					<c:if test="${numeroSemDados > 0 }">
						<h2>Deputados sem dados disponiveis:</h2>
						<c:forEach var = "deputado" items="${partido.deputadosSemDados }">
							<p>${deputado.nome }</p>
						</c:forEach>
					</c:if>	
				</div><!-- fim da div semDados -->
			</div><!-- fim da div arrumar -->
			
			<div id="rodape">
				<jsp:include page = 'Footer.html'/>
			</div> <!-- Fim da div rodapé -->
		</div><!--fim da div tudo-->			
	</body>
</html>