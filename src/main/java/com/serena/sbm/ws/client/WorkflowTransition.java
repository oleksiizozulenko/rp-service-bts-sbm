/**
 * WorkflowTransition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class WorkflowTransition  implements java.io.Serializable {
    private com.serena.sbm.ws.client.TransitionIdentifier id;

    private com.serena.sbm.ws.client.TransitionStyle style;

    private com.serena.sbm.ws.client.Point[] point;

    private java.lang.String styleClass;

    private com.serena.sbm.ws.client.Point labelPosition;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public WorkflowTransition() {
    }

    public WorkflowTransition(
           com.serena.sbm.ws.client.TransitionIdentifier id,
           com.serena.sbm.ws.client.TransitionStyle style,
           com.serena.sbm.ws.client.Point[] point,
           java.lang.String styleClass,
           com.serena.sbm.ws.client.Point labelPosition,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.style = style;
           this.point = point;
           this.styleClass = styleClass;
           this.labelPosition = labelPosition;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this WorkflowTransition.
     * 
     * @return id
     */
    public com.serena.sbm.ws.client.TransitionIdentifier getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkflowTransition.
     * 
     * @param id
     */
    public void setId(com.serena.sbm.ws.client.TransitionIdentifier id) {
        this.id = id;
    }


    /**
     * Gets the style value for this WorkflowTransition.
     * 
     * @return style
     */
    public com.serena.sbm.ws.client.TransitionStyle getStyle() {
        return style;
    }


    /**
     * Sets the style value for this WorkflowTransition.
     * 
     * @param style
     */
    public void setStyle(com.serena.sbm.ws.client.TransitionStyle style) {
        this.style = style;
    }


    /**
     * Gets the point value for this WorkflowTransition.
     * 
     * @return point
     */
    public com.serena.sbm.ws.client.Point[] getPoint() {
        return point;
    }


    /**
     * Sets the point value for this WorkflowTransition.
     * 
     * @param point
     */
    public void setPoint(com.serena.sbm.ws.client.Point[] point) {
        this.point = point;
    }

    public com.serena.sbm.ws.client.Point getPoint(int i) {
        return this.point[i];
    }

    public void setPoint(int i, com.serena.sbm.ws.client.Point _value) {
        this.point[i] = _value;
    }


    /**
     * Gets the styleClass value for this WorkflowTransition.
     * 
     * @return styleClass
     */
    public java.lang.String getStyleClass() {
        return styleClass;
    }


    /**
     * Sets the styleClass value for this WorkflowTransition.
     * 
     * @param styleClass
     */
    public void setStyleClass(java.lang.String styleClass) {
        this.styleClass = styleClass;
    }


    /**
     * Gets the labelPosition value for this WorkflowTransition.
     * 
     * @return labelPosition
     */
    public com.serena.sbm.ws.client.Point getLabelPosition() {
        return labelPosition;
    }


    /**
     * Sets the labelPosition value for this WorkflowTransition.
     * 
     * @param labelPosition
     */
    public void setLabelPosition(com.serena.sbm.ws.client.Point labelPosition) {
        this.labelPosition = labelPosition;
    }


    /**
     * Gets the extendedData value for this WorkflowTransition.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this WorkflowTransition.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowTransition)) return false;
        WorkflowTransition other = (WorkflowTransition) obj;
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
            ((this.style==null && other.getStyle()==null) || 
             (this.style!=null &&
              this.style.equals(other.getStyle()))) &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              java.util.Arrays.equals(this.point, other.getPoint()))) &&
            ((this.styleClass==null && other.getStyleClass()==null) || 
             (this.styleClass!=null &&
              this.styleClass.equals(other.getStyleClass()))) &&
            ((this.labelPosition==null && other.getLabelPosition()==null) || 
             (this.labelPosition!=null &&
              this.labelPosition.equals(other.getLabelPosition()))) &&
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
        if (getStyle() != null) {
            _hashCode += getStyle().hashCode();
        }
        if (getPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStyleClass() != null) {
            _hashCode += getStyleClass().hashCode();
        }
        if (getLabelPosition() != null) {
            _hashCode += getLabelPosition().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowTransition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowTransition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("style");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "style"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Transition-Style"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Point"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "styleClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "labelPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Point"));
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
