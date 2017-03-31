/**
 * QueryRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class QueryRange  implements java.io.Serializable {
    private java.math.BigInteger startIndex;

    private java.math.BigInteger fetchSize;

    private java.math.BigInteger totalCount;

    public QueryRange() {
    }

    public QueryRange(
           java.math.BigInteger startIndex,
           java.math.BigInteger fetchSize,
           java.math.BigInteger totalCount) {
           this.startIndex = startIndex;
           this.fetchSize = fetchSize;
           this.totalCount = totalCount;
    }


    /**
     * Gets the startIndex value for this QueryRange.
     * 
     * @return startIndex
     */
    public java.math.BigInteger getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this QueryRange.
     * 
     * @param startIndex
     */
    public void setStartIndex(java.math.BigInteger startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the fetchSize value for this QueryRange.
     * 
     * @return fetchSize
     */
    public java.math.BigInteger getFetchSize() {
        return fetchSize;
    }


    /**
     * Sets the fetchSize value for this QueryRange.
     * 
     * @param fetchSize
     */
    public void setFetchSize(java.math.BigInteger fetchSize) {
        this.fetchSize = fetchSize;
    }


    /**
     * Gets the totalCount value for this QueryRange.
     * 
     * @return totalCount
     */
    public java.math.BigInteger getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this QueryRange.
     * 
     * @param totalCount
     */
    public void setTotalCount(java.math.BigInteger totalCount) {
        this.totalCount = totalCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryRange)) return false;
        QueryRange other = (QueryRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.fetchSize==null && other.getFetchSize()==null) || 
             (this.fetchSize!=null &&
              this.fetchSize.equals(other.getFetchSize()))) &&
            ((this.totalCount==null && other.getTotalCount()==null) || 
             (this.totalCount!=null &&
              this.totalCount.equals(other.getTotalCount())));
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
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getFetchSize() != null) {
            _hashCode += getFetchSize().hashCode();
        }
        if (getTotalCount() != null) {
            _hashCode += getTotalCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "startIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "fetchSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "totalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
