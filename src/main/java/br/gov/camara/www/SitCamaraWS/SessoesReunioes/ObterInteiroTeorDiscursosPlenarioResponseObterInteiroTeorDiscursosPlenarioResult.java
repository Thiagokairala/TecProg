/**
 * ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Class: ObtainIntegerContentSpeechesPlenaryResponseObtainIntegerSpeechesPlenaryResult
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

public class ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType, org.apache.axis.encoding.MixedContentType {
    private org.apache.axis.message.MessageElement [] _any;

    public ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult() {
    }

    public ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult(
           org.apache.axis.message.MessageElement [] _any) {
           this._any = _any;
    }


    /**
     * Gets the _any value for this ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult)) return false;
        ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult other = (ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterInteiroTeorDiscursosPlenarioResponseObterInteiroTeorDiscursosPlenarioResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes", ">>obterInteiroTeorDiscursosPlenarioResponse>obterInteiroTeorDiscursosPlenarioResult"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
