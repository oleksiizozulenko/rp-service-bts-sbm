/**
 * FileAttachmentContents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class FileAttachmentContents  extends com.serena.sbm.ws.client.FileAttachment  implements java.io.Serializable {
    private com.serena.sbm.ws.client.FileBufferBase64 contentsBase64;

    public FileAttachmentContents() {
    }

    public FileAttachmentContents(
           java.math.BigInteger id,
           java.lang.String name,
           java.lang.String fileName,
           boolean showAsImage,
           java.util.Calendar modificationDateTime,
           java.lang.String url,
           com.serena.sbm.ws.client.AttachmentAccessType accessType,
           com.serena.sbm.ws.client.ExtendedData extendedData,
           com.serena.sbm.ws.client.FileBufferBase64 contentsBase64) {
        super(
            id,
            name,
            fileName,
            showAsImage,
            modificationDateTime,
            url,
            accessType,
            extendedData);
        this.contentsBase64 = contentsBase64;
    }


    /**
     * Gets the contentsBase64 value for this FileAttachmentContents.
     * 
     * @return contentsBase64
     */
    public com.serena.sbm.ws.client.FileBufferBase64 getContentsBase64() {
        return contentsBase64;
    }


    /**
     * Sets the contentsBase64 value for this FileAttachmentContents.
     * 
     * @param contentsBase64
     */
    public void setContentsBase64(com.serena.sbm.ws.client.FileBufferBase64 contentsBase64) {
        this.contentsBase64 = contentsBase64;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileAttachmentContents)) return false;
        FileAttachmentContents other = (FileAttachmentContents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentsBase64==null && other.getContentsBase64()==null) || 
             (this.contentsBase64!=null &&
              this.contentsBase64.equals(other.getContentsBase64())));
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
        if (getContentsBase64() != null) {
            _hashCode += getContentsBase64().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileAttachmentContents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachmentContents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentsBase64");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "contentsBase64"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FileBufferBase64"));
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
