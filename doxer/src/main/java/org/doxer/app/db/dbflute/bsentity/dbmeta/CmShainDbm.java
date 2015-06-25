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
 * The DB meta of CM_SHAIN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CmShainDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CmShainDbm _instance = new CmShainDbm();
    private CmShainDbm() {}
    public static CmShainDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CmShain)et).getCmShainId(), (et, vl) -> ((CmShain)et).setCmShainId(ctl(vl)), "cmShainId");
        setupEpg(_epgMap, et -> ((CmShain)et).getCmKaishaId(), (et, vl) -> ((CmShain)et).setCmKaishaId(ctl(vl)), "cmKaishaId");
        setupEpg(_epgMap, et -> ((CmShain)et).getShainSei(), (et, vl) -> ((CmShain)et).setShainSei((String)vl), "shainSei");
        setupEpg(_epgMap, et -> ((CmShain)et).getShainMei(), (et, vl) -> ((CmShain)et).setShainMei((String)vl), "shainMei");
        setupEpg(_epgMap, et -> ((CmShain)et).getShainSeiEn(), (et, vl) -> ((CmShain)et).setShainSeiEn((String)vl), "shainSeiEn");
        setupEpg(_epgMap, et -> ((CmShain)et).getShainMeiEn(), (et, vl) -> ((CmShain)et).setShainMeiEn((String)vl), "shainMeiEn");
        setupEpg(_epgMap, et -> ((CmShain)et).getLoginCd(), (et, vl) -> ((CmShain)et).setLoginCd((String)vl), "loginCd");
        setupEpg(_epgMap, et -> ((CmShain)et).getPassword(), (et, vl) -> ((CmShain)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((CmShain)et).getRegUserId(), (et, vl) -> ((CmShain)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((CmShain)et).getRegTm(), (et, vl) -> ((CmShain)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((CmShain)et).getRegFuncCd(), (et, vl) -> ((CmShain)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((CmShain)et).getUpdUserId(), (et, vl) -> ((CmShain)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((CmShain)et).getUpdTm(), (et, vl) -> ((CmShain)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((CmShain)et).getUpdFuncCd(), (et, vl) -> ((CmShain)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((CmShain)et).getVersionNo(), (et, vl) -> ((CmShain)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((CmShain)et).getCmKaisha(), (et, vl) -> ((CmShain)et).setCmKaisha((OptionalEntity<CmKaisha>)vl), "cmKaisha");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CM_SHAIN";
    protected final String _tableDispName = "CM_SHAIN";
    protected final String _tablePropertyName = "cmShain";
    protected final TableSqlName _tableSqlName = new TableSqlName("CM_SHAIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCmShainId = cci("CM_SHAIN_ID", "CM_SHAIN_ID", null, null, Long.class, "cmShainId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_E8CB7387_4942_42DD_AA19_DA45705C69FE", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmKaishaId = cci("CM_KAISHA_ID", "CM_KAISHA_ID", null, null, Long.class, "cmKaishaId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "cmKaisha", null, null, false);
    protected final ColumnInfo _columnShainSei = cci("SHAIN_SEI", "SHAIN_SEI", null, null, String.class, "shainSei", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShainMei = cci("SHAIN_MEI", "SHAIN_MEI", null, null, String.class, "shainMei", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShainSeiEn = cci("SHAIN_SEI_EN", "SHAIN_SEI_EN", null, null, String.class, "shainSeiEn", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShainMeiEn = cci("SHAIN_MEI_EN", "SHAIN_MEI_EN", null, null, String.class, "shainMeiEn", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoginCd = cci("LOGIN_CD", "LOGIN_CD", null, null, String.class, "loginCd", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegUserId = cci("REG_USER_ID", "REG_USER_ID", null, null, String.class, "regUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegTm = cci("REG_TM", "REG_TM", null, null, java.time.LocalDateTime.class, "regTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegFuncCd = cci("REG_FUNC_CD", "REG_FUNC_CD", null, null, String.class, "regFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUserId = cci("UPD_USER_ID", "UPD_USER_ID", null, null, String.class, "updUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTm = cci("UPD_TM", "UPD_TM", null, null, java.time.LocalDateTime.class, "updTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdFuncCd = cci("UPD_FUNC_CD", "UPD_FUNC_CD", null, null, String.class, "updFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "DECIMAL", 9, 0, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmShainId() { return _columnCmShainId; }
    /**
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmKaishaId() { return _columnCmKaishaId; }
    /**
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShainSei() { return _columnShainSei; }
    /**
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShainMei() { return _columnShainMei; }
    /**
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShainSeiEn() { return _columnShainSeiEn; }
    /**
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShainMeiEn() { return _columnShainMeiEn; }
    /**
     * LOGIN_CD: {+UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginCd() { return _columnLoginCd; }
    /**
     * PASSWORD: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
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
        ls.add(columnCmShainId());
        ls.add(columnCmKaishaId());
        ls.add(columnShainSei());
        ls.add(columnShainMei());
        ls.add(columnShainSeiEn());
        ls.add(columnShainMeiEn());
        ls.add(columnLoginCd());
        ls.add(columnPassword());
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
    protected UniqueInfo cpui() { return hpcpui(columnCmShainId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCmKaishaId());
        ls.add(columnLoginCd());
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
        return cfi("FK_CM_SHAIN_CM_KAISHA", "cmKaisha", this, CmKaishaDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "cmShainList", false);
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
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.CmShain"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.CmShainCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.CmShainBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CmShain> getEntityType() { return CmShain.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CmShain newEntity() { return new CmShain(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CmShain)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CmShain)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
