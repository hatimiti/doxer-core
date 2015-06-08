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
 * The base condition-query of CM_KISH_TESURYO.
 * @author DBFlute(AutoGenerator)
 */
public class BsCmKishTesuryoCQ extends AbstractBsCmKishTesuryoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CmKishTesuryoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCmKishTesuryoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CM_KISH_TESURYO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CmKishTesuryoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CmKishTesuryoCIQ xcreateCIQ() {
        CmKishTesuryoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CmKishTesuryoCIQ xnewCIQ() {
        return new CmKishTesuryoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CM_KISH_TESURYO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CmKishTesuryoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CmKishTesuryoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cmKishTesuryoId;
    public ConditionValue xdfgetCmKishTesuryoId()
    { if (_cmKishTesuryoId == null) { _cmKishTesuryoId = nCV(); }
      return _cmKishTesuryoId; }
    protected ConditionValue xgetCValueCmKishTesuryoId() { return xdfgetCmKishTesuryoId(); }

    /** 
     * Add order-by as ascend. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_CmKishTesuryoId_Asc() { regOBA("CM_KISH_TESURYO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_CmKishTesuryoId_Desc() { regOBD("CM_KISH_TESURYO_ID"); return this; }

    protected ConditionValue _cmKaishaId;
    public ConditionValue xdfgetCmKaishaId()
    { if (_cmKaishaId == null) { _cmKaishaId = nCV(); }
      return _cmKaishaId; }
    protected ConditionValue xgetCValueCmKaishaId() { return xdfgetCmKaishaId(); }

    /** 
     * Add order-by as ascend. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_CmKaishaId_Asc() { regOBA("CM_KAISHA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_CmKaishaId_Desc() { regOBD("CM_KAISHA_ID"); return this; }

    protected ConditionValue _tekiyoKikanFromDt;
    public ConditionValue xdfgetTekiyoKikanFromDt()
    { if (_tekiyoKikanFromDt == null) { _tekiyoKikanFromDt = nCV(); }
      return _tekiyoKikanFromDt; }
    protected ConditionValue xgetCValueTekiyoKikanFromDt() { return xdfgetTekiyoKikanFromDt(); }

    /** 
     * Add order-by as ascend. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_TekiyoKikanFromDt_Asc() { regOBA("TEKIYO_KIKAN_FROM_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_TekiyoKikanFromDt_Desc() { regOBD("TEKIYO_KIKAN_FROM_DT"); return this; }

    protected ConditionValue _tekiyoKikanToDt;
    public ConditionValue xdfgetTekiyoKikanToDt()
    { if (_tekiyoKikanToDt == null) { _tekiyoKikanToDt = nCV(); }
      return _tekiyoKikanToDt; }
    protected ConditionValue xgetCValueTekiyoKikanToDt() { return xdfgetTekiyoKikanToDt(); }

    /** 
     * Add order-by as ascend. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_TekiyoKikanToDt_Asc() { regOBA("TEKIYO_KIKAN_TO_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_TekiyoKikanToDt_Desc() { regOBD("TEKIYO_KIKAN_TO_DT"); return this; }

    protected ConditionValue _tesuryoSu;
    public ConditionValue xdfgetTesuryoSu()
    { if (_tesuryoSu == null) { _tesuryoSu = nCV(); }
      return _tesuryoSu; }
    protected ConditionValue xgetCValueTesuryoSu() { return xdfgetTesuryoSu(); }

    /** 
     * Add order-by as ascend. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_TesuryoSu_Asc() { regOBA("TESURYO_SU"); return this; }

    /**
     * Add order-by as descend. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_TesuryoSu_Desc() { regOBD("TESURYO_SU"); return this; }

    protected ConditionValue _tesuryoKb;
    public ConditionValue xdfgetTesuryoKb()
    { if (_tesuryoKb == null) { _tesuryoKb = nCV(); }
      return _tesuryoKb; }
    protected ConditionValue xgetCValueTesuryoKb() { return xdfgetTesuryoKb(); }

    /** 
     * Add order-by as ascend. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_TesuryoKb_Asc() { regOBA("TESURYO_KB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_TesuryoKb_Desc() { regOBD("TESURYO_KB"); return this; }

    protected ConditionValue _regUserId;
    public ConditionValue xdfgetRegUserId()
    { if (_regUserId == null) { _regUserId = nCV(); }
      return _regUserId; }
    protected ConditionValue xgetCValueRegUserId() { return xdfgetRegUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_RegUserId_Asc() { regOBA("REG_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_RegUserId_Desc() { regOBD("REG_USER_ID"); return this; }

    protected ConditionValue _regTm;
    public ConditionValue xdfgetRegTm()
    { if (_regTm == null) { _regTm = nCV(); }
      return _regTm; }
    protected ConditionValue xgetCValueRegTm() { return xdfgetRegTm(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_RegTm_Asc() { regOBA("REG_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_RegTm_Desc() { regOBD("REG_TM"); return this; }

    protected ConditionValue _regFuncCd;
    public ConditionValue xdfgetRegFuncCd()
    { if (_regFuncCd == null) { _regFuncCd = nCV(); }
      return _regFuncCd; }
    protected ConditionValue xgetCValueRegFuncCd() { return xdfgetRegFuncCd(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_RegFuncCd_Asc() { regOBA("REG_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_RegFuncCd_Desc() { regOBD("REG_FUNC_CD"); return this; }

    protected ConditionValue _updUserId;
    public ConditionValue xdfgetUpdUserId()
    { if (_updUserId == null) { _updUserId = nCV(); }
      return _updUserId; }
    protected ConditionValue xgetCValueUpdUserId() { return xdfgetUpdUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_UpdUserId_Asc() { regOBA("UPD_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_UpdUserId_Desc() { regOBD("UPD_USER_ID"); return this; }

    protected ConditionValue _updTm;
    public ConditionValue xdfgetUpdTm()
    { if (_updTm == null) { _updTm = nCV(); }
      return _updTm; }
    protected ConditionValue xgetCValueUpdTm() { return xdfgetUpdTm(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_UpdTm_Asc() { regOBA("UPD_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_UpdTm_Desc() { regOBD("UPD_TM"); return this; }

    protected ConditionValue _updFuncCd;
    public ConditionValue xdfgetUpdFuncCd()
    { if (_updFuncCd == null) { _updFuncCd = nCV(); }
      return _updFuncCd; }
    protected ConditionValue xgetCValueUpdFuncCd() { return xdfgetUpdFuncCd(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_UpdFuncCd_Asc() { regOBA("UPD_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_UpdFuncCd_Desc() { regOBD("UPD_FUNC_CD"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsCmKishTesuryoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsCmKishTesuryoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCmKishTesuryoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CmKishTesuryoCQ bq = (CmKishTesuryoCQ)bqs;
        CmKishTesuryoCQ uq = (CmKishTesuryoCQ)uqs;
        if (bq.hasConditionQueryCmKaisha()) {
            uq.queryCmKaisha().reflectRelationOnUnionQuery(bq.queryCmKaisha(), uq.queryCmKaisha());
        }
        if (bq.hasConditionQueryCmTesuryoKb()) {
            uq.queryCmTesuryoKb().reflectRelationOnUnionQuery(bq.queryCmTesuryoKb(), uq.queryCmTesuryoKb());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * CM_KAISHA by my CM_KAISHA_ID, named 'cmKaisha'.
     * @return The instance of condition-query. (NotNull)
     */
    public CmKaishaCQ queryCmKaisha() {
        return xdfgetConditionQueryCmKaisha();
    }
    public CmKaishaCQ xdfgetConditionQueryCmKaisha() {
        String prop = "cmKaisha";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCmKaisha()); xsetupOuterJoinCmKaisha(); }
        return xgetQueRlMap(prop);
    }
    protected CmKaishaCQ xcreateQueryCmKaisha() {
        String nrp = xresolveNRP("CM_KISH_TESURYO", "cmKaisha"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CmKaishaCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cmKaisha", nrp);
    }
    protected void xsetupOuterJoinCmKaisha() { xregOutJo("cmKaisha"); }
    public boolean hasConditionQueryCmKaisha() { return xhasQueRlMap("cmKaisha"); }

    /**
     * Get the condition-query for relation table. <br>
     * CM_TESURYO_KB by my TESURYO_KB, named 'cmTesuryoKb'.
     * @return The instance of condition-query. (NotNull)
     */
    public CmTesuryoKbCQ queryCmTesuryoKb() {
        return xdfgetConditionQueryCmTesuryoKb();
    }
    public CmTesuryoKbCQ xdfgetConditionQueryCmTesuryoKb() {
        String prop = "cmTesuryoKb";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCmTesuryoKb()); xsetupOuterJoinCmTesuryoKb(); }
        return xgetQueRlMap(prop);
    }
    protected CmTesuryoKbCQ xcreateQueryCmTesuryoKb() {
        String nrp = xresolveNRP("CM_KISH_TESURYO", "cmTesuryoKb"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CmTesuryoKbCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cmTesuryoKb", nrp);
    }
    protected void xsetupOuterJoinCmTesuryoKb() { xregOutJo("cmTesuryoKb"); }
    public boolean hasConditionQueryCmTesuryoKb() { return xhasQueRlMap("cmTesuryoKb"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CmKishTesuryoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CmKishTesuryoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CmKishTesuryoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CmKishTesuryoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CmKishTesuryoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CmKishTesuryoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CmKishTesuryoCQ> _myselfExistsMap;
    public Map<String, CmKishTesuryoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CmKishTesuryoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CmKishTesuryoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CmKishTesuryoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CmKishTesuryoCB.class.getName(); }
    protected String xCQ() { return CmKishTesuryoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
