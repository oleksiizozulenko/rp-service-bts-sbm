/**
 * GetAvailableTransitions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class GetAvailableTransitions  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.ItemIdentifier item;

    private com.serena.sbm.ws.client.GetTransitionOptions transitionOptions;

    private java.lang.String attributeName;

    private com.serena.sbm.ws.client.Options options;

    public GetAvailableTransitions() {
    }

    public GetAvailableTransitions(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.ItemIdentifier item,
           com.serena.sbm.ws.client.GetTransitionOptions transitionOptions,
           java.lang.String attributeName,
           com.serena.sbm.ws.client.Options options) {
           this.auth = auth;
           this.item = item;
           this.transitionOptions = transitionOptions;
           this.attributeName = attributeName;
           this.options = options;
    }


    /**
     * Gets the auth value for this GetAvailableTransitions.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this GetAvailableTransitions.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the item value for this GetAvailableTransitions.
     * 
     * @return item
     */
    public com.serena.sbm.ws.client.ItemIdentifier getItem() {
        return item;
    }


    /**
     * Sets the item value for this GetAvailableTransitions.
     * 
     * @param item
     */
    public void setItem(com.serena.sbm.ws.client.ItemIdentifier item) {
        this.item = item;
    }


    /**
     * Gets the transitionOptions value for this GetAvailableTransitions.
     * 
     * @return transitionOptions
     */
    public com.serena.sbm.ws.client.GetTransitionOptions getTransitionOptions() {
        return transitionOptions;
    }


    /**
     * Sets the transitionOptions value for this GetAvailableTransitions.
     * 
     * @param transitionOptions
     */
    public void setTransitionOptions(com.serena.sbm.ws.client.GetTransitionOptions transitionOptions) {
        this.transitionOptions = transitionOptions;
    }


    /**
     * Gets the attributeName value for this GetAvailableTransitions.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this GetAvailableTransitions.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the options value for this GetAvailableTransitions.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.Options getOptions() {
        return options;
    }


    /**
     * Sets the options value for this GetAvailableTransitions.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.Options options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableTransitions)) return false;
        GetAvailableTransitions other = (GetAvailableTransitions) obj;
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
            ((this.transitionOptions==null && other.getTransitionOptions()==null) || 
             (this.transitionOptions!=null &&
              this.transitionOptions.equals(other.getTransitionOptions()))) &&
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
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
        if (getTransitionOptions() != null) {
            _hashCode += getTransitionOptions().hashCode();
        }
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAvailableTransitions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">GetAvailableTransitions"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitionOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "transitionOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "GetTransitionOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Options"));
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
