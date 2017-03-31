/**
 * WorkflowBand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class WorkflowBand  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Identifier id;

    private java.math.BigInteger origin;

    private com.serena.sbm.ws.client.BandOrientation orientation;

    private java.lang.String description;

    private java.math.BigInteger size;

    private java.lang.String styleClass;

    private java.lang.String styleOverride;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public WorkflowBand() {
    }

    public WorkflowBand(
           com.serena.sbm.ws.client.Identifier id,
           java.math.BigInteger origin,
           com.serena.sbm.ws.client.BandOrientation orientation,
           java.lang.String description,
           java.math.BigInteger size,
           java.lang.String styleClass,
           java.lang.String styleOverride,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.origin = origin;
           this.orientation = orientation;
           this.description = description;
           this.size = size;
           this.styleClass = styleClass;
           this.styleOverride = styleOverride;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this WorkflowBand.
     * 
     * @return id
     */
    public com.serena.sbm.ws.client.Identifier getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkflowBand.
     * 
     * @param id
     */
    public void setId(com.serena.sbm.ws.client.Identifier id) {
        this.id = id;
    }


    /**
     * Gets the origin value for this WorkflowBand.
     * 
     * @return origin
     */
    public java.math.BigInteger getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this WorkflowBand.
     * 
     * @param origin
     */
    public void setOrigin(java.math.BigInteger origin) {
        this.origin = origin;
    }


    /**
     * Gets the orientation value for this WorkflowBand.
     * 
     * @return orientation
     */
    public com.serena.sbm.ws.client.BandOrientation getOrientation() {
        return orientation;
    }


    /**
     * Sets the orientation value for this WorkflowBand.
     * 
     * @param orientation
     */
    public void setOrientation(com.serena.sbm.ws.client.BandOrientation orientation) {
        this.orientation = orientation;
    }


    /**
     * Gets the description value for this WorkflowBand.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WorkflowBand.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the size value for this WorkflowBand.
     * 
     * @return size
     */
    public java.math.BigInteger getSize() {
        return size;
    }


    /**
     * Sets the size value for this WorkflowBand.
     * 
     * @param size
     */
    public void setSize(java.math.BigInteger size) {
        this.size = size;
    }


    /**
     * Gets the styleClass value for this WorkflowBand.
     * 
     * @return styleClass
     */
    public java.lang.String getStyleClass() {
        return styleClass;
    }


    /**
     * Sets the styleClass value for this WorkflowBand.
     * 
     * @param styleClass
     */
    public void setStyleClass(java.lang.String styleClass) {
        this.styleClass = styleClass;
    }


    /**
     * Gets the styleOverride value for this WorkflowBand.
     * 
     * @return styleOverride
     */
    public java.lang.String getStyleOverride() {
        return styleOverride;
    }


    /**
     * Sets the styleOverride value for this WorkflowBand.
     * 
     * @param styleOverride
     */
    public void setStyleOverride(java.lang.String styleOverride) {
        this.styleOverride = styleOverride;
    }


    /**
     * Gets the extendedData value for this WorkflowBand.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this WorkflowBand.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowBand)) return false;
        WorkflowBand other = (WorkflowBand) obj;
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
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.orientation==null && other.getOrientation()==null) || 
             (this.orientation!=null &&
              this.orientation.equals(other.getOrientation()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.styleClass==null && other.getStyleClass()==null) || 
             (this.styleClass!=null &&
              this.styleClass.equals(other.getStyleClass()))) &&
            ((this.styleOverride==null && other.getStyleOverride()==null) || 
             (this.styleOverride!=null &&
              this.styleOverride.equals(other.getStyleOverride()))) &&
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
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getOrientation() != null) {
            _hashCode += getOrientation().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getStyleClass() != null) {
            _hashCode += getStyleClass().hashCode();
        }
        if (getStyleOverride() != null) {
            _hashCode += getStyleOverride().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowBand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowBand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orientation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "orientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Band-Orientation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "styleClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "styleOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
