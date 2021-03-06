<!--  
FILE: ShowStatistics.jsp.

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
			<jsp:include page="FolhaParaQuemSomos.css"/>
			<jsp:include page="FolhaParaBody.css"/>
			<jsp:include page="FolhaParaFooter.css"/>
			<jsp:include page="FolhaParaMostrarEstatisticaDeputado.css"/>
		</style>
		<title>Chamada Parlamentar</title>
		
		<script type="text/javascript" src = "jquery.js"></script>
		<script src="http://code.highcharts.com/highcharts.js"></script>
		
		<!--This function is to generate the graphics-->
		<script>
			$(function () {
		    	// Radialize the colors
				Highcharts.getOptions().colors = Highcharts.map(Highcharts.getOptions().colors, function(color) {
				    return {
				        radialGradient: { cx: 0.5, cy: 0.3, r: 0.7 },
				        stops: [
				            [0, color],
				            [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
				        ]
				    };
				});
				
				// Build the chart
		        $('#container').highcharts({
		            chart: {
		                plotBackgroundColor: "#f8f8ff",
		                plotBorderWidth: null,
		                plotShadow: false
		            },
		            title: {
		                text: 'presenca do parlamentar.'
		            },
		            plotOptions: {
		                pie: {
		                    allowPointSelect: true,
		                    cursor: 'pointer',
		                    dataLabels: {
		                        enabled: true,
		                        color: '#333333',
		                        connectorColor: '#333333',
		      
		                        formatter: function() {
		                            return '<b>'+ this.point.name +'</b>: '+ this.percentage +' %';
		                        }
		                    }
		                }
		            },
		            series: [{
		                type: 'pie',
		                name: 'presen�a parlamentar',
		                data: [
		                    ['presenca',   ${presenca}],
		                    ['falta', (100-${presenca})]
		                ]
		            }]
		        });
	    	});
		</script>
	</head>
	<body>
		<fmt:setBundle basename="${language }"/>
		<div id = "tudo">
			<div id = "topo">
				<jsp:include page='Header.jsp'/>
			</div><!-- Fim da div topo -->
			
			<div id="container">
			
			</div><!-- Fim da div container -->
			
			<div id = "dados">
				<h1><fmt:message key="ShowEstatistic.Name"></fmt:message>: ${estatistica.nome }</h1>
				
				<h2><b><fmt:message key="ShowEstatistic.SessionsWhatched"></fmt:message>:</b></h2>
				<p>${estatistica.numeroSessao }</p>
				
				<h2><b><fmt:message key="ShowEstatistic.TotalNumberSessions"></fmt:message>:</b></h2> 
				<p>${estatistica.totalSessao }</p>
				
				<h2><b><fmt:message key="ShowEstatistic.Percent"></fmt:message>:</b></h2> 
				<p>${estatistica.porcentagem }</p>
				
				<h2><b><fmt:message key="ShowEstatistic.Sessions"></fmt:message>:</b></h2>  
				<p>
					<c:forEach var= "sessao" items = "${estatistica.lista }">
						<td>
							<a href = "sessaoPorNome?descricao=${sessao}">
									${sessao }</a>
						</td>
						<br>
						<br>
					</c:forEach>
				</p>
			</div><!-- fim da id dados -->
			
			<div id="novoDeputado">
				<form name ="selecaoDeputado" id = "selecaoDeputado" 
                              action ="segundoParlamentar?primeiroParlamentar=${estatistica.nome }" 
                              method= "POST">
					<h1><fmt:message key="ShowEstatistic.Ask"></fmt:message></h1>
					<input type = "text" name= "nome" id="nome" list = "deputados"
								 autocomplete= "off"/>
					
					<datalist id = "deputados" >
						<c:forEach var = "deputado" items = "${lista}">
							<option value = "${deputado}">
						</c:forEach> 
                    </datalist>
					                      
                    <input type=image src="pesquisa_lupa.png" id = "lupa"> 
	          	</form>
			</div><!-- fim da div novoDeputado -->
			
			<div id = "paginas">
				<c:if test="${paginaAtual != 1}">
					<td>
						<a href="parlamentarRecebido?pagina=${paginaAtual - 1}&nome=${estatistica.nome }">&larr;</a>
					</td>
				</c:if>
				
				<c:forEach begin="1" end="${noDePaginas}" var="i">
					<c:choose>
						<c:when test="${paginaAtual eq i}">
							<td>${i}</td>
						</c:when>
						
						<c:otherwise>
							<td>
								<a href="parlamentarRecebido?pagina=${i}&nome=${estatistica.nome }">${i}</a>
							</td>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				
				<c:if test="${paginaAtual != noDePaginas }">
					<td>
						<a href="parlamentarRecebido?pagina=${paginaAtual + 1}&nome=${estatistica.nome }">&rarr;</a>
					</td>
				</c:if>
			</div><!-- fim da id paginas -->
			
			<div id="rodape">
				<jsp:include page = 'Footer.html'/>
			</div> <!-- Fim da div rodap� -->
		</div><!--fim da div tudo-->
	</body>
</html>