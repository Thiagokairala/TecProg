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
    pageEncoding="ISO-8859-1"%>
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
		<fmt:setBundle basename="br.com.MDSGPP.ChamadaParlamentar.internalization.Internalization_En"/>
		<div id = "topo">				
		
		</div><!-- fim da div topo -->
				
		<ul class="menu">
			<li>
				<a href="index.jsp"><fmt:message key="menu.Home"></fmt:message></a>
			</li>
			
			<li>
				<a>Parlamentar</a>
				<ul>
					<li>
						<a href="acompanharParlamentar">Acompanhar
							Parlamentar</a>
					</li>
				</ul>
			</li>
	
			<li><a>Partido</a>
				<ul>
					<li>
						<a href="autoCompletePartido">Acompanhar Partido</a>
					</li>
				</ul>
			</li>

			<li>
				<a>Sessões</a>
				<ul>
					<li>
						<a href="acompanharSessao">Acompanhar Sess&atildeo</a>
					</li>
				</ul>
			</li>

			<li>
				<a>Ranking</a>
				<ul>
					<li>
						<a href="ranking">Top 5</a>
					</li>
					
					<li>
						<a href="rankingCompleto">Ranking Completo</a>
					</li>
				</ul>
			</li>
		</ul>
		<hr>
