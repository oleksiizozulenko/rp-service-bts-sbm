/**
 * MultipleResponseItemOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class MultipleResponseItemOptions  extends com.serena.sbm.ws.client.ResponseItemOptions  implements java.io.Serializable {
    private com.serena.sbm.ws.client.MultipleOption multiOption;

    public MultipleResponseItemOptions() {
    }

    public MultipleResponseItemOptions(
           com.serena.sbm.ws.client.ExtraValue[] extraOption,
           com.serena.sbm.ws.client.SectionsOption sections,
           java.lang.String specifiedSections,
           com.serena.sbm.ws.client.FieldIdentifier[] limitedField,
           com.serena.sbm.ws.client.MultipleOption multiOption) {
        super(
            extraOption,
            sections,
            specifiedSections,
            limitedField);
        this.multiOption = multiOption;
    }


    /**
     * Gets the multiOption value for this MultipleResponseItemOptions.
     * 
     * @return multiOption
     */
    public com.serena.sbm.ws.client.MultipleOption getMultiOption() {
        return multiOption;
    }


    /**
     * Sets the multiOption value for this MultipleResponseItemOptions.
     * 
     * @param multiOption
     */
    public void setMultiOption(com.serena.sbm.ws.client.MultipleOption multiOption) {
        this.multiOption = multiOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultipleResponseItemOptions)) return false;
        MultipleResponseItemOptions other = (MultipleResponseItemOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.multiOption==null && other.getMultiOption()==null) || 
             (this.multiOption!=null &&
              this.multiOption.equals(other.getMultiOption())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMultiOption() != null) {
            _hashCode += getMultiOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultipleResponseItemOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "multiOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
