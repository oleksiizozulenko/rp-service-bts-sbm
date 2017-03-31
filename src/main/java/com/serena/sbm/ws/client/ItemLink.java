/**
 * ItemLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ItemLink  implements java.io.Serializable {
    private java.math.BigInteger id;

    private com.serena.sbm.ws.client.ItemIdentifier itemID;

    private com.serena.sbm.ws.client.ItemLinkType linkType;

    private java.util.Calendar modificationDateTime;

    private com.serena.sbm.ws.client.AttachmentAccessType accessType;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public ItemLink() {
    }

    public ItemLink(
           java.math.BigInteger id,
           com.serena.sbm.ws.client.ItemIdentifier itemID,
           com.serena.sbm.ws.client.ItemLinkType linkType,
           java.util.Calendar modificationDateTime,
           com.serena.sbm.ws.client.AttachmentAccessType accessType,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.itemID = itemID;
           this.linkType = linkType;
           this.modificationDateTime = modificationDateTime;
           this.accessType = accessType;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this ItemLink.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this ItemLink.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the itemID value for this ItemLink.
     * 
     * @return itemID
     */
    public com.serena.sbm.ws.client.ItemIdentifier getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ItemLink.
     * 
     * @param itemID
     */
    public void setItemID(com.serena.sbm.ws.client.ItemIdentifier itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the linkType value for this ItemLink.
     * 
     * @return linkType
     */
    public com.serena.sbm.ws.client.ItemLinkType getLinkType() {
        return linkType;
    }


    /**
     * Sets the linkType value for this ItemLink.
     * 
     * @param linkType
     */
    public void setLinkType(com.serena.sbm.ws.client.ItemLinkType linkType) {
        this.linkType = linkType;
    }


    /**
     * Gets the modificationDateTime value for this ItemLink.
     * 
     * @return modificationDateTime
     */
    public java.util.Calendar getModificationDateTime() {
        return modificationDateTime;
    }


    /**
     * Sets the modificationDateTime value for this ItemLink.
     * 
     * @param modificationDateTime
     */
    public void setModificationDateTime(java.util.Calendar modificationDateTime) {
        this.modificationDateTime = modificationDateTime;
    }


    /**
     * Gets the accessType value for this ItemLink.
     * 
     * @return accessType
     */
    public com.serena.sbm.ws.client.AttachmentAccessType getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this ItemLink.
     * 
     * @param accessType
     */
    public void setAccessType(com.serena.sbm.ws.client.AttachmentAccessType accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the extendedData value for this ItemLink.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this ItemLink.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemLink)) return false;
        ItemLink other = (ItemLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.linkType==null && other.getLinkType()==null) || 
             (this.linkType!=null &&
              this.linkType.equals(other.getLinkType()))) &&
            ((this.modificationDateTime==null && other.getModificationDateTime()==null) || 
             (this.modificationDateTime!=null &&
              this.modificationDateTime.equals(other.getModificationDateTime()))) &&
            ((this.accessType==null && other.getAccessType()==null) || 
             (this.accessType!=null &&
              this.accessType.equals(other.getAccessType()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getLinkType() != null) {
            _hashCode += getLinkType().hashCode();
        }
        if (getModificationDateTime() != null) {
            _hashCode += getModificationDateTime().hashCode();
        }
        if (getAccessType() != null) {
            _hashCode += getAccessType().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "itemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "linkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemLink-Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "modificationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "accessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Attachment-Access-Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
