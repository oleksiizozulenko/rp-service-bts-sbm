/**
 * Sbmappservices72PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public interface Sbmappservices72PortType extends java.rmi.Remote {

    /**
     * Logs out the current active session, releasing license.
     */
    public void logout(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets the server version.
     */
    public java.lang.String getVersion() throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets the list of available applications.
     */
    public com.serena.sbm.ws.client.ApplicationData[] getApplications(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets the list of available solutions.
     */
    public com.serena.sbm.ws.client.SolutionData[] getSolutions(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets the list of available tables, optionally filtered by solution
     * and/or table type.
     */
    public com.serena.sbm.ws.client.TableData[] getTables(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.SolutionIdentifier solution, com.serena.sbm.ws.client.TableType tableType, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets a filtered list of reports.
     */
    public com.serena.sbm.ws.client.GetReportsResult getReports(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.QueryRange queryRange, com.serena.sbm.ws.client.ReportsFilter reportsFilter, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Runs a specified report.
     */
    public com.serena.sbm.ws.client.RunReportResult runReport(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.QueryRange queryRange, com.serena.sbm.ws.client.ReportIdentifier report, com.serena.sbm.ws.client.SolutionIdentifier solution, com.serena.sbm.ws.client.ProjectIdentifier project, com.serena.sbm.ws.client.TableIdentifier table, com.serena.sbm.ws.client.ReportCategory reportCategory, com.serena.sbm.ws.client.ReportAccessLevel reportAccessLevel, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Runs a specified report and returns report result as AE Report
     * Result XML.
     */
    public com.serena.sbm.ws.client.RunReportXmlResult runReportXml(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ReportData report, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets the list of available projects available for submitting
     * new items, optionally filtered by table id.
     */
    public com.serena.sbm.ws.client.ProjectData[] getSubmitProjects(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Creates a new item, given a project and item data.  Creates
     * the item as a sub-item if a parent item is specified.
     */
    public com.serena.sbm.ws.client.TTItemHolder createPrimaryItem(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ProjectIdentifier project, com.serena.sbm.ws.client.ItemIdentifier parentItem, com.serena.sbm.ws.client.TTItem item, com.serena.sbm.ws.client.TransitionIdentifier submitTransition, com.serena.sbm.ws.client.ResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Creates new item(s), given a project and item data.  Creates
     * the item(s) as sub-items if a parent item is specified.
     */
    public com.serena.sbm.ws.client.TTItemHolder[] createPrimaryItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ProjectIdentifier project, com.serena.sbm.ws.client.ItemIdentifier parentItem, com.serena.sbm.ws.client.TTItem[] item, com.serena.sbm.ws.client.TransitionIdentifier submitTransition, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Links one item to another as a sub-task.
     */
    public void linkSubtask(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier parentItem, com.serena.sbm.ws.client.ItemIdentifier childItem, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Creates a new aux item, given a table id and item data.
     */
    public com.serena.sbm.ws.client.TTItemHolder createAuxItem(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, com.serena.sbm.ws.client.TTItem item, com.serena.sbm.ws.client.ResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Service definition of function ae__CreateAuxItems
     */
    public com.serena.sbm.ws.client.TTItemHolder[] createAuxItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, com.serena.sbm.ws.client.TTItem[] item, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Creates a new attachment, given item id of the item to which
     * it is to be attached, and the file attachment contents.
     */
    public com.serena.sbm.ws.client.FileAttachment createFileAttachment(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.FileAttachmentContents attachmentContents, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * attaches note.
     */
    public boolean createNoteAttachment(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.UserIdentifier author, com.serena.sbm.ws.client.NoteAttachmentContents noteContents) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets item, given an item id.
     */
    public com.serena.sbm.ws.client.TTItemHolder getItem(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier itemId, com.serena.sbm.ws.client.ResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets items, given a list of item ids.
     */
    public com.serena.sbm.ws.client.TTItemHolder[] getItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier[] itemId, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets a list of existing items, given a table id, a query where
     * clause, an order by clause (optional) and a maximum return list size.
     */
    public com.serena.sbm.ws.client.TTItemList getItemsByQuery(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, java.lang.String queryWhereClause, java.lang.String orderByClause, java.math.BigInteger firstRecord, java.math.BigInteger maxReturnSize, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets an existing file attachment, given an item id and attachment
     * id.
     */
    public com.serena.sbm.ws.client.FileAttachmentContents getFileAttachment(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, java.math.BigInteger attachmentID, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Transitions existing item, given the the item id, plus any
     * data to update, and transition id to use a non-default transition.
     */
    public com.serena.sbm.ws.client.TTItemHolder transitionItem(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TTItem item, com.serena.sbm.ws.client.TransitionIdentifier transition, java.lang.Boolean breakLock, com.serena.sbm.ws.client.ResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Transitions existing items, given the item ids, plus any data
     * to update, and transition id to use a non-default transition.
     */
    public com.serena.sbm.ws.client.TTItemHolder[] transitionItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TTItem[] item, com.serena.sbm.ws.client.TransitionIdentifier transition, java.lang.Boolean breakLock, com.serena.sbm.ws.client.MultipleResponseItemOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Return available transitions, given an item id and attribute
     * name (may be null or empty).
     */
    public com.serena.sbm.ws.client.Transition[] getAvailableTransitions(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.GetTransitionOptions transitionOptions, java.lang.String attributeName, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Return available Submit transitions, given an item id and attribute
     * name (may be null or empty).
     */
    public com.serena.sbm.ws.client.Transition[] getAvailableSubmitTransitions(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ProjectIdentifier project, java.lang.String attributeName, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Updates an existing attachment, given item id, and the file
     * attachment contents.
     */
    public com.serena.sbm.ws.client.FileAttachment updateFileAttachment(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.FileAttachmentContents attachmentContents, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Service definition of function ae__DeleteItems
     */
    public com.serena.sbm.ws.client.Status[] deleteItems(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier[] itemId, com.serena.sbm.ws.client.MultipleOptions options) throws java.rmi.RemoteException;

    /**
     * Deletes one or more items, given a table id and a query where
     * clause.
     */
    public void deleteItemsByQuery(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.TableIdentifier table, java.lang.String queryWhereClause, com.serena.sbm.ws.client.MultipleOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Deletes an existing attachment, which may be a note, item link,
     * URL attachment or file attachment, given an attachment id.
     */
    public void deleteAttachment(com.serena.sbm.ws.client.Auth auth, java.math.BigInteger attachmentID, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Returns note logger information.
     */
    public com.serena.sbm.ws.client.NoteLoggerInfo getNoteLoggerInfo(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Gets the state change history of an existing item, given a
     * table id and internal item id.
     */
    public com.serena.sbm.ws.client.GetStateChangeHistoryResult getStateChangeHistory(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ItemIdentifier item, com.serena.sbm.ws.client.QueryRange queryRange, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Returns user information one or more users.  If getCurrentUser
     * is true, then information about the current user is returned.
     */
    public com.serena.sbm.ws.client.UserHolder[] getUsers(com.serena.sbm.ws.client.Auth auth, boolean getCurrentUser, java.lang.String searchByName, com.serena.sbm.ws.client.UserIdentifier[] user, com.serena.sbm.ws.client.UserResponseOptions options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Determine if the specified user is valid.
     */
    public boolean isUserValid(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.UserIdentifier user, com.serena.sbm.ws.client.Options options) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Returns full list of possible selections for single- or multi-selection
     * field.
     */
    public com.serena.sbm.ws.client.FieldSelectionsHolder[] getFieldSelections(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.FieldIdentifier[] field, com.serena.sbm.ws.client.ProjectIdentifier project) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;

    /**
     * Returns project workflows graphical data.
     */
    public com.serena.sbm.ws.client.WorkflowHolder[] getWorkflows(com.serena.sbm.ws.client.Auth auth, com.serena.sbm.ws.client.ProjectIdentifier[] project) throws java.rmi.RemoteException, com.serena.sbm.ws.client.AEWebservicesFaultFault;
}
