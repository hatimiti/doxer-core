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
 * The base condition-query of CM_RENRAKUSAKI_YOTO_KB.
 * @author DBFlute(AutoGenerator)
 */
public class BsCmRenrakusakiYotoKbCQ extends AbstractBsCmRenrakusakiYotoKbCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CmRenrakusakiYotoKbCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCmRenrakusakiYotoKbCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CM_RENRAKUSAKI_YOTO_KB) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CmRenrakusakiYotoKbCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CmRenrakusakiYotoKbCIQ xcreateCIQ() {
        CmRenrakusakiYotoKbCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CmRenrakusakiYotoKbCIQ xnewCIQ() {
        return new CmRenrakusakiYotoKbCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CM_RENRAKUSAKI_YOTO_KB on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CmRenrakusakiYotoKbCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CmRenrakusakiYotoKbCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _kbVal;
    public ConditionValue xdfgetKbVal()
    { if (_kbVal == null) { _kbVal = nCV(); }
      return _kbVal; }
    protected ConditionValue xgetCValueKbVal() { return xdfgetKbVal(); }

    /** 
     * Add order-by as ascend. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_KbVal_Asc() { regOBA("KB_VAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_KbVal_Desc() { regOBD("KB_VAL"); return this; }

    protected ConditionValue _kbMei;
    public ConditionValue xdfgetKbMei()
    { if (_kbMei == null) { _kbMei = nCV(); }
      return _kbMei; }
    protected ConditionValue xgetCValueKbMei() { return xdfgetKbMei(); }

    /** 
     * Add order-by as ascend. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_KbMei_Asc() { regOBA("KB_MEI"); return this; }

    /**
     * Add order-by as descend. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_KbMei_Desc() { regOBD("KB_MEI"); return this; }

    protected ConditionValue _kbMeiEn;
    public ConditionValue xdfgetKbMeiEn()
    { if (_kbMeiEn == null) { _kbMeiEn = nCV(); }
      return _kbMeiEn; }
    protected ConditionValue xgetCValueKbMeiEn() { return xdfgetKbMeiEn(); }

    /** 
     * Add order-by as ascend. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_KbMeiEn_Asc() { regOBA("KB_MEI_EN"); return this; }

    /**
     * Add order-by as descend. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_KbMeiEn_Desc() { regOBD("KB_MEI_EN"); return this; }

    protected ConditionValue _kbRem;
    public ConditionValue xdfgetKbRem()
    { if (_kbRem == null) { _kbRem = nCV(); }
      return _kbRem; }
    protected ConditionValue xgetCValueKbRem() { return xdfgetKbRem(); }

    /** 
     * Add order-by as ascend. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_KbRem_Asc() { regOBA("KB_REM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_KbRem_Desc() { regOBD("KB_REM"); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addOrderBy_RegUserId_Asc() { regOBA("REG_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_RegUserId_Desc() { regOBD("REG_USER_ID"); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addOrderBy_RegTm_Asc() { regOBA("REG_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_RegTm_Desc() { regOBD("REG_TM"); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addOrderBy_RegFuncCd_Asc() { regOBA("REG_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_RegFuncCd_Desc() { regOBD("REG_FUNC_CD"); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addOrderBy_UpdUserId_Asc() { regOBA("UPD_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_UpdUserId_Desc() { regOBD("UPD_USER_ID"); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addOrderBy_UpdTm_Asc() { regOBA("UPD_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_UpdTm_Desc() { regOBD("UPD_TM"); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addOrderBy_UpdFuncCd_Asc() { regOBA("UPD_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_UpdFuncCd_Desc() { regOBD("UPD_FUNC_CD"); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsCmRenrakusakiYotoKbCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCmRenrakusakiYotoKbCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, CmRenrakusakiYotoKbCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CmRenrakusakiYotoKbCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CmRenrakusakiYotoKbCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CmRenrakusakiYotoKbCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CmRenrakusakiYotoKbCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CmRenrakusakiYotoKbCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CmRenrakusakiYotoKbCQ> _myselfExistsMap;
    public Map<String, CmRenrakusakiYotoKbCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CmRenrakusakiYotoKbCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CmRenrakusakiYotoKbCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CmRenrakusakiYotoKbCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CmRenrakusakiYotoKbCB.class.getName(); }
    protected String xCQ() { return CmRenrakusakiYotoKbCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
