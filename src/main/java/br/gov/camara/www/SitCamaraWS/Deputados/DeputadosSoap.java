/**
 * DeputadosSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Class: DeputiesSoap
 * @author Thiago Ramires Kairala
 * @author Thabata Helen Macedo Granja
 * @author Eduardo Brasil Martins
 * @author João Guilherme Santana Araruna
 * @author Nilton Cesar Campos Araruna
 * @author Rafael Fazzolino Pinto Barbosa
 * @author Bruno Contessotto Bragança Pinheiro
 * Date: march 26 2014.
 * 
 * License: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 */
package br.gov.camara.www.SitCamaraWS.Deputados;

public interface DeputadosSoap extends java.rmi.Remote {
	public br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult obterDeputados()
			throws java.rmi.RemoteException;

	public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult obterPartidosCD()
			throws java.rmi.RemoteException;

	public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosBlocoCDResponseObterPartidosBlocoCDResult obterPartidosBlocoCD(
			java.lang.String idBloco, java.lang.String numLegislatura)
			throws java.rmi.RemoteException;

	public br.gov.camara.www.SitCamaraWS.Deputados.ObterDetalhesDeputadoResponseObterDetalhesDeputadoResult obterDetalhesDeputado(
			java.lang.String ideCadastro, java.lang.String numLegislatura)
			throws java.rmi.RemoteException;

	public br.gov.camara.www.SitCamaraWS.Deputados.ObterLideresBancadasResponseObterLideresBancadasResult obterLideresBancadas()
			throws java.rmi.RemoteException;
}
