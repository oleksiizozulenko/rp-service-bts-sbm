/**
 * LinkSubtask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class LinkSubtask  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.ItemIdentifier parentItem;

    private com.serena.sbm.ws.client.ItemIdentifier childItem;

    private com.serena.sbm.ws.client.Options options;

    public LinkSubtask() {
    }

    public LinkSubtask(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.ItemIdentifier parentItem,
           com.serena.sbm.ws.client.ItemIdentifier childItem,
           com.serena.sbm.ws.client.Options options) {
           this.auth = auth;
           this.parentItem = parentItem;
           this.childItem = childItem;
           this.options = options;
    }


    /**
     * Gets the auth value for this LinkSubtask.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this LinkSubtask.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the parentItem value for this LinkSubtask.
     * 
     * @return parentItem
     */
    public com.serena.sbm.ws.client.ItemIdentifier getParentItem() {
        return parentItem;
    }


    /**
     * Sets the parentItem value for this LinkSubtask.
     * 
     * @param parentItem
     */
    public void setParentItem(com.serena.sbm.ws.client.ItemIdentifier parentItem) {
        this.parentItem = parentItem;
    }


    /**
     * Gets the childItem value for this LinkSubtask.
     * 
     * @return childItem
     */
    public com.serena.sbm.ws.client.ItemIdentifier getChildItem() {
        return childItem;
    }


    /**
     * Sets the childItem value for this LinkSubtask.
     * 
     * @param childItem
     */
    public void setChildItem(com.serena.sbm.ws.client.ItemIdentifier childItem) {
        this.childItem = childItem;
    }


    /**
     * Gets the options value for this LinkSubtask.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.Options getOptions() {
        return options;
    }


    /**
     * Sets the options value for this LinkSubtask.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.Options options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkSubtask)) return false;
        LinkSubtask other = (LinkSubtask) obj;
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
            ((this.parentItem==null && other.getParentItem()==null) || 
             (this.parentItem!=null &&
              this.parentItem.equals(other.getParentItem()))) &&
            ((this.childItem==null && other.getChildItem()==null) || 
             (this.childItem!=null &&
              this.childItem.equals(other.getChildItem()))) &&
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
        if (getParentItem() != null) {
            _hashCode += getParentItem().hashCode();
        }
        if (getChildItem() != null) {
            _hashCode += getChildItem().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinkSubtask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">LinkSubtask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "parentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "childItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Options"));
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
