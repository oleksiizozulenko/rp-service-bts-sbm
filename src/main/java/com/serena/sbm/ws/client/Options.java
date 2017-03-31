/**
 * Options.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class Options  implements java.io.Serializable {
    private com.serena.sbm.ws.client.ExtraValue[] extraOption;

    public Options() {
    }

    public Options(
           com.serena.sbm.ws.client.ExtraValue[] extraOption) {
           this.extraOption = extraOption;
    }


    /**
     * Gets the extraOption value for this Options.
     * 
     * @return extraOption
     */
    public com.serena.sbm.ws.client.ExtraValue[] getExtraOption() {
        return extraOption;
    }


    /**
     * Sets the extraOption value for this Options.
     * 
     * @param extraOption
     */
    public void setExtraOption(com.serena.sbm.ws.client.ExtraValue[] extraOption) {
        this.extraOption = extraOption;
    }

    public com.serena.sbm.ws.client.ExtraValue getExtraOption(int i) {
        return this.extraOption[i];
    }

    public void setExtraOption(int i, com.serena.sbm.ws.client.ExtraValue _value) {
        this.extraOption[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Options)) return false;
        Options other = (Options) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extraOption==null && other.getExtraOption()==null) || 
             (this.extraOption!=null &&
              java.util.Arrays.equals(this.extraOption, other.getExtraOption())));
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
        if (getExtraOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtraOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtraOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Options.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Options"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "extraOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ExtraValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
