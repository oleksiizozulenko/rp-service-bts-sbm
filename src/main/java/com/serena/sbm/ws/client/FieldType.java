/**
 * FieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class FieldType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FieldType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "FLDTYPE-UNKNOWN";
    public static final java.lang.String _value2 = "FLDTYPE-NUMERIC";
    public static final java.lang.String _value3 = "FLDTYPE-TEXT";
    public static final java.lang.String _value4 = "FLDTYPE-DATETIME";
    public static final java.lang.String _value5 = "FLDTYPE-SELECTION";
    public static final java.lang.String _value6 = "FLDTYPE-BINARY";
    public static final java.lang.String _value7 = "FLDTYPE-STATE";
    public static final java.lang.String _value8 = "FLDTYPE-USER";
    public static final java.lang.String _value9 = "FLDTYPE-PROJECT";
    public static final java.lang.String _value10 = "FLDTYPE-SUMMATION";
    public static final java.lang.String _value11 = "FLDTYPE-MULTIPLE-SELECTION";
    public static final java.lang.String _value12 = "FLDTYPE-CONTACT";
    public static final java.lang.String _value13 = "FLDTYPE-INCIDENT";
    public static final java.lang.String _value14 = "FLDTYPE-FOLDER";
    public static final java.lang.String _value15 = "FLDTYPE-RELATIONAL";
    public static final java.lang.String _value16 = "FLDTYPE-SUBRELATIONAL";
    public static final java.lang.String _value17 = "FLDTYPE-SYSTEM";
    public static final java.lang.String _value18 = "FLDTYPE-MULTIPLE-RELATIONAL";
    public static final java.lang.String _value19 = "FLDTYPE-MULTIPLE-GROUP";
    public static final java.lang.String _value20 = "FLDTYPE-MULTIPLE-USERGROUP";
    public static final FieldType value1 = new FieldType(_value1);
    public static final FieldType value2 = new FieldType(_value2);
    public static final FieldType value3 = new FieldType(_value3);
    public static final FieldType value4 = new FieldType(_value4);
    public static final FieldType value5 = new FieldType(_value5);
    public static final FieldType value6 = new FieldType(_value6);
    public static final FieldType value7 = new FieldType(_value7);
    public static final FieldType value8 = new FieldType(_value8);
    public static final FieldType value9 = new FieldType(_value9);
    public static final FieldType value10 = new FieldType(_value10);
    public static final FieldType value11 = new FieldType(_value11);
    public static final FieldType value12 = new FieldType(_value12);
    public static final FieldType value13 = new FieldType(_value13);
    public static final FieldType value14 = new FieldType(_value14);
    public static final FieldType value15 = new FieldType(_value15);
    public static final FieldType value16 = new FieldType(_value16);
    public static final FieldType value17 = new FieldType(_value17);
    public static final FieldType value18 = new FieldType(_value18);
    public static final FieldType value19 = new FieldType(_value19);
    public static final FieldType value20 = new FieldType(_value20);
    public java.lang.String getValue() { return _value_;}
    public static FieldType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FieldType enumeration = (FieldType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FieldType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FieldType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Field-Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
