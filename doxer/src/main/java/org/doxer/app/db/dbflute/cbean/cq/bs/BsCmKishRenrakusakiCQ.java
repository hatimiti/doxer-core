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
 * The base condition-query of CM_KISH_RENRAKUSAKI.
 * @author DBFlute(AutoGenerator)
 */
public class BsCmKishRenrakusakiCQ extends AbstractBsCmKishRenrakusakiCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CmKishRenrakusakiCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCmKishRenrakusakiCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CM_KISH_RENRAKUSAKI) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CmKishRenrakusakiCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CmKishRenrakusakiCIQ xcreateCIQ() {
        CmKishRenrakusakiCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CmKishRenrakusakiCIQ xnewCIQ() {
        return new CmKishRenrakusakiCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CM_KISH_RENRAKUSAKI on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CmKishRenrakusakiCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CmKishRenrakusakiCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cmKishRenrakusakiId;
    public ConditionValue xdfgetCmKishRenrakusakiId()
    { if (_cmKishRenrakusakiId == null) { _cmKishRenrakusakiId = nCV(); }
      return _cmKishRenrakusakiId; }
    protected ConditionValue xgetCValueCmKishRenrakusakiId() { return xdfgetCmKishRenrakusakiId(); }

    /** 
     * Add order-by as ascend. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_CmKishRenrakusakiId_Asc() { regOBA("CM_KISH_RENRAKUSAKI_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_CmKishRenrakusakiId_Desc() { regOBD("CM_KISH_RENRAKUSAKI_ID"); return this; }

    protected ConditionValue _cmKaishaId;
    public ConditionValue xdfgetCmKaishaId()
    { if (_cmKaishaId == null) { _cmKaishaId = nCV(); }
      return _cmKaishaId; }
    protected ConditionValue xgetCValueCmKaishaId() { return xdfgetCmKaishaId(); }

    /** 
     * Add order-by as ascend. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_CmKaishaId_Asc() { regOBA("CM_KAISHA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_CmKaishaId_Desc() { regOBD("CM_KAISHA_ID"); return this; }

    protected ConditionValue _telNo1;
    public ConditionValue xdfgetTelNo1()
    { if (_telNo1 == null) { _telNo1 = nCV(); }
      return _telNo1; }
    protected ConditionValue xgetCValueTelNo1() { return xdfgetTelNo1(); }

    /** 
     * Add order-by as ascend. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_TelNo1_Asc() { regOBA("TEL_NO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_TelNo1_Desc() { regOBD("TEL_NO1"); return this; }

    protected ConditionValue _telNo2;
    public ConditionValue xdfgetTelNo2()
    { if (_telNo2 == null) { _telNo2 = nCV(); }
      return _telNo2; }
    protected ConditionValue xgetCValueTelNo2() { return xdfgetTelNo2(); }

    /** 
     * Add order-by as ascend. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_TelNo2_Asc() { regOBA("TEL_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_TelNo2_Desc() { regOBD("TEL_NO2"); return this; }

    protected ConditionValue _telNo3;
    public ConditionValue xdfgetTelNo3()
    { if (_telNo3 == null) { _telNo3 = nCV(); }
      return _telNo3; }
    protected ConditionValue xgetCValueTelNo3() { return xdfgetTelNo3(); }

    /** 
     * Add order-by as ascend. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_TelNo3_Asc() { regOBA("TEL_NO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_TelNo3_Desc() { regOBD("TEL_NO3"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue xdfgetMailAddress()
    { if (_mailAddress == null) { _mailAddress = nCV(); }
      return _mailAddress; }
    protected ConditionValue xgetCValueMailAddress() { return xdfgetMailAddress(); }

    /** 
     * Add order-by as ascend. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_MailAddress_Asc() { regOBA("MAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_MailAddress_Desc() { regOBD("MAIL_ADDRESS"); return this; }

    protected ConditionValue _renrakusakiYotoKb;
    public ConditionValue xdfgetRenrakusakiYotoKb()
    { if (_renrakusakiYotoKb == null) { _renrakusakiYotoKb = nCV(); }
      return _renrakusakiYotoKb; }
    protected ConditionValue xgetCValueRenrakusakiYotoKb() { return xdfgetRenrakusakiYotoKb(); }

    /** 
     * Add order-by as ascend. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_RenrakusakiYotoKb_Asc() { regOBA("RENRAKUSAKI_YOTO_KB"); return this; }

    /**
     * Add order-by as descend. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_RenrakusakiYotoKb_Desc() { regOBD("RENRAKUSAKI_YOTO_KB"); return this; }

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
    public BsCmKishRenrakusakiCQ addOrderBy_RegUserId_Asc() { regOBA("REG_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_RegUserId_Desc() { regOBD("REG_USER_ID"); return this; }

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
    public BsCmKishRenrakusakiCQ addOrderBy_RegTm_Asc() { regOBA("REG_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_RegTm_Desc() { regOBD("REG_TM"); return this; }

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
    public BsCmKishRenrakusakiCQ addOrderBy_RegFuncCd_Asc() { regOBA("REG_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_RegFuncCd_Desc() { regOBD("REG_FUNC_CD"); return this; }

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
    public BsCmKishRenrakusakiCQ addOrderBy_UpdUserId_Asc() { regOBA("UPD_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_UpdUserId_Desc() { regOBD("UPD_USER_ID"); return this; }

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
    public BsCmKishRenrakusakiCQ addOrderBy_UpdTm_Asc() { regOBA("UPD_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_UpdTm_Desc() { regOBD("UPD_TM"); return this; }

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
    public BsCmKishRenrakusakiCQ addOrderBy_UpdFuncCd_Asc() { regOBA("UPD_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_UpdFuncCd_Desc() { regOBD("UPD_FUNC_CD"); return this; }

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
    public BsCmKishRenrakusakiCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsCmKishRenrakusakiCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsCmKishRenrakusakiCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCmKishRenrakusakiCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CmKishRenrakusakiCQ bq = (CmKishRenrakusakiCQ)bqs;
        CmKishRenrakusakiCQ uq = (CmKishRenrakusakiCQ)uqs;
        if (bq.hasConditionQueryCmKaisha()) {
            uq.queryCmKaisha().reflectRelationOnUnionQuery(bq.queryCmKaisha(), uq.queryCmKaisha());
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
        String nrp = xresolveNRP("CM_KISH_RENRAKUSAKI", "cmKaisha"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CmKaishaCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cmKaisha", nrp);
    }
    protected void xsetupOuterJoinCmKaisha() { xregOutJo("cmKaisha"); }
    public boolean hasConditionQueryCmKaisha() { return xhasQueRlMap("cmKaisha"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CmKishRenrakusakiCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CmKishRenrakusakiCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CmKishRenrakusakiCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CmKishRenrakusakiCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CmKishRenrakusakiCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CmKishRenrakusakiCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CmKishRenrakusakiCQ> _myselfExistsMap;
    public Map<String, CmKishRenrakusakiCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CmKishRenrakusakiCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CmKishRenrakusakiCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CmKishRenrakusakiCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CmKishRenrakusakiCB.class.getName(); }
    protected String xCQ() { return CmKishRenrakusakiCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
