/**
 * ReportInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class ReportInfo  implements java.io.Serializable {
    private com.serena.sbm.ws.client.ReportIdentifier report;

    private java.lang.String reportURL;

    private com.serena.sbm.ws.client.ReportType reportType;

    private com.serena.sbm.ws.client.ReportCategory reportCategory;

    private com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel;

    private com.serena.sbm.ws.client.SolutionIdentifier solution;

    private com.serena.sbm.ws.client.TableIdentifier table;

    private com.serena.sbm.ws.client.ProjectIdentifier project;

    private com.serena.sbm.ws.client.UserIdentifier createdBy;

    private java.util.Calendar createDate;

    private com.serena.sbm.ws.client.UserIdentifier modifiedBy;

    private java.util.Calendar modifiedDate;

    private java.util.Calendar execDate;

    private boolean isQueryAtRuntime;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public ReportInfo() {
    }

    public ReportInfo(
           com.serena.sbm.ws.client.ReportIdentifier report,
           java.lang.String reportURL,
           com.serena.sbm.ws.client.ReportType reportType,
           com.serena.sbm.ws.client.ReportCategory reportCategory,
           com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel,
           com.serena.sbm.ws.client.SolutionIdentifier solution,
           com.serena.sbm.ws.client.TableIdentifier table,
           com.serena.sbm.ws.client.ProjectIdentifier project,
           com.serena.sbm.ws.client.UserIdentifier createdBy,
           java.util.Calendar createDate,
           com.serena.sbm.ws.client.UserIdentifier modifiedBy,
           java.util.Calendar modifiedDate,
           java.util.Calendar execDate,
           boolean isQueryAtRuntime,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.report = report;
           this.reportURL = reportURL;
           this.reportType = reportType;
           this.reportCategory = reportCategory;
           this.reportAccessLevel = reportAccessLevel;
           this.solution = solution;
           this.table = table;
           this.project = project;
           this.createdBy = createdBy;
           this.createDate = createDate;
           this.modifiedBy = modifiedBy;
           this.modifiedDate = modifiedDate;
           this.execDate = execDate;
           this.isQueryAtRuntime = isQueryAtRuntime;
           this.extendedData = extendedData;
    }


    /**
     * Gets the report value for this ReportInfo.
     * 
     * @return report
     */
    public com.serena.sbm.ws.client.ReportIdentifier getReport() {
        return report;
    }


    /**
     * Sets the report value for this ReportInfo.
     * 
     * @param report
     */
    public void setReport(com.serena.sbm.ws.client.ReportIdentifier report) {
        this.report = report;
    }


    /**
     * Gets the reportURL value for this ReportInfo.
     * 
     * @return reportURL
     */
    public java.lang.String getReportURL() {
        return reportURL;
    }


    /**
     * Sets the reportURL value for this ReportInfo.
     * 
     * @param reportURL
     */
    public void setReportURL(java.lang.String reportURL) {
        this.reportURL = reportURL;
    }


    /**
     * Gets the reportType value for this ReportInfo.
     * 
     * @return reportType
     */
    public com.serena.sbm.ws.client.ReportType getReportType() {
        return reportType;
    }


    /**
     * Sets the reportType value for this ReportInfo.
     * 
     * @param reportType
     */
    public void setReportType(com.serena.sbm.ws.client.ReportType reportType) {
        this.reportType = reportType;
    }


    /**
     * Gets the reportCategory value for this ReportInfo.
     * 
     * @return reportCategory
     */
    public com.serena.sbm.ws.client.ReportCategory getReportCategory() {
        return reportCategory;
    }


    /**
     * Sets the reportCategory value for this ReportInfo.
     * 
     * @param reportCategory
     */
    public void setReportCategory(com.serena.sbm.ws.client.ReportCategory reportCategory) {
        this.reportCategory = reportCategory;
    }


    /**
     * Gets the reportAccessLevel value for this ReportInfo.
     * 
     * @return reportAccessLevel
     */
    public com.serena.sbm.ws.client.ReportAccessLevel getReportAccessLevel() {
        return reportAccessLevel;
    }


    /**
     * Sets the reportAccessLevel value for this ReportInfo.
     * 
     * @param reportAccessLevel
     */
    public void setReportAccessLevel(com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel) {
        this.reportAccessLevel = reportAccessLevel;
    }


    /**
     * Gets the solution value for this ReportInfo.
     * 
     * @return solution
     */
    public com.serena.sbm.ws.client.SolutionIdentifier getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this ReportInfo.
     * 
     * @param solution
     */
    public void setSolution(com.serena.sbm.ws.client.SolutionIdentifier solution) {
        this.solution = solution;
    }


    /**
     * Gets the table value for this ReportInfo.
     * 
     * @return table
     */
    public com.serena.sbm.ws.client.TableIdentifier getTable() {
        return table;
    }


    /**
     * Sets the table value for this ReportInfo.
     * 
     * @param table
     */
    public void setTable(com.serena.sbm.ws.client.TableIdentifier table) {
        this.table = table;
    }


    /**
     * Gets the project value for this ReportInfo.
     * 
     * @return project
     */
    public com.serena.sbm.ws.client.ProjectIdentifier getProject() {
        return project;
    }


    /**
     * Sets the project value for this ReportInfo.
     * 
     * @param project
     */
    public void setProject(com.serena.sbm.ws.client.ProjectIdentifier project) {
        this.project = project;
    }


    /**
     * Gets the createdBy value for this ReportInfo.
     * 
     * @return createdBy
     */
    public com.serena.sbm.ws.client.UserIdentifier getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ReportInfo.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.serena.sbm.ws.client.UserIdentifier createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createDate value for this ReportInfo.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ReportInfo.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the modifiedBy value for this ReportInfo.
     * 
     * @return modifiedBy
     */
    public com.serena.sbm.ws.client.UserIdentifier getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this ReportInfo.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(com.serena.sbm.ws.client.UserIdentifier modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the modifiedDate value for this ReportInfo.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ReportInfo.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the execDate value for this ReportInfo.
     * 
     * @return execDate
     */
    public java.util.Calendar getExecDate() {
        return execDate;
    }


    /**
     * Sets the execDate value for this ReportInfo.
     * 
     * @param execDate
     */
    public void setExecDate(java.util.Calendar execDate) {
        this.execDate = execDate;
    }


    /**
     * Gets the isQueryAtRuntime value for this ReportInfo.
     * 
     * @return isQueryAtRuntime
     */
    public boolean isIsQueryAtRuntime() {
        return isQueryAtRuntime;
    }


    /**
     * Sets the isQueryAtRuntime value for this ReportInfo.
     * 
     * @param isQueryAtRuntime
     */
    public void setIsQueryAtRuntime(boolean isQueryAtRuntime) {
        this.isQueryAtRuntime = isQueryAtRuntime;
    }


    /**
     * Gets the extendedData value for this ReportInfo.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this ReportInfo.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportInfo)) return false;
        ReportInfo other = (ReportInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport()))) &&
            ((this.reportURL==null && other.getReportURL()==null) || 
             (this.reportURL!=null &&
              this.reportURL.equals(other.getReportURL()))) &&
            ((this.reportType==null && other.getReportType()==null) || 
             (this.reportType!=null &&
              this.reportType.equals(other.getReportType()))) &&
            ((this.reportCategory==null && other.getReportCategory()==null) || 
             (this.reportCategory!=null &&
              this.reportCategory.equals(other.getReportCategory()))) &&
            ((this.reportAccessLevel==null && other.getReportAccessLevel()==null) || 
             (this.reportAccessLevel!=null &&
              this.reportAccessLevel.equals(other.getReportAccessLevel()))) &&
            ((this.solution==null && other.getSolution()==null) || 
             (this.solution!=null &&
              this.solution.equals(other.getSolution()))) &&
            ((this.table==null && other.getTable()==null) || 
             (this.table!=null &&
              this.table.equals(other.getTable()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.execDate==null && other.getExecDate()==null) || 
             (this.execDate!=null &&
              this.execDate.equals(other.getExecDate()))) &&
            this.isQueryAtRuntime == other.isIsQueryAtRuntime() &&
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
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        if (getReportURL() != null) {
            _hashCode += getReportURL().hashCode();
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
        if (getSolution() != null) {
            _hashCode += getSolution().hashCode();
        }
        if (getTable() != null) {
            _hashCode += getTable().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getModifiedBy() != null) {
            _hashCode += getModifiedBy().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getExecDate() != null) {
            _hashCode += getExecDate().hashCode();
        }
        _hashCode += (isIsQueryAtRuntime() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "reportURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "reportAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ReportAccessLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionIdentifier"));
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
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "modifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("execDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "execDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQueryAtRuntime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "isQueryAtRuntime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
