/**
 * Transition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class Transition  implements java.io.Serializable {
    private com.serena.sbm.ws.client.TransitionIdentifier transition;

    private com.serena.sbm.ws.client.StateIdentifier fromState;

    private com.serena.sbm.ws.client.StateIdentifier toState;

    private com.serena.sbm.ws.client.TransitionType type;

    private com.serena.sbm.ws.client.ProjectIdentifier project;

    private java.lang.String[] transitionAttribute;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public Transition() {
    }

    public Transition(
           com.serena.sbm.ws.client.TransitionIdentifier transition,
           com.serena.sbm.ws.client.StateIdentifier fromState,
           com.serena.sbm.ws.client.StateIdentifier toState,
           com.serena.sbm.ws.client.TransitionType type,
           com.serena.sbm.ws.client.ProjectIdentifier project,
           java.lang.String[] transitionAttribute,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.transition = transition;
           this.fromState = fromState;
           this.toState = toState;
           this.type = type;
           this.project = project;
           this.transitionAttribute = transitionAttribute;
           this.extendedData = extendedData;
    }


    /**
     * Gets the transition value for this Transition.
     * 
     * @return transition
     */
    public com.serena.sbm.ws.client.TransitionIdentifier getTransition() {
        return transition;
    }


    /**
     * Sets the transition value for this Transition.
     * 
     * @param transition
     */
    public void setTransition(com.serena.sbm.ws.client.TransitionIdentifier transition) {
        this.transition = transition;
    }


    /**
     * Gets the fromState value for this Transition.
     * 
     * @return fromState
     */
    public com.serena.sbm.ws.client.StateIdentifier getFromState() {
        return fromState;
    }


    /**
     * Sets the fromState value for this Transition.
     * 
     * @param fromState
     */
    public void setFromState(com.serena.sbm.ws.client.StateIdentifier fromState) {
        this.fromState = fromState;
    }


    /**
     * Gets the toState value for this Transition.
     * 
     * @return toState
     */
    public com.serena.sbm.ws.client.StateIdentifier getToState() {
        return toState;
    }


    /**
     * Sets the toState value for this Transition.
     * 
     * @param toState
     */
    public void setToState(com.serena.sbm.ws.client.StateIdentifier toState) {
        this.toState = toState;
    }


    /**
     * Gets the type value for this Transition.
     * 
     * @return type
     */
    public com.serena.sbm.ws.client.TransitionType getType() {
        return type;
    }


    /**
     * Sets the type value for this Transition.
     * 
     * @param type
     */
    public void setType(com.serena.sbm.ws.client.TransitionType type) {
        this.type = type;
    }


    /**
     * Gets the project value for this Transition.
     * 
     * @return project
     */
    public com.serena.sbm.ws.client.ProjectIdentifier getProject() {
        return project;
    }


    /**
     * Sets the project value for this Transition.
     * 
     * @param project
     */
    public void setProject(com.serena.sbm.ws.client.ProjectIdentifier project) {
        this.project = project;
    }


    /**
     * Gets the transitionAttribute value for this Transition.
     * 
     * @return transitionAttribute
     */
    public java.lang.String[] getTransitionAttribute() {
        return transitionAttribute;
    }


    /**
     * Sets the transitionAttribute value for this Transition.
     * 
     * @param transitionAttribute
     */
    public void setTransitionAttribute(java.lang.String[] transitionAttribute) {
        this.transitionAttribute = transitionAttribute;
    }

    public java.lang.String getTransitionAttribute(int i) {
        return this.transitionAttribute[i];
    }

    public void setTransitionAttribute(int i, java.lang.String _value) {
        this.transitionAttribute[i] = _value;
    }


    /**
     * Gets the extendedData value for this Transition.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this Transition.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transition)) return false;
        Transition other = (Transition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transition==null && other.getTransition()==null) || 
             (this.transition!=null &&
              this.transition.equals(other.getTransition()))) &&
            ((this.fromState==null && other.getFromState()==null) || 
             (this.fromState!=null &&
              this.fromState.equals(other.getFromState()))) &&
            ((this.toState==null && other.getToState()==null) || 
             (this.toState!=null &&
              this.toState.equals(other.getToState()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.transitionAttribute==null && other.getTransitionAttribute()==null) || 
             (this.transitionAttribute!=null &&
              java.util.Arrays.equals(this.transitionAttribute, other.getTransitionAttribute()))) &&
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
        if (getTransition() != null) {
            _hashCode += getTransition().hashCode();
        }
        if (getFromState() != null) {
            _hashCode += getFromState().hashCode();
        }
        if (getToState() != null) {
            _hashCode += getToState().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getTransitionAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransitionAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransitionAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(Transition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Transition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "transition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "fromState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "StateIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "toState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "StateIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Transition-Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitionAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "transitionAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
