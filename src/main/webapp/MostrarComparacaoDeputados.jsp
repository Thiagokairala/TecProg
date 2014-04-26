<!--  
FILE: ShowComparisonDeputy.jsp.

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
	        <jsp:include page="FolhaParaBody.css"/>
	        <jsp:include page="FolhaParaFooter.css"/>
            <jsp:include page="FolhaParaMostrarComparacaoDeputados.css"/>
		</style>
		
		<script type="text/javascript" src = "jquery.js">
		
		</script>
		
		<script src="http://code.highcharts.com/highcharts.js">
		
		</script>
		
		<!-- This function is to generate the graphics to the page. -->
		<script>
			$(function () {
			    $('#grafico').highcharts({
			        chart: {
			            type: 'column'
			        },
			        title: {
			            text: 'Comparação dos deputados'
			        },
			        xAxis: {
			            categories: [
			                '${estatisticaPrimeiro.nome}',
			                '${estatisticaSegundo.nome}',
			                'Total',
			            ]
			        },
			        yAxis: {
			            min: 0,
			            title: {
			                text: 'Porcentagem de Presença'
			            }
			        },
			        tooltip: {
			            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
			            pointFormat: '<tr><td style="color:{series.color};padding:0">'+
			            '{series.name}: </td><td style="padding:0"><b>{point.y:.1f} %</b>'+
			            '</td></tr>',
			            footerFormat: '</table>',
			            shared: true,
			            useHTML: true
			        },
			        plotOptions: {
			            column: {
			                pointPadding: 0.2,
			                borderWidth: 0
			            }
			        },
			        series: [{
			            name: '${estatisticaPrimeiro.nome}',
			            data: [${presencaPrimeiro}]
			
			        }, {
			            name: '${estatisticaSegundo.nome}',
			            data: [${presencaSegundo}]
			
			        }, {
			            name: 'Total',
			            data: [100]
			        }]
			    });
			});
		</script>		
		<title>Chamada Parlamentar</title>
	</head>
	
	<body>
		<%if(Language.getLanguage().equals("english")) { %>
			<fmt:setBundle basename="br.com.MDSGPP.ChamadaParlamentar.internalization.Internalization_En"/>
		<%} else if(Language.getLanguage().equals("portuguese")) {%>
			<fmt:setBundle basename="br.com.MDSGPP.ChamadaParlamentar.internalization.Internalization_Pt"/>
		<%} %>
		<div id="tudo">
			<div id="topo">
				<jsp:include page='Header.jsp' />
			</div><!-- Fim da div topo -->
			
			<div id="grafico">
			
			</div><!-- fim da div id grafico. -->
	
			<div id="alinahr">
				<div id="primeiro">
					<h1><fmt:message key="ShowComparisonDeputy.Name"></fmt:message>: ${estatisticaPrimeiro.nome }</h1>

					<h2>
						<b><fmt:message key="ShowComparisonDeputy.SessionsWahtched"></fmt:message>:</b>
					</h2>

					<p>${estatisticaPrimeiro.numeroSessao }</p>
	
					<h2>
						<b><fmt:message key="ShowComparisonDeputy.TotalNumberSessions"></fmt:message>:</b>
					</h2>

					<p>${estatisticaPrimeiro.totalSessao }</p>
	
					<h2>
						<b><fmt:message key="ShowComparisonDeputy.Percent"></fmt:message>:</b>
					</h2>

					<p>${estatisticaPrimeiro.porcentagem }</p>
	
					<h2>
						<b><fmt:message key="ShowComparisonDeputy.Sessions"></fmt:message>:</b>
					</h2>
	
					<c:forEach var="sessao" items="${estatisticaPrimeiro.lista }">
						<td>
							<a href="sessaoPorNome?descricao=${sessao}"> ${sessao }</a>
						</td>
						
						<br>
						<br>
					</c:forEach>
				</div><!-- fim da div primeiro -->
	
				<div id="segundo">
					<h1><fmt:message key="ShowComparisonDeputy.Name"></fmt:message>: ${estatisticaSegundo.nome }</h1>
	
					<h2>
						<b><fmt:message key="ShowComparisonDeputy.SessionsWahtched"></fmt:message>:</b>
					</h2>
					
					<p>${estatisticaSegundo.numeroSessao }</p>
	
					<h2>
						<b><fmt:message key="ShowComparisonDeputy.TotalNumberSessions"></fmt:message>:</b>
					</h2>
					
					<p>${estatisticaSegundo.totalSessao }</p>
	
					<h2>
						<b><fmt:message key="ShowComparisonDeputy.Percent"></fmt:message>:</b>
					</h2>
					
					<p>${estatisticaSegundo.porcentagem }</p>
	
					<h2>
						<b><fmt:message key="ShowComparisonDeputy.Sessions"></fmt:message>:</b>
					</h2>
	
					<c:forEach var="sessao" items="${estatisticaSegundo.lista }">
						<td>
							<a href="sessaoPorNome?descricao=${sessao}"> ${sessao }</a>
						</td>
						
						<br>
						<br>
					</c:forEach>
				</div><!-- fim da div segundo -->
			</div><!-- fim da div alinhar -->
		
			<div id="rodape">
				<jsp:include page='Footer.html' />
			</div><!-- Fim da div rodapé -->
		</div><!--fim da div tudo-->
	</body>
</html>