/**
 * NoteAttachmentContents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class NoteAttachmentContents  implements java.io.Serializable {
    private java.math.BigInteger time;

    private java.lang.String title;

    private java.lang.String body;

    private com.serena.sbm.ws.client.AttachmentAccessType accessType;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public NoteAttachmentContents() {
    }

    public NoteAttachmentContents(
           java.math.BigInteger time,
           java.lang.String title,
           java.lang.String body,
           com.serena.sbm.ws.client.AttachmentAccessType accessType,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.time = time;
           this.title = title;
           this.body = body;
           this.accessType = accessType;
           this.extendedData = extendedData;
    }


    /**
     * Gets the time value for this NoteAttachmentContents.
     * 
     * @return time
     */
    public java.math.BigInteger getTime() {
        return time;
    }


    /**
     * Sets the time value for this NoteAttachmentContents.
     * 
     * @param time
     */
    public void setTime(java.math.BigInteger time) {
        this.time = time;
    }


    /**
     * Gets the title value for this NoteAttachmentContents.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NoteAttachmentContents.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the body value for this NoteAttachmentContents.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this NoteAttachmentContents.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the accessType value for this NoteAttachmentContents.
     * 
     * @return accessType
     */
    public com.serena.sbm.ws.client.AttachmentAccessType getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this NoteAttachmentContents.
     * 
     * @param accessType
     */
    public void setAccessType(com.serena.sbm.ws.client.AttachmentAccessType accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the extendedData value for this NoteAttachmentContents.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this NoteAttachmentContents.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoteAttachmentContents)) return false;
        NoteAttachmentContents other = (NoteAttachmentContents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
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
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
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
        new org.apache.axis.description.TypeDesc(NoteAttachmentContents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "NoteAttachmentContents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
