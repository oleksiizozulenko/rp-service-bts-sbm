/**
 * FieldValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class FieldValue  implements java.io.Serializable {
    private java.lang.String displayValue;

    private java.lang.String internalName;

    private java.lang.String internalValue;

    private java.lang.String uuid;

    public FieldValue() {
    }

    public FieldValue(
           java.lang.String displayValue,
           java.lang.String internalName,
           java.lang.String internalValue,
           java.lang.String uuid) {
           this.displayValue = displayValue;
           this.internalName = internalName;
           this.internalValue = internalValue;
           this.uuid = uuid;
    }


    /**
     * Gets the displayValue value for this FieldValue.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this FieldValue.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the internalName value for this FieldValue.
     * 
     * @return internalName
     */
    public java.lang.String getInternalName() {
        return internalName;
    }


    /**
     * Sets the internalName value for this FieldValue.
     * 
     * @param internalName
     */
    public void setInternalName(java.lang.String internalName) {
        this.internalName = internalName;
    }


    /**
     * Gets the internalValue value for this FieldValue.
     * 
     * @return internalValue
     */
    public java.lang.String getInternalValue() {
        return internalValue;
    }


    /**
     * Sets the internalValue value for this FieldValue.
     * 
     * @param internalValue
     */
    public void setInternalValue(java.lang.String internalValue) {
        this.internalValue = internalValue;
    }


    /**
     * Gets the uuid value for this FieldValue.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this FieldValue.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldValue)) return false;
        FieldValue other = (FieldValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.internalName==null && other.getInternalName()==null) || 
             (this.internalName!=null &&
              this.internalName.equals(other.getInternalName()))) &&
            ((this.internalValue==null && other.getInternalValue()==null) || 
             (this.internalValue!=null &&
              this.internalValue.equals(other.getInternalValue()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
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
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getInternalName() != null) {
            _hashCode += getInternalName().hashCode();
        }
        if (getInternalValue() != null) {
            _hashCode += getInternalValue().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "internalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "internalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "uuid"));
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
