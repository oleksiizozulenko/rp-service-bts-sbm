/**
 * WorkflowState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class WorkflowState  implements java.io.Serializable {
    private com.serena.sbm.ws.client.StateIdentifier id;

    private com.serena.sbm.ws.client.Point center;

    private com.serena.sbm.ws.client.Size size;

    private java.math.BigInteger radius;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public WorkflowState() {
    }

    public WorkflowState(
           com.serena.sbm.ws.client.StateIdentifier id,
           com.serena.sbm.ws.client.Point center,
           com.serena.sbm.ws.client.Size size,
           java.math.BigInteger radius,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.center = center;
           this.size = size;
           this.radius = radius;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this WorkflowState.
     * 
     * @return id
     */
    public com.serena.sbm.ws.client.StateIdentifier getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkflowState.
     * 
     * @param id
     */
    public void setId(com.serena.sbm.ws.client.StateIdentifier id) {
        this.id = id;
    }


    /**
     * Gets the center value for this WorkflowState.
     * 
     * @return center
     */
    public com.serena.sbm.ws.client.Point getCenter() {
        return center;
    }


    /**
     * Sets the center value for this WorkflowState.
     * 
     * @param center
     */
    public void setCenter(com.serena.sbm.ws.client.Point center) {
        this.center = center;
    }


    /**
     * Gets the size value for this WorkflowState.
     * 
     * @return size
     */
    public com.serena.sbm.ws.client.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this WorkflowState.
     * 
     * @param size
     */
    public void setSize(com.serena.sbm.ws.client.Size size) {
        this.size = size;
    }


    /**
     * Gets the radius value for this WorkflowState.
     * 
     * @return radius
     */
    public java.math.BigInteger getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this WorkflowState.
     * 
     * @param radius
     */
    public void setRadius(java.math.BigInteger radius) {
        this.radius = radius;
    }


    /**
     * Gets the extendedData value for this WorkflowState.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this WorkflowState.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowState)) return false;
        WorkflowState other = (WorkflowState) obj;
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
            ((this.radius==null && other.getRadius()==null) || 
             (this.radius!=null &&
              this.radius.equals(other.getRadius()))) &&
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
        if (getRadius() != null) {
            _hashCode += getRadius().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "StateIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
