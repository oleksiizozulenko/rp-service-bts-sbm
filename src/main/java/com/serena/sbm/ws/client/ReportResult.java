/**
 * ReportResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ReportResult  implements java.io.Serializable {
    private java.lang.String itemURL;

    private com.serena.sbm.ws.client.ItemIdentifier item;

    private com.serena.sbm.ws.client.FieldWithValue[] fieldValue;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public ReportResult() {
    }

    public ReportResult(
           java.lang.String itemURL,
           com.serena.sbm.ws.client.ItemIdentifier item,
           com.serena.sbm.ws.client.FieldWithValue[] fieldValue,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.itemURL = itemURL;
           this.item = item;
           this.fieldValue = fieldValue;
           this.extendedData = extendedData;
    }


    /**
     * Gets the itemURL value for this ReportResult.
     * 
     * @return itemURL
     */
    public java.lang.String getItemURL() {
        return itemURL;
    }


    /**
     * Sets the itemURL value for this ReportResult.
     * 
     * @param itemURL
     */
    public void setItemURL(java.lang.String itemURL) {
        this.itemURL = itemURL;
    }


    /**
     * Gets the item value for this ReportResult.
     * 
     * @return item
     */
    public com.serena.sbm.ws.client.ItemIdentifier getItem() {
        return item;
    }


    /**
     * Sets the item value for this ReportResult.
     * 
     * @param item
     */
    public void setItem(com.serena.sbm.ws.client.ItemIdentifier item) {
        this.item = item;
    }


    /**
     * Gets the fieldValue value for this ReportResult.
     * 
     * @return fieldValue
     */
    public com.serena.sbm.ws.client.FieldWithValue[] getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this ReportResult.
     * 
     * @param fieldValue
     */
    public void setFieldValue(com.serena.sbm.ws.client.FieldWithValue[] fieldValue) {
        this.fieldValue = fieldValue;
    }

    public com.serena.sbm.ws.client.FieldWithValue getFieldValue(int i) {
        return this.fieldValue[i];
    }

    public void setFieldValue(int i, com.serena.sbm.ws.client.FieldWithValue _value) {
        this.fieldValue[i] = _value;
    }


    /**
     * Gets the extendedData value for this ReportResult.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this ReportResult.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportResult)) return false;
        ReportResult other = (ReportResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemURL==null && other.getItemURL()==null) || 
             (this.itemURL!=null &&
              this.itemURL.equals(other.getItemURL()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              java.util.Arrays.equals(this.fieldValue, other.getFieldValue()))) &&
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
        if (getItemURL() != null) {
            _hashCode += getItemURL().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getFieldValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldValue(), i);
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
        new org.apache.axis.description.TypeDesc(ReportResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "itemURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "fieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldWithValue"));
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
