<!--  
FILE: Header.html.

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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="shortcut icon" href="favicon.ico" >
	</head>
	<body>
		<%if(Language.getLanguage().equals("english")) { %>
			<fmt:setBundle basename="br.com.MDSGPP.ChamadaParlamentar.internalization.Internalization_En"/>
		<%} else if(Language.getLanguage().equals("portuguese")) {%>
			<fmt:setBundle basename="br.com.MDSGPP.ChamadaParlamentar.internalization.Internalization_Pt"/>
		<%} %>
		
		<div id = "topo">				

		</div><!-- fim da div topo -->
				
		<div id = "language">
			<a href= "changeLanguage?language=english"><img src="american_flag.png" id = "american"></a>
			<a href= "changeLanguage?language=portuguese"><img src="brasil_flag.jpg" id = "brazil"></a>
		</div>
		
		<ul class="menu">
			<li>
				<a href="index.jsp"><fmt:message key="menu.Home"></fmt:message></a>
			</li>
			
			<li>
				<a><fmt:message key="menu.Deputys"></fmt:message></a>
				<ul>
					<li>
						<a href="acompanharParlamentar"><fmt:message key="menu.TrackDeputy"></fmt:message></a>
					</li>
				</ul>
			</li>
	
			<li><a><fmt:message key="menu.Party"></fmt:message></a>
				<ul>
					<li>
						<a href="autoCompletePartido"><fmt:message key="menu.TrackParty"></fmt:message></a>
					</li>
				</ul>
			</li>

			<li>
				<a><fmt:message key="menu.Sessions"></fmt:message></a>
				<ul>
					<li>
						<a href="acompanharSessao"><fmt:message key="menu.TrackSession"></fmt:message></a>
					</li>
				</ul>
			</li>

			<li>
				<a><fmt:message key="menu.Ranking"></fmt:message></a>
				<ul>
					<li>
						<a href="ranking"><fmt:message key="menu.RankingTop5"></fmt:message></a>
					</li>
					
					<li>
						<a href="rankingCompleto"><fmt:message key="menu.CompleteRanking"></fmt:message></a>
					</li>
				</ul>
			</li>
		</ul>
		<hr>
		
		
