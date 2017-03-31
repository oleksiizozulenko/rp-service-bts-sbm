/**
 * ApplicationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ApplicationData  implements java.io.Serializable {
    private com.serena.sbm.ws.client.ApplicationIdentifier application;

    private java.lang.String description;

    private java.lang.String appDefUUID;

    private java.lang.String revision;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public ApplicationData() {
    }

    public ApplicationData(
           com.serena.sbm.ws.client.ApplicationIdentifier application,
           java.lang.String description,
           java.lang.String appDefUUID,
           java.lang.String revision,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.application = application;
           this.description = description;
           this.appDefUUID = appDefUUID;
           this.revision = revision;
           this.extendedData = extendedData;
    }


    /**
     * Gets the application value for this ApplicationData.
     * 
     * @return application
     */
    public com.serena.sbm.ws.client.ApplicationIdentifier getApplication() {
        return application;
    }


    /**
     * Sets the application value for this ApplicationData.
     * 
     * @param application
     */
    public void setApplication(com.serena.sbm.ws.client.ApplicationIdentifier application) {
        this.application = application;
    }


    /**
     * Gets the description value for this ApplicationData.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ApplicationData.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the appDefUUID value for this ApplicationData.
     * 
     * @return appDefUUID
     */
    public java.lang.String getAppDefUUID() {
        return appDefUUID;
    }


    /**
     * Sets the appDefUUID value for this ApplicationData.
     * 
     * @param appDefUUID
     */
    public void setAppDefUUID(java.lang.String appDefUUID) {
        this.appDefUUID = appDefUUID;
    }


    /**
     * Gets the revision value for this ApplicationData.
     * 
     * @return revision
     */
    public java.lang.String getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this ApplicationData.
     * 
     * @param revision
     */
    public void setRevision(java.lang.String revision) {
        this.revision = revision;
    }


    /**
     * Gets the extendedData value for this ApplicationData.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this ApplicationData.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationData)) return false;
        ApplicationData other = (ApplicationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.appDefUUID==null && other.getAppDefUUID()==null) || 
             (this.appDefUUID!=null &&
              this.appDefUUID.equals(other.getAppDefUUID()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
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
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAppDefUUID() != null) {
            _hashCode += getAppDefUUID().hashCode();
        }
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ApplicationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ApplicationIdentifier"));
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
        elemField.setFieldName("appDefUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "appDefUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "revision"));
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
