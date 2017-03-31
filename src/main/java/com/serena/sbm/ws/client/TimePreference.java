/**
 * TimePreference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class TimePreference implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TimePreference(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "TIME-FORMAT-12HOUR";
    public static final java.lang.String _value2 = "TIME-FORMAT-24HOUR";
    public static final java.lang.String _value3 = "TIME-FORMAT-USE-GMT-OFFSET";
    public static final java.lang.String _value4 = "TIME-FORMAT-HONOR-DAYLIGHT";
    public static final java.lang.String _value5 = "TIME-FORMAT-LEAVE-UNCHANGED";
    public static final TimePreference value1 = new TimePreference(_value1);
    public static final TimePreference value2 = new TimePreference(_value2);
    public static final TimePreference value3 = new TimePreference(_value3);
    public static final TimePreference value4 = new TimePreference(_value4);
    public static final TimePreference value5 = new TimePreference(_value5);
    public java.lang.String getValue() { return _value_;}
    public static TimePreference fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TimePreference enumeration = (TimePreference)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TimePreference fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TimePreference.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TimePreference"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
