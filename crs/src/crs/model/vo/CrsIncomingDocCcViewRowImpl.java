package crs.model.vo;

import crs.model.eo.CrsIncomingDocCcImpl;

import java.math.BigDecimal;

import java.sql.Date;
import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 17 16:51:10 EEST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CrsIncomingDocCcViewRowImpl
  extends ViewRowImpl
{


  public static final int ENTITY_CRSINCOMINGDOCCC = 0;

  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    IncomingDocCcPk,
    IncomingDocumentsFk,
    DepartmentsFk,
    CreatedBy,
    CreationDate,
    ModifiedBy,
    ModifiedDate,
    UserDepartmentFk,
    ActionFk,
    ExecutionDateG,
    ExecutionDateH,
    DisplayDepartmentsFk,
    DisplayActionFk,
    DisplayNotes,
    EmployeeFk,
    DisplayEmployeeFk,
    ActionFkSearch,
    DepartmentsFkSearch,
    DisplayDepartmentsFkSearch,
    DisplayActionFkSearch,
    DisplayNotesSearch,
    EmployeeFkSearch,
    DisplayEmployeeFkSearch,
    DisplayRejectReason,
    DisplayIncomingDocGuidance,
    IncomingDocStsFk,
    DisplayIncomingDocGuidanceSearch,
    SelectedFl,
    CrsIncomingDocCcTlView,
    CrsIncomingDocumentsIncomingDocumentsFk,
    HcmDepartmentsDepartmentsFk,
    SsoSystemLookupValuesActionFk,
    HcmEmpBasicDataVw,
    DeparmentsRVO;
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


  public static final int INCOMINGDOCCCPK = AttributesEnum.IncomingDocCcPk.index();
  public static final int INCOMINGDOCUMENTSFK = AttributesEnum.IncomingDocumentsFk.index();
  public static final int DEPARTMENTSFK = AttributesEnum.DepartmentsFk.index();
  public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
  public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
  public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
  public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
  public static final int USERDEPARTMENTFK = AttributesEnum.UserDepartmentFk.index();
  public static final int ACTIONFK = AttributesEnum.ActionFk.index();
  public static final int EXECUTIONDATEG = AttributesEnum.ExecutionDateG.index();
  public static final int EXECUTIONDATEH = AttributesEnum.ExecutionDateH.index();
  public static final int DISPLAYDEPARTMENTSFK = AttributesEnum.DisplayDepartmentsFk.index();
  public static final int DISPLAYACTIONFK = AttributesEnum.DisplayActionFk.index();
  public static final int DISPLAYNOTES = AttributesEnum.DisplayNotes.index();
  public static final int EMPLOYEEFK = AttributesEnum.EmployeeFk.index();
  public static final int DISPLAYEMPLOYEEFK = AttributesEnum.DisplayEmployeeFk.index();
  public static final int ACTIONFKSEARCH = AttributesEnum.ActionFkSearch.index();
  public static final int DEPARTMENTSFKSEARCH = AttributesEnum.DepartmentsFkSearch.index();
  public static final int DISPLAYDEPARTMENTSFKSEARCH = AttributesEnum.DisplayDepartmentsFkSearch.index();
  public static final int DISPLAYACTIONFKSEARCH = AttributesEnum.DisplayActionFkSearch.index();
  public static final int DISPLAYNOTESSEARCH = AttributesEnum.DisplayNotesSearch.index();
  public static final int EMPLOYEEFKSEARCH = AttributesEnum.EmployeeFkSearch.index();
  public static final int DISPLAYEMPLOYEEFKSEARCH = AttributesEnum.DisplayEmployeeFkSearch.index();
  public static final int DISPLAYREJECTREASON = AttributesEnum.DisplayRejectReason.index();
  public static final int DISPLAYINCOMINGDOCGUIDANCE = AttributesEnum.DisplayIncomingDocGuidance.index();
  public static final int INCOMINGDOCSTSFK = AttributesEnum.IncomingDocStsFk.index();
  public static final int DISPLAYINCOMINGDOCGUIDANCESEARCH = AttributesEnum.DisplayIncomingDocGuidanceSearch.index();
  public static final int SELECTEDFL = AttributesEnum.SelectedFl.index();
  public static final int CRSINCOMINGDOCCCTLVIEW = AttributesEnum.CrsIncomingDocCcTlView.index();
  public static final int CRSINCOMINGDOCUMENTSINCOMINGDOCUMENTSFK =
    AttributesEnum.CrsIncomingDocumentsIncomingDocumentsFk.index();
  public static final int HCMDEPARTMENTSDEPARTMENTSFK = AttributesEnum.HcmDepartmentsDepartmentsFk.index();
  public static final int SSOSYSTEMLOOKUPVALUESACTIONFK = AttributesEnum.SsoSystemLookupValuesActionFk.index();
  public static final int HCMEMPBASICDATAVW = AttributesEnum.HcmEmpBasicDataVw.index();
  public static final int DEPARMENTSRVO = AttributesEnum.DeparmentsRVO.index();

  /**
   * This is the default constructor (do not remove).
   */
  public CrsIncomingDocCcViewRowImpl()
  {
  }

  /**
   * Gets CrsIncomingDocCc entity object.
   * @return the CrsIncomingDocCc
   */
  public CrsIncomingDocCcImpl getCrsIncomingDocCc()
  {
    return (CrsIncomingDocCcImpl) getEntity(ENTITY_CRSINCOMINGDOCCC);
  }

  /**
   * Gets the attribute value for INCOMING_DOC_CC_PK using the alias name IncomingDocCcPk.
   * @return the INCOMING_DOC_CC_PK
   */
  public BigDecimal getIncomingDocCcPk()
  {
    return (BigDecimal) getAttributeInternal(INCOMINGDOCCCPK);
  }

  /**
   * Sets <code>value</code> as attribute value for INCOMING_DOC_CC_PK using the alias name IncomingDocCcPk.
   * @param value value to set the INCOMING_DOC_CC_PK
   */
  public void setIncomingDocCcPk(BigDecimal value)
  {
    setAttributeInternal(INCOMINGDOCCCPK, value);
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
   * Gets the attribute value for DEPARTMENTS_FK using the alias name DepartmentsFk.
   * @return the DEPARTMENTS_FK
   */
  public BigDecimal getDepartmentsFk()
  {
    return (BigDecimal) getAttributeInternal(DEPARTMENTSFK);
  }

  /**
   * Sets <code>value</code> as attribute value for DEPARTMENTS_FK using the alias name DepartmentsFk.
   * @param value value to set the DEPARTMENTS_FK
   */
  public void setDepartmentsFk(BigDecimal value)
  {
    setAttributeInternal(DEPARTMENTSFK, value);
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
   * Gets the attribute value for ACTION_FK using the alias name ActionFk.
   * @return the ACTION_FK
   */
  public BigDecimal getActionFk()
  {
    return (BigDecimal) getAttributeInternal(ACTIONFK);
  }

  /**
   * Sets <code>value</code> as attribute value for ACTION_FK using the alias name ActionFk.
   * @param value value to set the ACTION_FK
   */
  public void setActionFk(BigDecimal value)
  {
    setAttributeInternal(ACTIONFK, value);
  }

  /**
   * Gets the attribute value for EXECUTION_DATE_G using the alias name ExecutionDateG.
   * @return the EXECUTION_DATE_G
   */
  public Date getExecutionDateG()
  {
    return (Date) getAttributeInternal(EXECUTIONDATEG);
  }

  /**
   * Sets <code>value</code> as attribute value for EXECUTION_DATE_G using the alias name ExecutionDateG.
   * @param value value to set the EXECUTION_DATE_G
   */
  public void setExecutionDateG(Date value)
  {
    setAttributeInternal(EXECUTIONDATEG, value);
  }

  /**
   * Gets the attribute value for EXECUTION_DATE_H using the alias name ExecutionDateH.
   * @return the EXECUTION_DATE_H
   */
  public BigDecimal getExecutionDateH()
  {
    return (BigDecimal) getAttributeInternal(EXECUTIONDATEH);
  }

  /**
   * Sets <code>value</code> as attribute value for EXECUTION_DATE_H using the alias name ExecutionDateH.
   * @param value value to set the EXECUTION_DATE_H
   */
  public void setExecutionDateH(BigDecimal value)
  {
    setAttributeInternal(EXECUTIONDATEH, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayDepartmentsFk.
   * @return the DisplayDepartmentsFk
   */
  public String getDisplayDepartmentsFk()
  {
    return (String) getAttributeInternal(DISPLAYDEPARTMENTSFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayDepartmentsFk.
   * @param value value to set the  DisplayDepartmentsFk
   */
  public void setDisplayDepartmentsFk(String value)
  {
    setAttributeInternal(DISPLAYDEPARTMENTSFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayActionFk.
   * @return the DisplayActionFk
   */
  public String getDisplayActionFk()
  {
    return (String) getAttributeInternal(DISPLAYACTIONFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayActionFk.
   * @param value value to set the  DisplayActionFk
   */
  public void setDisplayActionFk(String value)
  {
    setAttributeInternal(DISPLAYACTIONFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute ActionFkSearch.
   * @return the ActionFkSearch
   */
  public BigDecimal getActionFkSearch()
  {
    return (BigDecimal) getAttributeInternal(ACTIONFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute ActionFkSearch.
   * @param value value to set the  ActionFkSearch
   */
  public void setActionFkSearch(BigDecimal value)
  {
    setAttributeInternal(ACTIONFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DepartmentsFkSearch.
   * @return the DepartmentsFkSearch
   */
  public BigDecimal getDepartmentsFkSearch()
  {
    return (BigDecimal) getAttributeInternal(DEPARTMENTSFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DepartmentsFkSearch.
   * @param value value to set the  DepartmentsFkSearch
   */
  public void setDepartmentsFkSearch(BigDecimal value)
  {
    setAttributeInternal(DEPARTMENTSFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayDepartmentsFkSearch.
   * @return the DisplayDepartmentsFkSearch
   */
  public String getDisplayDepartmentsFkSearch()
  {
    return (String) getAttributeInternal(DISPLAYDEPARTMENTSFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayDepartmentsFkSearch.
   * @param value value to set the  DisplayDepartmentsFkSearch
   */
  public void setDisplayDepartmentsFkSearch(String value)
  {
    setAttributeInternal(DISPLAYDEPARTMENTSFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayActionFkSearch.
   * @return the DisplayActionFkSearch
   */
  public String getDisplayActionFkSearch()
  {
    return (String) getAttributeInternal(DISPLAYACTIONFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayActionFkSearch.
   * @param value value to set the  DisplayActionFkSearch
   */
  public void setDisplayActionFkSearch(String value)
  {
    setAttributeInternal(DISPLAYACTIONFK, value);
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
   * Gets the attribute value for the calculated attribute DisplayNotesSearch.
   * @return the DisplayNotesSearch
   */
  public String getDisplayNotesSearch()
  {
    return (String) getAttributeInternal(DISPLAYNOTES);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayNotesSearch.
   * @param value value to set the  DisplayNotesSearch
   */
  public void setDisplayNotesSearch(String value)
  {
    setAttributeInternal(DISPLAYNOTESSEARCH, value);
  }

  /**
   * Gets the attribute value for EMPLOYEE_FK using the alias name EmployeeFk.
   * @return the EMPLOYEE_FK
   */
  public BigDecimal getEmployeeFk()
  {
    return (BigDecimal) getAttributeInternal(EMPLOYEEFK);
  }

  /**
   * Sets <code>value</code> as attribute value for EMPLOYEE_FK using the alias name EmployeeFk.
   * @param value value to set the EMPLOYEE_FK
   */
  public void setEmployeeFk(BigDecimal value)
  {
    setAttributeInternal(EMPLOYEEFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayEmployeeFk.
   * @return the DisplayEmployeeFk
   */
  public String getDisplayEmployeeFk()
  {
    return (String) getAttributeInternal(DISPLAYEMPLOYEEFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayEmployeeFk.
   * @param value value to set the  DisplayEmployeeFk
   */
  public void setDisplayEmployeeFk(String value)
  {
    setAttributeInternal(DISPLAYEMPLOYEEFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute EmployeeFkSearch.
   * @return the EmployeeFkSearch
   */
  public BigDecimal getEmployeeFkSearch()
  {
    return (BigDecimal) getAttributeInternal(EMPLOYEEFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute EmployeeFkSearch.
   * @param value value to set the  EmployeeFkSearch
   */
  public void setEmployeeFkSearch(BigDecimal value)
  {
    setAttributeInternal(EMPLOYEEFKSEARCH, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayEmployeeFkSearch.
   * @return the DisplayEmployeeFkSearch
   */
  public String getDisplayEmployeeFkSearch()
  {
    return (String) getAttributeInternal(DISPLAYEMPLOYEEFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayEmployeeFkSearch.
   * @param value value to set the  DisplayEmployeeFkSearch
   */
  public void setDisplayEmployeeFkSearch(String value)
  {
    setAttributeInternal(DISPLAYEMPLOYEEFKSEARCH, value);
  }

  /**
   * Gets the attribute value for DISPLAY_REJECT_REASON using the alias name DisplayRejectReason.
   * @return the DISPLAY_REJECT_REASON
   */
  public String getDisplayRejectReason()
  {
    return (String) getAttributeInternal(DISPLAYREJECTREASON);
  }

  /**
   * Sets <code>value</code> as attribute value for DISPLAY_REJECT_REASON using the alias name DisplayRejectReason.
   * @param value value to set the DISPLAY_REJECT_REASON
   */
  public void setDisplayRejectReason(String value)
  {
    setAttributeInternal(DISPLAYREJECTREASON, value);
  }

  /**
   * Gets the attribute value for DISPLAY_INCOMING_DOC_GUIDANCE using the alias name DisplayIncomingDocGuidance.
   * @return the DISPLAY_INCOMING_DOC_GUIDANCE
   */
  public String getDisplayIncomingDocGuidance()
  {
    return (String) getAttributeInternal(DISPLAYINCOMINGDOCGUIDANCE);
  }

  /**
   * Sets <code>value</code> as attribute value for DISPLAY_INCOMING_DOC_GUIDANCE using the alias name DisplayIncomingDocGuidance.
   * @param value value to set the DISPLAY_INCOMING_DOC_GUIDANCE
   */
  public void setDisplayIncomingDocGuidance(String value)
  {
    setAttributeInternal(DISPLAYINCOMINGDOCGUIDANCE, value);
  }

  /**
   * Gets the attribute value for INCOMING_DOC_STS_FK using the alias name IncomingDocStsFk.
   * @return the INCOMING_DOC_STS_FK
   */
  public BigDecimal getIncomingDocStsFk()
  {
    return (BigDecimal) getAttributeInternal(INCOMINGDOCSTSFK);
  }

  /**
   * Sets <code>value</code> as attribute value for INCOMING_DOC_STS_FK using the alias name IncomingDocStsFk.
   * @param value value to set the INCOMING_DOC_STS_FK
   */
  public void setIncomingDocStsFk(BigDecimal value)
  {
    setAttributeInternal(INCOMINGDOCSTSFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayIncomingDocGuidanceSearch.
   * @return the DisplayIncomingDocGuidanceSearch
   */
  public String getDisplayIncomingDocGuidanceSearch()
  {
    return (String) getAttributeInternal(DISPLAYINCOMINGDOCGUIDANCE);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplayIncomingDocGuidanceSearch.
   * @param value value to set the  DisplayIncomingDocGuidanceSearch
   */
  public void setDisplayIncomingDocGuidanceSearch(String value)
  {
    setAttributeInternal(DISPLAYINCOMINGDOCGUIDANCESEARCH, value);
  }

  /**
   * Gets the attribute value for the calculated attribute SelectedFl.
   * @return the SelectedFl
   */
  public BigDecimal getSelectedFl()
  {
    return (BigDecimal) getAttributeInternal(SELECTEDFL);
  }
  
  public void setSelectedFl(BigDecimal value)
  {
    setAttributeInternal(SELECTEDFL, value);
  }

  /**
   * Gets the associated <code>RowIterator</code> using master-detail link CrsIncomingDocCcTlView.
   */
  public RowIterator getCrsIncomingDocCcTlView()
  {
    return (RowIterator) getAttributeInternal(CRSINCOMINGDOCCCTLVIEW);
  }

  /**
   * Gets the view accessor <code>RowSet</code> CrsIncomingDocumentsIncomingDocumentsFk.
   */
  public RowSet getCrsIncomingDocumentsIncomingDocumentsFk()
  {
    return (RowSet) getAttributeInternal(CRSINCOMINGDOCUMENTSINCOMINGDOCUMENTSFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> HcmDepartmentsDepartmentsFk.
   */
  public RowSet getHcmDepartmentsDepartmentsFk()
  {
    return (RowSet) getAttributeInternal(HCMDEPARTMENTSDEPARTMENTSFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> SsoSystemLookupValuesActionFk.
   */
  public RowSet getSsoSystemLookupValuesActionFk()
  {
    return (RowSet) getAttributeInternal(SSOSYSTEMLOOKUPVALUESACTIONFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> HcmEmpBasicDataVw.
   */
  public RowSet getHcmEmpBasicDataVw()
  {
    return (RowSet) getAttributeInternal(HCMEMPBASICDATAVW);
  }

  /**
   * Gets the view accessor <code>RowSet</code> DeparmentsRVO.
   */
  public RowSet getDeparmentsRVO()
  {
    return (RowSet) getAttributeInternal(DEPARMENTSRVO);
  }
}

