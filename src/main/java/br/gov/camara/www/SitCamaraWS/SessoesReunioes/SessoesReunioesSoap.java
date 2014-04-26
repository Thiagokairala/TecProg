/**
 * SessoesReunioesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Class: SessionsMeetingsSoap
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
package br.gov.camara.www.SitCamaraWS.SessoesReunioes;

public interface SessoesReunioesSoap extends java.rmi.Remote {
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarSituacoesReuniaoSessaoResponseListarSituacoesReuniaoSessaoResult listarSituacoesReuniaoSessao() throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasParlamentarResponseListarPresencasParlamentarResult listarPresencasParlamentar(java.lang.String dataIni, java.lang.String dataFim, java.lang.String numMatriculaParlamentar) throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarDiscursosPlenarioResponseListarDiscursosPlenarioResult listarDiscursosPlenario(java.lang.String dataIni, java.lang.String dataFim, java.lang.String codigoSessao, java.lang.String parteNomeParlamentar, java.lang.String siglaPartido, java.lang.String siglaUF) throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult obterInteiroTeorDiscursosPlenario(java.lang.String codSessao, java.lang.String numOrador, java.lang.String numQuarto, java.lang.String numInsercao) throws java.rmi.RemoteException;
    public br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasDiaResponseListarPresencasDiaResult listarPresencasDia(java.lang.String data, java.lang.String numMatriculaParlamentar, java.lang.String siglaPartido, java.lang.String siglaUF) throws java.rmi.RemoteException;
}
