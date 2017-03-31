/**
 * WorkflowHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class WorkflowHolder  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Workflow workflow;

    private com.serena.sbm.ws.client.Status[] status;

    public WorkflowHolder() {
    }

    public WorkflowHolder(
           com.serena.sbm.ws.client.Workflow workflow,
           com.serena.sbm.ws.client.Status[] status) {
           this.workflow = workflow;
           this.status = status;
    }


    /**
     * Gets the workflow value for this WorkflowHolder.
     * 
     * @return workflow
     */
    public com.serena.sbm.ws.client.Workflow getWorkflow() {
        return workflow;
    }


    /**
     * Sets the workflow value for this WorkflowHolder.
     * 
     * @param workflow
     */
    public void setWorkflow(com.serena.sbm.ws.client.Workflow workflow) {
        this.workflow = workflow;
    }


    /**
     * Gets the status value for this WorkflowHolder.
     * 
     * @return status
     */
    public com.serena.sbm.ws.client.Status[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WorkflowHolder.
     * 
     * @param status
     */
    public void setStatus(com.serena.sbm.ws.client.Status[] status) {
        this.status = status;
    }

    public com.serena.sbm.ws.client.Status getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.serena.sbm.ws.client.Status _value) {
        this.status[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowHolder)) return false;
        WorkflowHolder other = (WorkflowHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflow==null && other.getWorkflow()==null) || 
             (this.workflow!=null &&
              this.workflow.equals(other.getWorkflow()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus())));
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
        if (getWorkflow() != null) {
            _hashCode += getWorkflow().hashCode();
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
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
        new org.apache.axis.description.TypeDesc(WorkflowHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "workflow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Workflow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Status"));
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
