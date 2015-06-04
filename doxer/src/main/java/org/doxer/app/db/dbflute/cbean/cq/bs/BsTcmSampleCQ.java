package org.doxer.app.db.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.doxer.app.db.dbflute.cbean.cq.ciq.*;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The base condition-query of TCM_SAMPLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsTcmSampleCQ extends AbstractBsTcmSampleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TcmSampleCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTcmSampleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TCM_SAMPLE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TcmSampleCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TcmSampleCIQ xcreateCIQ() {
        TcmSampleCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TcmSampleCIQ xnewCIQ() {
        return new TcmSampleCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TCM_SAMPLE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TcmSampleCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TcmSampleCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tcmSampleId;
    public ConditionValue xdfgetTcmSampleId()
    { if (_tcmSampleId == null) { _tcmSampleId = nCV(); }
      return _tcmSampleId; }
    protected ConditionValue xgetCValueTcmSampleId() { return xdfgetTcmSampleId(); }

    /** 
     * Add order-by as ascend. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTcmSampleCQ addOrderBy_TcmSampleId_Asc() { regOBA("TCM_SAMPLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTcmSampleCQ addOrderBy_TcmSampleId_Desc() { regOBD("TCM_SAMPLE_ID"); return this; }

    protected ConditionValue _sampleName;
    public ConditionValue xdfgetSampleName()
    { if (_sampleName == null) { _sampleName = nCV(); }
      return _sampleName; }
    protected ConditionValue xgetCValueSampleName() { return xdfgetSampleName(); }

    /** 
     * Add order-by as ascend. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsTcmSampleCQ addOrderBy_SampleName_Asc() { regOBA("SAMPLE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsTcmSampleCQ addOrderBy_SampleName_Desc() { regOBD("SAMPLE_NAME"); return this; }

    protected ConditionValue _sampleNameEn;
    public ConditionValue xdfgetSampleNameEn()
    { if (_sampleNameEn == null) { _sampleNameEn = nCV(); }
      return _sampleNameEn; }
    protected ConditionValue xgetCValueSampleNameEn() { return xdfgetSampleNameEn(); }

    /** 
     * Add order-by as ascend. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsTcmSampleCQ addOrderBy_SampleNameEn_Asc() { regOBA("SAMPLE_NAME_EN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsTcmSampleCQ addOrderBy_SampleNameEn_Desc() { regOBD("SAMPLE_NAME_EN"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTcmSampleCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTcmSampleCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TcmSampleCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TcmSampleCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TcmSampleCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TcmSampleCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TcmSampleCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TcmSampleCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TcmSampleCQ> _myselfExistsMap;
    public Map<String, TcmSampleCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TcmSampleCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TcmSampleCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TcmSampleCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TcmSampleCB.class.getName(); }
    protected String xCQ() { return TcmSampleCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
