/**
 * ResponseItemOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ResponseItemOptions  extends com.serena.sbm.ws.client.Options  implements java.io.Serializable {
    private com.serena.sbm.ws.client.SectionsOption sections;

    private java.lang.String specifiedSections;

    private com.serena.sbm.ws.client.FieldIdentifier[] limitedField;

    public ResponseItemOptions() {
    }

    public ResponseItemOptions(
           com.serena.sbm.ws.client.ExtraValue[] extraOption,
           com.serena.sbm.ws.client.SectionsOption sections,
           java.lang.String specifiedSections,
           com.serena.sbm.ws.client.FieldIdentifier[] limitedField) {
        super(
            extraOption);
        this.sections = sections;
        this.specifiedSections = specifiedSections;
        this.limitedField = limitedField;
    }


    /**
     * Gets the sections value for this ResponseItemOptions.
     * 
     * @return sections
     */
    public com.serena.sbm.ws.client.SectionsOption getSections() {
        return sections;
    }


    /**
     * Sets the sections value for this ResponseItemOptions.
     * 
     * @param sections
     */
    public void setSections(com.serena.sbm.ws.client.SectionsOption sections) {
        this.sections = sections;
    }


    /**
     * Gets the specifiedSections value for this ResponseItemOptions.
     * 
     * @return specifiedSections
     */
    public java.lang.String getSpecifiedSections() {
        return specifiedSections;
    }


    /**
     * Sets the specifiedSections value for this ResponseItemOptions.
     * 
     * @param specifiedSections
     */
    public void setSpecifiedSections(java.lang.String specifiedSections) {
        this.specifiedSections = specifiedSections;
    }


    /**
     * Gets the limitedField value for this ResponseItemOptions.
     * 
     * @return limitedField
     */
    public com.serena.sbm.ws.client.FieldIdentifier[] getLimitedField() {
        return limitedField;
    }


    /**
     * Sets the limitedField value for this ResponseItemOptions.
     * 
     * @param limitedField
     */
    public void setLimitedField(com.serena.sbm.ws.client.FieldIdentifier[] limitedField) {
        this.limitedField = limitedField;
    }

    public com.serena.sbm.ws.client.FieldIdentifier getLimitedField(int i) {
        return this.limitedField[i];
    }

    public void setLimitedField(int i, com.serena.sbm.ws.client.FieldIdentifier _value) {
        this.limitedField[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseItemOptions)) return false;
        ResponseItemOptions other = (ResponseItemOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sections==null && other.getSections()==null) || 
             (this.sections!=null &&
              this.sections.equals(other.getSections()))) &&
            ((this.specifiedSections==null && other.getSpecifiedSections()==null) || 
             (this.specifiedSections!=null &&
              this.specifiedSections.equals(other.getSpecifiedSections()))) &&
            ((this.limitedField==null && other.getLimitedField()==null) || 
             (this.limitedField!=null &&
              java.util.Arrays.equals(this.limitedField, other.getLimitedField())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSections() != null) {
            _hashCode += getSections().hashCode();
        }
        if (getSpecifiedSections() != null) {
            _hashCode += getSpecifiedSections().hashCode();
        }
        if (getLimitedField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimitedField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimitedField(), i);
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
        new org.apache.axis.description.TypeDesc(ResponseItemOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ResponseItemOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "sections"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SectionsOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specifiedSections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "specifiedSections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitedField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "limitedField"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
