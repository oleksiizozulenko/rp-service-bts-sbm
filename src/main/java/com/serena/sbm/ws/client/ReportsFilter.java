/**
 * ReportsFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ReportsFilter  implements java.io.Serializable {
    private com.serena.sbm.ws.client.SolutionIdentifier solution;

    private com.serena.sbm.ws.client.ProjectIdentifier project;

    private com.serena.sbm.ws.client.TableIdentifier table;

    private com.serena.sbm.ws.client.UserIdentifier author;

    private com.serena.sbm.ws.client.ReportType reportType;

    private com.serena.sbm.ws.client.ReportCategory reportCategory;

    private com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel;

    private com.serena.sbm.ws.client.ReportIdentifier report;

    private java.lang.String searchByName;

    private java.lang.Boolean includeSubProjects;

    private java.util.Calendar createdDateFrom;

    private java.util.Calendar createdDateTo;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public ReportsFilter() {
    }

    public ReportsFilter(
           com.serena.sbm.ws.client.SolutionIdentifier solution,
           com.serena.sbm.ws.client.ProjectIdentifier project,
           com.serena.sbm.ws.client.TableIdentifier table,
           com.serena.sbm.ws.client.UserIdentifier author,
           com.serena.sbm.ws.client.ReportType reportType,
           com.serena.sbm.ws.client.ReportCategory reportCategory,
           com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel,
           com.serena.sbm.ws.client.ReportIdentifier report,
           java.lang.String searchByName,
           java.lang.Boolean includeSubProjects,
           java.util.Calendar createdDateFrom,
           java.util.Calendar createdDateTo,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.solution = solution;
           this.project = project;
           this.table = table;
           this.author = author;
           this.reportType = reportType;
           this.reportCategory = reportCategory;
           this.reportAccessLevel = reportAccessLevel;
           this.report = report;
           this.searchByName = searchByName;
           this.includeSubProjects = includeSubProjects;
           this.createdDateFrom = createdDateFrom;
           this.createdDateTo = createdDateTo;
           this.extendedData = extendedData;
    }


    /**
     * Gets the solution value for this ReportsFilter.
     * 
     * @return solution
     */
    public com.serena.sbm.ws.client.SolutionIdentifier getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this ReportsFilter.
     * 
     * @param solution
     */
    public void setSolution(com.serena.sbm.ws.client.SolutionIdentifier solution) {
        this.solution = solution;
    }


    /**
     * Gets the project value for this ReportsFilter.
     * 
     * @return project
     */
    public com.serena.sbm.ws.client.ProjectIdentifier getProject() {
        return project;
    }


    /**
     * Sets the project value for this ReportsFilter.
     * 
     * @param project
     */
    public void setProject(com.serena.sbm.ws.client.ProjectIdentifier project) {
        this.project = project;
    }


    /**
     * Gets the table value for this ReportsFilter.
     * 
     * @return table
     */
    public com.serena.sbm.ws.client.TableIdentifier getTable() {
        return table;
    }


    /**
     * Sets the table value for this ReportsFilter.
     * 
     * @param table
     */
    public void setTable(com.serena.sbm.ws.client.TableIdentifier table) {
        this.table = table;
    }


    /**
     * Gets the author value for this ReportsFilter.
     * 
     * @return author
     */
    public com.serena.sbm.ws.client.UserIdentifier getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this ReportsFilter.
     * 
     * @param author
     */
    public void setAuthor(com.serena.sbm.ws.client.UserIdentifier author) {
        this.author = author;
    }


    /**
     * Gets the reportType value for this ReportsFilter.
     * 
     * @return reportType
     */
    public com.serena.sbm.ws.client.ReportType getReportType() {
        return reportType;
    }


    /**
     * Sets the reportType value for this ReportsFilter.
     * 
     * @param reportType
     */
    public void setReportType(com.serena.sbm.ws.client.ReportType reportType) {
        this.reportType = reportType;
    }


    /**
     * Gets the reportCategory value for this ReportsFilter.
     * 
     * @return reportCategory
     */
    public com.serena.sbm.ws.client.ReportCategory getReportCategory() {
        return reportCategory;
    }


    /**
     * Sets the reportCategory value for this ReportsFilter.
     * 
     * @param reportCategory
     */
    public void setReportCategory(com.serena.sbm.ws.client.ReportCategory reportCategory) {
        this.reportCategory = reportCategory;
    }


    /**
     * Gets the reportAccessLevel value for this ReportsFilter.
     * 
     * @return reportAccessLevel
     */
    public com.serena.sbm.ws.client.ReportAccessLevel getReportAccessLevel() {
        return reportAccessLevel;
    }


    /**
     * Sets the reportAccessLevel value for this ReportsFilter.
     * 
     * @param reportAccessLevel
     */
    public void setReportAccessLevel(com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel) {
        this.reportAccessLevel = reportAccessLevel;
    }


    /**
     * Gets the report value for this ReportsFilter.
     * 
     * @return report
     */
    public com.serena.sbm.ws.client.ReportIdentifier getReport() {
        return report;
    }


    /**
     * Sets the report value for this ReportsFilter.
     * 
     * @param report
     */
    public void setReport(com.serena.sbm.ws.client.ReportIdentifier report) {
        this.report = report;
    }


    /**
     * Gets the searchByName value for this ReportsFilter.
     * 
     * @return searchByName
     */
    public java.lang.String getSearchByName() {
        return searchByName;
    }


    /**
     * Sets the searchByName value for this ReportsFilter.
     * 
     * @param searchByName
     */
    public void setSearchByName(java.lang.String searchByName) {
        this.searchByName = searchByName;
    }


    /**
     * Gets the includeSubProjects value for this ReportsFilter.
     * 
     * @return includeSubProjects
     */
    public java.lang.Boolean getIncludeSubProjects() {
        return includeSubProjects;
    }


    /**
     * Sets the includeSubProjects value for this ReportsFilter.
     * 
     * @param includeSubProjects
     */
    public void setIncludeSubProjects(java.lang.Boolean includeSubProjects) {
        this.includeSubProjects = includeSubProjects;
    }


    /**
     * Gets the createdDateFrom value for this ReportsFilter.
     * 
     * @return createdDateFrom
     */
    public java.util.Calendar getCreatedDateFrom() {
        return createdDateFrom;
    }


    /**
     * Sets the createdDateFrom value for this ReportsFilter.
     * 
     * @param createdDateFrom
     */
    public void setCreatedDateFrom(java.util.Calendar createdDateFrom) {
        this.createdDateFrom = createdDateFrom;
    }


    /**
     * Gets the createdDateTo value for this ReportsFilter.
     * 
     * @return createdDateTo
     */
    public java.util.Calendar getCreatedDateTo() {
        return createdDateTo;
    }


    /**
     * Sets the createdDateTo value for this ReportsFilter.
     * 
     * @param createdDateTo
     */
    public void setCreatedDateTo(java.util.Calendar createdDateTo) {
        this.createdDateTo = createdDateTo;
    }


    /**
     * Gets the extendedData value for this ReportsFilter.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this ReportsFilter.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportsFilter)) return false;
        ReportsFilter other = (ReportsFilter) obj;
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
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.table==null && other.getTable()==null) || 
             (this.table!=null &&
              this.table.equals(other.getTable()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.reportType==null && other.getReportType()==null) || 
             (this.reportType!=null &&
              this.reportType.equals(other.getReportType()))) &&
            ((this.reportCategory==null && other.getReportCategory()==null) || 
             (this.reportCategory!=null &&
              this.reportCategory.equals(other.getReportCategory()))) &&
            ((this.reportAccessLevel==null && other.getReportAccessLevel()==null) || 
             (this.reportAccessLevel!=null &&
              this.reportAccessLevel.equals(other.getReportAccessLevel()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport()))) &&
            ((this.searchByName==null && other.getSearchByName()==null) || 
             (this.searchByName!=null &&
              this.searchByName.equals(other.getSearchByName()))) &&
            ((this.includeSubProjects==null && other.getIncludeSubProjects()==null) || 
             (this.includeSubProjects!=null &&
              this.includeSubProjects.equals(other.getIncludeSubProjects()))) &&
            ((this.createdDateFrom==null && other.getCreatedDateFrom()==null) || 
             (this.createdDateFrom!=null &&
              this.createdDateFrom.equals(other.getCreatedDateFrom()))) &&
            ((this.createdDateTo==null && other.getCreatedDateTo()==null) || 
             (this.createdDateTo!=null &&
              this.createdDateTo.equals(other.getCreatedDateTo()))) &&
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
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getTable() != null) {
            _hashCode += getTable().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getReportType() != null) {
            _hashCode += getReportType().hashCode();
        }
        if (getReportCategory() != null) {
            _hashCode += getReportCategory().hashCode();
        }
        if (getReportAccessLevel() != null) {
            _hashCode += getReportAccessLevel().hashCode();
        }
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        if (getSearchByName() != null) {
            _hashCode += getSearchByName().hashCode();
        }
        if (getIncludeSubProjects() != null) {
            _hashCode += getIncludeSubProjects().hashCode();
        }
        if (getCreatedDateFrom() != null) {
            _hashCode += getCreatedDateFrom().hashCode();
        }
        if (getCreatedDateTo() != null) {
            _hashCode += getCreatedDateTo().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportsFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportsFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "reportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchByName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "searchByName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSubProjects");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "includeSubProjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "createdDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "createdDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
