/**
 * CreateNoteAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class CreateNoteAttachment  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.ItemIdentifier item;

    private com.serena.sbm.ws.client.UserIdentifier author;

    private com.serena.sbm.ws.client.NoteAttachmentContents noteContents;

    public CreateNoteAttachment() {
    }

    public CreateNoteAttachment(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.ItemIdentifier item,
           com.serena.sbm.ws.client.UserIdentifier author,
           com.serena.sbm.ws.client.NoteAttachmentContents noteContents) {
           this.auth = auth;
           this.item = item;
           this.author = author;
           this.noteContents = noteContents;
    }


    /**
     * Gets the auth value for this CreateNoteAttachment.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this CreateNoteAttachment.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the item value for this CreateNoteAttachment.
     * 
     * @return item
     */
    public com.serena.sbm.ws.client.ItemIdentifier getItem() {
        return item;
    }


    /**
     * Sets the item value for this CreateNoteAttachment.
     * 
     * @param item
     */
    public void setItem(com.serena.sbm.ws.client.ItemIdentifier item) {
        this.item = item;
    }


    /**
     * Gets the author value for this CreateNoteAttachment.
     * 
     * @return author
     */
    public com.serena.sbm.ws.client.UserIdentifier getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this CreateNoteAttachment.
     * 
     * @param author
     */
    public void setAuthor(com.serena.sbm.ws.client.UserIdentifier author) {
        this.author = author;
    }


    /**
     * Gets the noteContents value for this CreateNoteAttachment.
     * 
     * @return noteContents
     */
    public com.serena.sbm.ws.client.NoteAttachmentContents getNoteContents() {
        return noteContents;
    }


    /**
     * Sets the noteContents value for this CreateNoteAttachment.
     * 
     * @param noteContents
     */
    public void setNoteContents(com.serena.sbm.ws.client.NoteAttachmentContents noteContents) {
        this.noteContents = noteContents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateNoteAttachment)) return false;
        CreateNoteAttachment other = (CreateNoteAttachment) obj;
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
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.noteContents==null && other.getNoteContents()==null) || 
             (this.noteContents!=null &&
              this.noteContents.equals(other.getNoteContents())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getNoteContents() != null) {
            _hashCode += getNoteContents().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateNoteAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateNoteAttachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteContents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "noteContents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "NoteAttachmentContents"));
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
