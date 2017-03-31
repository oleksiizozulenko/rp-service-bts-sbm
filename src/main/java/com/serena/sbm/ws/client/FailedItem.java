/**
 * FailedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class FailedItem  implements java.io.Serializable {
    private com.serena.sbm.ws.client.ItemIdentifier itemId;

    private com.serena.sbm.ws.client.Status status;

    public FailedItem() {
    }

    public FailedItem(
           com.serena.sbm.ws.client.ItemIdentifier itemId,
           com.serena.sbm.ws.client.Status status) {
           this.itemId = itemId;
           this.status = status;
    }


    /**
     * Gets the itemId value for this FailedItem.
     * 
     * @return itemId
     */
    public com.serena.sbm.ws.client.ItemIdentifier getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this FailedItem.
     * 
     * @param itemId
     */
    public void setItemId(com.serena.sbm.ws.client.ItemIdentifier itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the status value for this FailedItem.
     * 
     * @return status
     */
    public com.serena.sbm.ws.client.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FailedItem.
     * 
     * @param status
     */
    public void setStatus(com.serena.sbm.ws.client.Status status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedItem)) return false;
        FailedItem other = (FailedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FailedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Status"));
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
