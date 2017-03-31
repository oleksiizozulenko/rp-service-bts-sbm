/**
 * RoleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class RoleInfo  implements java.io.Serializable {
    private com.serena.sbm.ws.client.RoleIdentifier id;

    private com.serena.sbm.ws.client.GrantState access;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public RoleInfo() {
    }

    public RoleInfo(
           com.serena.sbm.ws.client.RoleIdentifier id,
           com.serena.sbm.ws.client.GrantState access,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.access = access;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this RoleInfo.
     * 
     * @return id
     */
    public com.serena.sbm.ws.client.RoleIdentifier getId() {
        return id;
    }


    /**
     * Sets the id value for this RoleInfo.
     * 
     * @param id
     */
    public void setId(com.serena.sbm.ws.client.RoleIdentifier id) {
        this.id = id;
    }


    /**
     * Gets the access value for this RoleInfo.
     * 
     * @return access
     */
    public com.serena.sbm.ws.client.GrantState getAccess() {
        return access;
    }


    /**
     * Sets the access value for this RoleInfo.
     * 
     * @param access
     */
    public void setAccess(com.serena.sbm.ws.client.GrantState access) {
        this.access = access;
    }


    /**
     * Gets the extendedData value for this RoleInfo.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this RoleInfo.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoleInfo)) return false;
        RoleInfo other = (RoleInfo) obj;
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
            ((this.access==null && other.getAccess()==null) || 
             (this.access!=null &&
              this.access.equals(other.getAccess()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAccess() != null) {
            _hashCode += getAccess().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "RoleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "RoleIdentifier"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "access"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "GrantState"));
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
