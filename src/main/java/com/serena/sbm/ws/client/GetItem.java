/**
 * GetItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class GetItem  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.ItemIdentifier itemId;

    private com.serena.sbm.ws.client.ResponseItemOptions options;

    public GetItem() {
    }

    public GetItem(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.ItemIdentifier itemId,
           com.serena.sbm.ws.client.ResponseItemOptions options) {
           this.auth = auth;
           this.itemId = itemId;
           this.options = options;
    }


    /**
     * Gets the auth value for this GetItem.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this GetItem.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the itemId value for this GetItem.
     * 
     * @return itemId
     */
    public com.serena.sbm.ws.client.ItemIdentifier getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this GetItem.
     * 
     * @param itemId
     */
    public void setItemId(com.serena.sbm.ws.client.ItemIdentifier itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the options value for this GetItem.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.ResponseItemOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this GetItem.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.ResponseItemOptions options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetItem)) return false;
        GetItem other = (GetItem) obj;
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
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions())));
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
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">GetItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ResponseItemOptions"));
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
