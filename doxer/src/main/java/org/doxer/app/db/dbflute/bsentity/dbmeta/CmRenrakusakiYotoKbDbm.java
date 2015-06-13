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
 * The DB meta of CM_RENRAKUSAKI_YOTO_KB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CmRenrakusakiYotoKbDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CmRenrakusakiYotoKbDbm _instance = new CmRenrakusakiYotoKbDbm();
    private CmRenrakusakiYotoKbDbm() {}
    public static CmRenrakusakiYotoKbDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getKbVal(), (et, vl) -> {
            ColumnInfo col = columnKbVal();
            CDef.RenrakusakiYotoKb cls = (CDef.RenrakusakiYotoKb)gcls(et, col, vl);
            if (cls != null) {
                ((CmRenrakusakiYotoKb)et).setKbValAsRenrakusakiYotoKb(cls);
            } else {
                ((CmRenrakusakiYotoKb)et).mynativeMappingKbVal((String)vl);
            }
        }, "kbVal");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getKbMei(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setKbMei((String)vl), "kbMei");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getKbMeiEn(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setKbMeiEn((String)vl), "kbMeiEn");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getKbRem(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setKbRem((String)vl), "kbRem");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getRegUserId(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getRegTm(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getRegFuncCd(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getUpdUserId(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getUpdTm(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getUpdFuncCd(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((CmRenrakusakiYotoKb)et).getVersionNo(), (et, vl) -> ((CmRenrakusakiYotoKb)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CM_RENRAKUSAKI_YOTO_KB";
    protected final String _tableDispName = "CM_RENRAKUSAKI_YOTO_KB";
    protected final String _tablePropertyName = "cmRenrakusakiYotoKb";
    protected final TableSqlName _tableSqlName = new TableSqlName("CM_RENRAKUSAKI_YOTO_KB", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnKbVal = cci("KB_VAL", "KB_VAL", null, null, String.class, "kbVal", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.RenrakusakiYotoKb, false);
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
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
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
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.CmRenrakusakiYotoKb"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.CmRenrakusakiYotoKbCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.CmRenrakusakiYotoKbBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CmRenrakusakiYotoKb> getEntityType() { return CmRenrakusakiYotoKb.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CmRenrakusakiYotoKb newEntity() { return new CmRenrakusakiYotoKb(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CmRenrakusakiYotoKb)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CmRenrakusakiYotoKb)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
