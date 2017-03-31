/**
 * ReportAccessLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ReportAccessLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportAccessLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PRIVATE = "PRIVATE";
    public static final java.lang.String _GUEST = "GUEST";
    public static final java.lang.String _USER = "USER";
    public static final java.lang.String _MANAGER = "MANAGER";
    public static final ReportAccessLevel PRIVATE = new ReportAccessLevel(_PRIVATE);
    public static final ReportAccessLevel GUEST = new ReportAccessLevel(_GUEST);
    public static final ReportAccessLevel USER = new ReportAccessLevel(_USER);
    public static final ReportAccessLevel MANAGER = new ReportAccessLevel(_MANAGER);
    public java.lang.String getValue() { return _value_;}
    public static ReportAccessLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportAccessLevel enumeration = (ReportAccessLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportAccessLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReportAccessLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportAccessLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
