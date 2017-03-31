/**
 * URLAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class URLAttachment  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String name;

    private java.lang.String url;

    private boolean showAsImage;

    private java.util.Calendar modificationDateTime;

    private com.serena.sbm.ws.client.AttachmentAccessType accessType;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public URLAttachment() {
    }

    public URLAttachment(
           java.math.BigInteger id,
           java.lang.String name,
           java.lang.String url,
           boolean showAsImage,
           java.util.Calendar modificationDateTime,
           com.serena.sbm.ws.client.AttachmentAccessType accessType,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.name = name;
           this.url = url;
           this.showAsImage = showAsImage;
           this.modificationDateTime = modificationDateTime;
           this.accessType = accessType;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this URLAttachment.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this URLAttachment.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the name value for this URLAttachment.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this URLAttachment.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the url value for this URLAttachment.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this URLAttachment.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the showAsImage value for this URLAttachment.
     * 
     * @return showAsImage
     */
    public boolean isShowAsImage() {
        return showAsImage;
    }


    /**
     * Sets the showAsImage value for this URLAttachment.
     * 
     * @param showAsImage
     */
    public void setShowAsImage(boolean showAsImage) {
        this.showAsImage = showAsImage;
    }


    /**
     * Gets the modificationDateTime value for this URLAttachment.
     * 
     * @return modificationDateTime
     */
    public java.util.Calendar getModificationDateTime() {
        return modificationDateTime;
    }


    /**
     * Sets the modificationDateTime value for this URLAttachment.
     * 
     * @param modificationDateTime
     */
    public void setModificationDateTime(java.util.Calendar modificationDateTime) {
        this.modificationDateTime = modificationDateTime;
    }


    /**
     * Gets the accessType value for this URLAttachment.
     * 
     * @return accessType
     */
    public com.serena.sbm.ws.client.AttachmentAccessType getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this URLAttachment.
     * 
     * @param accessType
     */
    public void setAccessType(com.serena.sbm.ws.client.AttachmentAccessType accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the extendedData value for this URLAttachment.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this URLAttachment.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof URLAttachment)) return false;
        URLAttachment other = (URLAttachment) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            this.showAsImage == other.isShowAsImage() &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        _hashCode += (isShowAsImage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(URLAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "URLAttachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showAsImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "showAsImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
