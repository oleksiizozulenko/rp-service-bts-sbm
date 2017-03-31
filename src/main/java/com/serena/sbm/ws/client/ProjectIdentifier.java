/**
 * ProjectIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ProjectIdentifier  extends com.serena.sbm.ws.client.Identifier  implements java.io.Serializable {
    private java.lang.String fullyQualifiedName;

    private java.lang.String internalName;

    public ProjectIdentifier() {
    }

    public ProjectIdentifier(
           java.lang.String displayName,
           java.math.BigInteger id,
           java.lang.String uuid,
           java.lang.String fullyQualifiedName,
           java.lang.String internalName) {
        super(
            displayName,
            id,
            uuid);
        this.fullyQualifiedName = fullyQualifiedName;
        this.internalName = internalName;
    }


    /**
     * Gets the fullyQualifiedName value for this ProjectIdentifier.
     * 
     * @return fullyQualifiedName
     */
    public java.lang.String getFullyQualifiedName() {
        return fullyQualifiedName;
    }


    /**
     * Sets the fullyQualifiedName value for this ProjectIdentifier.
     * 
     * @param fullyQualifiedName
     */
    public void setFullyQualifiedName(java.lang.String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }


    /**
     * Gets the internalName value for this ProjectIdentifier.
     * 
     * @return internalName
     */
    public java.lang.String getInternalName() {
        return internalName;
    }


    /**
     * Sets the internalName value for this ProjectIdentifier.
     * 
     * @param internalName
     */
    public void setInternalName(java.lang.String internalName) {
        this.internalName = internalName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectIdentifier)) return false;
        ProjectIdentifier other = (ProjectIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fullyQualifiedName==null && other.getFullyQualifiedName()==null) || 
             (this.fullyQualifiedName!=null &&
              this.fullyQualifiedName.equals(other.getFullyQualifiedName()))) &&
            ((this.internalName==null && other.getInternalName()==null) || 
             (this.internalName!=null &&
              this.internalName.equals(other.getInternalName())));
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
        if (getFullyQualifiedName() != null) {
            _hashCode += getFullyQualifiedName().hashCode();
        }
        if (getInternalName() != null) {
            _hashCode += getInternalName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullyQualifiedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "fullyQualifiedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "internalName"));
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
