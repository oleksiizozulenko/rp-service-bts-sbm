/**
 * NoteLoggerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class NoteLoggerInfo  implements java.io.Serializable {
    private java.lang.String emailAddress;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public NoteLoggerInfo() {
    }

    public NoteLoggerInfo(
           java.lang.String emailAddress,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.emailAddress = emailAddress;
           this.extendedData = extendedData;
    }


    /**
     * Gets the emailAddress value for this NoteLoggerInfo.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this NoteLoggerInfo.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the extendedData value for this NoteLoggerInfo.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this NoteLoggerInfo.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoteLoggerInfo)) return false;
        NoteLoggerInfo other = (NoteLoggerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.extendedData==null && other.getExtendedData()==null) || 
             (this.extendedData!=null &&
              this.extendedData.equals(other.getExtendedData())));
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
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NoteLoggerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "NoteLoggerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "extendedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ExtendedData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
