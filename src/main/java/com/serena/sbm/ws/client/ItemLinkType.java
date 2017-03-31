/**
 * ItemLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ItemLinkType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemLinkType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "DEFAULT-ITEM-LINK";
    public static final java.lang.String _value2 = "TWOWAY-NO-TRIGGERS";
    public static final java.lang.String _value3 = "ONEWAY-NO-TRIGGERS";
    public static final java.lang.String _value4 = "ONEWAY-CURRENT-TRIGGERS-LINKED";
    public static final java.lang.String _value5 = "TWOWAY-CURRENT-TRIGGERS-LINKED";
    public static final java.lang.String _value6 = "TWOWAY-LINKED-TRIGGERS-CURRENT";
    public static final java.lang.String _value7 = "TWOWAY-BOTH-TRIGGERS";
    public static final ItemLinkType value1 = new ItemLinkType(_value1);
    public static final ItemLinkType value2 = new ItemLinkType(_value2);
    public static final ItemLinkType value3 = new ItemLinkType(_value3);
    public static final ItemLinkType value4 = new ItemLinkType(_value4);
    public static final ItemLinkType value5 = new ItemLinkType(_value5);
    public static final ItemLinkType value6 = new ItemLinkType(_value6);
    public static final ItemLinkType value7 = new ItemLinkType(_value7);
    public java.lang.String getValue() { return _value_;}
    public static ItemLinkType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemLinkType enumeration = (ItemLinkType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemLinkType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemLinkType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemLink-Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
