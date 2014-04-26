<!--  
FILE: TrackSession.jsp.

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
			<jsp:include page="FolhaParaAcompanharSessao.css"/>
		</style>

		<title>Chamada Parlamentar</title>
	</head>
	<body>
		<%if(Language.getLanguage().equals("english")) { %>
			<fmt:setBundle basename="br.com.MDSGPP.ChamadaParlamentar.internalization.Internalization_En"/>
		<%} else if(Language.getLanguage().equals("portuguese")) {%>
			<fmt:setBundle basename="br.com.MDSGPP.ChamadaParlamentar.internalization.Internalization_Pt"/>
		<%} %>
		<div id = "tudo">
		
			<div id = "topo">
				<jsp:include page='Header.jsp'/>
			</div><!-- Fim da div topo -->
		
			<div id = "arrumar">
				<div id = "principal">
					<h1>Sessoes:</h1>
					<form name="selecaoData" id="selecaoData" action="sessaoPorData"
							method="POST">
						<h3>Digite o dia que deseja pesquisar:
							<input type="text" name="datas" id="datas" list="datasAuto" autocomplete= "off" />
							
							<datalist id="datasAuto">
								<c:forEach var="datas"	items="${diasAuto}">
									<option value="${datas.data}">
								</c:forEach>
							</datalist>
							
							<input type=image src="pesquisa_lupa.png" id="lupa">
						</h3>
					</form>
					
					<p>Página ${paginaAtual }</p>
					
					<c:forEach var = "dia" items = "${dias }">
						<h2>Data: ${dia.data }</h2>
						<c:forEach var = "sessao" items = "${dia.listaSessoes}">
							<td>
								<a href = "sessaoPorNome?descricao=${sessao.descricaoCompleta}">
								${sessao.descricao }</a>
							</td>
						</c:forEach>
					</c:forEach>
				</div><!-- fim da id principal -->
			</div><!-- fim da div arrumar -->
		
			<div id="paginas">
				<c:if test="${paginaAtual != 1}">
					<td>
						<a href="acompanharSessao?pagina=${paginaAtual - 1}">&larr;</a>
					</td>
				</c:if>
		
				<c:forEach begin="1" end="${noDePaginas}" var="i">
					<c:choose>
						<c:when test="${paginaAtual eq i}">
							<td>${i}</td>
						</c:when>
						<c:otherwise>
							<td>
								<a href="acompanharSessao?pagina=${i}">${i}</a>
							</td>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				
				<c:if test="${paginaAtual != noDePaginas }">
					<td>
						<a href="acompanharSessao?pagina=${paginaAtual + 1}">&rarr;</a>
					</td>
				</c:if>
			</div><!-- fim da div paginas -->
		
			<div id="rodape">
				<jsp:include page = 'Footer.html'/>
			</div> <!-- Fim da div rodapé -->
		</div><!--fim da div tudo-->		
	</body>
</html>