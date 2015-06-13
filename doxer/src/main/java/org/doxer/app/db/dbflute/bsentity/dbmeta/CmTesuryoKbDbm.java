package org.doxer.app.db.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.doxer.app.db.dbflute.allcommon.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The DB meta of CM_TESURYO_KB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CmTesuryoKbDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CmTesuryoKbDbm _instance = new CmTesuryoKbDbm();
    private CmTesuryoKbDbm() {}
    public static CmTesuryoKbDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getKbVal(), (et, vl) -> {
            ColumnInfo col = columnKbVal();
            CDef.TesuryoKb cls = (CDef.TesuryoKb)gcls(et, col, vl);
            if (cls != null) {
                ((CmTesuryoKb)et).setKbValAsTesuryoKb(cls);
            } else {
                ((CmTesuryoKb)et).mynativeMappingKbVal((String)vl);
            }
        }, "kbVal");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getKbMei(), (et, vl) -> ((CmTesuryoKb)et).setKbMei((String)vl), "kbMei");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getKbMeiEn(), (et, vl) -> ((CmTesuryoKb)et).setKbMeiEn((String)vl), "kbMeiEn");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getKbRem(), (et, vl) -> ((CmTesuryoKb)et).setKbRem((String)vl), "kbRem");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getRegUserId(), (et, vl) -> ((CmTesuryoKb)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getRegTm(), (et, vl) -> ((CmTesuryoKb)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getRegFuncCd(), (et, vl) -> ((CmTesuryoKb)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getUpdUserId(), (et, vl) -> ((CmTesuryoKb)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getUpdTm(), (et, vl) -> ((CmTesuryoKb)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getUpdFuncCd(), (et, vl) -> ((CmTesuryoKb)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((CmTesuryoKb)et).getVersionNo(), (et, vl) -> ((CmTesuryoKb)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CM_TESURYO_KB";
    protected final String _tableDispName = "CM_TESURYO_KB";
    protected final String _tablePropertyName = "cmTesuryoKb";
    protected final TableSqlName _tableSqlName = new TableSqlName("CM_TESURYO_KB", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnKbVal = cci("KB_VAL", "KB_VAL", null, null, String.class, "kbVal", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "cmKishTesuryoList", CDef.DefMeta.TesuryoKb, false);
    protected final ColumnInfo _columnKbMei = cci("KB_MEI", "KB_MEI", null, null, String.class, "kbMei", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKbMeiEn = cci("KB_MEI_EN", "KB_MEI_EN", null, null, String.class, "kbMeiEn", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKbRem = cci("KB_REM", "KB_REM", null, null, String.class, "kbRem", null, false, false, true, "VARCHAR", 15, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegUserId = cci("REG_USER_ID", "REG_USER_ID", null, null, String.class, "regUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegTm = cci("REG_TM", "REG_TM", null, null, java.time.LocalDateTime.class, "regTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegFuncCd = cci("REG_FUNC_CD", "REG_FUNC_CD", null, null, String.class, "regFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUserId = cci("UPD_USER_ID", "UPD_USER_ID", null, null, String.class, "updUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTm = cci("UPD_TM", "UPD_TM", null, null, java.time.LocalDateTime.class, "updTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdFuncCd = cci("UPD_FUNC_CD", "UPD_FUNC_CD", null, null, String.class, "updFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "DECIMAL", 9, 0, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * KB_VAL: {PK, NotNull, CHAR(3), classification=TesuryoKb}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKbVal() { return _columnKbVal; }
    /**
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKbMei() { return _columnKbMei; }
    /**
     * KB_MEI_EN: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKbMeiEn() { return _columnKbMeiEn; }
    /**
     * KB_REM: {NotNull, VARCHAR(15)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKbRem() { return _columnKbRem; }
    /**
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegUserId() { return _columnRegUserId; }
    /**
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegTm() { return _columnRegTm; }
    /**
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegFuncCd() { return _columnRegFuncCd; }
    /**
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUserId() { return _columnUpdUserId; }
    /**
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdTm() { return _columnUpdTm; }
    /**
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdFuncCd() { return _columnUpdFuncCd; }
    /**
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnKbVal());
        ls.add(columnKbMei());
        ls.add(columnKbMeiEn());
        ls.add(columnKbRem());
        ls.add(columnRegUserId());
        ls.add(columnRegTm());
        ls.add(columnRegFuncCd());
        ls.add(columnUpdUserId());
        ls.add(columnUpdTm());
        ls.add(columnUpdFuncCd());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnKbVal()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * CM_KISH_TESURYO by TESURYO_KB, named 'cmKishTesuryoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCmKishTesuryoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnKbVal(), CmKishTesuryoDbm.getInstance().columnTesuryoKb());
        return cri("FK_CM_KISH_TESURYO_CM_TESURYO_KB", "cmKishTesuryoList", this, CmKishTesuryoDbm.getInstance(), mp, false, "cmTesuryoKb");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegUserId(), columnRegTm(), columnRegFuncCd(), columnUpdUserId(), columnUpdTm(), columnUpdFuncCd(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegUserId(), columnRegTm(), columnRegFuncCd(), columnUpdUserId(), columnUpdTm(), columnUpdFuncCd(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdUserId(), columnUpdTm(), columnUpdFuncCd()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.CmTesuryoKb"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.CmTesuryoKbCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.CmTesuryoKbBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CmTesuryoKb> getEntityType() { return CmTesuryoKb.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CmTesuryoKb newEntity() { return new CmTesuryoKb(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CmTesuryoKb)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CmTesuryoKb)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
