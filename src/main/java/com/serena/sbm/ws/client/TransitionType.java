/**
 * TransitionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class TransitionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransitionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "TRANSITION-REGULAR";
    public static final java.lang.String _value2 = "TRANSITION-COPY";
    public static final java.lang.String _value3 = "TRANSITION-POST";
    public static final java.lang.String _value4 = "TRANSITION-SUBMITPROBLEM";
    public static final java.lang.String _value5 = "TRANSITION-MOBILE";
    public static final java.lang.String _value6 = "TRANSITION-SUBTASK";
    public static final java.lang.String _value7 = "TRANSITION-UPDATE";
    public static final java.lang.String _value8 = "TRANSITION-DELETE";
    public static final java.lang.String _value9 = "TRANSITION-EXTERNALPOST";
    public static final TransitionType value1 = new TransitionType(_value1);
    public static final TransitionType value2 = new TransitionType(_value2);
    public static final TransitionType value3 = new TransitionType(_value3);
    public static final TransitionType value4 = new TransitionType(_value4);
    public static final TransitionType value5 = new TransitionType(_value5);
    public static final TransitionType value6 = new TransitionType(_value6);
    public static final TransitionType value7 = new TransitionType(_value7);
    public static final TransitionType value8 = new TransitionType(_value8);
    public static final TransitionType value9 = new TransitionType(_value9);
    public java.lang.String getValue() { return _value_;}
    public static TransitionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransitionType enumeration = (TransitionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransitionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransitionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Transition-Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
