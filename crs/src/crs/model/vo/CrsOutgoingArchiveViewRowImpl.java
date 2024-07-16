package crs.model.vo;

import crs.model.eo.CrsOutgoingArchiveImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 26 11:52:24 EEST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CrsOutgoingArchiveViewRowImpl
  extends ViewRowImpl
{


  public static final int ENTITY_CRSOUTGOINGARCHIVE = 0;

  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    OutgoingArchivePk,
    ArcFilePath,
    OutgoingDocumentsFk,
    OutgoingDocPreparationFk,
    SecurityLevelFk,
    CreatedBy,
    CreationDate,
    ModifiedBy,
    ModifiedDate,
    UserDepartmentFk,
    DisplaySecurityLevelFk,
    SecurityLevelFkSearch,
    DisplaySecurityLevelFkSearch,
    DisplayArcDocName,
    DisplayArcDocDesc,
    DisplayArcDocNameSearch,
    DisplayArcDocDescSearch,
    CrsOutgoingArchiveTlView,
    CrsOutgoingDocumentsOutgoingDocumentsFk,
    CrsOutgoingDocPreparationOutgoingDocPreparationFk,
    SsoSystemLookupValuesSecurityLevelFk;
    private static AttributesEnum[] vals = null; ;
    private static final int firstIndex = 0;

    protected int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    protected static final int firstIndex()
    {
      return firstIndex;
    }

    protected static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    protected static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }


  public static final int OUTGOINGARCHIVEPK = AttributesEnum.OutgoingArchivePk.index();
  public static final int ARCFILEPATH = AttributesEnum.ArcFilePath.index();
  public static final int OUTGOINGDOCUMENTSFK = AttributesEnum.OutgoingDocumentsFk.index();
  public static final int OUTGOINGDOCPREPARATIONFK = AttributesEnum.OutgoingDocPreparationFk.index();
  public static final int SECURITYLEVELFK = AttributesEnum.SecurityLevelFk.index();
  public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
  public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
  public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
  public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
  public static final int USERDEPARTMENTFK = AttributesEnum.UserDepartmentFk.index();
  public static final int DISPLAYSECURITYLEVELFK = AttributesEnum.DisplaySecurityLevelFk.index();
  public static final int SECURITYLEVELFKSEARCH = AttributesEnum.SecurityLevelFkSearch.index();
  public static final int DISPLAYSECURITYLEVELFKSEARCH = AttributesEnum.DisplaySecurityLevelFkSearch.index();
  public static final int DISPLAYARCDOCNAME = AttributesEnum.DisplayArcDocName.index();
  public static final int DISPLAYARCDOCDESC = AttributesEnum.DisplayArcDocDesc.index();
  public static final int DISPLAYARCDOCNAMESEARCH = AttributesEnum.DisplayArcDocNameSearch.index();
  public static final int DISPLAYARCDOCDESCSEARCH = AttributesEnum.DisplayArcDocDescSearch.index();
  public static final int CRSOUTGOINGARCHIVETLVIEW = AttributesEnum.CrsOutgoingArchiveTlView.index();
  public static final int CRSOUTGOINGDOCUMENTSOUTGOINGDOCUMENTSFK =
    AttributesEnum.CrsOutgoingDocumentsOutgoingDocumentsFk.index();
  public static final int CRSOUTGOINGDOCPREPARATIONOUTGOINGDOCPREPARATIONFK =
    AttributesEnum.CrsOutgoingDocPreparationOutgoingDocPreparationFk.index();
  public static final int SSOSYSTEMLOOKUPVALUESSECURITYLEVELFK =
    AttributesEnum.SsoSystemLookupValuesSecurityLevelFk.index();

  /**
   * This is the default constructor (do not remove).
   */
  public CrsOutgoingArchiveViewRowImpl()
  {
  }

  /**
   * Gets CrsOutgoingArchive entity object.
   * @return the CrsOutgoingArchive
   */
  public CrsOutgoingArchiveImpl getCrsOutgoingArchive()
  {
    return (CrsOutgoingArchiveImpl) getEntity(ENTITY_CRSOUTGOINGARCHIVE);
  }

  /**
   * Gets the attribute value for OUTGOING_ARCHIVE_PK using the alias name OutgoingArchivePk.
   * @return the OUTGOING_ARCHIVE_PK
   */
  public BigDecimal getOutgoingArchivePk()
  {
    return (BigDecimal) getAttributeInternal(OUTGOINGARCHIVEPK);
  }

  /**
   * Sets <code>value</code> as attribute value for OUTGOING_ARCHIVE_PK using the alias name OutgoingArchivePk.
   * @param value value to set the OUTGOING_ARCHIVE_PK
   */
  public void setOutgoingArchivePk(BigDecimal value)
  {
    setAttributeInternal(OUTGOINGARCHIVEPK, value);
  }

  /**
   * Gets the attribute value for ARC_FILE_PATH using the alias name ArcFilePath.
   * @return the ARC_FILE_PATH
   */
  public String getArcFilePath()
  {
    return (String) getAttributeInternal(ARCFILEPATH);
  }

  /**
   * Sets <code>value</code> as attribute value for ARC_FILE_PATH using the alias name ArcFilePath.
   * @param value value to set the ARC_FILE_PATH
   */
  public void setArcFilePath(String value)
  {
    setAttributeInternal(ARCFILEPATH, value);
  }

  /**
   * Gets the attribute value for OUTGOING_DOCUMENTS_FK using the alias name OutgoingDocumentsFk.
   * @return the OUTGOING_DOCUMENTS_FK
   */
  public BigDecimal getOutgoingDocumentsFk()
  {
    return (BigDecimal) getAttributeInternal(OUTGOINGDOCUMENTSFK);
  }

  /**
   * Sets <code>value</code> as attribute value for OUTGOING_DOCUMENTS_FK using the alias name OutgoingDocumentsFk.
   * @param value value to set the OUTGOING_DOCUMENTS_FK
   */
  public void setOutgoingDocumentsFk(BigDecimal value)
  {
    setAttributeInternal(OUTGOINGDOCUMENTSFK, value);
  }

  /**
   * Gets the attribute value for OUTGOING_DOC_PREPARATION_FK using the alias name OutgoingDocPreparationFk.
   * @return the OUTGOING_DOC_PREPARATION_FK
   */
  public BigDecimal getOutgoingDocPreparationFk()
  {
    return (BigDecimal) getAttributeInternal(OUTGOINGDOCPREPARATIONFK);
  }

  /**
   * Sets <code>value</code> as attribute value for OUTGOING_DOC_PREPARATION_FK using the alias name OutgoingDocPreparationFk.
   * @param value value to set the OUTGOING_DOC_PREPARATION_FK
   */
  public void setOutgoingDocPreparationFk(BigDecimal value)
  {
    setAttributeInternal(OUTGOINGDOCPREPARATIONFK, value);
  }

  /**
   * Gets the attribute value for SECURITY_LEVEL_FK using the alias name SecurityLevelFk.
   * @return the SECURITY_LEVEL_FK
   */
  public BigDecimal getSecurityLevelFk()
  {
    return (BigDecimal) getAttributeInternal(SECURITYLEVELFK);
  }

  /**
   * Sets <code>value</code> as attribute value for SECURITY_LEVEL_FK using the alias name SecurityLevelFk.
   * @param value value to set the SECURITY_LEVEL_FK
   */
  public void setSecurityLevelFk(BigDecimal value)
  {
    setAttributeInternal(SECURITYLEVELFK, value);
  }

  /**
   * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
   * @return the CREATED_BY
   */
  public BigDecimal getCreatedBy()
  {
    return (BigDecimal) getAttributeInternal(CREATEDBY);
  }

  /**
   * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
   * @param value value to set the CREATED_BY
   */
  public void setCreatedBy(BigDecimal value)
  {
    setAttributeInternal(CREATEDBY, value);
  }

  /**
   * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
   * @return the CREATION_DATE
   */
  public Timestamp getCreationDate()
  {
    return (Timestamp) getAttributeInternal(CREATIONDATE);
  }

  /**
   * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
   * @param value value to set the CREATION_DATE
   */
  public void setCreationDate(Timestamp value)
  {
    setAttributeInternal(CREATIONDATE, value);
  }

  /**
   * Gets the attribute value for MODIFIED_BY using the alias name ModifiedBy.
   * @return the MODIFIED_BY
   */
  public BigDecimal getModifiedBy()
  {
    return (BigDecimal) getAttributeInternal(MODIFIEDBY);
  }

  /**
   * Sets <code>value</code> as attribute value for MODIFIED_BY using the alias name ModifiedBy.
   * @param value value to set the MODIFIED_BY
   */
  public void setModifiedBy(BigDecimal value)
  {
    setAttributeInternal(MODIFIEDBY, value);
  }

  /**
   * Gets the attribute value for MODIFIED_DATE using the alias name ModifiedDate.
   * @return the MODIFIED_DATE
   */
  public Timestamp getModifiedDate()
  {
    return (Timestamp) getAttributeInternal(MODIFIEDDATE);
  }

  /**
   * Sets <code>value</code> as attribute value for MODIFIED_DATE using the alias name ModifiedDate.
   * @param value value to set the MODIFIED_DATE
   */
  public void setModifiedDate(Timestamp value)
  {
    setAttributeInternal(MODIFIEDDATE, value);
  }

  /**
   * Gets the attribute value for USER_DEPARTMENT_FK using the alias name UserDepartmentFk.
   * @return the USER_DEPARTMENT_FK
   */
  public BigDecimal getUserDepartmentFk()
  {
    return (BigDecimal) getAttributeInternal(USERDEPARTMENTFK);
  }

  /**
   * Sets <code>value</code> as attribute value for USER_DEPARTMENT_FK using the alias name UserDepartmentFk.
   * @param value value to set the USER_DEPARTMENT_FK
   */
  public void setUserDepartmentFk(BigDecimal value)
  {
    setAttributeInternal(USERDEPARTMENTFK, value);
  }


  /**
   * Gets the attribute value for the calculated attribute DisplaySecurityLevelFk.
   * @return the DisplaySecurityLevelFk
   */
  public String getDisplaySecurityLevelFk()
  {
    return (String) getAttributeInternal(DISPLAYSECURITYLEVELFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplaySecurityLevelFk.
   * @param value value to set the  DisplaySecurityLevelFk
   */
  public void setDisplaySecurityLevelFk(String value)
  {
    setAttributeInternal(DISPLAYSECURITYLEVELFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute SecurityLevelFkSearch.
   * @return the SecurityLevelFkSearch
   */
  public BigDecimal getSecurityLevelFkSearch()
  {
    return (BigDecimal) getAttributeInternal(SECURITYLEVELFK);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplaySecurityLevelFkSearch.
   * @return the DisplaySecurityLevelFkSearch
   */
  public String getDisplaySecurityLevelFkSearch()
  {
    return (String) getAttributeInternal(DISPLAYSECURITYLEVELFK);
  }

  /**
   * Gets the attribute value for DISPLAY_ARC_DOC_NAME using the alias name DisplayArcDocName.
   * @return the DISPLAY_ARC_DOC_NAME
   */
  public String getDisplayArcDocName()
  {
    return (String) getAttributeInternal(DISPLAYARCDOCNAME);
  }

  /**
   * Sets <code>value</code> as attribute value for DISPLAY_ARC_DOC_NAME using the alias name DisplayArcDocName.
   * @param value value to set the DISPLAY_ARC_DOC_NAME
   */
  public void setDisplayArcDocName(String value)
  {
    setAttributeInternal(DISPLAYARCDOCNAME, value);
  }

  /**
   * Gets the attribute value for DISPLAY_ARC_DOC_DESC using the alias name DisplayArcDocDesc.
   * @return the DISPLAY_ARC_DOC_DESC
   */
  public String getDisplayArcDocDesc()
  {
    return (String) getAttributeInternal(DISPLAYARCDOCDESC);
  }

  /**
   * Sets <code>value</code> as attribute value for DISPLAY_ARC_DOC_DESC using the alias name DisplayArcDocDesc.
   * @param value value to set the DISPLAY_ARC_DOC_DESC
   */
  public void setDisplayArcDocDesc(String value)
  {
    setAttributeInternal(DISPLAYARCDOCDESC, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayArcDocNameSearch.
   * @return the DisplayArcDocNameSearch
   */
  public String getDisplayArcDocNameSearch()
  {
    return (String) getAttributeInternal(DISPLAYARCDOCNAME);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayArcDocDescSearch.
   * @return the DisplayArcDocDescSearch
   */
  public String getDisplayArcDocDescSearch()
  {
    return (String) getAttributeInternal(DISPLAYARCDOCDESC);
  }

  /**
   * Gets the associated <code>RowIterator</code> using master-detail link CrsOutgoingArchiveTlView.
   */
  public RowIterator getCrsOutgoingArchiveTlView()
  {
    return (RowIterator) getAttributeInternal(CRSOUTGOINGARCHIVETLVIEW);
  }

  /**
   * Gets the view accessor <code>RowSet</code> CrsOutgoingDocumentsOutgoingDocumentsFk.
   */
  public RowSet getCrsOutgoingDocumentsOutgoingDocumentsFk()
  {
    return (RowSet) getAttributeInternal(CRSOUTGOINGDOCUMENTSOUTGOINGDOCUMENTSFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> CrsOutgoingDocPreparationOutgoingDocPreparationFk.
   */
  public RowSet getCrsOutgoingDocPreparationOutgoingDocPreparationFk()
  {
    return (RowSet) getAttributeInternal(CRSOUTGOINGDOCPREPARATIONOUTGOINGDOCPREPARATIONFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> SsoSystemLookupValuesSecurityLevelFk.
   */
  public RowSet getSsoSystemLookupValuesSecurityLevelFk()
  {
    return (RowSet) getAttributeInternal(SSOSYSTEMLOOKUPVALUESSECURITYLEVELFK);
  }
}

