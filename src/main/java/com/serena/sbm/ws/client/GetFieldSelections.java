/**
 * GetFieldSelections.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class GetFieldSelections  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.FieldIdentifier[] field;

    private com.serena.sbm.ws.client.ProjectIdentifier project;

    public GetFieldSelections() {
    }

    public GetFieldSelections(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.FieldIdentifier[] field,
           com.serena.sbm.ws.client.ProjectIdentifier project) {
           this.auth = auth;
           this.field = field;
           this.project = project;
    }


    /**
     * Gets the auth value for this GetFieldSelections.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this GetFieldSelections.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the field value for this GetFieldSelections.
     * 
     * @return field
     */
    public com.serena.sbm.ws.client.FieldIdentifier[] getField() {
        return field;
    }


    /**
     * Sets the field value for this GetFieldSelections.
     * 
     * @param field
     */
    public void setField(com.serena.sbm.ws.client.FieldIdentifier[] field) {
        this.field = field;
    }

    public com.serena.sbm.ws.client.FieldIdentifier getField(int i) {
        return this.field[i];
    }

    public void setField(int i, com.serena.sbm.ws.client.FieldIdentifier _value) {
        this.field[i] = _value;
    }


    /**
     * Gets the project value for this GetFieldSelections.
     * 
     * @return project
     */
    public com.serena.sbm.ws.client.ProjectIdentifier getProject() {
        return project;
    }


    /**
     * Sets the project value for this GetFieldSelections.
     * 
     * @param project
     */
    public void setProject(com.serena.sbm.ws.client.ProjectIdentifier project) {
        this.project = project;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFieldSelections)) return false;
        GetFieldSelections other = (GetFieldSelections) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auth==null && other.getAuth()==null) || 
             (this.auth!=null &&
              this.auth.equals(other.getAuth()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              java.util.Arrays.equals(this.field, other.getField()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject())));
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
        if (getAuth() != null) {
            _hashCode += getAuth().hashCode();
        }
        if (getField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFieldSelections.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">GetFieldSelections"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"));
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
