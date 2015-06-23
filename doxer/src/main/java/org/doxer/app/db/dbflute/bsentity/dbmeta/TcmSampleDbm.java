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
 * The DB meta of TCM_SAMPLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TcmSampleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TcmSampleDbm _instance = new TcmSampleDbm();
    private TcmSampleDbm() {}
    public static TcmSampleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TcmSample)et).getTcmSampleId(), (et, vl) -> ((TcmSample)et).setTcmSampleId(ctl(vl)), "tcmSampleId");
        setupEpg(_epgMap, et -> ((TcmSample)et).getSampleName(), (et, vl) -> ((TcmSample)et).setSampleName((String)vl), "sampleName");
        setupEpg(_epgMap, et -> ((TcmSample)et).getSampleNameEn(), (et, vl) -> ((TcmSample)et).setSampleNameEn((String)vl), "sampleNameEn");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "TCM_SAMPLE";
    protected final String _tableDispName = "TCM_SAMPLE";
    protected final String _tablePropertyName = "tcmSample";
    protected final TableSqlName _tableSqlName = new TableSqlName("TCM_SAMPLE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTcmSampleId = cci("TCM_SAMPLE_ID", "TCM_SAMPLE_ID", null, null, Long.class, "tcmSampleId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_993DF060_AA2D_47C2_8ED4_4C02ED970E10", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSampleName = cci("SAMPLE_NAME", "SAMPLE_NAME", null, null, String.class, "sampleName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSampleNameEn = cci("SAMPLE_NAME_EN", "SAMPLE_NAME_EN", null, null, String.class, "sampleNameEn", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);

    /**
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTcmSampleId() { return _columnTcmSampleId; }
    /**
     * SAMPLE_NAME: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSampleName() { return _columnSampleName; }
    /**
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSampleNameEn() { return _columnSampleNameEn; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTcmSampleId());
        ls.add(columnSampleName());
        ls.add(columnSampleNameEn());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTcmSampleId()); }
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
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.TcmSample"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.TcmSampleCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.TcmSampleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TcmSample> getEntityType() { return TcmSample.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TcmSample newEntity() { return new TcmSample(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TcmSample)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TcmSample)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
