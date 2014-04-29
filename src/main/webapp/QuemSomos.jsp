<!--  
FILE: WhoWeAre.jsp.

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
    pageEncoding="ISO-8859-1"
    import="br.com.MDSGPP.ChamadaParlamentar.util.Language;"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<style type="text/css">
			<jsp:include page="FolhaParaHeader.css"/>
			<jsp:include page="FolhaParaTudo.css"/>
			<jsp:include page="FolhaParaQuemSomos.css"/>
			<jsp:include page="FolhaParaBody.css"/>
			<jsp:include page="FolhaParaFooter.css"/>
		</style>
		<title>Chamada Parlamentar</title>
	</head>
	
	<body>
		<fmt:setBundle basename="${language }"/>
		<div id = "tudo">
			<div id = "topo">
				<jsp:include page='Header.jsp'/>
			</div><!-- Fim da div topo -->
			
			<div id = "somos">
				<h1><fmt:message key="WhoWeAre.WhoWeAre"></fmt:message>:</h1>
	            <p><fmt:message key="WhoWeAre.WeAre"></fmt:message>
	            	<br><fmt:message key="WhoWeAre.Members"></fmt:message><br>
	            	<br> <b><fmt:message key="WhoWeAre.MDS"></fmt:message></b>
	            	<br><br>-Thiago Kairala
	            	<br>-Eduardo Brasil Martins
	            	<br>-Carlos Cruz
	            	<br>-Bruno bragança
	            	<br>-Rafael Fazzolino P. Barbosa<br>
	            	<br> <b><fmt:message key="WhoWeAre.GPP"></fmt:message></b>
	            	<br><br>-Thabata Helen
	            	<br>-Nilton Araruna
	            	<br>-João Guilherme Araruna
	            </p>
			</div><!-- fim da id somos -->				
			
			<div id="rodape">
				<jsp:include page = 'Footer.html'/>
			</div> <!-- Fim da div rodapé -->
		</div><!--fim da div tudo-->		
	</body>
</html>