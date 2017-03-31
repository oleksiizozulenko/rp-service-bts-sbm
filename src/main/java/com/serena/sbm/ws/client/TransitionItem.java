/**
 * TransitionItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class TransitionItem  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.TTItem item;

    private com.serena.sbm.ws.client.TransitionIdentifier transition;

    private java.lang.Boolean breakLock;

    private com.serena.sbm.ws.client.ResponseItemOptions options;

    public TransitionItem() {
    }

    public TransitionItem(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.TTItem item,
           com.serena.sbm.ws.client.TransitionIdentifier transition,
           java.lang.Boolean breakLock,
           com.serena.sbm.ws.client.ResponseItemOptions options) {
           this.auth = auth;
           this.item = item;
           this.transition = transition;
           this.breakLock = breakLock;
           this.options = options;
    }


    /**
     * Gets the auth value for this TransitionItem.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this TransitionItem.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the item value for this TransitionItem.
     * 
     * @return item
     */
    public com.serena.sbm.ws.client.TTItem getItem() {
        return item;
    }


    /**
     * Sets the item value for this TransitionItem.
     * 
     * @param item
     */
    public void setItem(com.serena.sbm.ws.client.TTItem item) {
        this.item = item;
    }


    /**
     * Gets the transition value for this TransitionItem.
     * 
     * @return transition
     */
    public com.serena.sbm.ws.client.TransitionIdentifier getTransition() {
        return transition;
    }


    /**
     * Sets the transition value for this TransitionItem.
     * 
     * @param transition
     */
    public void setTransition(com.serena.sbm.ws.client.TransitionIdentifier transition) {
        this.transition = transition;
    }


    /**
     * Gets the breakLock value for this TransitionItem.
     * 
     * @return breakLock
     */
    public java.lang.Boolean getBreakLock() {
        return breakLock;
    }


    /**
     * Sets the breakLock value for this TransitionItem.
     * 
     * @param breakLock
     */
    public void setBreakLock(java.lang.Boolean breakLock) {
        this.breakLock = breakLock;
    }


    /**
     * Gets the options value for this TransitionItem.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.ResponseItemOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this TransitionItem.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.ResponseItemOptions options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransitionItem)) return false;
        TransitionItem other = (TransitionItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auth==null && other.getAuth()==null) || 
             (this.auth!=null &&
              this.auth.equals(other.getAuth()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.transition==null && other.getTransition()==null) || 
             (this.transition!=null &&
              this.transition.equals(other.getTransition()))) &&
            ((this.breakLock==null && other.getBreakLock()==null) || 
             (this.breakLock!=null &&
              this.breakLock.equals(other.getBreakLock()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions())));
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
        if (getAuth() != null) {
            _hashCode += getAuth().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getTransition() != null) {
            _hashCode += getTransition().hashCode();
        }
        if (getBreakLock() != null) {
            _hashCode += getBreakLock().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransitionItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">TransitionItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"));
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
        elemField.setFieldName("breakLock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "breakLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ResponseItemOptions"));
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
