/**
 * DeleteItemsByQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class DeleteItemsByQuery  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.TableIdentifier table;

    private java.lang.String queryWhereClause;

    private com.serena.sbm.ws.client.MultipleOptions options;

    public DeleteItemsByQuery() {
    }

    public DeleteItemsByQuery(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.TableIdentifier table,
           java.lang.String queryWhereClause,
           com.serena.sbm.ws.client.MultipleOptions options) {
           this.auth = auth;
           this.table = table;
           this.queryWhereClause = queryWhereClause;
           this.options = options;
    }


    /**
     * Gets the auth value for this DeleteItemsByQuery.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this DeleteItemsByQuery.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the table value for this DeleteItemsByQuery.
     * 
     * @return table
     */
    public com.serena.sbm.ws.client.TableIdentifier getTable() {
        return table;
    }


    /**
     * Sets the table value for this DeleteItemsByQuery.
     * 
     * @param table
     */
    public void setTable(com.serena.sbm.ws.client.TableIdentifier table) {
        this.table = table;
    }


    /**
     * Gets the queryWhereClause value for this DeleteItemsByQuery.
     * 
     * @return queryWhereClause
     */
    public java.lang.String getQueryWhereClause() {
        return queryWhereClause;
    }


    /**
     * Sets the queryWhereClause value for this DeleteItemsByQuery.
     * 
     * @param queryWhereClause
     */
    public void setQueryWhereClause(java.lang.String queryWhereClause) {
        this.queryWhereClause = queryWhereClause;
    }


    /**
     * Gets the options value for this DeleteItemsByQuery.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.MultipleOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this DeleteItemsByQuery.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.MultipleOptions options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteItemsByQuery)) return false;
        DeleteItemsByQuery other = (DeleteItemsByQuery) obj;
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
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteItemsByQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">DeleteItemsByQuery"));
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
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleOptions"));
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
