package crs.model.eo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Apr 01 13:33:07 GMT+03:00 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CrsAuditModificationsImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    AuditModificationsPk,
    UsersFk,
    DbUser,
    TableName,
    ColumnName,
    ColumnDesc,
    OldValue,
    NewValue,
    Remarks,
    TransactionTimeG,
    TransactionFk,
    TableRecordFk,
    PageName,
    RemoteHost,
    RemoteIp,
    OperationSql;
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
  public static final int AUDITMODIFICATIONSPK = AttributesEnum.AuditModificationsPk.index();
  public static final int USERSFK = AttributesEnum.UsersFk.index();
  public static final int DBUSER = AttributesEnum.DbUser.index();
  public static final int TABLENAME = AttributesEnum.TableName.index();
  public static final int COLUMNNAME = AttributesEnum.ColumnName.index();
  public static final int COLUMNDESC = AttributesEnum.ColumnDesc.index();
  public static final int OLDVALUE = AttributesEnum.OldValue.index();
  public static final int NEWVALUE = AttributesEnum.NewValue.index();
  public static final int REMARKS = AttributesEnum.Remarks.index();
  public static final int TRANSACTIONTIMEG = AttributesEnum.TransactionTimeG.index();
  public static final int TRANSACTIONFK = AttributesEnum.TransactionFk.index();
  public static final int TABLERECORDFK = AttributesEnum.TableRecordFk.index();
  public static final int PAGENAME = AttributesEnum.PageName.index();
  public static final int REMOTEHOST = AttributesEnum.RemoteHost.index();
  public static final int REMOTEIP = AttributesEnum.RemoteIp.index();
  public static final int OPERATIONSQL = AttributesEnum.OperationSql.index();

  /**
   * This is the default constructor (do not remove).
   */
  public CrsAuditModificationsImpl()
  {
  }

  /**
   * Gets the attribute value for AuditModificationsPk, using the alias name AuditModificationsPk.
   * @return the value of AuditModificationsPk
   */
  public BigDecimal getAuditModificationsPk()
  {
    return (BigDecimal) getAttributeInternal(AUDITMODIFICATIONSPK);
  }

  /**
   * Sets <code>value</code> as the attribute value for AuditModificationsPk.
   * @param value value to set the AuditModificationsPk
   */
  public void setAuditModificationsPk(BigDecimal value)
  {
    setAttributeInternal(AUDITMODIFICATIONSPK, value);
  }

  /**
   * Gets the attribute value for UsersFk, using the alias name UsersFk.
   * @return the value of UsersFk
   */
  public String getUsersFk()
  {
    return (String) getAttributeInternal(USERSFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for UsersFk.
   * @param value value to set the UsersFk
   */
  public void setUsersFk(String value)
  {
    setAttributeInternal(USERSFK, value);
  }

  /**
   * Gets the attribute value for DbUser, using the alias name DbUser.
   * @return the value of DbUser
   */
  public String getDbUser()
  {
    return (String) getAttributeInternal(DBUSER);
  }

  /**
   * Sets <code>value</code> as the attribute value for DbUser.
   * @param value value to set the DbUser
   */
  public void setDbUser(String value)
  {
    setAttributeInternal(DBUSER, value);
  }

  /**
   * Gets the attribute value for TableName, using the alias name TableName.
   * @return the value of TableName
   */
  public String getTableName()
  {
    return (String) getAttributeInternal(TABLENAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for TableName.
   * @param value value to set the TableName
   */
  public void setTableName(String value)
  {
    setAttributeInternal(TABLENAME, value);
  }

  /**
   * Gets the attribute value for ColumnName, using the alias name ColumnName.
   * @return the value of ColumnName
   */
  public String getColumnName()
  {
    return (String) getAttributeInternal(COLUMNNAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for ColumnName.
   * @param value value to set the ColumnName
   */
  public void setColumnName(String value)
  {
    setAttributeInternal(COLUMNNAME, value);
  }

  /**
   * Gets the attribute value for ColumnDesc, using the alias name ColumnDesc.
   * @return the value of ColumnDesc
   */
  public String getColumnDesc()
  {
    return (String) getAttributeInternal(COLUMNDESC);
  }

  /**
   * Sets <code>value</code> as the attribute value for ColumnDesc.
   * @param value value to set the ColumnDesc
   */
  public void setColumnDesc(String value)
  {
    setAttributeInternal(COLUMNDESC, value);
  }

  /**
   * Gets the attribute value for OldValue, using the alias name OldValue.
   * @return the value of OldValue
   */
  public String getOldValue()
  {
    return (String) getAttributeInternal(OLDVALUE);
  }

  /**
   * Sets <code>value</code> as the attribute value for OldValue.
   * @param value value to set the OldValue
   */
  public void setOldValue(String value)
  {
    setAttributeInternal(OLDVALUE, value);
  }

  /**
   * Gets the attribute value for NewValue, using the alias name NewValue.
   * @return the value of NewValue
   */
  public String getNewValue()
  {
    return (String) getAttributeInternal(NEWVALUE);
  }

  /**
   * Sets <code>value</code> as the attribute value for NewValue.
   * @param value value to set the NewValue
   */
  public void setNewValue(String value)
  {
    setAttributeInternal(NEWVALUE, value);
  }

  /**
   * Gets the attribute value for Remarks, using the alias name Remarks.
   * @return the value of Remarks
   */
  public String getRemarks()
  {
    return (String) getAttributeInternal(REMARKS);
  }

  /**
   * Sets <code>value</code> as the attribute value for Remarks.
   * @param value value to set the Remarks
   */
  public void setRemarks(String value)
  {
    setAttributeInternal(REMARKS, value);
  }

  /**
   * Gets the attribute value for TransactionTimeG, using the alias name TransactionTimeG.
   * @return the value of TransactionTimeG
   */
  public Timestamp getTransactionTimeG()
  {
    return (Timestamp) getAttributeInternal(TRANSACTIONTIMEG);
  }

  /**
   * Sets <code>value</code> as the attribute value for TransactionTimeG.
   * @param value value to set the TransactionTimeG
   */
  public void setTransactionTimeG(Timestamp value)
  {
    setAttributeInternal(TRANSACTIONTIMEG, value);
  }

  /**
   * Gets the attribute value for TransactionFk, using the alias name TransactionFk.
   * @return the value of TransactionFk
   */
  public BigDecimal getTransactionFk()
  {
    return (BigDecimal) getAttributeInternal(TRANSACTIONFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for TransactionFk.
   * @param value value to set the TransactionFk
   */
  public void setTransactionFk(BigDecimal value)
  {
    setAttributeInternal(TRANSACTIONFK, value);
  }

  /**
   * Gets the attribute value for TableRecordFk, using the alias name TableRecordFk.
   * @return the value of TableRecordFk
   */
  public String getTableRecordFk()
  {
    return (String) getAttributeInternal(TABLERECORDFK);
  }

  /**
   * Sets <code>value</code> as the attribute value for TableRecordFk.
   * @param value value to set the TableRecordFk
   */
  public void setTableRecordFk(String value)
  {
    setAttributeInternal(TABLERECORDFK, value);
  }

  /**
   * Gets the attribute value for PageName, using the alias name PageName.
   * @return the value of PageName
   */
  public String getPageName()
  {
    return (String) getAttributeInternal(PAGENAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for PageName.
   * @param value value to set the PageName
   */
  public void setPageName(String value)
  {
    setAttributeInternal(PAGENAME, value);
  }

  /**
   * Gets the attribute value for RemoteHost, using the alias name RemoteHost.
   * @return the value of RemoteHost
   */
  public String getRemoteHost()
  {
    return (String) getAttributeInternal(REMOTEHOST);
  }

  /**
   * Sets <code>value</code> as the attribute value for RemoteHost.
   * @param value value to set the RemoteHost
   */
  public void setRemoteHost(String value)
  {
    setAttributeInternal(REMOTEHOST, value);
  }

  /**
   * Gets the attribute value for RemoteIp, using the alias name RemoteIp.
   * @return the value of RemoteIp
   */
  public String getRemoteIp()
  {
    return (String) getAttributeInternal(REMOTEIP);
  }

  /**
   * Sets <code>value</code> as the attribute value for RemoteIp.
   * @param value value to set the RemoteIp
   */
  public void setRemoteIp(String value)
  {
    setAttributeInternal(REMOTEIP, value);
  }

  /**
   * Gets the attribute value for OperationSql, using the alias name OperationSql.
   * @return the value of OperationSql
   */
  public String getOperationSql()
  {
    return (String) getAttributeInternal(OPERATIONSQL);
  }

  /**
   * Sets <code>value</code> as the attribute value for OperationSql.
   * @param value value to set the OperationSql
   */
  public void setOperationSql(String value)
  {
    setAttributeInternal(OPERATIONSQL, value);
  }

  /**
   * @param auditModificationsPk key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(BigDecimal auditModificationsPk)
  {
    return new Key(new Object[] { auditModificationsPk });
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("crs.model.eo.CrsAuditModifications");
  }

  

  protected void doDML(int operation, oracle.jbo.server.TransactionEvent e)
  {
    super.doDML(operation, e);

    if ( operation == DML_INSERT )
    {
      BigDecimal auditModificationsPk = gen.common.GenLib.getPrimaryKeyValue(getDBTransaction(), "CRS_AUDIT_MODIFICATIONS_SEQ");
      setAuditModificationsPk(auditModificationsPk);
    }
  }

}

