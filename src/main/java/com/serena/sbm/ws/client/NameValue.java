/**
 * NameValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class NameValue  implements java.io.Serializable {
    private com.serena.sbm.ws.client.FieldIdentifier id;

    private com.serena.sbm.ws.client.SetValueBy setValueBy;

    private com.serena.sbm.ws.client.SetValueMethod setValueMethod;

    private com.serena.sbm.ws.client.FieldValue[] value;

    public NameValue() {
    }

    public NameValue(
           com.serena.sbm.ws.client.FieldIdentifier id,
           com.serena.sbm.ws.client.SetValueBy setValueBy,
           com.serena.sbm.ws.client.SetValueMethod setValueMethod,
           com.serena.sbm.ws.client.FieldValue[] value) {
           this.id = id;
           this.setValueBy = setValueBy;
           this.setValueMethod = setValueMethod;
           this.value = value;
    }


    /**
     * Gets the id value for this NameValue.
     * 
     * @return id
     */
    public com.serena.sbm.ws.client.FieldIdentifier getId() {
        return id;
    }


    /**
     * Sets the id value for this NameValue.
     * 
     * @param id
     */
    public void setId(com.serena.sbm.ws.client.FieldIdentifier id) {
        this.id = id;
    }


    /**
     * Gets the setValueBy value for this NameValue.
     * 
     * @return setValueBy
     */
    public com.serena.sbm.ws.client.SetValueBy getSetValueBy() {
        return setValueBy;
    }


    /**
     * Sets the setValueBy value for this NameValue.
     * 
     * @param setValueBy
     */
    public void setSetValueBy(com.serena.sbm.ws.client.SetValueBy setValueBy) {
        this.setValueBy = setValueBy;
    }


    /**
     * Gets the setValueMethod value for this NameValue.
     * 
     * @return setValueMethod
     */
    public com.serena.sbm.ws.client.SetValueMethod getSetValueMethod() {
        return setValueMethod;
    }


    /**
     * Sets the setValueMethod value for this NameValue.
     * 
     * @param setValueMethod
     */
    public void setSetValueMethod(com.serena.sbm.ws.client.SetValueMethod setValueMethod) {
        this.setValueMethod = setValueMethod;
    }


    /**
     * Gets the value value for this NameValue.
     * 
     * @return value
     */
    public com.serena.sbm.ws.client.FieldValue[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this NameValue.
     * 
     * @param value
     */
    public void setValue(com.serena.sbm.ws.client.FieldValue[] value) {
        this.value = value;
    }

    public com.serena.sbm.ws.client.FieldValue getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.serena.sbm.ws.client.FieldValue _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameValue)) return false;
        NameValue other = (NameValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.setValueBy==null && other.getSetValueBy()==null) || 
             (this.setValueBy!=null &&
              this.setValueBy.equals(other.getSetValueBy()))) &&
            ((this.setValueMethod==null && other.getSetValueMethod()==null) || 
             (this.setValueMethod!=null &&
              this.setValueMethod.equals(other.getSetValueMethod()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSetValueBy() != null) {
            _hashCode += getSetValueBy().hashCode();
        }
        if (getSetValueMethod() != null) {
            _hashCode += getSetValueMethod().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
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
        new org.apache.axis.description.TypeDesc(NameValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "NameValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setValueBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "setValueBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Set-Value-By"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setValueMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "setValueMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Set-Value-Method"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldValue"));
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
