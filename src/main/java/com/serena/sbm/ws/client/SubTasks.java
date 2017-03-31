/**
 * SubTasks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class SubTasks  implements java.io.Serializable {
    private com.serena.sbm.ws.client.ItemIdentifier parentItemId;

    private com.serena.sbm.ws.client.ItemIdentifier[] subtask;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public SubTasks() {
    }

    public SubTasks(
           com.serena.sbm.ws.client.ItemIdentifier parentItemId,
           com.serena.sbm.ws.client.ItemIdentifier[] subtask,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.parentItemId = parentItemId;
           this.subtask = subtask;
           this.extendedData = extendedData;
    }


    /**
     * Gets the parentItemId value for this SubTasks.
     * 
     * @return parentItemId
     */
    public com.serena.sbm.ws.client.ItemIdentifier getParentItemId() {
        return parentItemId;
    }


    /**
     * Sets the parentItemId value for this SubTasks.
     * 
     * @param parentItemId
     */
    public void setParentItemId(com.serena.sbm.ws.client.ItemIdentifier parentItemId) {
        this.parentItemId = parentItemId;
    }


    /**
     * Gets the subtask value for this SubTasks.
     * 
     * @return subtask
     */
    public com.serena.sbm.ws.client.ItemIdentifier[] getSubtask() {
        return subtask;
    }


    /**
     * Sets the subtask value for this SubTasks.
     * 
     * @param subtask
     */
    public void setSubtask(com.serena.sbm.ws.client.ItemIdentifier[] subtask) {
        this.subtask = subtask;
    }

    public com.serena.sbm.ws.client.ItemIdentifier getSubtask(int i) {
        return this.subtask[i];
    }

    public void setSubtask(int i, com.serena.sbm.ws.client.ItemIdentifier _value) {
        this.subtask[i] = _value;
    }


    /**
     * Gets the extendedData value for this SubTasks.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this SubTasks.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubTasks)) return false;
        SubTasks other = (SubTasks) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parentItemId==null && other.getParentItemId()==null) || 
             (this.parentItemId!=null &&
              this.parentItemId.equals(other.getParentItemId()))) &&
            ((this.subtask==null && other.getSubtask()==null) || 
             (this.subtask!=null &&
              java.util.Arrays.equals(this.subtask, other.getSubtask()))) &&
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
        if (getParentItemId() != null) {
            _hashCode += getParentItemId().hashCode();
        }
        if (getSubtask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubtask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubtask(), i);
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
        new org.apache.axis.description.TypeDesc(SubTasks.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SubTasks"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "parentItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "subtask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
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
