/**
 * Workflow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class Workflow  implements java.io.Serializable {
    private com.serena.sbm.ws.client.WorkflowIdentifier id;

    private com.serena.sbm.ws.client.WorkflowState[] state;

    private com.serena.sbm.ws.client.WorkflowTransition[] transition;

    private com.serena.sbm.ws.client.WorkflowComment[] comment;

    private com.serena.sbm.ws.client.WorkflowBand[] band;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public Workflow() {
    }

    public Workflow(
           com.serena.sbm.ws.client.WorkflowIdentifier id,
           com.serena.sbm.ws.client.WorkflowState[] state,
           com.serena.sbm.ws.client.WorkflowTransition[] transition,
           com.serena.sbm.ws.client.WorkflowComment[] comment,
           com.serena.sbm.ws.client.WorkflowBand[] band,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.state = state;
           this.transition = transition;
           this.comment = comment;
           this.band = band;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this Workflow.
     * 
     * @return id
     */
    public com.serena.sbm.ws.client.WorkflowIdentifier getId() {
        return id;
    }


    /**
     * Sets the id value for this Workflow.
     * 
     * @param id
     */
    public void setId(com.serena.sbm.ws.client.WorkflowIdentifier id) {
        this.id = id;
    }


    /**
     * Gets the state value for this Workflow.
     * 
     * @return state
     */
    public com.serena.sbm.ws.client.WorkflowState[] getState() {
        return state;
    }


    /**
     * Sets the state value for this Workflow.
     * 
     * @param state
     */
    public void setState(com.serena.sbm.ws.client.WorkflowState[] state) {
        this.state = state;
    }

    public com.serena.sbm.ws.client.WorkflowState getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.serena.sbm.ws.client.WorkflowState _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the transition value for this Workflow.
     * 
     * @return transition
     */
    public com.serena.sbm.ws.client.WorkflowTransition[] getTransition() {
        return transition;
    }


    /**
     * Sets the transition value for this Workflow.
     * 
     * @param transition
     */
    public void setTransition(com.serena.sbm.ws.client.WorkflowTransition[] transition) {
        this.transition = transition;
    }

    public com.serena.sbm.ws.client.WorkflowTransition getTransition(int i) {
        return this.transition[i];
    }

    public void setTransition(int i, com.serena.sbm.ws.client.WorkflowTransition _value) {
        this.transition[i] = _value;
    }


    /**
     * Gets the comment value for this Workflow.
     * 
     * @return comment
     */
    public com.serena.sbm.ws.client.WorkflowComment[] getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Workflow.
     * 
     * @param comment
     */
    public void setComment(com.serena.sbm.ws.client.WorkflowComment[] comment) {
        this.comment = comment;
    }

    public com.serena.sbm.ws.client.WorkflowComment getComment(int i) {
        return this.comment[i];
    }

    public void setComment(int i, com.serena.sbm.ws.client.WorkflowComment _value) {
        this.comment[i] = _value;
    }


    /**
     * Gets the band value for this Workflow.
     * 
     * @return band
     */
    public com.serena.sbm.ws.client.WorkflowBand[] getBand() {
        return band;
    }


    /**
     * Sets the band value for this Workflow.
     * 
     * @param band
     */
    public void setBand(com.serena.sbm.ws.client.WorkflowBand[] band) {
        this.band = band;
    }

    public com.serena.sbm.ws.client.WorkflowBand getBand(int i) {
        return this.band[i];
    }

    public void setBand(int i, com.serena.sbm.ws.client.WorkflowBand _value) {
        this.band[i] = _value;
    }


    /**
     * Gets the extendedData value for this Workflow.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this Workflow.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Workflow)) return false;
        Workflow other = (Workflow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.transition==null && other.getTransition()==null) || 
             (this.transition!=null &&
              java.util.Arrays.equals(this.transition, other.getTransition()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              java.util.Arrays.equals(this.comment, other.getComment()))) &&
            ((this.band==null && other.getBand()==null) || 
             (this.band!=null &&
              java.util.Arrays.equals(this.band, other.getBand()))) &&
            ((this.extendedData==null && other.getExtendedData()==null) || 
             (this.extendedData!=null &&
              this.extendedData.equals(other.getExtendedData())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Workflow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Workflow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "transition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowTransition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("band");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "band"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowBand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "extendedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ExtendedData"));
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
