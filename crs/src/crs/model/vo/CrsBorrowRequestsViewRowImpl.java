package crs.model.vo;

import crs.model.eo.CrsBorrowRequestsImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 16 14:41:12 EEST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CrsBorrowRequestsViewRowImpl
  extends ViewRowImpl
{


  public static final int ENTITY_CRSBORROWREQUESTS = 0;

  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    BorrowRequestsPk,
    IncomingDocumentsFk,
    RequestPeriod,
    CreatedBy,
    CreationDate,
    ModifiedBy,
    ModifiedDate,
    UserDepartmentFk,
    OutgoingDocumentsFk,
    IncomingDocumentsFkDesc,
    OutgoingDocumentsFkDesc,
    DocumentTypeFk,
    DisplayRequestReason,
    DisplayNotes,
    DisplayRequestReasonSearch,
    DisplayNotesSearch,
    CrsBorrowRequestsTlView,
    CrsIncomingDocumentsIncomingDocumentsFk,
    CrsOutgoingDocumentsOutgoingDocumentsFk,
    SsoActiveLookupValuesVwView1;
    private static AttributesEnum[] vals = null;
    ;
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


  public static final int BORROWREQUESTSPK = AttributesEnum.BorrowRequestsPk.index();
  public static final int INCOMINGDOCUMENTSFK = AttributesEnum.IncomingDocumentsFk.index();
  public static final int REQUESTPERIOD = AttributesEnum.RequestPeriod.index();
  public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
  public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
  public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
  public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
  public static final int USERDEPARTMENTFK = AttributesEnum.UserDepartmentFk.index();
  public static final int OUTGOINGDOCUMENTSFK = AttributesEnum.OutgoingDocumentsFk.index();
  public static final int INCOMINGDOCUMENTSFKDESC = AttributesEnum.IncomingDocumentsFkDesc.index();
  public static final int OUTGOINGDOCUMENTSFKDESC = AttributesEnum.OutgoingDocumentsFkDesc.index();
  public static final int DOCUMENTTYPEFK = AttributesEnum.DocumentTypeFk.index();
  public static final int DISPLAYREQUESTREASON = AttributesEnum.DisplayRequestReason.index();
  public static final int DISPLAYNOTES = AttributesEnum.DisplayNotes.index();
  public static final int DISPLAYREQUESTREASONSEARCH = AttributesEnum.DisplayRequestReasonSearch.index();
  public static final int DISPLAYNOTESSEARCH = AttributesEnum.DisplayNotesSearch.index();
  public static final int CRSBORROWREQUESTSTLVIEW = AttributesEnum.CrsBorrowRequestsTlView.index();
  public static final int CRSINCOMINGDOCUMENTSINCOMINGDOCUMENTSFK =
    AttributesEnum.CrsIncomingDocumentsIncomingDocumentsFk.index();
  public static final int CRSOUTGOINGDOCUMENTSOUTGOINGDOCUMENTSFK =
    AttributesEnum.CrsOutgoingDocumentsOutgoingDocumentsFk.index();
  public static final int SSOACTIVELOOKUPVALUESVWVIEW1 = AttributesEnum.SsoActiveLookupValuesVwView1.index();

  /**
   * This is the default constructor (do not remove).
   */
  public CrsBorrowRequestsViewRowImpl()
  {
  }

  /**
   * Gets CrsBorrowRequests entity object.
   * @return the CrsBorrowRequests
   */
  public CrsBorrowRequestsImpl getCrsBorrowRequests()
  {
    return (CrsBorrowRequestsImpl) getEntity(ENTITY_CRSBORROWREQUESTS);
  }

  /**
   * Gets the attribute value for BORROW_REQUESTS_PK using the alias name BorrowRequestsPk.
   * @return the BORROW_REQUESTS_PK
   */
  public BigDecimal getBorrowRequestsPk()
  {
    return (BigDecimal) getAttributeInternal(BORROWREQUESTSPK);
  }

  /**
   * Sets <code>value</code> as attribute value for BORROW_REQUESTS_PK using the alias name BorrowRequestsPk.
   * @param value value to set the BORROW_REQUESTS_PK
   */
  public void setBorrowRequestsPk(BigDecimal value)
  {
    setAttributeInternal(BORROWREQUESTSPK, value);
  }

  /**
   * Gets the attribute value for INCOMING_DOCUMENTS_FK using the alias name IncomingDocumentsFk.
   * @return the INCOMING_DOCUMENTS_FK
   */
  public BigDecimal getIncomingDocumentsFk()
  {
    return (BigDecimal) getAttributeInternal(INCOMINGDOCUMENTSFK);
  }

  /**
   * Sets <code>value</code> as attribute value for INCOMING_DOCUMENTS_FK using the alias name IncomingDocumentsFk.
   * @param value value to set the INCOMING_DOCUMENTS_FK
   */
  public void setIncomingDocumentsFk(BigDecimal value)
  {
    setAttributeInternal(INCOMINGDOCUMENTSFK, value);
  }

  /**
   * Gets the attribute value for REQUEST_PERIOD using the alias name RequestPeriod.
   * @return the REQUEST_PERIOD
   */
  public BigDecimal getRequestPeriod()
  {
    return (BigDecimal) getAttributeInternal(REQUESTPERIOD);
  }

  /**
   * Sets <code>value</code> as attribute value for REQUEST_PERIOD using the alias name RequestPeriod.
   * @param value value to set the REQUEST_PERIOD
   */
  public void setRequestPeriod(BigDecimal value)
  {
    setAttributeInternal(REQUESTPERIOD, value);
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
   * Gets the attribute value for the calculated attribute IncomingDocumentsFkDesc.
   * @return the IncomingDocumentsFkDesc
   */
  public String getIncomingDocumentsFkDesc()
  {
    return (String) getAttributeInternal(INCOMINGDOCUMENTSFKDESC);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute IncomingDocumentsFkDesc.
   * @param value value to set the  IncomingDocumentsFkDesc
   */
  public void setIncomingDocumentsFkDesc(String value)
  {
    setAttributeInternal(INCOMINGDOCUMENTSFKDESC, value);
  }

  /**
   * Gets the attribute value for the calculated attribute OutgoingDocumentsFkDesc.
   * @return the OutgoingDocumentsFkDesc
   */
  public String getOutgoingDocumentsFkDesc()
  {
    return (String) getAttributeInternal(OUTGOINGDOCUMENTSFKDESC);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute OutgoingDocumentsFkDesc.
   * @param value value to set the  OutgoingDocumentsFkDesc
   */
  public void setOutgoingDocumentsFkDesc(String value)
  {
    setAttributeInternal(OUTGOINGDOCUMENTSFKDESC, value);
  }

  /**
   * Gets the attribute value for DOCUMENT_TYPE_FK using the alias name DocumentTypeFk.
   * @return the DOCUMENT_TYPE_FK
   */
  public BigDecimal getDocumentTypeFk()
  {
    return (BigDecimal) getAttributeInternal(DOCUMENTTYPEFK);
  }

  /**
   * Sets <code>value</code> as attribute value for DOCUMENT_TYPE_FK using the alias name DocumentTypeFk.
   * @param value value to set the DOCUMENT_TYPE_FK
   */
  public void setDocumentTypeFk(BigDecimal value)
  {
    setAttributeInternal(DOCUMENTTYPEFK, value);
  }

  /**
   * Gets the attribute value for DISPLAY_REQUEST_REASON using the alias name DisplayRequestReason.
   * @return the DISPLAY_REQUEST_REASON
   */
  public String getDisplayRequestReason()
  {
    return (String) getAttributeInternal(DISPLAYREQUESTREASON);
  }

  /**
   * Sets <code>value</code> as attribute value for DISPLAY_REQUEST_REASON using the alias name DisplayRequestReason.
   * @param value value to set the DISPLAY_REQUEST_REASON
   */
  public void setDisplayRequestReason(String value)
  {
    setAttributeInternal(DISPLAYREQUESTREASON, value);
  }

  /**
   * Gets the attribute value for DISPLAY_NOTES using the alias name DisplayNotes.
   * @return the DISPLAY_NOTES
   */
  public String getDisplayNotes()
  {
    return (String) getAttributeInternal(DISPLAYNOTES);
  }

  /**
   * Sets <code>value</code> as attribute value for DISPLAY_NOTES using the alias name DisplayNotes.
   * @param value value to set the DISPLAY_NOTES
   */
  public void setDisplayNotes(String value)
  {
    setAttributeInternal(DISPLAYNOTES, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayRequestReasonSearch.
   * @return the DisplayRequestReasonSearch
   */
  public String getDisplayRequestReasonSearch()
  {
    return (String) getAttributeInternal(DISPLAYREQUESTREASON);//(String) getAttributeInternal(DISPLAYREQUESTREASONSEARCH);
  }


  /**
   * Gets the attribute value for the calculated attribute DisplayNotesSearch.
   * @return the DisplayNotesSearch
   */
  public String getDisplayNotesSearch()
  {
    return (String) getAttributeInternal(DISPLAYNOTES);//(String) getAttributeInternal(DISPLAYNOTESSEARCH);
  }


  /**
   * Gets the associated <code>RowIterator</code> using master-detail link CrsBorrowRequestsTlView.
   */
  public RowIterator getCrsBorrowRequestsTlView()
  {
    return (RowIterator) getAttributeInternal(CRSBORROWREQUESTSTLVIEW);
  }

  /**
   * Gets the view accessor <code>RowSet</code> CrsIncomingDocumentsIncomingDocumentsFk.
   */
  public RowSet getCrsIncomingDocumentsIncomingDocumentsFk()
  {
    return (RowSet) getAttributeInternal(CRSINCOMINGDOCUMENTSINCOMINGDOCUMENTSFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> CrsOutgoingDocumentsOutgoingDocumentsFk.
   */
  public RowSet getCrsOutgoingDocumentsOutgoingDocumentsFk()
  {
    return (RowSet) getAttributeInternal(CRSOUTGOINGDOCUMENTSOUTGOINGDOCUMENTSFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> SsoActiveLookupValuesVwView1.
   */
  public RowSet getSsoActiveLookupValuesVwView1()
  {
    return (RowSet) getAttributeInternal(SSOACTIVELOOKUPVALUESVWVIEW1);
  }
}

