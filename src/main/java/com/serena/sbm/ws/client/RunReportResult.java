/**
 * RunReportResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class RunReportResult  implements java.io.Serializable {
    private com.serena.sbm.ws.client.QueryRange queryRange;

    private com.serena.sbm.ws.client.ReportInfo reportInfo;

    private com.serena.sbm.ws.client.ReportDefinition reportDefinition;

    private com.serena.sbm.ws.client.ReportResult[] result;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public RunReportResult() {
    }

    public RunReportResult(
           com.serena.sbm.ws.client.QueryRange queryRange,
           com.serena.sbm.ws.client.ReportInfo reportInfo,
           com.serena.sbm.ws.client.ReportDefinition reportDefinition,
           com.serena.sbm.ws.client.ReportResult[] result,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.queryRange = queryRange;
           this.reportInfo = reportInfo;
           this.reportDefinition = reportDefinition;
           this.result = result;
           this.extendedData = extendedData;
    }


    /**
     * Gets the queryRange value for this RunReportResult.
     * 
     * @return queryRange
     */
    public com.serena.sbm.ws.client.QueryRange getQueryRange() {
        return queryRange;
    }


    /**
     * Sets the queryRange value for this RunReportResult.
     * 
     * @param queryRange
     */
    public void setQueryRange(com.serena.sbm.ws.client.QueryRange queryRange) {
        this.queryRange = queryRange;
    }


    /**
     * Gets the reportInfo value for this RunReportResult.
     * 
     * @return reportInfo
     */
    public com.serena.sbm.ws.client.ReportInfo getReportInfo() {
        return reportInfo;
    }


    /**
     * Sets the reportInfo value for this RunReportResult.
     * 
     * @param reportInfo
     */
    public void setReportInfo(com.serena.sbm.ws.client.ReportInfo reportInfo) {
        this.reportInfo = reportInfo;
    }


    /**
     * Gets the reportDefinition value for this RunReportResult.
     * 
     * @return reportDefinition
     */
    public com.serena.sbm.ws.client.ReportDefinition getReportDefinition() {
        return reportDefinition;
    }


    /**
     * Sets the reportDefinition value for this RunReportResult.
     * 
     * @param reportDefinition
     */
    public void setReportDefinition(com.serena.sbm.ws.client.ReportDefinition reportDefinition) {
        this.reportDefinition = reportDefinition;
    }


    /**
     * Gets the result value for this RunReportResult.
     * 
     * @return result
     */
    public com.serena.sbm.ws.client.ReportResult[] getResult() {
        return result;
    }


    /**
     * Sets the result value for this RunReportResult.
     * 
     * @param result
     */
    public void setResult(com.serena.sbm.ws.client.ReportResult[] result) {
        this.result = result;
    }

    public com.serena.sbm.ws.client.ReportResult getResult(int i) {
        return this.result[i];
    }

    public void setResult(int i, com.serena.sbm.ws.client.ReportResult _value) {
        this.result[i] = _value;
    }


    /**
     * Gets the extendedData value for this RunReportResult.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this RunReportResult.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunReportResult)) return false;
        RunReportResult other = (RunReportResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryRange==null && other.getQueryRange()==null) || 
             (this.queryRange!=null &&
              this.queryRange.equals(other.getQueryRange()))) &&
            ((this.reportInfo==null && other.getReportInfo()==null) || 
             (this.reportInfo!=null &&
              this.reportInfo.equals(other.getReportInfo()))) &&
            ((this.reportDefinition==null && other.getReportDefinition()==null) || 
             (this.reportDefinition!=null &&
              this.reportDefinition.equals(other.getReportDefinition()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              java.util.Arrays.equals(this.result, other.getResult()))) &&
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
        if (getQueryRange() != null) {
            _hashCode += getQueryRange().hashCode();
        }
        if (getReportInfo() != null) {
            _hashCode += getReportInfo().hashCode();
        }
        if (getReportDefinition() != null) {
            _hashCode += getReportDefinition().hashCode();
        }
        if (getResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResult(), i);
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
        new org.apache.axis.description.TypeDesc(RunReportResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "RunReportResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "queryRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "reportInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "reportDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportDefinition"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportResult"));
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
