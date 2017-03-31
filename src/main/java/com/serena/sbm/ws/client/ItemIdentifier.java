/**
 * ItemIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ItemIdentifier  extends com.serena.sbm.ws.client.Identifier  implements java.io.Serializable {
    private java.math.BigInteger tableId;

    private java.lang.String tableIdItemId;

    private java.lang.String issueId;

    public ItemIdentifier() {
    }

    public ItemIdentifier(
           java.lang.String displayName,
           java.math.BigInteger id,
           java.lang.String uuid,
           java.math.BigInteger tableId,
           java.lang.String tableIdItemId,
           java.lang.String issueId) {
        super(
            displayName,
            id,
            uuid);
        this.tableId = tableId;
        this.tableIdItemId = tableIdItemId;
        this.issueId = issueId;
    }


    /**
     * Gets the tableId value for this ItemIdentifier.
     * 
     * @return tableId
     */
    public java.math.BigInteger getTableId() {
        return tableId;
    }


    /**
     * Sets the tableId value for this ItemIdentifier.
     * 
     * @param tableId
     */
    public void setTableId(java.math.BigInteger tableId) {
        this.tableId = tableId;
    }


    /**
     * Gets the tableIdItemId value for this ItemIdentifier.
     * 
     * @return tableIdItemId
     */
    public java.lang.String getTableIdItemId() {
        return tableIdItemId;
    }


    /**
     * Sets the tableIdItemId value for this ItemIdentifier.
     * 
     * @param tableIdItemId
     */
    public void setTableIdItemId(java.lang.String tableIdItemId) {
        this.tableIdItemId = tableIdItemId;
    }


    /**
     * Gets the issueId value for this ItemIdentifier.
     * 
     * @return issueId
     */
    public java.lang.String getIssueId() {
        return issueId;
    }


    /**
     * Sets the issueId value for this ItemIdentifier.
     * 
     * @param issueId
     */
    public void setIssueId(java.lang.String issueId) {
        this.issueId = issueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemIdentifier)) return false;
        ItemIdentifier other = (ItemIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tableId==null && other.getTableId()==null) || 
             (this.tableId!=null &&
              this.tableId.equals(other.getTableId()))) &&
            ((this.tableIdItemId==null && other.getTableIdItemId()==null) || 
             (this.tableIdItemId!=null &&
              this.tableIdItemId.equals(other.getTableIdItemId()))) &&
            ((this.issueId==null && other.getIssueId()==null) || 
             (this.issueId!=null &&
              this.issueId.equals(other.getIssueId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTableId() != null) {
            _hashCode += getTableId().hashCode();
        }
        if (getTableIdItemId() != null) {
            _hashCode += getTableIdItemId().hashCode();
        }
        if (getIssueId() != null) {
            _hashCode += getIssueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "tableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableIdItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "tableIdItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "issueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
