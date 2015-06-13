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
 * The DB meta of CM_KAISHA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CmKaishaDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CmKaishaDbm _instance = new CmKaishaDbm();
    private CmKaishaDbm() {}
    public static CmKaishaDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CmKaisha)et).getCmKaishaId(), (et, vl) -> ((CmKaisha)et).setCmKaishaId(ctl(vl)), "cmKaishaId");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getKaishaMei(), (et, vl) -> ((CmKaisha)et).setKaishaMei((String)vl), "kaishaMei");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getKaishaMeiEn(), (et, vl) -> ((CmKaisha)et).setKaishaMeiEn((String)vl), "kaishaMeiEn");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getRegUserId(), (et, vl) -> ((CmKaisha)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getRegTm(), (et, vl) -> ((CmKaisha)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getRegFuncCd(), (et, vl) -> ((CmKaisha)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getUpdUserId(), (et, vl) -> ((CmKaisha)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getUpdTm(), (et, vl) -> ((CmKaisha)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getUpdFuncCd(), (et, vl) -> ((CmKaisha)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((CmKaisha)et).getVersionNo(), (et, vl) -> ((CmKaisha)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CM_KAISHA";
    protected final String _tableDispName = "CM_KAISHA";
    protected final String _tablePropertyName = "cmKaisha";
    protected final TableSqlName _tableSqlName = new TableSqlName("CM_KAISHA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCmKaishaId = cci("CM_KAISHA_ID", "CM_KAISHA_ID", null, null, Long.class, "cmKaishaId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_80B668BC_6672_4C93_9C0D_6E8291C36EFC", false, null, null, null, "cmKishTesuryoList,cmKishRenrakusakiList", null, false);
    protected final ColumnInfo _columnKaishaMei = cci("KAISHA_MEI", "KAISHA_MEI", null, null, String.class, "kaishaMei", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKaishaMeiEn = cci("KAISHA_MEI_EN", "KAISHA_MEI_EN", null, null, String.class, "kaishaMeiEn", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegUserId = cci("REG_USER_ID", "REG_USER_ID", null, null, String.class, "regUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegTm = cci("REG_TM", "REG_TM", null, null, java.time.LocalDateTime.class, "regTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegFuncCd = cci("REG_FUNC_CD", "REG_FUNC_CD", null, null, String.class, "regFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUserId = cci("UPD_USER_ID", "UPD_USER_ID", null, null, String.class, "updUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTm = cci("UPD_TM", "UPD_TM", null, null, java.time.LocalDateTime.class, "updTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdFuncCd = cci("UPD_FUNC_CD", "UPD_FUNC_CD", null, null, String.class, "updFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "DECIMAL", 9, 0, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmKaishaId() { return _columnCmKaishaId; }
    /**
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKaishaMei() { return _columnKaishaMei; }
    /**
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKaishaMeiEn() { return _columnKaishaMeiEn; }
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
        ls.add(columnCmKaishaId());
        ls.add(columnKaishaMei());
        ls.add(columnKaishaMeiEn());
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
    protected UniqueInfo cpui() { return hpcpui(columnCmKaishaId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnKaishaMei()); }

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
     * CM_KISH_TESURYO by CM_KAISHA_ID, named 'cmKishTesuryoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCmKishTesuryoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCmKaishaId(), CmKishTesuryoDbm.getInstance().columnCmKaishaId());
        return cri("FK_CM_KISH_TESURYO_CM_KAISHA", "cmKishTesuryoList", this, CmKishTesuryoDbm.getInstance(), mp, false, "cmKaisha");
    }
    /**
     * CM_KISH_RENRAKUSAKI by CM_KAISHA_ID, named 'cmKishRenrakusakiList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCmKishRenrakusakiList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCmKaishaId(), CmKishRenrakusakiDbm.getInstance().columnCmKaishaId());
        return cri("FK_CM_KISH_RENRAKUSAKI_CM_KAISHA", "cmKishRenrakusakiList", this, CmKishRenrakusakiDbm.getInstance(), mp, false, "cmKaisha");
    }

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
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.CmKaisha"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.CmKaishaCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.CmKaishaBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CmKaisha> getEntityType() { return CmKaisha.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CmKaisha newEntity() { return new CmKaisha(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CmKaisha)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CmKaisha)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
