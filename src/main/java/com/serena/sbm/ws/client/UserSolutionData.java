/**
 * UserSolutionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class UserSolutionData  implements java.io.Serializable {
    private com.serena.sbm.ws.client.SolutionIdentifier solution;

    private com.serena.sbm.ws.client.ReportIdentifier homeReport;

    private com.serena.sbm.ws.client.ProjectIdentifier[] preferredProject;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public UserSolutionData() {
    }

    public UserSolutionData(
           com.serena.sbm.ws.client.SolutionIdentifier solution,
           com.serena.sbm.ws.client.ReportIdentifier homeReport,
           com.serena.sbm.ws.client.ProjectIdentifier[] preferredProject,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.solution = solution;
           this.homeReport = homeReport;
           this.preferredProject = preferredProject;
           this.extendedData = extendedData;
    }


    /**
     * Gets the solution value for this UserSolutionData.
     * 
     * @return solution
     */
    public com.serena.sbm.ws.client.SolutionIdentifier getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this UserSolutionData.
     * 
     * @param solution
     */
    public void setSolution(com.serena.sbm.ws.client.SolutionIdentifier solution) {
        this.solution = solution;
    }


    /**
     * Gets the homeReport value for this UserSolutionData.
     * 
     * @return homeReport
     */
    public com.serena.sbm.ws.client.ReportIdentifier getHomeReport() {
        return homeReport;
    }


    /**
     * Sets the homeReport value for this UserSolutionData.
     * 
     * @param homeReport
     */
    public void setHomeReport(com.serena.sbm.ws.client.ReportIdentifier homeReport) {
        this.homeReport = homeReport;
    }


    /**
     * Gets the preferredProject value for this UserSolutionData.
     * 
     * @return preferredProject
     */
    public com.serena.sbm.ws.client.ProjectIdentifier[] getPreferredProject() {
        return preferredProject;
    }


    /**
     * Sets the preferredProject value for this UserSolutionData.
     * 
     * @param preferredProject
     */
    public void setPreferredProject(com.serena.sbm.ws.client.ProjectIdentifier[] preferredProject) {
        this.preferredProject = preferredProject;
    }

    public com.serena.sbm.ws.client.ProjectIdentifier getPreferredProject(int i) {
        return this.preferredProject[i];
    }

    public void setPreferredProject(int i, com.serena.sbm.ws.client.ProjectIdentifier _value) {
        this.preferredProject[i] = _value;
    }


    /**
     * Gets the extendedData value for this UserSolutionData.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this UserSolutionData.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSolutionData)) return false;
        UserSolutionData other = (UserSolutionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.solution==null && other.getSolution()==null) || 
             (this.solution!=null &&
              this.solution.equals(other.getSolution()))) &&
            ((this.homeReport==null && other.getHomeReport()==null) || 
             (this.homeReport!=null &&
              this.homeReport.equals(other.getHomeReport()))) &&
            ((this.preferredProject==null && other.getPreferredProject()==null) || 
             (this.preferredProject!=null &&
              java.util.Arrays.equals(this.preferredProject, other.getPreferredProject()))) &&
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
        if (getSolution() != null) {
            _hashCode += getSolution().hashCode();
        }
        if (getHomeReport() != null) {
            _hashCode += getHomeReport().hashCode();
        }
        if (getPreferredProject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredProject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredProject(), i);
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
        new org.apache.axis.description.TypeDesc(UserSolutionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserSolutionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeReport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "homeReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredProject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "preferredProject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"));
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
