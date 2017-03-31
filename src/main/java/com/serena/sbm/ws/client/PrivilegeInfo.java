/**
 * PrivilegeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class PrivilegeInfo  implements java.io.Serializable {
    private com.serena.sbm.ws.client.PrivilegeIdentifier privilegeId;

    private com.serena.sbm.ws.client.GrantState access;

    private com.serena.sbm.ws.client.Identifier objectId;

    private com.serena.sbm.ws.client.ProjectIdentifier projectId;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public PrivilegeInfo() {
    }

    public PrivilegeInfo(
           com.serena.sbm.ws.client.PrivilegeIdentifier privilegeId,
           com.serena.sbm.ws.client.GrantState access,
           com.serena.sbm.ws.client.Identifier objectId,
           com.serena.sbm.ws.client.ProjectIdentifier projectId,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.privilegeId = privilegeId;
           this.access = access;
           this.objectId = objectId;
           this.projectId = projectId;
           this.extendedData = extendedData;
    }


    /**
     * Gets the privilegeId value for this PrivilegeInfo.
     * 
     * @return privilegeId
     */
    public com.serena.sbm.ws.client.PrivilegeIdentifier getPrivilegeId() {
        return privilegeId;
    }


    /**
     * Sets the privilegeId value for this PrivilegeInfo.
     * 
     * @param privilegeId
     */
    public void setPrivilegeId(com.serena.sbm.ws.client.PrivilegeIdentifier privilegeId) {
        this.privilegeId = privilegeId;
    }


    /**
     * Gets the access value for this PrivilegeInfo.
     * 
     * @return access
     */
    public com.serena.sbm.ws.client.GrantState getAccess() {
        return access;
    }


    /**
     * Sets the access value for this PrivilegeInfo.
     * 
     * @param access
     */
    public void setAccess(com.serena.sbm.ws.client.GrantState access) {
        this.access = access;
    }


    /**
     * Gets the objectId value for this PrivilegeInfo.
     * 
     * @return objectId
     */
    public com.serena.sbm.ws.client.Identifier getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this PrivilegeInfo.
     * 
     * @param objectId
     */
    public void setObjectId(com.serena.sbm.ws.client.Identifier objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the projectId value for this PrivilegeInfo.
     * 
     * @return projectId
     */
    public com.serena.sbm.ws.client.ProjectIdentifier getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this PrivilegeInfo.
     * 
     * @param projectId
     */
    public void setProjectId(com.serena.sbm.ws.client.ProjectIdentifier projectId) {
        this.projectId = projectId;
    }


    /**
     * Gets the extendedData value for this PrivilegeInfo.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this PrivilegeInfo.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrivilegeInfo)) return false;
        PrivilegeInfo other = (PrivilegeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.privilegeId==null && other.getPrivilegeId()==null) || 
             (this.privilegeId!=null &&
              this.privilegeId.equals(other.getPrivilegeId()))) &&
            ((this.access==null && other.getAccess()==null) || 
             (this.access!=null &&
              this.access.equals(other.getAccess()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.projectId==null && other.getProjectId()==null) || 
             (this.projectId!=null &&
              this.projectId.equals(other.getProjectId()))) &&
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
        if (getPrivilegeId() != null) {
            _hashCode += getPrivilegeId().hashCode();
        }
        if (getAccess() != null) {
            _hashCode += getAccess().hashCode();
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getProjectId() != null) {
            _hashCode += getProjectId().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrivilegeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "PrivilegeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "privilegeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "PrivilegeIdentifier"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "access"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "GrantState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "objectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "projectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"));
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
