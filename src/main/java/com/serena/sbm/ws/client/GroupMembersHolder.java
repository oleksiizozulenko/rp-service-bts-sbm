/**
 * GroupMembersHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class GroupMembersHolder  implements java.io.Serializable {
    private com.serena.sbm.ws.client.GroupIdentifierEx group;

    private com.serena.sbm.ws.client.UserIdentifierEx[] member;

    private com.serena.sbm.ws.client.Status[] status;

    public GroupMembersHolder() {
    }

    public GroupMembersHolder(
           com.serena.sbm.ws.client.GroupIdentifierEx group,
           com.serena.sbm.ws.client.UserIdentifierEx[] member,
           com.serena.sbm.ws.client.Status[] status) {
           this.group = group;
           this.member = member;
           this.status = status;
    }


    /**
     * Gets the group value for this GroupMembersHolder.
     * 
     * @return group
     */
    public com.serena.sbm.ws.client.GroupIdentifierEx getGroup() {
        return group;
    }


    /**
     * Sets the group value for this GroupMembersHolder.
     * 
     * @param group
     */
    public void setGroup(com.serena.sbm.ws.client.GroupIdentifierEx group) {
        this.group = group;
    }


    /**
     * Gets the member value for this GroupMembersHolder.
     * 
     * @return member
     */
    public com.serena.sbm.ws.client.UserIdentifierEx[] getMember() {
        return member;
    }


    /**
     * Sets the member value for this GroupMembersHolder.
     * 
     * @param member
     */
    public void setMember(com.serena.sbm.ws.client.UserIdentifierEx[] member) {
        this.member = member;
    }

    public com.serena.sbm.ws.client.UserIdentifierEx getMember(int i) {
        return this.member[i];
    }

    public void setMember(int i, com.serena.sbm.ws.client.UserIdentifierEx _value) {
        this.member[i] = _value;
    }


    /**
     * Gets the status value for this GroupMembersHolder.
     * 
     * @return status
     */
    public com.serena.sbm.ws.client.Status[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GroupMembersHolder.
     * 
     * @param status
     */
    public void setStatus(com.serena.sbm.ws.client.Status[] status) {
        this.status = status;
    }

    public com.serena.sbm.ws.client.Status getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.serena.sbm.ws.client.Status _value) {
        this.status[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupMembersHolder)) return false;
        GroupMembersHolder other = (GroupMembersHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.member==null && other.getMember()==null) || 
             (this.member!=null &&
              java.util.Arrays.equals(this.member, other.getMember()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus())));
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
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupMembersHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "GroupMembersHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "GroupIdentifierEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifierEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
