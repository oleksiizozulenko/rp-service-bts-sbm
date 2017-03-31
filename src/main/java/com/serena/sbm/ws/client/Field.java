/**
 * Field.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class Field  implements java.io.Serializable {
    private com.serena.sbm.ws.client.FieldIdentifier field;

    private com.serena.sbm.ws.client.FieldType fieldType;

    private java.math.BigInteger attribute;

    private java.math.BigInteger properties;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public Field() {
    }

    public Field(
           com.serena.sbm.ws.client.FieldIdentifier field,
           com.serena.sbm.ws.client.FieldType fieldType,
           java.math.BigInteger attribute,
           java.math.BigInteger properties,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.field = field;
           this.fieldType = fieldType;
           this.attribute = attribute;
           this.properties = properties;
           this.extendedData = extendedData;
    }


    /**
     * Gets the field value for this Field.
     * 
     * @return field
     */
    public com.serena.sbm.ws.client.FieldIdentifier getField() {
        return field;
    }


    /**
     * Sets the field value for this Field.
     * 
     * @param field
     */
    public void setField(com.serena.sbm.ws.client.FieldIdentifier field) {
        this.field = field;
    }


    /**
     * Gets the fieldType value for this Field.
     * 
     * @return fieldType
     */
    public com.serena.sbm.ws.client.FieldType getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this Field.
     * 
     * @param fieldType
     */
    public void setFieldType(com.serena.sbm.ws.client.FieldType fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the attribute value for this Field.
     * 
     * @return attribute
     */
    public java.math.BigInteger getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this Field.
     * 
     * @param attribute
     */
    public void setAttribute(java.math.BigInteger attribute) {
        this.attribute = attribute;
    }


    /**
     * Gets the properties value for this Field.
     * 
     * @return properties
     */
    public java.math.BigInteger getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this Field.
     * 
     * @param properties
     */
    public void setProperties(java.math.BigInteger properties) {
        this.properties = properties;
    }


    /**
     * Gets the extendedData value for this Field.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this Field.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Field)) return false;
        Field other = (Field) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              this.attribute.equals(other.getAttribute()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties()))) &&
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
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getAttribute() != null) {
            _hashCode += getAttribute().hashCode();
        }
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Field.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Field"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Field-Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
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
