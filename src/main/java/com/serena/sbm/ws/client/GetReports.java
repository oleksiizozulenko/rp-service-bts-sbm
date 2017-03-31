/**
 * GetReports.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class GetReports  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.QueryRange queryRange;

    private com.serena.sbm.ws.client.ReportsFilter reportsFilter;

    private com.serena.sbm.ws.client.Options options;

    public GetReports() {
    }

    public GetReports(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.QueryRange queryRange,
           com.serena.sbm.ws.client.ReportsFilter reportsFilter,
           com.serena.sbm.ws.client.Options options) {
           this.auth = auth;
           this.queryRange = queryRange;
           this.reportsFilter = reportsFilter;
           this.options = options;
    }


    /**
     * Gets the auth value for this GetReports.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this GetReports.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the queryRange value for this GetReports.
     * 
     * @return queryRange
     */
    public com.serena.sbm.ws.client.QueryRange getQueryRange() {
        return queryRange;
    }


    /**
     * Sets the queryRange value for this GetReports.
     * 
     * @param queryRange
     */
    public void setQueryRange(com.serena.sbm.ws.client.QueryRange queryRange) {
        this.queryRange = queryRange;
    }


    /**
     * Gets the reportsFilter value for this GetReports.
     * 
     * @return reportsFilter
     */
    public com.serena.sbm.ws.client.ReportsFilter getReportsFilter() {
        return reportsFilter;
    }


    /**
     * Sets the reportsFilter value for this GetReports.
     * 
     * @param reportsFilter
     */
    public void setReportsFilter(com.serena.sbm.ws.client.ReportsFilter reportsFilter) {
        this.reportsFilter = reportsFilter;
    }


    /**
     * Gets the options value for this GetReports.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.Options getOptions() {
        return options;
    }


    /**
     * Sets the options value for this GetReports.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.Options options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReports)) return false;
        GetReports other = (GetReports) obj;
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
            ((this.queryRange==null && other.getQueryRange()==null) || 
             (this.queryRange!=null &&
              this.queryRange.equals(other.getQueryRange()))) &&
            ((this.reportsFilter==null && other.getReportsFilter()==null) || 
             (this.reportsFilter!=null &&
              this.reportsFilter.equals(other.getReportsFilter()))) &&
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
        if (getQueryRange() != null) {
            _hashCode += getQueryRange().hashCode();
        }
        if (getReportsFilter() != null) {
            _hashCode += getReportsFilter().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetReports.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">GetReports"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "queryRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportsFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "reportsFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportsFilter"));
        elemField.setMinOccurs(0);
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
