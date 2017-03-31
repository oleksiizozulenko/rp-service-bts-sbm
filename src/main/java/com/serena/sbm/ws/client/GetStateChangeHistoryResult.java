/**
 * GetStateChangeHistoryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class GetStateChangeHistoryResult  implements java.io.Serializable {
    private com.serena.sbm.ws.client.QueryRange queryRange;

    private com.serena.sbm.ws.client.StateChangeHistory[] stateChangeHistory;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public GetStateChangeHistoryResult() {
    }

    public GetStateChangeHistoryResult(
           com.serena.sbm.ws.client.QueryRange queryRange,
           com.serena.sbm.ws.client.StateChangeHistory[] stateChangeHistory,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.queryRange = queryRange;
           this.stateChangeHistory = stateChangeHistory;
           this.extendedData = extendedData;
    }


    /**
     * Gets the queryRange value for this GetStateChangeHistoryResult.
     * 
     * @return queryRange
     */
    public com.serena.sbm.ws.client.QueryRange getQueryRange() {
        return queryRange;
    }


    /**
     * Sets the queryRange value for this GetStateChangeHistoryResult.
     * 
     * @param queryRange
     */
    public void setQueryRange(com.serena.sbm.ws.client.QueryRange queryRange) {
        this.queryRange = queryRange;
    }


    /**
     * Gets the stateChangeHistory value for this GetStateChangeHistoryResult.
     * 
     * @return stateChangeHistory
     */
    public com.serena.sbm.ws.client.StateChangeHistory[] getStateChangeHistory() {
        return stateChangeHistory;
    }


    /**
     * Sets the stateChangeHistory value for this GetStateChangeHistoryResult.
     * 
     * @param stateChangeHistory
     */
    public void setStateChangeHistory(com.serena.sbm.ws.client.StateChangeHistory[] stateChangeHistory) {
        this.stateChangeHistory = stateChangeHistory;
    }

    public com.serena.sbm.ws.client.StateChangeHistory getStateChangeHistory(int i) {
        return this.stateChangeHistory[i];
    }

    public void setStateChangeHistory(int i, com.serena.sbm.ws.client.StateChangeHistory _value) {
        this.stateChangeHistory[i] = _value;
    }


    /**
     * Gets the extendedData value for this GetStateChangeHistoryResult.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this GetStateChangeHistoryResult.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStateChangeHistoryResult)) return false;
        GetStateChangeHistoryResult other = (GetStateChangeHistoryResult) obj;
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
            ((this.stateChangeHistory==null && other.getStateChangeHistory()==null) || 
             (this.stateChangeHistory!=null &&
              java.util.Arrays.equals(this.stateChangeHistory, other.getStateChangeHistory()))) &&
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
        if (getStateChangeHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateChangeHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateChangeHistory(), i);
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
        new org.apache.axis.description.TypeDesc(GetStateChangeHistoryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "GetStateChangeHistoryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "queryRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateChangeHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "stateChangeHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "StateChangeHistory"));
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
