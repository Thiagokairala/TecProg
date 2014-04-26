/**
 * Deputados.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Class: Deputies
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

public interface Deputados extends javax.xml.rpc.Service {
	public java.lang.String getDeputadosSoapAddress();

	public br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap getDeputadosSoap()
			throws javax.xml.rpc.ServiceException;

	public br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoap getDeputadosSoap(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
