/**
 * WorkflowComment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class WorkflowComment  implements java.io.Serializable {
    private java.math.BigInteger id;

    private com.serena.sbm.ws.client.Point center;

    private com.serena.sbm.ws.client.Size size;

    private java.lang.String text;

    private java.lang.String styleClass;

    private java.lang.String styleOverride;

    private com.serena.sbm.ws.client.TransitionIdentifier ownerTransition;

    private com.serena.sbm.ws.client.StateIdentifier ownerState;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public WorkflowComment() {
    }

    public WorkflowComment(
           java.math.BigInteger id,
           com.serena.sbm.ws.client.Point center,
           com.serena.sbm.ws.client.Size size,
           java.lang.String text,
           java.lang.String styleClass,
           java.lang.String styleOverride,
           com.serena.sbm.ws.client.TransitionIdentifier ownerTransition,
           com.serena.sbm.ws.client.StateIdentifier ownerState,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.center = center;
           this.size = size;
           this.text = text;
           this.styleClass = styleClass;
           this.styleOverride = styleOverride;
           this.ownerTransition = ownerTransition;
           this.ownerState = ownerState;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this WorkflowComment.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkflowComment.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the center value for this WorkflowComment.
     * 
     * @return center
     */
    public com.serena.sbm.ws.client.Point getCenter() {
        return center;
    }


    /**
     * Sets the center value for this WorkflowComment.
     * 
     * @param center
     */
    public void setCenter(com.serena.sbm.ws.client.Point center) {
        this.center = center;
    }


    /**
     * Gets the size value for this WorkflowComment.
     * 
     * @return size
     */
    public com.serena.sbm.ws.client.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this WorkflowComment.
     * 
     * @param size
     */
    public void setSize(com.serena.sbm.ws.client.Size size) {
        this.size = size;
    }


    /**
     * Gets the text value for this WorkflowComment.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this WorkflowComment.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the styleClass value for this WorkflowComment.
     * 
     * @return styleClass
     */
    public java.lang.String getStyleClass() {
        return styleClass;
    }


    /**
     * Sets the styleClass value for this WorkflowComment.
     * 
     * @param styleClass
     */
    public void setStyleClass(java.lang.String styleClass) {
        this.styleClass = styleClass;
    }


    /**
     * Gets the styleOverride value for this WorkflowComment.
     * 
     * @return styleOverride
     */
    public java.lang.String getStyleOverride() {
        return styleOverride;
    }


    /**
     * Sets the styleOverride value for this WorkflowComment.
     * 
     * @param styleOverride
     */
    public void setStyleOverride(java.lang.String styleOverride) {
        this.styleOverride = styleOverride;
    }


    /**
     * Gets the ownerTransition value for this WorkflowComment.
     * 
     * @return ownerTransition
     */
    public com.serena.sbm.ws.client.TransitionIdentifier getOwnerTransition() {
        return ownerTransition;
    }


    /**
     * Sets the ownerTransition value for this WorkflowComment.
     * 
     * @param ownerTransition
     */
    public void setOwnerTransition(com.serena.sbm.ws.client.TransitionIdentifier ownerTransition) {
        this.ownerTransition = ownerTransition;
    }


    /**
     * Gets the ownerState value for this WorkflowComment.
     * 
     * @return ownerState
     */
    public com.serena.sbm.ws.client.StateIdentifier getOwnerState() {
        return ownerState;
    }


    /**
     * Sets the ownerState value for this WorkflowComment.
     * 
     * @param ownerState
     */
    public void setOwnerState(com.serena.sbm.ws.client.StateIdentifier ownerState) {
        this.ownerState = ownerState;
    }


    /**
     * Gets the extendedData value for this WorkflowComment.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this WorkflowComment.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowComment)) return false;
        WorkflowComment other = (WorkflowComment) obj;
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
            ((this.center==null && other.getCenter()==null) || 
             (this.center!=null &&
              this.center.equals(other.getCenter()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.styleClass==null && other.getStyleClass()==null) || 
             (this.styleClass!=null &&
              this.styleClass.equals(other.getStyleClass()))) &&
            ((this.styleOverride==null && other.getStyleOverride()==null) || 
             (this.styleOverride!=null &&
              this.styleOverride.equals(other.getStyleOverride()))) &&
            ((this.ownerTransition==null && other.getOwnerTransition()==null) || 
             (this.ownerTransition!=null &&
              this.ownerTransition.equals(other.getOwnerTransition()))) &&
            ((this.ownerState==null && other.getOwnerState()==null) || 
             (this.ownerState!=null &&
              this.ownerState.equals(other.getOwnerState()))) &&
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
        if (getCenter() != null) {
            _hashCode += getCenter().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getStyleClass() != null) {
            _hashCode += getStyleClass().hashCode();
        }
        if (getStyleOverride() != null) {
            _hashCode += getStyleOverride().hashCode();
        }
        if (getOwnerTransition() != null) {
            _hashCode += getOwnerTransition().hashCode();
        }
        if (getOwnerState() != null) {
            _hashCode += getOwnerState().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowComment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowComment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("center");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "center"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Point"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("ownerTransition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "ownerTransition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "ownerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "StateIdentifier"));
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
