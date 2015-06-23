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
 * The DB meta of CM_KISH_TESURYO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CmKishTesuryoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CmKishTesuryoDbm _instance = new CmKishTesuryoDbm();
    private CmKishTesuryoDbm() {}
    public static CmKishTesuryoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getCmKishTesuryoId(), (et, vl) -> ((CmKishTesuryo)et).setCmKishTesuryoId(ctl(vl)), "cmKishTesuryoId");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getCmKaishaId(), (et, vl) -> ((CmKishTesuryo)et).setCmKaishaId(ctl(vl)), "cmKaishaId");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getTekiyoKikanFromDt(), (et, vl) -> ((CmKishTesuryo)et).setTekiyoKikanFromDt((String)vl), "tekiyoKikanFromDt");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getTekiyoKikanToDt(), (et, vl) -> ((CmKishTesuryo)et).setTekiyoKikanToDt((String)vl), "tekiyoKikanToDt");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getTesuryoSu(), (et, vl) -> ((CmKishTesuryo)et).setTesuryoSu(ctb(vl)), "tesuryoSu");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getTesuryoKb(), (et, vl) -> {
            ColumnInfo col = columnTesuryoKb();
            CDef.TesuryoKb cls = (CDef.TesuryoKb)gcls(et, col, vl);
            if (cls != null) {
                ((CmKishTesuryo)et).setTesuryoKbAsTesuryoKb(cls);
            } else {
                ((CmKishTesuryo)et).mynativeMappingTesuryoKb((String)vl);
            }
        }, "tesuryoKb");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getRegUserId(), (et, vl) -> ((CmKishTesuryo)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getRegTm(), (et, vl) -> ((CmKishTesuryo)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getRegFuncCd(), (et, vl) -> ((CmKishTesuryo)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getUpdUserId(), (et, vl) -> ((CmKishTesuryo)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getUpdTm(), (et, vl) -> ((CmKishTesuryo)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getUpdFuncCd(), (et, vl) -> ((CmKishTesuryo)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((CmKishTesuryo)et).getVersionNo(), (et, vl) -> ((CmKishTesuryo)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((CmKishTesuryo)et).getCmKaisha(), (et, vl) -> ((CmKishTesuryo)et).setCmKaisha((OptionalEntity<CmKaisha>)vl), "cmKaisha");
        setupEfpg(_efpgMap, et -> ((CmKishTesuryo)et).getCmTesuryoKb(), (et, vl) -> ((CmKishTesuryo)et).setCmTesuryoKb((OptionalEntity<CmTesuryoKb>)vl), "cmTesuryoKb");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CM_KISH_TESURYO";
    protected final String _tableDispName = "CM_KISH_TESURYO";
    protected final String _tablePropertyName = "cmKishTesuryo";
    protected final TableSqlName _tableSqlName = new TableSqlName("CM_KISH_TESURYO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCmKishTesuryoId = cci("CM_KISH_TESURYO_ID", "CM_KISH_TESURYO_ID", null, null, Long.class, "cmKishTesuryoId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_030D6349_F596_4240_87F0_4DD946CE60BA", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmKaishaId = cci("CM_KAISHA_ID", "CM_KAISHA_ID", null, null, Long.class, "cmKaishaId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "cmKaisha", null, null, false);
    protected final ColumnInfo _columnTekiyoKikanFromDt = cci("TEKIYO_KIKAN_FROM_DT", "TEKIYO_KIKAN_FROM_DT", null, null, String.class, "tekiyoKikanFromDt", null, false, false, true, "CHAR", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTekiyoKikanToDt = cci("TEKIYO_KIKAN_TO_DT", "TEKIYO_KIKAN_TO_DT", null, null, String.class, "tekiyoKikanToDt", null, false, false, true, "CHAR", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTesuryoSu = cci("TESURYO_SU", "TESURYO_SU", null, null, java.math.BigDecimal.class, "tesuryoSu", null, false, false, true, "DECIMAL", 7, 1, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTesuryoKb = cci("TESURYO_KB", "TESURYO_KB", null, null, String.class, "tesuryoKb", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "cmTesuryoKb", null, CDef.DefMeta.TesuryoKb, false);
    protected final ColumnInfo _columnRegUserId = cci("REG_USER_ID", "REG_USER_ID", null, null, String.class, "regUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegTm = cci("REG_TM", "REG_TM", null, null, java.time.LocalDateTime.class, "regTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegFuncCd = cci("REG_FUNC_CD", "REG_FUNC_CD", null, null, String.class, "regFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUserId = cci("UPD_USER_ID", "UPD_USER_ID", null, null, String.class, "updUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTm = cci("UPD_TM", "UPD_TM", null, null, java.time.LocalDateTime.class, "updTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdFuncCd = cci("UPD_FUNC_CD", "UPD_FUNC_CD", null, null, String.class, "updFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "DECIMAL", 9, 0, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmKishTesuryoId() { return _columnCmKishTesuryoId; }
    /**
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmKaishaId() { return _columnCmKaishaId; }
    /**
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTekiyoKikanFromDt() { return _columnTekiyoKikanFromDt; }
    /**
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTekiyoKikanToDt() { return _columnTekiyoKikanToDt; }
    /**
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTesuryoSu() { return _columnTesuryoSu; }
    /**
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTesuryoKb() { return _columnTesuryoKb; }
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
        ls.add(columnCmKishTesuryoId());
        ls.add(columnCmKaishaId());
        ls.add(columnTekiyoKikanFromDt());
        ls.add(columnTekiyoKikanToDt());
        ls.add(columnTesuryoSu());
        ls.add(columnTesuryoKb());
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
    protected UniqueInfo cpui() { return hpcpui(columnCmKishTesuryoId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCmKaishaId());
        ls.add(columnTekiyoKikanFromDt());
        return hpcui(ls);
    }

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
        return cfi("FK_CM_KISH_TESURYO_CM_KAISHA", "cmKaisha", this, CmKaishaDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "cmKishTesuryoList", false);
    }
    /**
     * CM_TESURYO_KB by my TESURYO_KB, named 'cmTesuryoKb'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCmTesuryoKb() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTesuryoKb(), CmTesuryoKbDbm.getInstance().columnKbVal());
        return cfi("FK_CM_KISH_TESURYO_CM_TESURYO_KB", "cmTesuryoKb", this, CmTesuryoKbDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "cmKishTesuryoList", false);
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
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.CmKishTesuryo"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.CmKishTesuryoCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.CmKishTesuryoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CmKishTesuryo> getEntityType() { return CmKishTesuryo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CmKishTesuryo newEntity() { return new CmKishTesuryo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CmKishTesuryo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CmKishTesuryo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
