/**
 * TableType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class TableType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TableType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "NOT-SPECIFIED";
    public static final java.lang.String _value2 = "SYSTEM-TABLE";
    public static final java.lang.String _value3 = "PRIMARY-TABLE";
    public static final java.lang.String _value4 = "AUXILIARY-TABLE";
    public static final java.lang.String _value5 = "SYSTEM-AUXILIARY-TABLE";
    public static final java.lang.String _value6 = "ARCHIVE-TABLE";
    public static final TableType value1 = new TableType(_value1);
    public static final TableType value2 = new TableType(_value2);
    public static final TableType value3 = new TableType(_value3);
    public static final TableType value4 = new TableType(_value4);
    public static final TableType value5 = new TableType(_value5);
    public static final TableType value6 = new TableType(_value6);
    public java.lang.String getValue() { return _value_;}
    public static TableType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TableType enumeration = (TableType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TableType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TableType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Table-Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
