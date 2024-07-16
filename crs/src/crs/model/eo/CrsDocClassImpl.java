package crs.model.eo;

import com.sd.util.db.DBUtil;

import gen.common.GenLib;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.List;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 03 17:04:36 GMT+03:00 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CrsDocClassImpl
  extends AuditEntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    DocClassPk,
    DistributionTypeFk,
    CreatedBy,
    CreationDate,
    ModifiedBy,
    ModifiedDate,
    UserDepartmentFk,
    DisplayDocClass,
    CrsDocClassCc,
    CrsDocClassTl;
    private static AttributesEnum[] vals = null;
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


  public static final int DOCCLASSPK = AttributesEnum.DocClassPk.index();
  public static final int DISTRIBUTIONTYPEFK = AttributesEnum.DistributionTypeFk.index();
  public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
  public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
  public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
  public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
  public static final int USERDEPARTMENTFK = AttributesEnum.UserDepartmentFk.index();
  public static final int DISPLAYDOCCLASS = AttributesEnum.DisplayDocClass.index();
  public static final int CRSDOCCLASSCC = AttributesEnum.CrsDocClassCc.index();
  public static final int CRSDOCCLASSTL = AttributesEnum.CrsDocClassTl.index();

  /**
   * This is the default constructor (do not remove).
   */
  public CrsDocClassImpl()
  {
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("crs.model.eo.CrsDocClass");
  }


  /**
   * Gets the attribute value for DocClassPk, using the alias name DocClassPk.
   * @return the value of DocClassPk
   */
  public BigDecimal getDocClassPk()
  {
    return (BigDecimal) getAttributeInternal(DOCCLASSPK);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocClassPk.
   * @param value value to set the DocClassPk
   */
  public void setDocClassPk(BigDecimal value)
  {
    setAttributeInternal(DOCCLASSPK, value);
  }

  /**
   * Gets the attribute value for DistributionTypeFk, using the alias name DistributionTypeFk.
   * @return the value of DistributionTypeFk
   */
  public BigDecimal getDistributionTypeFk()
  {
    return (BigDecimal) getAttributeInternal(DISTRIBUTIONTYPEFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for DistributionTypeFk.
   * @param value value to set the DistributionTypeFk
   */
  public void setDistributionTypeFk(BigDecimal value)
  {
    setAttributeInternal(DISTRIBUTIONTYPEFK, value);
  }

  /**
   * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
   * @return the value of CreatedBy
   */
  public BigDecimal getCreatedBy()
  {
    return (BigDecimal) getAttributeInternal(CREATEDBY);
  }

  /**
   * Sets <code>value</code> as the attribute value for CreatedBy.
   * @param value value to set the CreatedBy
   */
  public void setCreatedBy(BigDecimal value)
  {
    setAttributeInternal(CREATEDBY, value);
  }

  /**
   * Gets the attribute value for CreationDate, using the alias name CreationDate.
   * @return the value of CreationDate
   */
  public Timestamp getCreationDate()
  {
    return (Timestamp) getAttributeInternal(CREATIONDATE);
  }

  /**
   * Sets <code>value</code> as the attribute value for CreationDate.
   * @param value value to set the CreationDate
   */
  public void setCreationDate(Timestamp value)
  {
    setAttributeInternal(CREATIONDATE, value);
  }

  /**
   * Gets the attribute value for ModifiedBy, using the alias name ModifiedBy.
   * @return the value of ModifiedBy
   */
  public BigDecimal getModifiedBy()
  {
    return (BigDecimal) getAttributeInternal(MODIFIEDBY);
  }

  /**
   * Sets <code>value</code> as the attribute value for ModifiedBy.
   * @param value value to set the ModifiedBy
   */
  public void setModifiedBy(BigDecimal value)
  {
    setAttributeInternal(MODIFIEDBY, value);
  }

  /**
   * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
   * @return the value of ModifiedDate
   */
  public Timestamp getModifiedDate()
  {
    return (Timestamp) getAttributeInternal(MODIFIEDDATE);
  }

  /**
   * Sets <code>value</code> as the attribute value for ModifiedDate.
   * @param value value to set the ModifiedDate
   */
  public void setModifiedDate(Timestamp value)
  {
    setAttributeInternal(MODIFIEDDATE, value);
  }

  /**
   * Gets the attribute value for UserDepartmentFk, using the alias name UserDepartmentFk.
   * @return the value of UserDepartmentFk
   */
  public BigDecimal getUserDepartmentFk()
  {
    return (BigDecimal) getAttributeInternal(USERDEPARTMENTFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for UserDepartmentFk.
   * @param value value to set the UserDepartmentFk
   */
  public void setUserDepartmentFk(BigDecimal value)
  {
    setAttributeInternal(USERDEPARTMENTFK, value);
  }

  /**
   * Gets the attribute value for DisplayDocClass, using the alias name DisplayDocClass.
   * @return the value of DisplayDocClass
   */
  public String getDisplayDocClass()
  {
    return (String) getAttributeInternal(DISPLAYDOCCLASS);
  }

  /**
   * Sets <code>value</code> as the attribute value for DisplayDocClass.
   * @param value value to set the DisplayDocClass
   */
  public void setDisplayDocClass(String value)
  {
    setAttributeInternal(DISPLAYDOCCLASS, value);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getCrsDocClassCc()
  {
    return (RowIterator) getAttributeInternal(CRSDOCCLASSCC);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getCrsDocClassTl()
  {
    return (RowIterator) getAttributeInternal(CRSDOCCLASSTL);
  }


  /**
   * @param docClassPk key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(BigDecimal docClassPk)
  {
    return new Key(new Object[] { docClassPk });
  }

  protected void doDML(int operation, oracle.jbo.server.TransactionEvent e)
  {
    
    if ( operation == DML_UPDATE)
    {
      if(!getDistributionTypeFk().equals(244))
      {
        String removeAllTranslateData = "delete from crs_doc_class_cc_tl  where  doc_class_cc_fk in (select   doc_class_cc_pk from crs_doc_class_cc   where doc_class_fk = "+getDocClassPk()+")";
        String removeAllData = "delete from crs_doc_class_cc   where doc_class_fk = "+getDocClassPk();

        try
        {
          DBUtil.executeDML(removeAllTranslateData);
          DBUtil.executeDML(removeAllData);

        }
        catch (Exception e1)
        {
          e1.printStackTrace();
        }

      }
    }
    
    super.doDML(operation, e);

    if ( operation == DML_INSERT )
    {
      BigDecimal docClassPk = gen.common.GenLib.getPrimaryKeyValue(getDBTransaction(), "CRS_DOC_CLASS_SEQ");
      setDocClassPk(docClassPk);
      insertToCrsDocClassTl();
    }
  }
  
  
  
  private void insertToCrsDocClassTl(){
      oracle.jbo.server.EntityDefImpl crsDocClassDefinition = CrsDocClassTlImpl.getDefinitionObject();
      List<Integer> activeLanguages  = gen.common.GenLib.getActiveDataLanguages(getDBTransaction());
      for (Integer languageId : activeLanguages) {
        CrsDocClassTlImpl crsDocClassTl = (CrsDocClassTlImpl)crsDocClassDefinition.createInstance2(getDBTransaction(), null);
        crsDocClassTl.setLanguagesFk(BigDecimal.valueOf(languageId));
        crsDocClassTl.setDocClassFk(getDocClassPk());
        crsDocClassTl.setDocClass(getDisplayDocClass());
      }
    }

  public void remove()
  {
    gen.common.GenLib.removeTranlationRows(getCrsDocClassTl());
    super.remove();
  }
}