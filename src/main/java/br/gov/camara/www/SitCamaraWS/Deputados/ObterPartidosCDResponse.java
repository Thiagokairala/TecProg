/**
 * ObterPartidosCDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Class: ObtainPartiesCDResponse
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

public class ObterPartidosCDResponse implements java.io.Serializable {
	private br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult obterPartidosCDResult;

	public ObterPartidosCDResponse() {
	}

	public ObterPartidosCDResponse(
			br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult obterPartidosCDResult) {
		this.obterPartidosCDResult = obterPartidosCDResult;
	}

	/**
	 * Gets the obterPartidosCDResult value for this ObterPartidosCDResponse.
	 * 
	 * @return obterPartidosCDResult
	 */
	public br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult getObterPartidosCDResult() {
		return obterPartidosCDResult;
	}

	/**
	 * Sets the obterPartidosCDResult value for this ObterPartidosCDResponse.
	 * 
	 * @param obterPartidosCDResult
	 */
	public void setObterPartidosCDResult(
			br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult obterPartidosCDResult) {
		this.obterPartidosCDResult = obterPartidosCDResult;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ObterPartidosCDResponse))
			return false;
		ObterPartidosCDResponse other = (ObterPartidosCDResponse) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.obterPartidosCDResult == null && other
				.getObterPartidosCDResult() == null) || (this.obterPartidosCDResult != null && this.obterPartidosCDResult
				.equals(other.getObterPartidosCDResult())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getObterPartidosCDResult() != null) {
			_hashCode += getObterPartidosCDResult().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ObterPartidosCDResponse.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.camara.gov.br/SitCamaraWS/Deputados",
				">ObterPartidosCDResponse"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("obterPartidosCDResult");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://www.camara.gov.br/SitCamaraWS/Deputados",
				"ObterPartidosCDResult"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.camara.gov.br/SitCamaraWS/Deputados",
				">>ObterPartidosCDResponse>ObterPartidosCDResult"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
