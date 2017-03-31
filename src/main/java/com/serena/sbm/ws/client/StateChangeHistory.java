/**
 * StateChangeHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class StateChangeHistory  implements java.io.Serializable {
    private com.serena.sbm.ws.client.StateIdentifier newState;

    private com.serena.sbm.ws.client.TransitionIdentifier transition;

    private java.util.Calendar time;

    private com.serena.sbm.ws.client.UserIdentifier user;

    private com.serena.sbm.ws.client.UserIdentifier owner;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public StateChangeHistory() {
    }

    public StateChangeHistory(
           com.serena.sbm.ws.client.StateIdentifier newState,
           com.serena.sbm.ws.client.TransitionIdentifier transition,
           java.util.Calendar time,
           com.serena.sbm.ws.client.UserIdentifier user,
           com.serena.sbm.ws.client.UserIdentifier owner,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.newState = newState;
           this.transition = transition;
           this.time = time;
           this.user = user;
           this.owner = owner;
           this.extendedData = extendedData;
    }


    /**
     * Gets the newState value for this StateChangeHistory.
     * 
     * @return newState
     */
    public com.serena.sbm.ws.client.StateIdentifier getNewState() {
        return newState;
    }


    /**
     * Sets the newState value for this StateChangeHistory.
     * 
     * @param newState
     */
    public void setNewState(com.serena.sbm.ws.client.StateIdentifier newState) {
        this.newState = newState;
    }


    /**
     * Gets the transition value for this StateChangeHistory.
     * 
     * @return transition
     */
    public com.serena.sbm.ws.client.TransitionIdentifier getTransition() {
        return transition;
    }


    /**
     * Sets the transition value for this StateChangeHistory.
     * 
     * @param transition
     */
    public void setTransition(com.serena.sbm.ws.client.TransitionIdentifier transition) {
        this.transition = transition;
    }


    /**
     * Gets the time value for this StateChangeHistory.
     * 
     * @return time
     */
    public java.util.Calendar getTime() {
        return time;
    }


    /**
     * Sets the time value for this StateChangeHistory.
     * 
     * @param time
     */
    public void setTime(java.util.Calendar time) {
        this.time = time;
    }


    /**
     * Gets the user value for this StateChangeHistory.
     * 
     * @return user
     */
    public com.serena.sbm.ws.client.UserIdentifier getUser() {
        return user;
    }


    /**
     * Sets the user value for this StateChangeHistory.
     * 
     * @param user
     */
    public void setUser(com.serena.sbm.ws.client.UserIdentifier user) {
        this.user = user;
    }


    /**
     * Gets the owner value for this StateChangeHistory.
     * 
     * @return owner
     */
    public com.serena.sbm.ws.client.UserIdentifier getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this StateChangeHistory.
     * 
     * @param owner
     */
    public void setOwner(com.serena.sbm.ws.client.UserIdentifier owner) {
        this.owner = owner;
    }


    /**
     * Gets the extendedData value for this StateChangeHistory.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this StateChangeHistory.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StateChangeHistory)) return false;
        StateChangeHistory other = (StateChangeHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newState==null && other.getNewState()==null) || 
             (this.newState!=null &&
              this.newState.equals(other.getNewState()))) &&
            ((this.transition==null && other.getTransition()==null) || 
             (this.transition!=null &&
              this.transition.equals(other.getTransition()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
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
        if (getNewState() != null) {
            _hashCode += getNewState().hashCode();
        }
        if (getTransition() != null) {
            _hashCode += getTransition().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StateChangeHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "StateChangeHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "newState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "StateIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "transition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
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
