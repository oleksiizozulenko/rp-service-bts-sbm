/**
 * ReportDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ReportDefinition  implements java.io.Serializable {
    private com.serena.sbm.ws.client.OrderBy orderBy;

    private com.serena.sbm.ws.client.Field[] column;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public ReportDefinition() {
    }

    public ReportDefinition(
           com.serena.sbm.ws.client.OrderBy orderBy,
           com.serena.sbm.ws.client.Field[] column,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.orderBy = orderBy;
           this.column = column;
           this.extendedData = extendedData;
    }


    /**
     * Gets the orderBy value for this ReportDefinition.
     * 
     * @return orderBy
     */
    public com.serena.sbm.ws.client.OrderBy getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this ReportDefinition.
     * 
     * @param orderBy
     */
    public void setOrderBy(com.serena.sbm.ws.client.OrderBy orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the column value for this ReportDefinition.
     * 
     * @return column
     */
    public com.serena.sbm.ws.client.Field[] getColumn() {
        return column;
    }


    /**
     * Sets the column value for this ReportDefinition.
     * 
     * @param column
     */
    public void setColumn(com.serena.sbm.ws.client.Field[] column) {
        this.column = column;
    }

    public com.serena.sbm.ws.client.Field getColumn(int i) {
        return this.column[i];
    }

    public void setColumn(int i, com.serena.sbm.ws.client.Field _value) {
        this.column[i] = _value;
    }


    /**
     * Gets the extendedData value for this ReportDefinition.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this ReportDefinition.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinition)) return false;
        ReportDefinition other = (ReportDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              java.util.Arrays.equals(this.column, other.getColumn()))) &&
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
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        if (getColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumn(), i);
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
        new org.apache.axis.description.TypeDesc(ReportDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "orderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "OrderBy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Field"));
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
