/**
 * FieldAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class FieldAttribute implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FieldAttribute(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "ATTRIBUTES-NOT-DEFINED";
    public static final java.lang.String _value2 = "BINARY-ATTRIBUTE-LISTBOX";
    public static final java.lang.String _value3 = "BINARY-ATTRIBUTE-RADIOBUTTON";
    public static final java.lang.String _value4 = "BINARY-ATTRIBUTE-CHECKBOX";
    public static final java.lang.String _value5 = "BINARY-ATTRIBUTE-TRINARY";
    public static final FieldAttribute value1 = new FieldAttribute(_value1);
    public static final FieldAttribute value2 = new FieldAttribute(_value2);
    public static final FieldAttribute value3 = new FieldAttribute(_value3);
    public static final FieldAttribute value4 = new FieldAttribute(_value4);
    public static final FieldAttribute value5 = new FieldAttribute(_value5);
    public java.lang.String getValue() { return _value_;}
    public static FieldAttribute fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FieldAttribute enumeration = (FieldAttribute)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FieldAttribute fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FieldAttribute.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Field-Attribute"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
