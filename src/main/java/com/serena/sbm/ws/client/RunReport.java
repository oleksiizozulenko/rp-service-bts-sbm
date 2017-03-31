/**
 * RunReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class RunReport  implements java.io.Serializable {
    private com.serena.sbm.ws.client.Auth auth;

    private com.serena.sbm.ws.client.QueryRange queryRange;

    private com.serena.sbm.ws.client.ReportIdentifier report;

    private com.serena.sbm.ws.client.SolutionIdentifier solution;

    private com.serena.sbm.ws.client.ProjectIdentifier project;

    private com.serena.sbm.ws.client.TableIdentifier table;

    private com.serena.sbm.ws.client.ReportCategory reportCategory;

    private com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel;

    private com.serena.sbm.ws.client.Options options;

    public RunReport() {
    }

    public RunReport(
           com.serena.sbm.ws.client.Auth auth,
           com.serena.sbm.ws.client.QueryRange queryRange,
           com.serena.sbm.ws.client.ReportIdentifier report,
           com.serena.sbm.ws.client.SolutionIdentifier solution,
           com.serena.sbm.ws.client.ProjectIdentifier project,
           com.serena.sbm.ws.client.TableIdentifier table,
           com.serena.sbm.ws.client.ReportCategory reportCategory,
           com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel,
           com.serena.sbm.ws.client.Options options) {
           this.auth = auth;
           this.queryRange = queryRange;
           this.report = report;
           this.solution = solution;
           this.project = project;
           this.table = table;
           this.reportCategory = reportCategory;
           this.reportAccessLevel = reportAccessLevel;
           this.options = options;
    }


    /**
     * Gets the auth value for this RunReport.
     * 
     * @return auth
     */
    public com.serena.sbm.ws.client.Auth getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this RunReport.
     * 
     * @param auth
     */
    public void setAuth(com.serena.sbm.ws.client.Auth auth) {
        this.auth = auth;
    }


    /**
     * Gets the queryRange value for this RunReport.
     * 
     * @return queryRange
     */
    public com.serena.sbm.ws.client.QueryRange getQueryRange() {
        return queryRange;
    }


    /**
     * Sets the queryRange value for this RunReport.
     * 
     * @param queryRange
     */
    public void setQueryRange(com.serena.sbm.ws.client.QueryRange queryRange) {
        this.queryRange = queryRange;
    }


    /**
     * Gets the report value for this RunReport.
     * 
     * @return report
     */
    public com.serena.sbm.ws.client.ReportIdentifier getReport() {
        return report;
    }


    /**
     * Sets the report value for this RunReport.
     * 
     * @param report
     */
    public void setReport(com.serena.sbm.ws.client.ReportIdentifier report) {
        this.report = report;
    }


    /**
     * Gets the solution value for this RunReport.
     * 
     * @return solution
     */
    public com.serena.sbm.ws.client.SolutionIdentifier getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this RunReport.
     * 
     * @param solution
     */
    public void setSolution(com.serena.sbm.ws.client.SolutionIdentifier solution) {
        this.solution = solution;
    }


    /**
     * Gets the project value for this RunReport.
     * 
     * @return project
     */
    public com.serena.sbm.ws.client.ProjectIdentifier getProject() {
        return project;
    }


    /**
     * Sets the project value for this RunReport.
     * 
     * @param project
     */
    public void setProject(com.serena.sbm.ws.client.ProjectIdentifier project) {
        this.project = project;
    }


    /**
     * Gets the table value for this RunReport.
     * 
     * @return table
     */
    public com.serena.sbm.ws.client.TableIdentifier getTable() {
        return table;
    }


    /**
     * Sets the table value for this RunReport.
     * 
     * @param table
     */
    public void setTable(com.serena.sbm.ws.client.TableIdentifier table) {
        this.table = table;
    }


    /**
     * Gets the reportCategory value for this RunReport.
     * 
     * @return reportCategory
     */
    public com.serena.sbm.ws.client.ReportCategory getReportCategory() {
        return reportCategory;
    }


    /**
     * Sets the reportCategory value for this RunReport.
     * 
     * @param reportCategory
     */
    public void setReportCategory(com.serena.sbm.ws.client.ReportCategory reportCategory) {
        this.reportCategory = reportCategory;
    }


    /**
     * Gets the reportAccessLevel value for this RunReport.
     * 
     * @return reportAccessLevel
     */
    public com.serena.sbm.ws.client.ReportAccessLevel getReportAccessLevel() {
        return reportAccessLevel;
    }


    /**
     * Sets the reportAccessLevel value for this RunReport.
     * 
     * @param reportAccessLevel
     */
    public void setReportAccessLevel(com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel) {
        this.reportAccessLevel = reportAccessLevel;
    }


    /**
     * Gets the options value for this RunReport.
     * 
     * @return options
     */
    public com.serena.sbm.ws.client.Options getOptions() {
        return options;
    }


    /**
     * Sets the options value for this RunReport.
     * 
     * @param options
     */
    public void setOptions(com.serena.sbm.ws.client.Options options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunReport)) return false;
        RunReport other = (RunReport) obj;
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
            ((this.queryRange==null && other.getQueryRange()==null) || 
             (this.queryRange!=null &&
              this.queryRange.equals(other.getQueryRange()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport()))) &&
            ((this.solution==null && other.getSolution()==null) || 
             (this.solution!=null &&
              this.solution.equals(other.getSolution()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.table==null && other.getTable()==null) || 
             (this.table!=null &&
              this.table.equals(other.getTable()))) &&
            ((this.reportCategory==null && other.getReportCategory()==null) || 
             (this.reportCategory!=null &&
              this.reportCategory.equals(other.getReportCategory()))) &&
            ((this.reportAccessLevel==null && other.getReportAccessLevel()==null) || 
             (this.reportAccessLevel!=null &&
              this.reportAccessLevel.equals(other.getReportAccessLevel()))) &&
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
        if (getQueryRange() != null) {
            _hashCode += getQueryRange().hashCode();
        }
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        if (getSolution() != null) {
            _hashCode += getSolution().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getTable() != null) {
            _hashCode += getTable().hashCode();
        }
        if (getReportCategory() != null) {
            _hashCode += getReportCategory().hashCode();
        }
        if (getReportAccessLevel() != null) {
            _hashCode += getReportAccessLevel().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", ">RunReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "queryRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionIdentifier"));
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
        elemField.setFieldName("table");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "table"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "reportCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "reportAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Options"));
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
