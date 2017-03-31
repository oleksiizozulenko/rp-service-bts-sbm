/**
 * GetItemsByQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class GetItemsByQuery  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.TableIdentifier table;

    private java.lang.String queryWhereClause;

    private java.lang.String orderByClause;

    private java.math.BigInteger firstRecord;

    private java.math.BigInteger maxReturnSize;

    private com.serena.sbm.ws.client.MultipleResponseItemOptions options;

    public GetItemsByQuery() {
    }

    public GetItemsByQuery(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.TableIdentifier table,
           java.lang.String queryWhereClause,
           java.lang.String orderByClause,
           java.math.BigInteger firstRecord,
           java.math.BigInteger maxReturnSize,
           com.serena.sbm.ws.client.MultipleResponseItemOptions options) {
           this.auth = auth;
           this.table = table;
           this.queryWhereClause = queryWhereClause;
           this.orderByClause = orderByClause;
           this.firstRecord = firstRecord;
           this.maxReturnSize = maxReturnSize;
           this.options = options;
    }


    /**
     * Gets the auth value for this GetItemsByQuery.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this GetItemsByQuery.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the table value for this GetItemsByQuery.
     * 
     * @return table
     */
    public com.serena.sbm.ws.client.TableIdentifier getTable() {
        return table;
    }


    /**
     * Sets the table value for this GetItemsByQuery.
     * 
     * @param table
     */
    public void setTable(com.serena.sbm.ws.client.TableIdentifier table) {
        this.table = table;
    }


    /**
     * Gets the queryWhereClause value for this GetItemsByQuery.
     * 
     * @return queryWhereClause
     */
    public java.lang.String getQueryWhereClause() {
        return queryWhereClause;
    }


    /**
     * Sets the queryWhereClause value for this GetItemsByQuery.
     * 
     * @param queryWhereClause
     */
    public void setQueryWhereClause(java.lang.String queryWhereClause) {
        this.queryWhereClause = queryWhereClause;
    }


    /**
     * Gets the orderByClause value for this GetItemsByQuery.
     * 
     * @return orderByClause
     */
    public java.lang.String getOrderByClause() {
        return orderByClause;
    }


    /**
     * Sets the orderByClause value for this GetItemsByQuery.
     * 
     * @param orderByClause
     */
    public void setOrderByClause(java.lang.String orderByClause) {
        this.orderByClause = orderByClause;
    }


    /**
     * Gets the firstRecord value for this GetItemsByQuery.
     * 
     * @return firstRecord
     */
    public java.math.BigInteger getFirstRecord() {
        return firstRecord;
    }


    /**
     * Sets the firstRecord value for this GetItemsByQuery.
     * 
     * @param firstRecord
     */
    public void setFirstRecord(java.math.BigInteger firstRecord) {
        this.firstRecord = firstRecord;
    }


    /**
     * Gets the maxReturnSize value for this GetItemsByQuery.
     * 
     * @return maxReturnSize
     */
    public java.math.BigInteger getMaxReturnSize() {
        return maxReturnSize;
    }


    /**
     * Sets the maxReturnSize value for this GetItemsByQuery.
     * 
     * @param maxReturnSize
     */
    public void setMaxReturnSize(java.math.BigInteger maxReturnSize) {
        this.maxReturnSize = maxReturnSize;
    }


    /**
     * Gets the options value for this GetItemsByQuery.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.MultipleResponseItemOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this GetItemsByQuery.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.MultipleResponseItemOptions options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetItemsByQuery)) return false;
        GetItemsByQuery other = (GetItemsByQuery) obj;
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
            ((this.table==null && other.getTable()==null) || 
             (this.table!=null &&
              this.table.equals(other.getTable()))) &&
            ((this.queryWhereClause==null && other.getQueryWhereClause()==null) || 
             (this.queryWhereClause!=null &&
              this.queryWhereClause.equals(other.getQueryWhereClause()))) &&
            ((this.orderByClause==null && other.getOrderByClause()==null) || 
             (this.orderByClause!=null &&
              this.orderByClause.equals(other.getOrderByClause()))) &&
            ((this.firstRecord==null && other.getFirstRecord()==null) || 
             (this.firstRecord!=null &&
              this.firstRecord.equals(other.getFirstRecord()))) &&
            ((this.maxReturnSize==null && other.getMaxReturnSize()==null) || 
             (this.maxReturnSize!=null &&
              this.maxReturnSize.equals(other.getMaxReturnSize()))) &&
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
        if (getTable() != null) {
            _hashCode += getTable().hashCode();
        }
        if (getQueryWhereClause() != null) {
            _hashCode += getQueryWhereClause().hashCode();
        }
        if (getOrderByClause() != null) {
            _hashCode += getOrderByClause().hashCode();
        }
        if (getFirstRecord() != null) {
            _hashCode += getFirstRecord().hashCode();
        }
        if (getMaxReturnSize() != null) {
            _hashCode += getMaxReturnSize().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetItemsByQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">GetItemsByQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("table");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "table"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryWhereClause");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "queryWhereClause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderByClause");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "orderByClause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "firstRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxReturnSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "maxReturnSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions"));
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
