/**
 * CreatePrimaryItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class CreatePrimaryItems  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.ProjectIdentifier project;

    private com.serena.sbm.ws.client.ItemIdentifier parentItem;

    private com.serena.sbm.ws.client.TTItem[] item;

    private com.serena.sbm.ws.client.TransitionIdentifier submitTransition;

    private com.serena.sbm.ws.client.MultipleResponseItemOptions options;

    public CreatePrimaryItems() {
    }

    public CreatePrimaryItems(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.ProjectIdentifier project,
           com.serena.sbm.ws.client.ItemIdentifier parentItem,
           com.serena.sbm.ws.client.TTItem[] item,
           com.serena.sbm.ws.client.TransitionIdentifier submitTransition,
           com.serena.sbm.ws.client.MultipleResponseItemOptions options) {
           this.auth = auth;
           this.project = project;
           this.parentItem = parentItem;
           this.item = item;
           this.submitTransition = submitTransition;
           this.options = options;
    }


    /**
     * Gets the auth value for this CreatePrimaryItems.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this CreatePrimaryItems.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the project value for this CreatePrimaryItems.
     * 
     * @return project
     */
    public com.serena.sbm.ws.client.ProjectIdentifier getProject() {
        return project;
    }


    /**
     * Sets the project value for this CreatePrimaryItems.
     * 
     * @param project
     */
    public void setProject(com.serena.sbm.ws.client.ProjectIdentifier project) {
        this.project = project;
    }


    /**
     * Gets the parentItem value for this CreatePrimaryItems.
     * 
     * @return parentItem
     */
    public com.serena.sbm.ws.client.ItemIdentifier getParentItem() {
        return parentItem;
    }


    /**
     * Sets the parentItem value for this CreatePrimaryItems.
     * 
     * @param parentItem
     */
    public void setParentItem(com.serena.sbm.ws.client.ItemIdentifier parentItem) {
        this.parentItem = parentItem;
    }


    /**
     * Gets the item value for this CreatePrimaryItems.
     * 
     * @return item
     */
    public com.serena.sbm.ws.client.TTItem[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this CreatePrimaryItems.
     * 
     * @param item
     */
    public void setItem(com.serena.sbm.ws.client.TTItem[] item) {
        this.item = item;
    }

    public com.serena.sbm.ws.client.TTItem getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.serena.sbm.ws.client.TTItem _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the submitTransition value for this CreatePrimaryItems.
     * 
     * @return submitTransition
     */
    public com.serena.sbm.ws.client.TransitionIdentifier getSubmitTransition() {
        return submitTransition;
    }


    /**
     * Sets the submitTransition value for this CreatePrimaryItems.
     * 
     * @param submitTransition
     */
    public void setSubmitTransition(com.serena.sbm.ws.client.TransitionIdentifier submitTransition) {
        this.submitTransition = submitTransition;
    }


    /**
     * Gets the options value for this CreatePrimaryItems.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.MultipleResponseItemOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this CreatePrimaryItems.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.MultipleResponseItemOptions options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePrimaryItems)) return false;
        CreatePrimaryItems other = (CreatePrimaryItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auth==null && other.getAuth()==null) || 
             (this.auth!=null &&
              this.auth.equals(other.getAuth()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.parentItem==null && other.getParentItem()==null) || 
             (this.parentItem!=null &&
              this.parentItem.equals(other.getParentItem()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.submitTransition==null && other.getSubmitTransition()==null) || 
             (this.submitTransition!=null &&
              this.submitTransition.equals(other.getSubmitTransition()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions())));
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
        if (getAuth() != null) {
            _hashCode += getAuth().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getParentItem() != null) {
            _hashCode += getParentItem().hashCode();
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubmitTransition() != null) {
            _hashCode += getSubmitTransition().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePrimaryItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">CreatePrimaryItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "parentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitTransition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "submitTransition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
