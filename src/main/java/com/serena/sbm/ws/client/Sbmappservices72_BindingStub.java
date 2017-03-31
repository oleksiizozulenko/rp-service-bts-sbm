/**
 * Sbmappservices72_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class Sbmappservices72_BindingStub extends org.apache.axis.client.Stub implements com.serena.sbm.ws.client.Sbmappservices72PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[34];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetApplications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "ApplicationData"));
        oper.setReturnClass(com.serena.sbm.ws.client.ApplicationData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSolutions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionData"));
        oper.setReturnClass(com.serena.sbm.ws.client.SolutionData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTables");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "solution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionIdentifier"), com.serena.sbm.ws.client.SolutionIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "tableType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Table-Type"), com.serena.sbm.ws.client.TableType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TableData"));
        oper.setReturnClass(com.serena.sbm.ws.client.TableData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReports");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "queryRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange"), com.serena.sbm.ws.client.QueryRange.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "reportsFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ReportsFilter"), com.serena.sbm.ws.client.ReportsFilter.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "GetReportsResult"));
        oper.setReturnClass(com.serena.sbm.ws.client.GetReportsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RunReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "queryRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange"), com.serena.sbm.ws.client.QueryRange.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "report"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ReportIdentifier"), com.serena.sbm.ws.client.ReportIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "solution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionIdentifier"), com.serena.sbm.ws.client.SolutionIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"), com.serena.sbm.ws.client.ProjectIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "table"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier"), com.serena.sbm.ws.client.TableIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "reportCategory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ReportCategory"), com.serena.sbm.ws.client.ReportCategory.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "reportAccessLevel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ReportAccessLevel"), com.serena.sbm.ws.client.ReportAccessLevel.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "RunReportResult"));
        oper.setReturnClass(com.serena.sbm.ws.client.RunReportResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RunReportXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "report"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ReportData"), com.serena.sbm.ws.client.ReportData.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "RunReportXmlResult"));
        oper.setReturnClass(com.serena.sbm.ws.client.RunReportXmlResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubmitProjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "table"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier"), com.serena.sbm.ws.client.TableIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectData"));
        oper.setReturnClass(com.serena.sbm.ws.client.ProjectData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePrimaryItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"), com.serena.sbm.ws.client.ProjectIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "parentItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"), com.serena.sbm.ws.client.TTItem.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "submitTransition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"), com.serena.sbm.ws.client.TransitionIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ResponseItemOptions"), com.serena.sbm.ws.client.ResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePrimaryItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"), com.serena.sbm.ws.client.ProjectIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "parentItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"), com.serena.sbm.ws.client.TTItem[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "submitTransition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"), com.serena.sbm.ws.client.TransitionIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions"), com.serena.sbm.ws.client.MultipleResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemHolder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LinkSubtask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "parentItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "childItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAuxItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "table"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier"), com.serena.sbm.ws.client.TableIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"), com.serena.sbm.ws.client.TTItem.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ResponseItemOptions"), com.serena.sbm.ws.client.ResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAuxItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "table"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier"), com.serena.sbm.ws.client.TableIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"), com.serena.sbm.ws.client.TTItem[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions"), com.serena.sbm.ws.client.MultipleResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemHolder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateFileAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "attachmentContents"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachmentContents"), com.serena.sbm.ws.client.FileAttachmentContents.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachment"));
        oper.setReturnClass(com.serena.sbm.ws.client.FileAttachment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateNoteAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "author"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"), com.serena.sbm.ws.client.UserIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "noteContents"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "NoteAttachmentContents"), com.serena.sbm.ws.client.NoteAttachmentContents.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "itemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ResponseItemOptions"), com.serena.sbm.ws.client.ResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "itemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions"), com.serena.sbm.ws.client.MultipleResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemHolder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemsByQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "table"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier"), com.serena.sbm.ws.client.TableIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "queryWhereClause"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "orderByClause"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "firstRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "maxReturnSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions"), com.serena.sbm.ws.client.MultipleResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemList"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFileAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "attachmentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachmentContents"));
        oper.setReturnClass(com.serena.sbm.ws.client.FileAttachmentContents.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransitionItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"), com.serena.sbm.ws.client.TTItem.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "transition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"), com.serena.sbm.ws.client.TransitionIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "breakLock"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ResponseItemOptions"), com.serena.sbm.ws.client.ResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransitionItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"), com.serena.sbm.ws.client.TTItem[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "transition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier"), com.serena.sbm.ws.client.TransitionIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "breakLock"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions"), com.serena.sbm.ws.client.MultipleResponseItemOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.TTItemHolder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAvailableTransitions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "transitionOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "GetTransitionOptions"), com.serena.sbm.ws.client.GetTransitionOptions.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "attributeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "Transition"));
        oper.setReturnClass(com.serena.sbm.ws.client.Transition[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAvailableSubmitTransitions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"), com.serena.sbm.ws.client.ProjectIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "attributeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "Transition"));
        oper.setReturnClass(com.serena.sbm.ws.client.Transition[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateFileAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "attachmentContents"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachmentContents"), com.serena.sbm.ws.client.FileAttachmentContents.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachment"));
        oper.setReturnClass(com.serena.sbm.ws.client.FileAttachment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "itemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleOptions"), com.serena.sbm.ws.client.MultipleOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "Status"));
        oper.setReturnClass(com.serena.sbm.ws.client.Status[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteItemsByQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "table"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier"), com.serena.sbm.ws.client.TableIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "queryWhereClause"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleOptions"), com.serena.sbm.ws.client.MultipleOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "attachmentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNoteLoggerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "NoteLoggerInfo"));
        oper.setReturnClass(com.serena.sbm.ws.client.NoteLoggerInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStateChangeHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"), com.serena.sbm.ws.client.ItemIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "queryRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange"), com.serena.sbm.ws.client.QueryRange.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "GetStateChangeHistoryResult"));
        oper.setReturnClass(com.serena.sbm.ws.client.GetStateChangeHistoryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "getCurrentUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "searchByName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"), com.serena.sbm.ws.client.UserIdentifier[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "UserResponseOptions"), com.serena.sbm.ws.client.UserResponseOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.UserHolder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsUserValid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"), com.serena.sbm.ws.client.UserIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Options"), com.serena.sbm.ws.client.Options.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFieldSelections");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "FieldIdentifier"), com.serena.sbm.ws.client.FieldIdentifier[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"), com.serena.sbm.ws.client.ProjectIdentifier.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "FieldSelectionsHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.FieldSelectionsHolder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWorkflows");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "auth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "Auth"), com.serena.sbm.ws.client.Auth.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sbmappservices72", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier"), com.serena.sbm.ws.client.ProjectIdentifier[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowHolder"));
        oper.setReturnClass(com.serena.sbm.ws.client.WorkflowHolder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sbmappservices72", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sbmappservices72", "AEWebservicesFault"),
                      "com.serena.sbm.ws.client.AEWebservicesFaultFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[33] = oper;

    }

    public Sbmappservices72_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Sbmappservices72_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Sbmappservices72_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateAuxItem");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreateAuxItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateAuxItemResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreateAuxItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateAuxItems");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreateAuxItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateAuxItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreateAuxItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateFileAttachment");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreateFileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateFileAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreateFileAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateNoteAttachment");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreateNoteAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreateNoteAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreateNoteAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreatePrimaryItem");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreatePrimaryItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreatePrimaryItemResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreatePrimaryItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreatePrimaryItems");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreatePrimaryItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">CreatePrimaryItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.CreatePrimaryItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">DeleteAttachment");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.DeleteAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">DeleteAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.DeleteAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">DeleteItems");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.DeleteItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">DeleteItemsByQuery");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.DeleteItemsByQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">DeleteItemsByQueryResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.DeleteItemsByQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">DeleteItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.DeleteItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetApplications");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetApplications.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetApplicationsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetApplicationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetAvailableSubmitTransitions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetAvailableSubmitTransitions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetAvailableSubmitTransitionsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetAvailableSubmitTransitionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetAvailableTransitions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetAvailableTransitions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetAvailableTransitionsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetAvailableTransitionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetFieldSelections");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetFieldSelections.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetFieldSelectionsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetFieldSelectionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetFileAttachment");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetFileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetFileAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetFileAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetItem");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetItemResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetItems");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetItemsByQuery");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetItemsByQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetItemsByQueryResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetItemsByQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetNoteLoggerInfo");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetNoteLoggerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetNoteLoggerInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetNoteLoggerInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetReports");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetReports.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetReportsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetReportsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetSolutions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetSolutions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetSolutionsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetSolutionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetStateChangeHistory");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetStateChangeHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetStateChangeHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetStateChangeHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetSubmitProjects");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetSubmitProjects.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetSubmitProjectsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetSubmitProjectsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetTables");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetTables.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetTablesResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetTablesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetUsers");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetUsers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetVersion");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetVersionResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetVersionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetWorkflows");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetWorkflows.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">GetWorkflowsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetWorkflowsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">IsUserValid");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.IsUserValid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">IsUserValidResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.IsUserValidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">LinkSubtask");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.LinkSubtask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">LinkSubtaskResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.LinkSubtaskResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">Logout");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Logout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">LogoutResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">RunReport");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RunReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">RunReportResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RunReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">RunReportXml");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RunReportXml.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">RunReportXmlResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RunReportXmlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">TransitionItem");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TransitionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">TransitionItemResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TransitionItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">TransitionItems");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TransitionItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">TransitionItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TransitionItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">UpdateFileAttachment");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UpdateFileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", ">UpdateFileAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UpdateFileAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "AccessType");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.AccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ApplicationData");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ApplicationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ApplicationIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ApplicationIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Attachment-Access-Type");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.AttachmentAccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Auth");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Auth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Band-Orientation");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.BandOrientation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ContactIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ContactIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "DatePreference");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.DatePreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ExtendedData");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ExtendedData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ExtraValue");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ExtraValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FailedItem");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FailedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FailedItemResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FailedItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Field");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Field.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Field-Attribute");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FieldAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Field-Type");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FieldIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FieldIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FieldSelectionsHolder");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FieldSelectionsHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FieldValue");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FieldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FieldWithValue");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FieldWithValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachment");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachmentContents");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FileAttachmentContents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FileBufferBase64");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FileBufferBase64.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "FileContents");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.FileContents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GetReportsResult");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetReportsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GetStateChangeHistoryResult");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetStateChangeHistoryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GetTransitionOptions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GetTransitionOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GrantState");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GrantState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GroupHolder");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GroupHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GroupIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GroupIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GroupIdentifierEx");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GroupIdentifierEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GroupInfo");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "GroupMembersHolder");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.GroupMembersHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Identifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Identifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ItemIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ItemLink");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ItemLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ItemLink-Type");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ItemLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleOption");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.MultipleOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleOptions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.MultipleOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "MultipleResponseItemOptions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.MultipleResponseItemOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "NameValue");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.NameValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Note");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "NoteAttachmentContents");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.NoteAttachmentContents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "NoteLoggerInfo");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.NoteLoggerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Options");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Options.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "OrderBy");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.OrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "PauseItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.PauseItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Point");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Point.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "PrivilegeHolder");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.PrivilegeHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "PrivilegeIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.PrivilegeIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "PrivilegeInfo");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.PrivilegeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "PrivilegeKind");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.PrivilegeKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectData");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ProjectData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ProjectIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ProjectIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "QueryRange");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.QueryRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportAccessLevel");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportAccessLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportCategory");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportData");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportDefinition");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportInfo");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportResult");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportsFilter");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportsFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ReportType");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ReportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "ResponseItemOptions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.ResponseItemOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "RoleHolder");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RoleHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "RoleIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RoleIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "RoleInfo");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RoleInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "RunReportResult");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RunReportResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "RunReportXmlResult");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.RunReportXmlResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "SectionsOption");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SectionsOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Selection-Type");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SelectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "SelectionOption");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SelectionOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Set-Value-By");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SetValueBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Set-Value-Method");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SetValueMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Size");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Size.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Solution-Type");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SolutionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionData");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SolutionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SolutionIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "StateChangeHistory");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.StateChangeHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "StateIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.StateIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Status");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "StatusEnum");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.StatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "SubTasks");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SubTasks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Table-Type");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TableType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "TableData");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TableData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "TableIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TableIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "TimePreference");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TimePreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Transition");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Transition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Transition-Style");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TransitionStyle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Transition-Type");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TransitionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TransitionIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TTItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemHolder");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TTItemHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "TTItemList");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.TTItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "URLAttachment");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.URLAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "UserHolder");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UserHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UserIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifierEx");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UserIdentifierEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "UserInfo");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "UserResponseOptions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UserResponseOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "UserSingleResponseOptions");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UserSingleResponseOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "UserSolutionData");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.UserSolutionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "Workflow");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.Workflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowBand");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.WorkflowBand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowComment");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.WorkflowComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowHolder");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.WorkflowHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowIdentifier");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.WorkflowIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowState");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.WorkflowState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sbmappservices72", "WorkflowTransition");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.WorkflowTransition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:SerenaDiagnostics", "SerenaDiagnostics");
            cachedSerQNames.add(qName);
            cls = com.serena.sbm.ws.client.SerenaDiagnostics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void logout(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "Logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getVersion() throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.ApplicationData[] getApplications(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetApplications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.ApplicationData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.ApplicationData[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.ApplicationData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.SolutionData[] getSolutions(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetSolutions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.SolutionData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.SolutionData[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.SolutionData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TableData[] getTables(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.SolutionIdentifier solution, com.serena.sbm.ws.client.TableType tableType, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetTables"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, solution, tableType, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TableData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TableData[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TableData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.GetReportsResult getReports(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.QueryRange queryRange, com.serena.sbm.ws.client.ReportsFilter reportsFilter, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetReports"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, queryRange, reportsFilter, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.GetReportsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.GetReportsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.GetReportsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.RunReportResult runReport(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.QueryRange queryRange, com.serena.sbm.ws.client.ReportIdentifier report, com.serena.sbm.ws.client.SolutionIdentifier solution, com.serena.sbm.ws.client.ProjectIdentifier project, com.serena.sbm.ws.client.TableIdentifier table, com.serena.sbm.ws.client.ReportCategory reportCategory, com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "RunReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, queryRange, report, solution, project, table, reportCategory, reportAccessLevel, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.RunReportResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.RunReportResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.RunReportResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.RunReportXmlResult runReportXml(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ReportData report, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "RunReportXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, report, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.RunReportXmlResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.RunReportXmlResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.RunReportXmlResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.ProjectData[] getSubmitProjects(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetSubmitProjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, table, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.ProjectData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.ProjectData[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.ProjectData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemHolder createPrimaryItem(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ProjectIdentifier project, com.serena.sbm.ws.client.ItemIdentifier parentItem, com.serena.sbm.ws.client.TTItem item, com.serena.sbm.ws.client.TransitionIdentifier submitTransition, com.serena.sbm.ws.client.ResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "CreatePrimaryItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, project, parentItem, item, submitTransition, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemHolder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemHolder) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemHolder[] createPrimaryItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ProjectIdentifier project, com.serena.sbm.ws.client.ItemIdentifier parentItem, com.serena.sbm.ws.client.TTItem[] item, com.serena.sbm.ws.client.TransitionIdentifier submitTransition, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "CreatePrimaryItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, project, parentItem, item, submitTransition, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemHolder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemHolder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemHolder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void linkSubtask(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier parentItem, com.serena.sbm.ws.client.ItemIdentifier childItem, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "LinkSubtask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, parentItem, childItem, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemHolder createAuxItem(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, com.serena.sbm.ws.client.TTItem item, com.serena.sbm.ws.client.ResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "CreateAuxItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, table, item, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemHolder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemHolder) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemHolder[] createAuxItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, com.serena.sbm.ws.client.TTItem[] item, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "CreateAuxItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, table, item, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemHolder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemHolder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemHolder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.FileAttachment createFileAttachment(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.FileAttachmentContents attachmentContents, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "CreateFileAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, item, attachmentContents, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.FileAttachment) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.FileAttachment) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.FileAttachment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean createNoteAttachment(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.UserIdentifier author, com.serena.sbm.ws.client.NoteAttachmentContents noteContents) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "CreateNoteAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, item, author, noteContents});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemHolder getItem(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier itemId, com.serena.sbm.ws.client.ResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, itemId, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemHolder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemHolder) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemHolder[] getItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier[] itemId, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, itemId, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemHolder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemHolder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemHolder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemList getItemsByQuery(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, java.lang.String queryWhereClause, java.lang.String orderByClause, java.math.BigInteger firstRecord, java.math.BigInteger maxReturnSize, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetItemsByQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, table, queryWhereClause, orderByClause, firstRecord, maxReturnSize, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemList) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemList) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.FileAttachmentContents getFileAttachment(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, java.math.BigInteger attachmentID, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetFileAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, item, attachmentID, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.FileAttachmentContents) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.FileAttachmentContents) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.FileAttachmentContents.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemHolder transitionItem(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TTItem item, com.serena.sbm.ws.client.TransitionIdentifier transition, java.lang.Boolean breakLock, com.serena.sbm.ws.client.ResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, item, transition, breakLock, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemHolder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemHolder) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.TTItemHolder[] transitionItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TTItem[] item, com.serena.sbm.ws.client.TransitionIdentifier transition, java.lang.Boolean breakLock, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "TransitionItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, item, transition, breakLock, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.TTItemHolder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.TTItemHolder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.TTItemHolder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.Transition[] getAvailableTransitions(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.GetTransitionOptions transitionOptions, java.lang.String attributeName, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetAvailableTransitions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, item, transitionOptions, attributeName, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.Transition[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.Transition[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.Transition[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.Transition[] getAvailableSubmitTransitions(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ProjectIdentifier project, java.lang.String attributeName, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetAvailableSubmitTransitions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, project, attributeName, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.Transition[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.Transition[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.Transition[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.FileAttachment updateFileAttachment(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.FileAttachmentContents attachmentContents, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "UpdateFileAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, item, attachmentContents, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.FileAttachment) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.FileAttachment) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.FileAttachment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.Status[] deleteItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier[] itemId, com.serena.sbm.ws.client.MultipleOptions options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "DeleteItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, itemId, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.Status[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.Status[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.Status[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteItemsByQuery(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, java.lang.String queryWhereClause, com.serena.sbm.ws.client.MultipleOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "DeleteItemsByQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, table, queryWhereClause, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteAttachment(com.serena.sbm.ws.client.Auth auth, java.math.BigInteger attachmentID, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "DeleteAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, attachmentID, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.NoteLoggerInfo getNoteLoggerInfo(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetNoteLoggerInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.NoteLoggerInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.NoteLoggerInfo) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.NoteLoggerInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.GetStateChangeHistoryResult getStateChangeHistory(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.QueryRange queryRange, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetStateChangeHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, item, queryRange, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.GetStateChangeHistoryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.GetStateChangeHistoryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.GetStateChangeHistoryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.UserHolder[] getUsers(com.serena.sbm.ws.client.Auth auth, boolean getCurrentUser, java.lang.String searchByName, com.serena.sbm.ws.client.UserIdentifier[] user, com.serena.sbm.ws.client.UserResponseOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, new java.lang.Boolean(getCurrentUser), searchByName, user, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.UserHolder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.UserHolder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.UserHolder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isUserValid(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.UserIdentifier user, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "IsUserValid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, user, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.FieldSelectionsHolder[] getFieldSelections(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.FieldIdentifier[] field, com.serena.sbm.ws.client.ProjectIdentifier project) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetFieldSelections"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, field, project});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.FieldSelectionsHolder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.FieldSelectionsHolder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.FieldSelectionsHolder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.serena.sbm.ws.client.WorkflowHolder[] getWorkflows(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ProjectIdentifier[] project) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sbmappservices72", "GetWorkflows"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth, project});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.serena.sbm.ws.client.WorkflowHolder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.serena.sbm.ws.client.WorkflowHolder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.serena.sbm.ws.client.WorkflowHolder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.serena.sbm.ws.client.AEWebservicesFaultFault) {
              throw (com.serena.sbm.ws.client.AEWebservicesFaultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
