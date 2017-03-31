/**
 * GetUsers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class GetUsers  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private boolean getCurrentUser;

    private java.lang.String searchByName;

    private com.serena.sbm.ws.client.UserIdentifier[] user;

    private com.serena.sbm.ws.client.UserResponseOptions options;

    public GetUsers() {
    }

    public GetUsers(
           com.serena.sbm.ws.client.Auth auth,
           boolean getCurrentUser,
           java.lang.String searchByName,
           com.serena.sbm.ws.client.UserIdentifier[] user,
           com.serena.sbm.ws.client.UserResponseOptions options) {
           this.auth = auth;
           this.getCurrentUser = getCurrentUser;
           this.searchByName = searchByName;
           this.user = user;
           this.options = options;
    }


    /**
     * Gets the auth value for this GetUsers.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this GetUsers.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the getCurrentUser value for this GetUsers.
     * 
     * @return getCurrentUser
     */
    public boolean isGetCurrentUser() {
        return getCurrentUser;
    }


    /**
     * Sets the getCurrentUser value for this GetUsers.
     * 
     * @param getCurrentUser
     */
    public void setGetCurrentUser(boolean getCurrentUser) {
        this.getCurrentUser = getCurrentUser;
    }


    /**
     * Gets the searchByName value for this GetUsers.
     * 
     * @return searchByName
     */
    public java.lang.String getSearchByName() {
        return searchByName;
    }


    /**
     * Sets the searchByName value for this GetUsers.
     * 
     * @param searchByName
     */
    public void setSearchByName(java.lang.String searchByName) {
        this.searchByName = searchByName;
    }


    /**
     * Gets the user value for this GetUsers.
     * 
     * @return user
     */
    public com.serena.sbm.ws.client.UserIdentifier[] getUser() {
        return user;
    }


    /**
     * Sets the user value for this GetUsers.
     * 
     * @param user
     */
    public void setUser(com.serena.sbm.ws.client.UserIdentifier[] user) {
        this.user = user;
    }

    public com.serena.sbm.ws.client.UserIdentifier getUser(int i) {
        return this.user[i];
    }

    public void setUser(int i, com.serena.sbm.ws.client.UserIdentifier _value) {
        this.user[i] = _value;
    }


    /**
     * Gets the options value for this GetUsers.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.UserResponseOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this GetUsers.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.UserResponseOptions options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsers)) return false;
        GetUsers other = (GetUsers) obj;
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
            this.getCurrentUser == other.isGetCurrentUser() &&
            ((this.searchByName==null && other.getSearchByName()==null) || 
             (this.searchByName!=null &&
              this.searchByName.equals(other.getSearchByName()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              java.util.Arrays.equals(this.user, other.getUser()))) &&
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
        _hashCode += (isGetCurrentUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSearchByName() != null) {
            _hashCode += getSearchByName().hashCode();
        }
        if (getUser() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUser());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUser(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUsers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">GetUsers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "getCurrentUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchByName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "searchByName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserResponseOptions"));
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
