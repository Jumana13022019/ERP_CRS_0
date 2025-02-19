package crs.model.vo;

import crs.model.eo.CrsAllowedSendDepartmentsImpl;

import crs.common.Constants;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 03 12:17:24 EEST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CrsAllowedSendDepartmentsViewRowImpl
  extends ViewRowImpl
{


  public static final int ENTITY_CRSALLOWEDSENDDEPARTMENTS = 0;

  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    AllowedSendDepartmentsPk,
    DepartmentsFk,
    SentDepartmentFk,
    CreatedBy,
    CreationDate,
    ModifiedBy,
    ModifiedDate,
    UserDepartmentFk,
    DisplaySentDepartmentFk,
    DisplayDepartmentsFk,
    DepartmentTypeFk,
    SentDepartmentFkSwitcher,
    DisplaySentDepartmentFkSearch,
    DepartmentsFkSearch,
    SentDepartmentFkSeacrh,
    DisplayDepartmentTypeFk,
    DepartmentTypeFkSearch,
    DisplayDepartmentTypeFkSearch,
    HcmDepartmentsSentDepartmentFk,
    HcmDepartmentsDepartmentsFk,
    SsoActiveLookupValuesVwView1,
    HcmDepartmentsVwView1;
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


  public static final int ALLOWEDSENDDEPARTMENTSPK = AttributesEnum.AllowedSendDepartmentsPk.index();
  public static final int DEPARTMENTSFK = AttributesEnum.DepartmentsFk.index();
  public static final int SENTDEPARTMENTFK = AttributesEnum.SentDepartmentFk.index();
  public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
  public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
  public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
  public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
  public static final int USERDEPARTMENTFK = AttributesEnum.UserDepartmentFk.index();
  public static final int DISPLAYSENTDEPARTMENTFK = AttributesEnum.DisplaySentDepartmentFk.index();
  public static final int DISPLAYDEPARTMENTSFK = AttributesEnum.DisplayDepartmentsFk.index();
  public static final int DEPARTMENTTYPEFK = AttributesEnum.DepartmentTypeFk.index();
  public static final int SENTDEPARTMENTFKSWITCHER = AttributesEnum.SentDepartmentFkSwitcher.index();
  public static final int DISPLAYSENTDEPARTMENTFKSEARCH = AttributesEnum.DisplaySentDepartmentFkSearch.index();
  public static final int DEPARTMENTSFKSEARCH = AttributesEnum.DepartmentsFkSearch.index();
  public static final int SENTDEPARTMENTFKSEACRH = AttributesEnum.SentDepartmentFkSeacrh.index();
  public static final int DISPLAYDEPARTMENTTYPEFK = AttributesEnum.DisplayDepartmentTypeFk.index();
  public static final int DEPARTMENTTYPEFKSEARCH = AttributesEnum.DepartmentTypeFkSearch.index();
  public static final int DISPLAYDEPARTMENTTYPEFKSEARCH = AttributesEnum.DisplayDepartmentTypeFkSearch.index();
  public static final int HCMDEPARTMENTSSENTDEPARTMENTFK = AttributesEnum.HcmDepartmentsSentDepartmentFk.index();
  public static final int HCMDEPARTMENTSDEPARTMENTSFK = AttributesEnum.HcmDepartmentsDepartmentsFk.index();
  public static final int SSOACTIVELOOKUPVALUESVWVIEW1 = AttributesEnum.SsoActiveLookupValuesVwView1.index();
  public static final int HCMDEPARTMENTSVWVIEW1 = AttributesEnum.HcmDepartmentsVwView1.index();

  /**
   * This is the default constructor (do not remove).
   */
  public CrsAllowedSendDepartmentsViewRowImpl()
  {
  }

  /**
   * Gets CrsAllowedSendDepartments entity object.
   * @return the CrsAllowedSendDepartments
   */
  public CrsAllowedSendDepartmentsImpl getCrsAllowedSendDepartments()
  {
    return (CrsAllowedSendDepartmentsImpl) getEntity(ENTITY_CRSALLOWEDSENDDEPARTMENTS);
  }

  /**
   * Gets the attribute value for ALLOWED_SEND_DEPARTMENTS_PK using the alias name AllowedSendDepartmentsPk.
   * @return the ALLOWED_SEND_DEPARTMENTS_PK
   */
  public BigDecimal getAllowedSendDepartmentsPk()
  {
    return (BigDecimal) getAttributeInternal(ALLOWEDSENDDEPARTMENTSPK);
  }

  /**
   * Sets <code>value</code> as attribute value for ALLOWED_SEND_DEPARTMENTS_PK using the alias name AllowedSendDepartmentsPk.
   * @param value value to set the ALLOWED_SEND_DEPARTMENTS_PK
   */
  public void setAllowedSendDepartmentsPk(BigDecimal value)
  {
    setAttributeInternal(ALLOWEDSENDDEPARTMENTSPK, value);
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
   * Gets the attribute value for SENT_DEPARTMENT_FK using the alias name SentDepartmentFk.
   * @return the SENT_DEPARTMENT_FK
   */
  public BigDecimal getSentDepartmentFk()
  {
    return (BigDecimal) getAttributeInternal(SENTDEPARTMENTFK);
  }

  /**
   * Sets <code>value</code> as attribute value for SENT_DEPARTMENT_FK using the alias name SentDepartmentFk.
   * @param value value to set the SENT_DEPARTMENT_FK
   */
  public void setSentDepartmentFk(BigDecimal value)
  {
    setAttributeInternal(SENTDEPARTMENTFK, value);
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
   * Gets the attribute value for the calculated attribute DisplaySentDepartmentFk.
   * @return the DisplaySentDepartmentFk
   */
  public String getDisplaySentDepartmentFk()
  {
    return (String) getAttributeInternal(DISPLAYSENTDEPARTMENTFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplaySentDepartmentFk.
   * @param value value to set the  DisplaySentDepartmentFk
   */
  public void setDisplaySentDepartmentFk(String value)
  {
    setAttributeInternal(DISPLAYSENTDEPARTMENTFK, value);
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
   * Gets the attribute value for DEPARTMENT_TYPE_FK using the alias name DepartmentTypeFk.
   * @return the DEPARTMENT_TYPE_FK
   */
  public BigDecimal getDepartmentTypeFk()
  {
    return (BigDecimal) getAttributeInternal(DEPARTMENTTYPEFK);
  }

  /**
   * Sets <code>value</code> as attribute value for DEPARTMENT_TYPE_FK using the alias name DepartmentTypeFk.
   * @param value value to set the DEPARTMENT_TYPE_FK
   */
  public void setDepartmentTypeFk(BigDecimal value)
  {
    setAttributeInternal(DEPARTMENTTYPEFK, value);
  }

  /**
   * Gets the attribute value for the calculated attribute SentDepartmentFkSwitcher.
   * @return the SentDepartmentFkSwitcher
   */
  public String getSentDepartmentFkSwitcher()
  {
    if (getDepartmentTypeFk()!= null )
    {
    if ( getDepartmentTypeFk().intValue() == Constants.DEPARTMENT_TYPE_FK_INTERNAL)
    {
      return "LOV_SentInternalDepartmentFk";
    }
    return "LOV_SentExternalDepartmentFk";
    }
    return (String) getAttributeInternal(SENTDEPARTMENTFKSWITCHER);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute SentDepartmentFkSwitcher.
   * @param value value to set the  SentDepartmentFkSwitcher
   */
  public void setSentDepartmentFkSwitcher(String value)
  {
    setAttributeInternal(SENTDEPARTMENTFKSWITCHER, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplaySentDepartmentFkSearch.
   * @return the DisplaySentDepartmentFkSearch
   */
  public String getDisplaySentDepartmentFkSearch()
  {
    return (String) getAttributeInternal(DISPLAYSENTDEPARTMENTFK);//(DISPLAYSENTDEPARTMENTFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute DisplaySentDepartmentFkSearch.
   * @param value value to set the  DisplaySentDepartmentFkSearch
   */
  public void setDisplaySentDepartmentFkSearch(String value)
  {
    setAttributeInternal(DISPLAYSENTDEPARTMENTFKSEARCH, value);
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
    setAttributeInternal(DEPARTMENTSFKSEARCH, value);
  }

  /**
   * Gets the attribute value for the calculated attribute SentDepartmentFkSeacrh.
   * @return the SentDepartmentFkSeacrh
   */
  public BigDecimal getSentDepartmentFkSeacrh()
  {
    return (BigDecimal) getAttributeInternal(SENTDEPARTMENTFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute SentDepartmentFkSeacrh.
   * @param value value to set the  SentDepartmentFkSeacrh
   */
  public void setSentDepartmentFkSeacrh(BigDecimal value)
  {
    setAttributeInternal(SENTDEPARTMENTFKSEACRH, value);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayDepartmentTypeFk.
   * @return the DisplayDepartmentTypeFk
   */
  public String getDisplayDepartmentTypeFk()
  {
    return (String) getAttributeInternal(DISPLAYDEPARTMENTTYPEFK);
  }


  /**
   * Gets the attribute value for the calculated attribute DepartmentTypeFkSearch.
   * @return the DepartmentTypeFkSearch
   */
  public BigDecimal getDepartmentTypeFkSearch()
  {
    return (BigDecimal) getAttributeInternal(DEPARTMENTTYPEFK);
  }

  /**
   * Gets the attribute value for the calculated attribute DisplayDepartmentTypeFkSearch.
   * @return the DisplayDepartmentTypeFkSearch
   */
  public String getDisplayDepartmentTypeFkSearch()
  {
    return (String) getAttributeInternal(DISPLAYDEPARTMENTTYPEFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> HcmDepartmentsSentDepartmentFk.
   */
  public RowSet getHcmDepartmentsSentDepartmentFk()
  {
    return (RowSet) getAttributeInternal(HCMDEPARTMENTSSENTDEPARTMENTFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> HcmDepartmentsDepartmentsFk.
   */
  public RowSet getHcmDepartmentsDepartmentsFk()
  {
    return (RowSet) getAttributeInternal(HCMDEPARTMENTSDEPARTMENTSFK);
  }

  /**
   * Gets the view accessor <code>RowSet</code> SsoActiveLookupValuesVwView1.
   */
  public RowSet getSsoActiveLookupValuesVwView1()
  {
    return (RowSet) getAttributeInternal(SSOACTIVELOOKUPVALUESVWVIEW1);
  }

  /**
   * Gets the view accessor <code>RowSet</code> HcmDepartmentsVwView1.
   */
  public RowSet getHcmDepartmentsVwView1()
  {
    return (RowSet) getAttributeInternal(HCMDEPARTMENTSVWVIEW1);
  }
}

