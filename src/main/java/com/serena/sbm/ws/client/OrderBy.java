/**
 * OrderBy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class OrderBy  implements java.io.Serializable {
    private java.lang.String firstFieldName;

    private java.lang.String secondFieldName;

    public OrderBy() {
    }

    public OrderBy(
           java.lang.String firstFieldName,
           java.lang.String secondFieldName) {
           this.firstFieldName = firstFieldName;
           this.secondFieldName = secondFieldName;
    }


    /**
     * Gets the firstFieldName value for this OrderBy.
     * 
     * @return firstFieldName
     */
    public java.lang.String getFirstFieldName() {
        return firstFieldName;
    }


    /**
     * Sets the firstFieldName value for this OrderBy.
     * 
     * @param firstFieldName
     */
    public void setFirstFieldName(java.lang.String firstFieldName) {
        this.firstFieldName = firstFieldName;
    }


    /**
     * Gets the secondFieldName value for this OrderBy.
     * 
     * @return secondFieldName
     */
    public java.lang.String getSecondFieldName() {
        return secondFieldName;
    }


    /**
     * Sets the secondFieldName value for this OrderBy.
     * 
     * @param secondFieldName
     */
    public void setSecondFieldName(java.lang.String secondFieldName) {
        this.secondFieldName = secondFieldName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderBy)) return false;
        OrderBy other = (OrderBy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstFieldName==null && other.getFirstFieldName()==null) || 
             (this.firstFieldName!=null &&
              this.firstFieldName.equals(other.getFirstFieldName()))) &&
            ((this.secondFieldName==null && other.getSecondFieldName()==null) || 
             (this.secondFieldName!=null &&
              this.secondFieldName.equals(other.getSecondFieldName())));
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
        if (getFirstFieldName() != null) {
            _hashCode += getFirstFieldName().hashCode();
        }
        if (getSecondFieldName() != null) {
            _hashCode += getSecondFieldName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderBy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "OrderBy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "firstFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "secondFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
