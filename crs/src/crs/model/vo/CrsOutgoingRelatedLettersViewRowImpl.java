package crs.model.vo;

import crs.model.eo.CrsOutgoingRelatedLettersImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 03 09:31:15 EEST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CrsOutgoingRelatedLettersViewRowImpl
  extends ViewRowImpl
{


  public static final int ENTITY_CRSOUTGOINGRELATEDLETTERS = 0;

  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    OutgoingRelatedLettersPk,
    OutgoingDocumentsFk,
    OutgoingDocPreparationFk,
    RelatedOutgoingDocumentFk,
    CreatedBy,
    CreationDate,
    ModifiedBy,
    ModifiedDate,
    UserDepartmentFk,
    RelatedIncomingDocumentsFk,
    RelatedDocumentTypeFk,
    DisplayRelatedDocumentsFk,
    DisplayRelatedDocumentTypeFk,
    DisplayDocDateG,
    DisplayDocDateH,
    RelatedOutgoingDocumentFkSearch,
    RelatedIncomingDocumentsFkSearch,
    RelatedDocumentTypeFkSearch,
    DisplayRelatedDocumentTypeFkSearch,
    DisplayDocNo,
    DisplayRelatedDocumentsFkSearch,
    CrsIncomingDocumentsRelatedIncomingDocumentsFk,
    CrsOutgoingDocumentsRelatedOutgoingDocumentFk,
    CrsOutgoingDocumentsOutgoingDocumentsFk,
    CrsOutgoingDocPreparationOutgoingDocPreparationFk,
    SsoSystemLookupValuesRelatedDocumentTypeFk;
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


  public static final int OUTGOINGRELATEDLETTERSPK = AttributesEnum.OutgoingRelatedLettersPk.index();
  public static final int OUTGOINGDOCUMENTSFK = AttributesEnum.OutgoingDocumentsFk.index();
  public static final int OUTGOINGDOCPREPARATIONFK = AttributesEnum.OutgoingDocPreparationFk.index();
  public static final int RELATEDOUTGOINGDOCUMENTFK = AttributesEnum.RelatedOutgoingDocumentFk.index();
  public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
  public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
  public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
  public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
  public static final int USERDEPARTMENTFK = AttributesEnum.UserDepartmentFk.index();
  public static final int RELATEDINCOMINGDOCUMENTSFK = AttributesEnum.RelatedIncomingDocumentsFk.index();
  public static final int RELATEDDOCUMENTTYPEFK = AttributesEnum.RelatedDocumentTypeFk.index();
  public static final int DISPLAYRELATEDDOCUMENTSFK = AttributesEnum.DisplayRelatedDocumentsFk.index();
  public static final int DISPLAYRELATEDDOCUMENTTYPEFK = AttributesEnum.DisplayRelatedDocumentTypeFk.index();
  public static final int DISPLAYDOCDATEG = AttributesEnum.DisplayDocDateG.index();
  public static final int DISPLAYDOCDATEH = AttributesEnum.DisplayDocDateH.index();
  public static final int RELATEDOUTGOINGDOCUMENTFKSEARCH = AttributesEnum.RelatedOutgoingDocumentFkSearch.index();
  public static final int RELATEDINCOMINGDOCUMENTSFKSEARCH = AttributesEnum.RelatedIncomingDocumentsFkSearch.index();
  public static final int RELATEDDOCUMENTTYPEFKSEARCH = AttributesEnum.RelatedDocumentTypeFkSearch.index();
  public static final int DISPLAYRELATEDDOCUMENTTYPEFKSEARCH =
    AttributesEnum.DisplayRelatedDocumentTypeFkSearch.index();
  public static final int DISPLAYDOCNO = AttributesEnum.DisplayDocNo.index();
  public static final int DISPLAYRELATEDDOCUMENTSFKSEARCH = AttributesEnum.DisplayRelatedDocumentsFkSearch.index();
  public static final int CRSINCOMINGDOCUMENTSRELATEDINCOMINGDOCUMENTSFK =
    AttributesEnum.CrsIncomingDocumentsRelatedIncomingDocumentsFk.index();
  public static final int CRSOUTGOINGDOCUMENTSRELATEDOUTGOINGDOCUMENTFK =
    AttributesEnum.CrsOutgoingDocumentsRelatedOutgoingDocumentFk.index();
  public static final int CRSOUTGOINGDOCUMENTSOUTGOINGDOCUMENTSFK =
    AttributesEnum.CrsOutgoingDocumentsOutgoingDocumentsFk.index();
  public static final int CRSOUTGOINGDOCPREPARATIONOUTGOINGDOCPREPARATIONFK =
    AttributesEnum.CrsOutgoingDocPreparationOutgoingDocPreparationFk.index();
  public static final int SSOSYSTEMLOOKUPVALUESRELATEDDOCUMENTTYPEFK =
    AttributesEnum.SsoSystemLookupValuesRelatedDocumentTypeFk.index();

  /**
   * This is the default constructor (do not remove).
   */
  public CrsOutgoingRelatedLettersViewRowImpl()
  {
  }

  /**
   * Gets CrsOutgoingRelatedLetters entity object.
   * @return the CrsOutgoingRelatedLetters
   */
  public CrsOutgoingRelatedLettersImpl getCrsOutgoingRelatedLetters()
  {
    return (CrsOutgoingRelatedLettersImpl) getEntity(ENTITY_CRSOUTGOINGRELATEDLETTERS);
  }

  /**
   * Gets the attribute value for OUTGOING_RELATED_LETTERS_PK using the alias name OutgoingRelatedLettersPk.
   * @return the OUTGOING_RELATED_LETTERS_PK
   */
  public BigDecimal getOutgoingRelatedLettersPk()
  {
    return (BigDecimal) getAttributeInternal(OUTGOINGRELATEDLETTERSPK);
  }

  /**
   * Sets <code>value</code> as attribute value for OUTGOING_RELATED_LETTERS_PK using the alias name OutgoingRelatedLettersPk.
   * @param value value to set the OUTGOING_RELATED_LETTERS_PK
   */
  public void setOutgoingRelatedLettersPk(BigDecimal value)
  {
    setAttributeInternal(OUTGOINGRELATEDLETTERSPK, value);
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
   * Gets the attribute value for RELATED_OUTGOING_DOCUMENT_FK using the alias name RelatedOutgoingDocumentFk.
   * @return the RELATED_OUTGOING_DOCUMENT_FK
   */
  public BigDecimal getRelatedOutgoingDocumentFk()
  {
    return (BigDecimal) getAttributeInternal(RELATEDOUTGOINGDOCUMENTFK);
  }

  /**
   * Sets <code>value</code> as attribute value for RELATED_OUTGOING_DOCUMENT_FK using the alias name RelatedOutgoingDocumentFk.
   * @param value value to set the RELATED_OUTGOING_DOCUMENT_FK
   */
  public void setRelatedOutgoingDocumentFk(BigDecimal value)
  {
    setAttributeInternal(RELATEDOUTGOINGDOCUMENTFK, value);
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
   * Gets the attribute value for RELATED_INCOMING_DOCUMENTS_FK using the alias name RelatedIncomingDocumentsFk.
   * @return the RELATED_INCOMING_DOCUMENTS_FK
   */
  public BigDecimal getRelatedIncomingDocumentsFk()
  {
    return (BigDecimal) getAttributeInternal(RELATEDINCOMINGDOCUMENTSFK);
  }

  /**
   * Sets <code>value</code> as attribute value for RELATED_INCOMING_DOCUMENTS_FK using the alias name RelatedIncomingDocumentsFk.
   * @param value value to set the RELATED_INCOMING_DOCUMENTS_FK
   */
  public void setRelatedIncomingDocumentsFk(BigDecimal value)
  {
    setAttributeInternal(RELATEDINCOMINGDOCUMENTSFK, value);
  }

  /**
   * Gets the attribute value for RELATED_DOCUMENT_TYPE_FK using the alias name RelatedDocumentTypeFk.
   * @return the RELATED_DOCUMENT_TYPE_FK
   */
  public BigDecimal getRelatedDocumentTypeFk()
  {
    return (BigDecimal) getAttributeInternal(RELATEDDOCUMENTTYPEFK);
  }

  /**
   * Sets <code>value</code> as attribute value for RELATED_DOCUMENT_TYPE_FK using the alias name RelatedDocumentTypeFk.
   * @param value value to set the RELATED_DOCUMENT_TYPE_FK
   */
  public void setRelatedDocumentTypeFk(BigDecimal value)
  {
    setAttributeInternal(RELATEDDOCUMENTTYPEFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayRelatedIncomingDocumentsFk.
   * @return the DisplayRelatedIncomingDocumentsFk
   */
  public String getDisplayRelatedDocumentsFk()
  {
    return (String) getAttributeInternal(DISPLAYRELATEDDOCUMENTSFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayRelatedIncomingDocumentsFk.
   * @param value value to set the  DisplayRelatedIncomingDocumentsFk
   */
  public void setDisplayRelatedDocumentsFk(String value)
  {
    setAttributeInternal(DISPLAYRELATEDDOCUMENTSFK, value);
  }


  /**
   * Gets the attribute value for the calculated attribute DisplayRelatedDocumentTypeFk.
   * @return the DisplayRelatedDocumentTypeFk
   */
  public String getDisplayRelatedDocumentTypeFk()
  {
    return (String) getAttributeInternal(DISPLAYRELATEDDOCUMENTTYPEFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayRelatedDocumentTypeFk.
   * @param value value to set the  DisplayRelatedDocumentTypeFk
   */
  public void setDisplayRelatedDocumentTypeFk(String value)
  {
    setAttributeInternal(DISPLAYRELATEDDOCUMENTTYPEFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayOutDocDateG.
   * @return the DisplayOutDocDateG
   */
  public Timestamp getDisplayDocDateG()
  {
    return (Timestamp) getAttributeInternal(DISPLAYDOCDATEG);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayOutDocDateG.
   * @param value value to set the  DisplayOutDocDateG
   */
  public void setDisplayDocDateG(Timestamp value)
  {
    setAttributeInternal(DISPLAYDOCDATEG, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayOutDocDateH.
   * @return the DisplayOutDocDateH
   */
  public BigDecimal getDisplayDocDateH()
  {
    return (BigDecimal) getAttributeInternal(DISPLAYDOCDATEH);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayOutDocDateH.
   * @param value value to set the  DisplayOutDocDateH
   */
  public void setDisplayDocDateH(BigDecimal value)
  {
    setAttributeInternal(DISPLAYDOCDATEH, value);
  }

  /**
   * Gets the attribute value for the calculated attribute RelatedOutgoingDocumentFkSearch.
   * @return the RelatedOutgoingDocumentFkSearch
   */
  public BigDecimal getRelatedOutgoingDocumentFkSearch()
  {
    return (BigDecimal) getAttributeInternal(RELATEDOUTGOINGDOCUMENTFK);
  }

  /**
   * Gets the attribute value for the calculated attribute RelatedIncomingDocumentsFkSearch.
   * @return the RelatedIncomingDocumentsFkSearch
   */
  public BigDecimal getRelatedIncomingDocumentsFkSearch()
  {
    return (BigDecimal) getAttributeInternal(RELATEDINCOMINGDOCUMENTSFK);
  }

  /**
   * Gets the attribute value for the calculated attribute RelatedDocumentTypeFkSearch.
   * @return the RelatedDocumentTypeFkSearch
   */
  public BigDecimal getRelatedDocumentTypeFkSearch()
  {
    return (BigDecimal) getAttributeInternal(RELATEDDOCUMENTTYPEFK);
  }


  /**
   * Gets the attribute value for the calculated attribute DisplayRelatedDocumentTypeFkSearch.
   * @return the DisplayRelatedDocumentTypeFkSearch
   */
  public String getDisplayRelatedDocumentTypeFkSearch()
  {
    return (String) getAttributeInternal(DISPLAYRELATEDDOCUMENTTYPEFK);
  }


  /**
   * Gets the attribute value for the calculated attribute DisplayDocNo.
   * @return the DisplayDocNo
   */
  public String getDisplayDocNo()
  {
    return (String) getAttributeInternal(DISPLAYDOCNO);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayDocNo.
   * @param value value to set the  DisplayDocNo
   */
  public void setDisplayDocNo(String value)
  {
    setAttributeInternal(DISPLAYDOCNO, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayRelatedDocumentsFkSearch.
   * @return the DisplayRelatedDocumentsFkSearch
   */
  public String getDisplayRelatedDocumentsFkSearch()
  {
    return (String) getAttributeInternal(DISPLAYRELATEDDOCUMENTSFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> CrsIncomingDocumentsRelatedIncomingDocumentsFk.
   */
  public RowSet getCrsIncomingDocumentsRelatedIncomingDocumentsFk()
  {
    return (RowSet) getAttributeInternal(CRSINCOMINGDOCUMENTSRELATEDINCOMINGDOCUMENTSFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> CrsOutgoingDocumentsRelatedOutgoingDocumentFk.
   */
  public RowSet getCrsOutgoingDocumentsRelatedOutgoingDocumentFk()
  {
    return (RowSet) getAttributeInternal(CRSOUTGOINGDOCUMENTSRELATEDOUTGOINGDOCUMENTFK);
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
   * Gets the view accessor <code>RowSet</code> SsoSystemLookupValuesRelatedDocumentTypeFk.
   */
  public RowSet getSsoSystemLookupValuesRelatedDocumentTypeFk()
  {
    return (RowSet) getAttributeInternal(SSOSYSTEMLOOKUPVALUESRELATEDDOCUMENTTYPEFK);
  }
}

