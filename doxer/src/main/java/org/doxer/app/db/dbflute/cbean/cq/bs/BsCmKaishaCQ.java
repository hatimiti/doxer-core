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
 * The base condition-query of CM_KAISHA.
 * @author DBFlute(AutoGenerator)
 */
public class BsCmKaishaCQ extends AbstractBsCmKaishaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CmKaishaCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCmKaishaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CM_KAISHA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CmKaishaCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CmKaishaCIQ xcreateCIQ() {
        CmKaishaCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CmKaishaCIQ xnewCIQ() {
        return new CmKaishaCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CM_KAISHA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CmKaishaCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CmKaishaCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cmKaishaId;
    public ConditionValue xdfgetCmKaishaId()
    { if (_cmKaishaId == null) { _cmKaishaId = nCV(); }
      return _cmKaishaId; }
    protected ConditionValue xgetCValueCmKaishaId() { return xdfgetCmKaishaId(); }

    public Map<String, CmKishTesuryoCQ> xdfgetCmKaishaId_ExistsReferrer_CmKishTesuryoList() { return xgetSQueMap("cmKaishaId_ExistsReferrer_CmKishTesuryoList"); }
    public String keepCmKaishaId_ExistsReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq) { return xkeepSQue("cmKaishaId_ExistsReferrer_CmKishTesuryoList", sq); }

    public Map<String, CmKishRenrakusakiCQ> xdfgetCmKaishaId_ExistsReferrer_CmKishRenrakusakiList() { return xgetSQueMap("cmKaishaId_ExistsReferrer_CmKishRenrakusakiList"); }
    public String keepCmKaishaId_ExistsReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq) { return xkeepSQue("cmKaishaId_ExistsReferrer_CmKishRenrakusakiList", sq); }

    public Map<String, CmKishTesuryoCQ> xdfgetCmKaishaId_NotExistsReferrer_CmKishTesuryoList() { return xgetSQueMap("cmKaishaId_NotExistsReferrer_CmKishTesuryoList"); }
    public String keepCmKaishaId_NotExistsReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq) { return xkeepSQue("cmKaishaId_NotExistsReferrer_CmKishTesuryoList", sq); }

    public Map<String, CmKishRenrakusakiCQ> xdfgetCmKaishaId_NotExistsReferrer_CmKishRenrakusakiList() { return xgetSQueMap("cmKaishaId_NotExistsReferrer_CmKishRenrakusakiList"); }
    public String keepCmKaishaId_NotExistsReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq) { return xkeepSQue("cmKaishaId_NotExistsReferrer_CmKishRenrakusakiList", sq); }

    public Map<String, CmKishTesuryoCQ> xdfgetCmKaishaId_SpecifyDerivedReferrer_CmKishTesuryoList() { return xgetSQueMap("cmKaishaId_SpecifyDerivedReferrer_CmKishTesuryoList"); }
    public String keepCmKaishaId_SpecifyDerivedReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq) { return xkeepSQue("cmKaishaId_SpecifyDerivedReferrer_CmKishTesuryoList", sq); }

    public Map<String, CmKishRenrakusakiCQ> xdfgetCmKaishaId_SpecifyDerivedReferrer_CmKishRenrakusakiList() { return xgetSQueMap("cmKaishaId_SpecifyDerivedReferrer_CmKishRenrakusakiList"); }
    public String keepCmKaishaId_SpecifyDerivedReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq) { return xkeepSQue("cmKaishaId_SpecifyDerivedReferrer_CmKishRenrakusakiList", sq); }

    public Map<String, CmKishTesuryoCQ> xdfgetCmKaishaId_QueryDerivedReferrer_CmKishTesuryoList() { return xgetSQueMap("cmKaishaId_QueryDerivedReferrer_CmKishTesuryoList"); }
    public String keepCmKaishaId_QueryDerivedReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq) { return xkeepSQue("cmKaishaId_QueryDerivedReferrer_CmKishTesuryoList", sq); }
    public Map<String, Object> xdfgetCmKaishaId_QueryDerivedReferrer_CmKishTesuryoListParameter() { return xgetSQuePmMap("cmKaishaId_QueryDerivedReferrer_CmKishTesuryoList"); }
    public String keepCmKaishaId_QueryDerivedReferrer_CmKishTesuryoListParameter(Object pm) { return xkeepSQuePm("cmKaishaId_QueryDerivedReferrer_CmKishTesuryoList", pm); }

    public Map<String, CmKishRenrakusakiCQ> xdfgetCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList() { return xgetSQueMap("cmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList"); }
    public String keepCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq) { return xkeepSQue("cmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList", sq); }
    public Map<String, Object> xdfgetCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiListParameter() { return xgetSQuePmMap("cmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList"); }
    public String keepCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiListParameter(Object pm) { return xkeepSQuePm("cmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_CmKaishaId_Asc() { regOBA("CM_KAISHA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_CmKaishaId_Desc() { regOBD("CM_KAISHA_ID"); return this; }

    protected ConditionValue _kaishaMei;
    public ConditionValue xdfgetKaishaMei()
    { if (_kaishaMei == null) { _kaishaMei = nCV(); }
      return _kaishaMei; }
    protected ConditionValue xgetCValueKaishaMei() { return xdfgetKaishaMei(); }

    /** 
     * Add order-by as ascend. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_KaishaMei_Asc() { regOBA("KAISHA_MEI"); return this; }

    /**
     * Add order-by as descend. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_KaishaMei_Desc() { regOBD("KAISHA_MEI"); return this; }

    protected ConditionValue _kaishaMeiEn;
    public ConditionValue xdfgetKaishaMeiEn()
    { if (_kaishaMeiEn == null) { _kaishaMeiEn = nCV(); }
      return _kaishaMeiEn; }
    protected ConditionValue xgetCValueKaishaMeiEn() { return xdfgetKaishaMeiEn(); }

    /** 
     * Add order-by as ascend. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_KaishaMeiEn_Asc() { regOBA("KAISHA_MEI_EN"); return this; }

    /**
     * Add order-by as descend. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_KaishaMeiEn_Desc() { regOBD("KAISHA_MEI_EN"); return this; }

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
    public BsCmKaishaCQ addOrderBy_RegUserId_Asc() { regOBA("REG_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_RegUserId_Desc() { regOBD("REG_USER_ID"); return this; }

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
    public BsCmKaishaCQ addOrderBy_RegTm_Asc() { regOBA("REG_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_RegTm_Desc() { regOBD("REG_TM"); return this; }

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
    public BsCmKaishaCQ addOrderBy_RegFuncCd_Asc() { regOBA("REG_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_RegFuncCd_Desc() { regOBD("REG_FUNC_CD"); return this; }

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
    public BsCmKaishaCQ addOrderBy_UpdUserId_Asc() { regOBA("UPD_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_UpdUserId_Desc() { regOBD("UPD_USER_ID"); return this; }

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
    public BsCmKaishaCQ addOrderBy_UpdTm_Asc() { regOBA("UPD_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_UpdTm_Desc() { regOBD("UPD_TM"); return this; }

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
    public BsCmKaishaCQ addOrderBy_UpdFuncCd_Asc() { regOBA("UPD_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_UpdFuncCd_Desc() { regOBD("UPD_FUNC_CD"); return this; }

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
    public BsCmKaishaCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsCmKaishaCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsCmKaishaCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCmKaishaCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, CmKaishaCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CmKaishaCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CmKaishaCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CmKaishaCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CmKaishaCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CmKaishaCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CmKaishaCQ> _myselfExistsMap;
    public Map<String, CmKaishaCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CmKaishaCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CmKaishaCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CmKaishaCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CmKaishaCB.class.getName(); }
    protected String xCQ() { return CmKaishaCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
