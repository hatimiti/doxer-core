package org.doxer.app.db.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.doxer.app.db.dbflute.allcommon.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The DB meta of CM_KISH_RENRAKUSAKI. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CmKishRenrakusakiDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CmKishRenrakusakiDbm _instance = new CmKishRenrakusakiDbm();
    private CmKishRenrakusakiDbm() {}
    public static CmKishRenrakusakiDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getCmKishRenrakusakiId(), (et, vl) -> ((CmKishRenrakusaki)et).setCmKishRenrakusakiId(ctl(vl)), "cmKishRenrakusakiId");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getCmKaishaId(), (et, vl) -> ((CmKishRenrakusaki)et).setCmKaishaId(ctl(vl)), "cmKaishaId");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getTelNo1(), (et, vl) -> ((CmKishRenrakusaki)et).setTelNo1(cti(vl)), "telNo1");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getTelNo2(), (et, vl) -> ((CmKishRenrakusaki)et).setTelNo2(cti(vl)), "telNo2");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getTelNo3(), (et, vl) -> ((CmKishRenrakusaki)et).setTelNo3(cti(vl)), "telNo3");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getMailAddress(), (et, vl) -> ((CmKishRenrakusaki)et).setMailAddress((String)vl), "mailAddress");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getRenrakusakiYotoKb(), (et, vl) -> {
            ColumnInfo col = columnRenrakusakiYotoKb();
            CDef.RenrakusakiYotoKb cls = (CDef.RenrakusakiYotoKb)gcls(et, col, vl);
            if (cls != null) {
                ((CmKishRenrakusaki)et).setRenrakusakiYotoKbAsRenrakusakiYotoKb(cls);
            } else {
                ((CmKishRenrakusaki)et).mynativeMappingRenrakusakiYotoKb((String)vl);
            }
        }, "renrakusakiYotoKb");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getRegUserId(), (et, vl) -> ((CmKishRenrakusaki)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getRegTm(), (et, vl) -> ((CmKishRenrakusaki)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getRegFuncCd(), (et, vl) -> ((CmKishRenrakusaki)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getUpdUserId(), (et, vl) -> ((CmKishRenrakusaki)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getUpdTm(), (et, vl) -> ((CmKishRenrakusaki)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getUpdFuncCd(), (et, vl) -> ((CmKishRenrakusaki)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((CmKishRenrakusaki)et).getVersionNo(), (et, vl) -> ((CmKishRenrakusaki)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((CmKishRenrakusaki)et).getCmKaisha(), (et, vl) -> ((CmKishRenrakusaki)et).setCmKaisha((OptionalEntity<CmKaisha>)vl), "cmKaisha");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CM_KISH_RENRAKUSAKI";
    protected final String _tableDispName = "CM_KISH_RENRAKUSAKI";
    protected final String _tablePropertyName = "cmKishRenrakusaki";
    protected final TableSqlName _tableSqlName = new TableSqlName("CM_KISH_RENRAKUSAKI", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCmKishRenrakusakiId = cci("CM_KISH_RENRAKUSAKI_ID", "CM_KISH_RENRAKUSAKI_ID", null, null, Long.class, "cmKishRenrakusakiId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_EBC3D298_7B83_4580_B974_EBF88532F33C", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmKaishaId = cci("CM_KAISHA_ID", "CM_KAISHA_ID", null, null, Long.class, "cmKaishaId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "cmKaisha", null, null, false);
    protected final ColumnInfo _columnTelNo1 = cci("TEL_NO1", "TEL_NO1", null, null, Integer.class, "telNo1", null, false, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo2 = cci("TEL_NO2", "TEL_NO2", null, null, Integer.class, "telNo2", null, false, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo3 = cci("TEL_NO3", "TEL_NO3", null, null, Integer.class, "telNo3", null, false, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailAddress = cci("MAIL_ADDRESS", "MAIL_ADDRESS", null, null, String.class, "mailAddress", null, false, false, false, "VARCHAR", 253, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRenrakusakiYotoKb = cci("RENRAKUSAKI_YOTO_KB", "RENRAKUSAKI_YOTO_KB", null, null, String.class, "renrakusakiYotoKb", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.RenrakusakiYotoKb, false);
    protected final ColumnInfo _columnRegUserId = cci("REG_USER_ID", "REG_USER_ID", null, null, String.class, "regUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegTm = cci("REG_TM", "REG_TM", null, null, java.time.LocalDateTime.class, "regTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegFuncCd = cci("REG_FUNC_CD", "REG_FUNC_CD", null, null, String.class, "regFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUserId = cci("UPD_USER_ID", "UPD_USER_ID", null, null, String.class, "updUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTm = cci("UPD_TM", "UPD_TM", null, null, java.time.LocalDateTime.class, "updTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdFuncCd = cci("UPD_FUNC_CD", "UPD_FUNC_CD", null, null, String.class, "updFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "DECIMAL", 9, 0, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmKishRenrakusakiId() { return _columnCmKishRenrakusakiId; }
    /**
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmKaishaId() { return _columnCmKaishaId; }
    /**
     * TEL_NO1: {DECIMAL(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo1() { return _columnTelNo1; }
    /**
     * TEL_NO2: {DECIMAL(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo2() { return _columnTelNo2; }
    /**
     * TEL_NO3: {DECIMAL(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo3() { return _columnTelNo3; }
    /**
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }
    /**
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRenrakusakiYotoKb() { return _columnRenrakusakiYotoKb; }
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
        ls.add(columnCmKishRenrakusakiId());
        ls.add(columnCmKaishaId());
        ls.add(columnTelNo1());
        ls.add(columnTelNo2());
        ls.add(columnTelNo3());
        ls.add(columnMailAddress());
        ls.add(columnRenrakusakiYotoKb());
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
    protected UniqueInfo cpui() { return hpcpui(columnCmKishRenrakusakiId()); }
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
    /**
     * CM_KAISHA by my CM_KAISHA_ID, named 'cmKaisha'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCmKaisha() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCmKaishaId(), CmKaishaDbm.getInstance().columnCmKaishaId());
        return cfi("FK_CM_KISH_RENRAKUSAKI_CM_KAISHA", "cmKaisha", this, CmKaishaDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "cmKishRenrakusakiList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
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
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.CmKishRenrakusaki"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.CmKishRenrakusakiCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.CmKishRenrakusakiBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CmKishRenrakusaki> getEntityType() { return CmKishRenrakusaki.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CmKishRenrakusaki newEntity() { return new CmKishRenrakusaki(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CmKishRenrakusaki)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CmKishRenrakusaki)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
