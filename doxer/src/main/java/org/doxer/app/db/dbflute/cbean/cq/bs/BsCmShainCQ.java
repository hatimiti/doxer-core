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
 * The base condition-query of CM_SHAIN.
 * @author DBFlute(AutoGenerator)
 */
public class BsCmShainCQ extends AbstractBsCmShainCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CmShainCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCmShainCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CM_SHAIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CmShainCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CmShainCIQ xcreateCIQ() {
        CmShainCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CmShainCIQ xnewCIQ() {
        return new CmShainCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CM_SHAIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CmShainCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CmShainCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cmShainId;
    public ConditionValue xdfgetCmShainId()
    { if (_cmShainId == null) { _cmShainId = nCV(); }
      return _cmShainId; }
    protected ConditionValue xgetCValueCmShainId() { return xdfgetCmShainId(); }

    /** 
     * Add order-by as ascend. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_CmShainId_Asc() { regOBA("CM_SHAIN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_CmShainId_Desc() { regOBD("CM_SHAIN_ID"); return this; }

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
    public BsCmShainCQ addOrderBy_CmKaishaId_Asc() { regOBA("CM_KAISHA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_CmKaishaId_Desc() { regOBD("CM_KAISHA_ID"); return this; }

    protected ConditionValue _shainSei;
    public ConditionValue xdfgetShainSei()
    { if (_shainSei == null) { _shainSei = nCV(); }
      return _shainSei; }
    protected ConditionValue xgetCValueShainSei() { return xdfgetShainSei(); }

    /** 
     * Add order-by as ascend. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_ShainSei_Asc() { regOBA("SHAIN_SEI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_ShainSei_Desc() { regOBD("SHAIN_SEI"); return this; }

    protected ConditionValue _shainMei;
    public ConditionValue xdfgetShainMei()
    { if (_shainMei == null) { _shainMei = nCV(); }
      return _shainMei; }
    protected ConditionValue xgetCValueShainMei() { return xdfgetShainMei(); }

    /** 
     * Add order-by as ascend. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_ShainMei_Asc() { regOBA("SHAIN_MEI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_ShainMei_Desc() { regOBD("SHAIN_MEI"); return this; }

    protected ConditionValue _shainSeiEn;
    public ConditionValue xdfgetShainSeiEn()
    { if (_shainSeiEn == null) { _shainSeiEn = nCV(); }
      return _shainSeiEn; }
    protected ConditionValue xgetCValueShainSeiEn() { return xdfgetShainSeiEn(); }

    /** 
     * Add order-by as ascend. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_ShainSeiEn_Asc() { regOBA("SHAIN_SEI_EN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_ShainSeiEn_Desc() { regOBD("SHAIN_SEI_EN"); return this; }

    protected ConditionValue _shainMeiEn;
    public ConditionValue xdfgetShainMeiEn()
    { if (_shainMeiEn == null) { _shainMeiEn = nCV(); }
      return _shainMeiEn; }
    protected ConditionValue xgetCValueShainMeiEn() { return xdfgetShainMeiEn(); }

    /** 
     * Add order-by as ascend. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_ShainMeiEn_Asc() { regOBA("SHAIN_MEI_EN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_ShainMeiEn_Desc() { regOBD("SHAIN_MEI_EN"); return this; }

    protected ConditionValue _loginCd;
    public ConditionValue xdfgetLoginCd()
    { if (_loginCd == null) { _loginCd = nCV(); }
      return _loginCd; }
    protected ConditionValue xgetCValueLoginCd() { return xdfgetLoginCd(); }

    /** 
     * Add order-by as ascend. <br>
     * LOGIN_CD: {+UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_LoginCd_Asc() { regOBA("LOGIN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGIN_CD: {+UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_LoginCd_Desc() { regOBD("LOGIN_CD"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /** 
     * Add order-by as ascend. <br>
     * PASSWORD: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

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
    public BsCmShainCQ addOrderBy_RegUserId_Asc() { regOBA("REG_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_RegUserId_Desc() { regOBD("REG_USER_ID"); return this; }

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
    public BsCmShainCQ addOrderBy_RegTm_Asc() { regOBA("REG_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_RegTm_Desc() { regOBD("REG_TM"); return this; }

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
    public BsCmShainCQ addOrderBy_RegFuncCd_Asc() { regOBA("REG_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_RegFuncCd_Desc() { regOBD("REG_FUNC_CD"); return this; }

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
    public BsCmShainCQ addOrderBy_UpdUserId_Asc() { regOBA("UPD_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_UpdUserId_Desc() { regOBD("UPD_USER_ID"); return this; }

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
    public BsCmShainCQ addOrderBy_UpdTm_Asc() { regOBA("UPD_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_UpdTm_Desc() { regOBD("UPD_TM"); return this; }

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
    public BsCmShainCQ addOrderBy_UpdFuncCd_Asc() { regOBA("UPD_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_UpdFuncCd_Desc() { regOBD("UPD_FUNC_CD"); return this; }

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
    public BsCmShainCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsCmShainCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsCmShainCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCmShainCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CmShainCQ bq = (CmShainCQ)bqs;
        CmShainCQ uq = (CmShainCQ)uqs;
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
        String nrp = xresolveNRP("CM_SHAIN", "cmKaisha"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, CmShainCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CmShainCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CmShainCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CmShainCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CmShainCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CmShainCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CmShainCQ> _myselfExistsMap;
    public Map<String, CmShainCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CmShainCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CmShainCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CmShainCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CmShainCB.class.getName(); }
    protected String xCQ() { return CmShainCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
