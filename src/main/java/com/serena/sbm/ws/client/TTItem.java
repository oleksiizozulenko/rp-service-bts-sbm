/**
 * TTItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class TTItem  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.serena.sbm.ws.client.ItemIdentifier id;

    private java.lang.String itemType;

    private com.serena.sbm.ws.client.ProjectIdentifier project;

    private java.lang.String title;

    private java.lang.String description;

    private com.serena.sbm.ws.client.UserIdentifier createdBy;

    private java.util.Calendar createDate;

    private com.serena.sbm.ws.client.UserIdentifier modifiedBy;

    private java.util.Calendar modifiedDate;

    private java.lang.String activeInactive;

    private com.serena.sbm.ws.client.StateIdentifier state;

    private com.serena.sbm.ws.client.UserIdentifier owner;

    private java.lang.String url;

    private com.serena.sbm.ws.client.NameValue[] extendedField;

    private com.serena.sbm.ws.client.Note[] note;

    private com.serena.sbm.ws.client.ItemLink[] itemLink;

    private com.serena.sbm.ws.client.URLAttachment[] urlAttachment;

    private com.serena.sbm.ws.client.FileAttachment[] fileAttachment;

    private com.serena.sbm.ws.client.SubTasks subtasks;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    private org.apache.axis.message.MessageElement [] _any;

    public TTItem() {
    }

    public TTItem(
           com.serena.sbm.ws.client.ItemIdentifier id,
           java.lang.String itemType,
           com.serena.sbm.ws.client.ProjectIdentifier project,
           java.lang.String title,
           java.lang.String description,
           com.serena.sbm.ws.client.UserIdentifier createdBy,
           java.util.Calendar createDate,
           com.serena.sbm.ws.client.UserIdentifier modifiedBy,
           java.util.Calendar modifiedDate,
           java.lang.String activeInactive,
           com.serena.sbm.ws.client.StateIdentifier state,
           com.serena.sbm.ws.client.UserIdentifier owner,
           java.lang.String url,
           com.serena.sbm.ws.client.NameValue[] extendedField,
           com.serena.sbm.ws.client.Note[] note,
           com.serena.sbm.ws.client.ItemLink[] itemLink,
           com.serena.sbm.ws.client.URLAttachment[] urlAttachment,
           com.serena.sbm.ws.client.FileAttachment[] fileAttachment,
           com.serena.sbm.ws.client.SubTasks subtasks,
           com.serena.sbm.ws.client.ExtendedData extendedData,
           org.apache.axis.message.MessageElement [] _any) {
           this.id = id;
           this.itemType = itemType;
           this.project = project;
           this.title = title;
           this.description = description;
           this.createdBy = createdBy;
           this.createDate = createDate;
           this.modifiedBy = modifiedBy;
           this.modifiedDate = modifiedDate;
           this.activeInactive = activeInactive;
           this.state = state;
           this.owner = owner;
           this.url = url;
           this.extendedField = extendedField;
           this.note = note;
           this.itemLink = itemLink;
           this.urlAttachment = urlAttachment;
           this.fileAttachment = fileAttachment;
           this.subtasks = subtasks;
           this.extendedData = extendedData;
           this._any = _any;
    }


    /**
     * Gets the id value for this TTItem.
     * 
     * @return id
     */
    public com.serena.sbm.ws.client.ItemIdentifier getId() {
        return id;
    }


    /**
     * Sets the id value for this TTItem.
     * 
     * @param id
     */
    public void setId(com.serena.sbm.ws.client.ItemIdentifier id) {
        this.id = id;
    }


    /**
     * Gets the itemType value for this TTItem.
     * 
     * @return itemType
     */
    public java.lang.String getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this TTItem.
     * 
     * @param itemType
     */
    public void setItemType(java.lang.String itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the project value for this TTItem.
     * 
     * @return project
     */
    public com.serena.sbm.ws.client.ProjectIdentifier getProject() {
        return project;
    }


    /**
     * Sets the project value for this TTItem.
     * 
     * @param project
     */
    public void setProject(com.serena.sbm.ws.client.ProjectIdentifier project) {
        this.project = project;
    }


    /**
     * Gets the title value for this TTItem.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TTItem.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this TTItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TTItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the createdBy value for this TTItem.
     * 
     * @return createdBy
     */
    public com.serena.sbm.ws.client.UserIdentifier getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this TTItem.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.serena.sbm.ws.client.UserIdentifier createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createDate value for this TTItem.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this TTItem.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the modifiedBy value for this TTItem.
     * 
     * @return modifiedBy
     */
    public com.serena.sbm.ws.client.UserIdentifier getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this TTItem.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(com.serena.sbm.ws.client.UserIdentifier modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the modifiedDate value for this TTItem.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this TTItem.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the activeInactive value for this TTItem.
     * 
     * @return activeInactive
     */
    public java.lang.String getActiveInactive() {
        return activeInactive;
    }


    /**
     * Sets the activeInactive value for this TTItem.
     * 
     * @param activeInactive
     */
    public void setActiveInactive(java.lang.String activeInactive) {
        this.activeInactive = activeInactive;
    }


    /**
     * Gets the state value for this TTItem.
     * 
     * @return state
     */
    public com.serena.sbm.ws.client.StateIdentifier getState() {
        return state;
    }


    /**
     * Sets the state value for this TTItem.
     * 
     * @param state
     */
    public void setState(com.serena.sbm.ws.client.StateIdentifier state) {
        this.state = state;
    }


    /**
     * Gets the owner value for this TTItem.
     * 
     * @return owner
     */
    public com.serena.sbm.ws.client.UserIdentifier getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this TTItem.
     * 
     * @param owner
     */
    public void setOwner(com.serena.sbm.ws.client.UserIdentifier owner) {
        this.owner = owner;
    }


    /**
     * Gets the url value for this TTItem.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this TTItem.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the extendedField value for this TTItem.
     * 
     * @return extendedField
     */
    public com.serena.sbm.ws.client.NameValue[] getExtendedField() {
        return extendedField;
    }


    /**
     * Sets the extendedField value for this TTItem.
     * 
     * @param extendedField
     */
    public void setExtendedField(com.serena.sbm.ws.client.NameValue[] extendedField) {
        this.extendedField = extendedField;
    }

    public com.serena.sbm.ws.client.NameValue getExtendedField(int i) {
        return this.extendedField[i];
    }

    public void setExtendedField(int i, com.serena.sbm.ws.client.NameValue _value) {
        this.extendedField[i] = _value;
    }


    /**
     * Gets the note value for this TTItem.
     * 
     * @return note
     */
    public com.serena.sbm.ws.client.Note[] getNote() {
        return note;
    }


    /**
     * Sets the note value for this TTItem.
     * 
     * @param note
     */
    public void setNote(com.serena.sbm.ws.client.Note[] note) {
        this.note = note;
    }

    public com.serena.sbm.ws.client.Note getNote(int i) {
        return this.note[i];
    }

    public void setNote(int i, com.serena.sbm.ws.client.Note _value) {
        this.note[i] = _value;
    }


    /**
     * Gets the itemLink value for this TTItem.
     * 
     * @return itemLink
     */
    public com.serena.sbm.ws.client.ItemLink[] getItemLink() {
        return itemLink;
    }


    /**
     * Sets the itemLink value for this TTItem.
     * 
     * @param itemLink
     */
    public void setItemLink(com.serena.sbm.ws.client.ItemLink[] itemLink) {
        this.itemLink = itemLink;
    }

    public com.serena.sbm.ws.client.ItemLink getItemLink(int i) {
        return this.itemLink[i];
    }

    public void setItemLink(int i, com.serena.sbm.ws.client.ItemLink _value) {
        this.itemLink[i] = _value;
    }


    /**
     * Gets the urlAttachment value for this TTItem.
     * 
     * @return urlAttachment
     */
    public com.serena.sbm.ws.client.URLAttachment[] getUrlAttachment() {
        return urlAttachment;
    }


    /**
     * Sets the urlAttachment value for this TTItem.
     * 
     * @param urlAttachment
     */
    public void setUrlAttachment(com.serena.sbm.ws.client.URLAttachment[] urlAttachment) {
        this.urlAttachment = urlAttachment;
    }

    public com.serena.sbm.ws.client.URLAttachment getUrlAttachment(int i) {
        return this.urlAttachment[i];
    }

    public void setUrlAttachment(int i, com.serena.sbm.ws.client.URLAttachment _value) {
        this.urlAttachment[i] = _value;
    }


    /**
     * Gets the fileAttachment value for this TTItem.
     * 
     * @return fileAttachment
     */
    public com.serena.sbm.ws.client.FileAttachment[] getFileAttachment() {
        return fileAttachment;
    }


    /**
     * Sets the fileAttachment value for this TTItem.
     * 
     * @param fileAttachment
     */
    public void setFileAttachment(com.serena.sbm.ws.client.FileAttachment[] fileAttachment) {
        this.fileAttachment = fileAttachment;
    }

    public com.serena.sbm.ws.client.FileAttachment getFileAttachment(int i) {
        return this.fileAttachment[i];
    }

    public void setFileAttachment(int i, com.serena.sbm.ws.client.FileAttachment _value) {
        this.fileAttachment[i] = _value;
    }


    /**
     * Gets the subtasks value for this TTItem.
     * 
     * @return subtasks
     */
    public com.serena.sbm.ws.client.SubTasks getSubtasks() {
        return subtasks;
    }


    /**
     * Sets the subtasks value for this TTItem.
     * 
     * @param subtasks
     */
    public void setSubtasks(com.serena.sbm.ws.client.SubTasks subtasks) {
        this.subtasks = subtasks;
    }


    /**
     * Gets the extendedData value for this TTItem.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this TTItem.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }


    /**
     * Gets the _any value for this TTItem.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this TTItem.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTItem)) return false;
        TTItem other = (TTItem) obj;
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
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
            ((this.activeInactive==null && other.getActiveInactive()==null) || 
             (this.activeInactive!=null &&
              this.activeInactive.equals(other.getActiveInactive()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.extendedField==null && other.getExtendedField()==null) || 
             (this.extendedField!=null &&
              java.util.Arrays.equals(this.extendedField, other.getExtendedField()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              java.util.Arrays.equals(this.note, other.getNote()))) &&
            ((this.itemLink==null && other.getItemLink()==null) || 
             (this.itemLink!=null &&
              java.util.Arrays.equals(this.itemLink, other.getItemLink()))) &&
            ((this.urlAttachment==null && other.getUrlAttachment()==null) || 
             (this.urlAttachment!=null &&
              java.util.Arrays.equals(this.urlAttachment, other.getUrlAttachment()))) &&
            ((this.fileAttachment==null && other.getFileAttachment()==null) || 
             (this.fileAttachment!=null &&
              java.util.Arrays.equals(this.fileAttachment, other.getFileAttachment()))) &&
            ((this.subtasks==null && other.getSubtasks()==null) || 
             (this.subtasks!=null &&
              this.subtasks.equals(other.getSubtasks()))) &&
            ((this.extendedData==null && other.getExtendedData()==null) || 
             (this.extendedData!=null &&
              this.extendedData.equals(other.getExtendedData()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getActiveInactive() != null) {
            _hashCode += getActiveInactive().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getExtendedField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendedField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendedField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemLink(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrlAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrlAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubtasks() != null) {
            _hashCode += getSubtasks().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(TTItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TTItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "activeInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "StateIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "extendedField"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "NameValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "Note"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "itemLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ItemLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "urlAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "URLAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "fileAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "FileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "subtasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SubTasks"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
