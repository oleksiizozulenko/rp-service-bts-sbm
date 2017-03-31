/**
 * SolutionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class SolutionData  implements java.io.Serializable {
    private com.serena.sbm.ws.client.SolutionIdentifier solution;

    private com.serena.sbm.ws.client.SolutionType type;

    private java.lang.String prefix;

    private java.lang.String description;

    private java.lang.String[] processAppUUID;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public SolutionData() {
    }

    public SolutionData(
           com.serena.sbm.ws.client.SolutionIdentifier solution,
           com.serena.sbm.ws.client.SolutionType type,
           java.lang.String prefix,
           java.lang.String description,
           java.lang.String[] processAppUUID,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.solution = solution;
           this.type = type;
           this.prefix = prefix;
           this.description = description;
           this.processAppUUID = processAppUUID;
           this.extendedData = extendedData;
    }


    /**
     * Gets the solution value for this SolutionData.
     * 
     * @return solution
     */
    public com.serena.sbm.ws.client.SolutionIdentifier getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this SolutionData.
     * 
     * @param solution
     */
    public void setSolution(com.serena.sbm.ws.client.SolutionIdentifier solution) {
        this.solution = solution;
    }


    /**
     * Gets the type value for this SolutionData.
     * 
     * @return type
     */
    public com.serena.sbm.ws.client.SolutionType getType() {
        return type;
    }


    /**
     * Sets the type value for this SolutionData.
     * 
     * @param type
     */
    public void setType(com.serena.sbm.ws.client.SolutionType type) {
        this.type = type;
    }


    /**
     * Gets the prefix value for this SolutionData.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this SolutionData.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the description value for this SolutionData.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SolutionData.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the processAppUUID value for this SolutionData.
     * 
     * @return processAppUUID
     */
    public java.lang.String[] getProcessAppUUID() {
        return processAppUUID;
    }


    /**
     * Sets the processAppUUID value for this SolutionData.
     * 
     * @param processAppUUID
     */
    public void setProcessAppUUID(java.lang.String[] processAppUUID) {
        this.processAppUUID = processAppUUID;
    }

    public java.lang.String getProcessAppUUID(int i) {
        return this.processAppUUID[i];
    }

    public void setProcessAppUUID(int i, java.lang.String _value) {
        this.processAppUUID[i] = _value;
    }


    /**
     * Gets the extendedData value for this SolutionData.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this SolutionData.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolutionData)) return false;
        SolutionData other = (SolutionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.solution==null && other.getSolution()==null) || 
             (this.solution!=null &&
              this.solution.equals(other.getSolution()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.processAppUUID==null && other.getProcessAppUUID()==null) || 
             (this.processAppUUID!=null &&
              java.util.Arrays.equals(this.processAppUUID, other.getProcessAppUUID()))) &&
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
        if (getSolution() != null) {
            _hashCode += getSolution().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getProcessAppUUID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessAppUUID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessAppUUID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolutionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Solution-Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processAppUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "processAppUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
