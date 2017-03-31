/**
 * DatePreference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class DatePreference implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DatePreference(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "DATE-FORMAT-FROM-LOCALE";
    public static final java.lang.String _value2 = "DATE-FORMAT-MM-DD-YYYY";
    public static final java.lang.String _value3 = "DATE-FORMAT-DD-MM-YYYY";
    public static final java.lang.String _value4 = "DATE-FORMAT-DD-MM-YYYY.S";
    public static final java.lang.String _value5 = "DATE-FORMAT-YYYY-MM-DD";
    public static final java.lang.String _value6 = "DATE-FORMAT-LEAVE-UNCHANGED";
    public static final DatePreference value1 = new DatePreference(_value1);
    public static final DatePreference value2 = new DatePreference(_value2);
    public static final DatePreference value3 = new DatePreference(_value3);
    public static final DatePreference value4 = new DatePreference(_value4);
    public static final DatePreference value5 = new DatePreference(_value5);
    public static final DatePreference value6 = new DatePreference(_value6);
    public java.lang.String getValue() { return _value_;}
    public static DatePreference fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DatePreference enumeration = (DatePreference)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DatePreference fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DatePreference.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "DatePreference"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
