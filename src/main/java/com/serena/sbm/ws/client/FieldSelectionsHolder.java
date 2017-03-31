/**
 * FieldSelectionsHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class FieldSelectionsHolder  implements java.io.Serializable {
    private com.serena.sbm.ws.client.FieldIdentifier field;

    private com.serena.sbm.ws.client.SelectionType type;

    private com.serena.sbm.ws.client.FieldAttribute[] attribute;

    private com.serena.sbm.ws.client.SelectionOption[] option;

    private com.serena.sbm.ws.client.Status[] status;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public FieldSelectionsHolder() {
    }

    public FieldSelectionsHolder(
           com.serena.sbm.ws.client.FieldIdentifier field,
           com.serena.sbm.ws.client.SelectionType type,
           com.serena.sbm.ws.client.FieldAttribute[] attribute,
           com.serena.sbm.ws.client.SelectionOption[] option,
           com.serena.sbm.ws.client.Status[] status,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.field = field;
           this.type = type;
           this.attribute = attribute;
           this.option = option;
           this.status = status;
           this.extendedData = extendedData;
    }


    /**
     * Gets the field value for this FieldSelectionsHolder.
     * 
     * @return field
     */
    public com.serena.sbm.ws.client.FieldIdentifier getField() {
        return field;
    }


    /**
     * Sets the field value for this FieldSelectionsHolder.
     * 
     * @param field
     */
    public void setField(com.serena.sbm.ws.client.FieldIdentifier field) {
        this.field = field;
    }


    /**
     * Gets the type value for this FieldSelectionsHolder.
     * 
     * @return type
     */
    public com.serena.sbm.ws.client.SelectionType getType() {
        return type;
    }


    /**
     * Sets the type value for this FieldSelectionsHolder.
     * 
     * @param type
     */
    public void setType(com.serena.sbm.ws.client.SelectionType type) {
        this.type = type;
    }


    /**
     * Gets the attribute value for this FieldSelectionsHolder.
     * 
     * @return attribute
     */
    public com.serena.sbm.ws.client.FieldAttribute[] getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this FieldSelectionsHolder.
     * 
     * @param attribute
     */
    public void setAttribute(com.serena.sbm.ws.client.FieldAttribute[] attribute) {
        this.attribute = attribute;
    }

    public com.serena.sbm.ws.client.FieldAttribute getAttribute(int i) {
        return this.attribute[i];
    }

    public void setAttribute(int i, com.serena.sbm.ws.client.FieldAttribute _value) {
        this.attribute[i] = _value;
    }


    /**
     * Gets the option value for this FieldSelectionsHolder.
     * 
     * @return option
     */
    public com.serena.sbm.ws.client.SelectionOption[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this FieldSelectionsHolder.
     * 
     * @param option
     */
    public void setOption(com.serena.sbm.ws.client.SelectionOption[] option) {
        this.option = option;
    }

    public com.serena.sbm.ws.client.SelectionOption getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, com.serena.sbm.ws.client.SelectionOption _value) {
        this.option[i] = _value;
    }


    /**
     * Gets the status value for this FieldSelectionsHolder.
     * 
     * @return status
     */
    public com.serena.sbm.ws.client.Status[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FieldSelectionsHolder.
     * 
     * @param status
     */
    public void setStatus(com.serena.sbm.ws.client.Status[] status) {
        this.status = status;
    }

    public com.serena.sbm.ws.client.Status getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.serena.sbm.ws.client.Status _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the extendedData value for this FieldSelectionsHolder.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this FieldSelectionsHolder.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldSelectionsHolder)) return false;
        FieldSelectionsHolder other = (FieldSelectionsHolder) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              java.util.Arrays.equals(this.attribute, other.getAttribute()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldSelectionsHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldSelectionsHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Selection-Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Field-Attribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SelectionOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
