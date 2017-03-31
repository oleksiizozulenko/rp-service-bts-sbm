/**
 * AccessType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class AccessType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccessType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "ACCESS-NONE";
    public static final java.lang.String _value2 = "ACCESS-USER";
    public static final java.lang.String _value3 = "ACCESS-OCCASIONAL";
    public static final java.lang.String _value4 = "ACCESS-EXTERNAL";
    public static final java.lang.String _value5 = "ACCESS-ADMIN";
    public static final java.lang.String _value6 = "ACCESS-APISCRIPT";
    public static final java.lang.String _value7 = "ACCESS-LEAVE-UNCHANGED";
    public static final AccessType value1 = new AccessType(_value1);
    public static final AccessType value2 = new AccessType(_value2);
    public static final AccessType value3 = new AccessType(_value3);
    public static final AccessType value4 = new AccessType(_value4);
    public static final AccessType value5 = new AccessType(_value5);
    public static final AccessType value6 = new AccessType(_value6);
    public static final AccessType value7 = new AccessType(_value7);
    public java.lang.String getValue() { return _value_;}
    public static AccessType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccessType enumeration = (AccessType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccessType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "AccessType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
