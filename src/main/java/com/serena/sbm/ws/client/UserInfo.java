/**
 * UserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serena.sbm.ws.client;

public class UserInfo  implements java.io.Serializable {
    private com.serena.sbm.ws.client.UserIdentifier id;

    private com.serena.sbm.ws.client.AccessType accessType;

    private java.lang.String email;

    private java.lang.String emailCC;

    private java.lang.String timezone;

    private java.math.BigInteger offsetFromGMT;

    private java.math.BigInteger dstSavings;

    private com.serena.sbm.ws.client.DatePreference datePreference;

    private com.serena.sbm.ws.client.TimePreference timePreference;

    private java.lang.String namespaceName;

    private java.lang.String phoneNumber;

    private java.lang.String locale;

    private boolean isDeleted;

    private com.serena.sbm.ws.client.ContactIdentifier contact;

    private java.math.BigInteger maxNotes;

    private java.math.BigInteger maxChangeHistory;

    private java.math.BigInteger maxItemsPerPage;

    private java.math.BigInteger fieldsMask;

    private java.math.BigInteger notesMask;

    private java.math.BigInteger changeHistoryMask;

    private java.math.BigInteger browserMask;

    private com.serena.sbm.ws.client.GroupIdentifier[] group;

    private com.serena.sbm.ws.client.SolutionIdentifier preferredSolution;

    private com.serena.sbm.ws.client.UserSolutionData[] solutionData;

    private com.serena.sbm.ws.client.ExtendedData extendedData;

    public UserInfo() {
    }

    public UserInfo(
           com.serena.sbm.ws.client.UserIdentifier id,
           com.serena.sbm.ws.client.AccessType accessType,
           java.lang.String email,
           java.lang.String emailCC,
           java.lang.String timezone,
           java.math.BigInteger offsetFromGMT,
           java.math.BigInteger dstSavings,
           com.serena.sbm.ws.client.DatePreference datePreference,
           com.serena.sbm.ws.client.TimePreference timePreference,
           java.lang.String namespaceName,
           java.lang.String phoneNumber,
           java.lang.String locale,
           boolean isDeleted,
           com.serena.sbm.ws.client.ContactIdentifier contact,
           java.math.BigInteger maxNotes,
           java.math.BigInteger maxChangeHistory,
           java.math.BigInteger maxItemsPerPage,
           java.math.BigInteger fieldsMask,
           java.math.BigInteger notesMask,
           java.math.BigInteger changeHistoryMask,
           java.math.BigInteger browserMask,
           com.serena.sbm.ws.client.GroupIdentifier[] group,
           com.serena.sbm.ws.client.SolutionIdentifier preferredSolution,
           com.serena.sbm.ws.client.UserSolutionData[] solutionData,
           com.serena.sbm.ws.client.ExtendedData extendedData) {
           this.id = id;
           this.accessType = accessType;
           this.email = email;
           this.emailCC = emailCC;
           this.timezone = timezone;
           this.offsetFromGMT = offsetFromGMT;
           this.dstSavings = dstSavings;
           this.datePreference = datePreference;
           this.timePreference = timePreference;
           this.namespaceName = namespaceName;
           this.phoneNumber = phoneNumber;
           this.locale = locale;
           this.isDeleted = isDeleted;
           this.contact = contact;
           this.maxNotes = maxNotes;
           this.maxChangeHistory = maxChangeHistory;
           this.maxItemsPerPage = maxItemsPerPage;
           this.fieldsMask = fieldsMask;
           this.notesMask = notesMask;
           this.changeHistoryMask = changeHistoryMask;
           this.browserMask = browserMask;
           this.group = group;
           this.preferredSolution = preferredSolution;
           this.solutionData = solutionData;
           this.extendedData = extendedData;
    }


    /**
     * Gets the id value for this UserInfo.
     * 
     * @return id
     */
    public com.serena.sbm.ws.client.UserIdentifier getId() {
        return id;
    }


    /**
     * Sets the id value for this UserInfo.
     * 
     * @param id
     */
    public void setId(com.serena.sbm.ws.client.UserIdentifier id) {
        this.id = id;
    }


    /**
     * Gets the accessType value for this UserInfo.
     * 
     * @return accessType
     */
    public com.serena.sbm.ws.client.AccessType getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this UserInfo.
     * 
     * @param accessType
     */
    public void setAccessType(com.serena.sbm.ws.client.AccessType accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the email value for this UserInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailCC value for this UserInfo.
     * 
     * @return emailCC
     */
    public java.lang.String getEmailCC() {
        return emailCC;
    }


    /**
     * Sets the emailCC value for this UserInfo.
     * 
     * @param emailCC
     */
    public void setEmailCC(java.lang.String emailCC) {
        this.emailCC = emailCC;
    }


    /**
     * Gets the timezone value for this UserInfo.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this UserInfo.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the offsetFromGMT value for this UserInfo.
     * 
     * @return offsetFromGMT
     */
    public java.math.BigInteger getOffsetFromGMT() {
        return offsetFromGMT;
    }


    /**
     * Sets the offsetFromGMT value for this UserInfo.
     * 
     * @param offsetFromGMT
     */
    public void setOffsetFromGMT(java.math.BigInteger offsetFromGMT) {
        this.offsetFromGMT = offsetFromGMT;
    }


    /**
     * Gets the dstSavings value for this UserInfo.
     * 
     * @return dstSavings
     */
    public java.math.BigInteger getDstSavings() {
        return dstSavings;
    }


    /**
     * Sets the dstSavings value for this UserInfo.
     * 
     * @param dstSavings
     */
    public void setDstSavings(java.math.BigInteger dstSavings) {
        this.dstSavings = dstSavings;
    }


    /**
     * Gets the datePreference value for this UserInfo.
     * 
     * @return datePreference
     */
    public com.serena.sbm.ws.client.DatePreference getDatePreference() {
        return datePreference;
    }


    /**
     * Sets the datePreference value for this UserInfo.
     * 
     * @param datePreference
     */
    public void setDatePreference(com.serena.sbm.ws.client.DatePreference datePreference) {
        this.datePreference = datePreference;
    }


    /**
     * Gets the timePreference value for this UserInfo.
     * 
     * @return timePreference
     */
    public com.serena.sbm.ws.client.TimePreference getTimePreference() {
        return timePreference;
    }


    /**
     * Sets the timePreference value for this UserInfo.
     * 
     * @param timePreference
     */
    public void setTimePreference(com.serena.sbm.ws.client.TimePreference timePreference) {
        this.timePreference = timePreference;
    }


    /**
     * Gets the namespaceName value for this UserInfo.
     * 
     * @return namespaceName
     */
    public java.lang.String getNamespaceName() {
        return namespaceName;
    }


    /**
     * Sets the namespaceName value for this UserInfo.
     * 
     * @param namespaceName
     */
    public void setNamespaceName(java.lang.String namespaceName) {
        this.namespaceName = namespaceName;
    }


    /**
     * Gets the phoneNumber value for this UserInfo.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this UserInfo.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the locale value for this UserInfo.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this UserInfo.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the isDeleted value for this UserInfo.
     * 
     * @return isDeleted
     */
    public boolean isIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this UserInfo.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the contact value for this UserInfo.
     * 
     * @return contact
     */
    public com.serena.sbm.ws.client.ContactIdentifier getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this UserInfo.
     * 
     * @param contact
     */
    public void setContact(com.serena.sbm.ws.client.ContactIdentifier contact) {
        this.contact = contact;
    }


    /**
     * Gets the maxNotes value for this UserInfo.
     * 
     * @return maxNotes
     */
    public java.math.BigInteger getMaxNotes() {
        return maxNotes;
    }


    /**
     * Sets the maxNotes value for this UserInfo.
     * 
     * @param maxNotes
     */
    public void setMaxNotes(java.math.BigInteger maxNotes) {
        this.maxNotes = maxNotes;
    }


    /**
     * Gets the maxChangeHistory value for this UserInfo.
     * 
     * @return maxChangeHistory
     */
    public java.math.BigInteger getMaxChangeHistory() {
        return maxChangeHistory;
    }


    /**
     * Sets the maxChangeHistory value for this UserInfo.
     * 
     * @param maxChangeHistory
     */
    public void setMaxChangeHistory(java.math.BigInteger maxChangeHistory) {
        this.maxChangeHistory = maxChangeHistory;
    }


    /**
     * Gets the maxItemsPerPage value for this UserInfo.
     * 
     * @return maxItemsPerPage
     */
    public java.math.BigInteger getMaxItemsPerPage() {
        return maxItemsPerPage;
    }


    /**
     * Sets the maxItemsPerPage value for this UserInfo.
     * 
     * @param maxItemsPerPage
     */
    public void setMaxItemsPerPage(java.math.BigInteger maxItemsPerPage) {
        this.maxItemsPerPage = maxItemsPerPage;
    }


    /**
     * Gets the fieldsMask value for this UserInfo.
     * 
     * @return fieldsMask
     */
    public java.math.BigInteger getFieldsMask() {
        return fieldsMask;
    }


    /**
     * Sets the fieldsMask value for this UserInfo.
     * 
     * @param fieldsMask
     */
    public void setFieldsMask(java.math.BigInteger fieldsMask) {
        this.fieldsMask = fieldsMask;
    }


    /**
     * Gets the notesMask value for this UserInfo.
     * 
     * @return notesMask
     */
    public java.math.BigInteger getNotesMask() {
        return notesMask;
    }


    /**
     * Sets the notesMask value for this UserInfo.
     * 
     * @param notesMask
     */
    public void setNotesMask(java.math.BigInteger notesMask) {
        this.notesMask = notesMask;
    }


    /**
     * Gets the changeHistoryMask value for this UserInfo.
     * 
     * @return changeHistoryMask
     */
    public java.math.BigInteger getChangeHistoryMask() {
        return changeHistoryMask;
    }


    /**
     * Sets the changeHistoryMask value for this UserInfo.
     * 
     * @param changeHistoryMask
     */
    public void setChangeHistoryMask(java.math.BigInteger changeHistoryMask) {
        this.changeHistoryMask = changeHistoryMask;
    }


    /**
     * Gets the browserMask value for this UserInfo.
     * 
     * @return browserMask
     */
    public java.math.BigInteger getBrowserMask() {
        return browserMask;
    }


    /**
     * Sets the browserMask value for this UserInfo.
     * 
     * @param browserMask
     */
    public void setBrowserMask(java.math.BigInteger browserMask) {
        this.browserMask = browserMask;
    }


    /**
     * Gets the group value for this UserInfo.
     * 
     * @return group
     */
    public com.serena.sbm.ws.client.GroupIdentifier[] getGroup() {
        return group;
    }


    /**
     * Sets the group value for this UserInfo.
     * 
     * @param group
     */
    public void setGroup(com.serena.sbm.ws.client.GroupIdentifier[] group) {
        this.group = group;
    }

    public com.serena.sbm.ws.client.GroupIdentifier getGroup(int i) {
        return this.group[i];
    }

    public void setGroup(int i, com.serena.sbm.ws.client.GroupIdentifier _value) {
        this.group[i] = _value;
    }


    /**
     * Gets the preferredSolution value for this UserInfo.
     * 
     * @return preferredSolution
     */
    public com.serena.sbm.ws.client.SolutionIdentifier getPreferredSolution() {
        return preferredSolution;
    }


    /**
     * Sets the preferredSolution value for this UserInfo.
     * 
     * @param preferredSolution
     */
    public void setPreferredSolution(com.serena.sbm.ws.client.SolutionIdentifier preferredSolution) {
        this.preferredSolution = preferredSolution;
    }


    /**
     * Gets the solutionData value for this UserInfo.
     * 
     * @return solutionData
     */
    public com.serena.sbm.ws.client.UserSolutionData[] getSolutionData() {
        return solutionData;
    }


    /**
     * Sets the solutionData value for this UserInfo.
     * 
     * @param solutionData
     */
    public void setSolutionData(com.serena.sbm.ws.client.UserSolutionData[] solutionData) {
        this.solutionData = solutionData;
    }

    public com.serena.sbm.ws.client.UserSolutionData getSolutionData(int i) {
        return this.solutionData[i];
    }

    public void setSolutionData(int i, com.serena.sbm.ws.client.UserSolutionData _value) {
        this.solutionData[i] = _value;
    }


    /**
     * Gets the extendedData value for this UserInfo.
     * 
     * @return extendedData
     */
    public com.serena.sbm.ws.client.ExtendedData getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this UserInfo.
     * 
     * @param extendedData
     */
    public void setExtendedData(com.serena.sbm.ws.client.ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInfo)) return false;
        UserInfo other = (UserInfo) obj;
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
            ((this.accessType==null && other.getAccessType()==null) || 
             (this.accessType!=null &&
              this.accessType.equals(other.getAccessType()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailCC==null && other.getEmailCC()==null) || 
             (this.emailCC!=null &&
              this.emailCC.equals(other.getEmailCC()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.offsetFromGMT==null && other.getOffsetFromGMT()==null) || 
             (this.offsetFromGMT!=null &&
              this.offsetFromGMT.equals(other.getOffsetFromGMT()))) &&
            ((this.dstSavings==null && other.getDstSavings()==null) || 
             (this.dstSavings!=null &&
              this.dstSavings.equals(other.getDstSavings()))) &&
            ((this.datePreference==null && other.getDatePreference()==null) || 
             (this.datePreference!=null &&
              this.datePreference.equals(other.getDatePreference()))) &&
            ((this.timePreference==null && other.getTimePreference()==null) || 
             (this.timePreference!=null &&
              this.timePreference.equals(other.getTimePreference()))) &&
            ((this.namespaceName==null && other.getNamespaceName()==null) || 
             (this.namespaceName!=null &&
              this.namespaceName.equals(other.getNamespaceName()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            this.isDeleted == other.isIsDeleted() &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.maxNotes==null && other.getMaxNotes()==null) || 
             (this.maxNotes!=null &&
              this.maxNotes.equals(other.getMaxNotes()))) &&
            ((this.maxChangeHistory==null && other.getMaxChangeHistory()==null) || 
             (this.maxChangeHistory!=null &&
              this.maxChangeHistory.equals(other.getMaxChangeHistory()))) &&
            ((this.maxItemsPerPage==null && other.getMaxItemsPerPage()==null) || 
             (this.maxItemsPerPage!=null &&
              this.maxItemsPerPage.equals(other.getMaxItemsPerPage()))) &&
            ((this.fieldsMask==null && other.getFieldsMask()==null) || 
             (this.fieldsMask!=null &&
              this.fieldsMask.equals(other.getFieldsMask()))) &&
            ((this.notesMask==null && other.getNotesMask()==null) || 
             (this.notesMask!=null &&
              this.notesMask.equals(other.getNotesMask()))) &&
            ((this.changeHistoryMask==null && other.getChangeHistoryMask()==null) || 
             (this.changeHistoryMask!=null &&
              this.changeHistoryMask.equals(other.getChangeHistoryMask()))) &&
            ((this.browserMask==null && other.getBrowserMask()==null) || 
             (this.browserMask!=null &&
              this.browserMask.equals(other.getBrowserMask()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              java.util.Arrays.equals(this.group, other.getGroup()))) &&
            ((this.preferredSolution==null && other.getPreferredSolution()==null) || 
             (this.preferredSolution!=null &&
              this.preferredSolution.equals(other.getPreferredSolution()))) &&
            ((this.solutionData==null && other.getSolutionData()==null) || 
             (this.solutionData!=null &&
              java.util.Arrays.equals(this.solutionData, other.getSolutionData()))) &&
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
        if (getAccessType() != null) {
            _hashCode += getAccessType().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailCC() != null) {
            _hashCode += getEmailCC().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getOffsetFromGMT() != null) {
            _hashCode += getOffsetFromGMT().hashCode();
        }
        if (getDstSavings() != null) {
            _hashCode += getDstSavings().hashCode();
        }
        if (getDatePreference() != null) {
            _hashCode += getDatePreference().hashCode();
        }
        if (getTimePreference() != null) {
            _hashCode += getTimePreference().hashCode();
        }
        if (getNamespaceName() != null) {
            _hashCode += getNamespaceName().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        _hashCode += (isIsDeleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getMaxNotes() != null) {
            _hashCode += getMaxNotes().hashCode();
        }
        if (getMaxChangeHistory() != null) {
            _hashCode += getMaxChangeHistory().hashCode();
        }
        if (getMaxItemsPerPage() != null) {
            _hashCode += getMaxItemsPerPage().hashCode();
        }
        if (getFieldsMask() != null) {
            _hashCode += getFieldsMask().hashCode();
        }
        if (getNotesMask() != null) {
            _hashCode += getNotesMask().hashCode();
        }
        if (getChangeHistoryMask() != null) {
            _hashCode += getChangeHistoryMask().hashCode();
        }
        if (getBrowserMask() != null) {
            _hashCode += getBrowserMask().hashCode();
        }
        if (getGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredSolution() != null) {
            _hashCode += getPreferredSolution().hashCode();
        }
        if (getSolutionData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSolutionData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSolutionData(), i);
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
        new org.apache.axis.description.TypeDesc(UserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "accessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "AccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailCC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "emailCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offsetFromGMT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "offsetFromGMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dstSavings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "dstSavings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "datePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "DatePreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "timePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "TimePreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespaceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "namespaceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "isDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "ContactIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "maxNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxChangeHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "maxChangeHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxItemsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "maxItemsPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldsMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "fieldsMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "notesMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeHistoryMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "changeHistoryMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "browserMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "GroupIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredSolution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "preferredSolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "SolutionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutionData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sbmappservices72", "solutionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sbmappservices72", "UserSolutionData"));
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
