package org.doxer.app.db.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.doxer.app.db.dbflute.allcommon.*;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of CM_KAISHA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCmKaishaCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCmKaishaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "CM_KAISHA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKaishaId The value of cmKaishaId as equal. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_Equal(Long cmKaishaId) {
        doSetCmKaishaId_Equal(cmKaishaId);
    }

    protected void doSetCmKaishaId_Equal(Long cmKaishaId) {
        regCmKaishaId(CK_EQ, cmKaishaId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKaishaId The value of cmKaishaId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_NotEqual(Long cmKaishaId) {
        doSetCmKaishaId_NotEqual(cmKaishaId);
    }

    protected void doSetCmKaishaId_NotEqual(Long cmKaishaId) {
        regCmKaishaId(CK_NES, cmKaishaId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKaishaId The value of cmKaishaId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_GreaterThan(Long cmKaishaId) {
        regCmKaishaId(CK_GT, cmKaishaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKaishaId The value of cmKaishaId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_LessThan(Long cmKaishaId) {
        regCmKaishaId(CK_LT, cmKaishaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKaishaId The value of cmKaishaId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_GreaterEqual(Long cmKaishaId) {
        regCmKaishaId(CK_GE, cmKaishaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKaishaId The value of cmKaishaId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_LessEqual(Long cmKaishaId) {
        regCmKaishaId(CK_LE, cmKaishaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cmKaishaId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cmKaishaId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCmKaishaId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCmKaishaId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cmKaishaId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cmKaishaId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCmKaishaId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCmKaishaId(), "CM_KAISHA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKaishaIdList The collection of cmKaishaId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCmKaishaId_InScope(Collection<Long> cmKaishaIdList) {
        doSetCmKaishaId_InScope(cmKaishaIdList);
    }

    protected void doSetCmKaishaId_InScope(Collection<Long> cmKaishaIdList) {
        regINS(CK_INS, cTL(cmKaishaIdList), xgetCValueCmKaishaId(), "CM_KAISHA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKaishaIdList The collection of cmKaishaId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCmKaishaId_NotInScope(Collection<Long> cmKaishaIdList) {
        doSetCmKaishaId_NotInScope(cmKaishaIdList);
    }

    protected void doSetCmKaishaId_NotInScope(Collection<Long> cmKaishaIdList) {
        regINS(CK_NINS, cTL(cmKaishaIdList), xgetCValueCmKaishaId(), "CM_KAISHA_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select cm_kaisha_id from CM_KISH_TESURYO where ...)} <br>
     * CM_KISH_TESURYO by CM_KAISHA_ID, named 'cmKishTesuryoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCmKishTesuryo</span>(tesuryoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tesuryoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CmKishTesuryoList for 'exists'. (NotNull)
     */
    public void existsCmKishTesuryo(SubQuery<CmKishTesuryoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmKishTesuryoCB cb = new CmKishTesuryoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCmKaishaId_ExistsReferrer_CmKishTesuryoList(cb.query());
        registerExistsReferrer(cb.query(), "CM_KAISHA_ID", "cm_kaisha_id", pp, "cmKishTesuryoList");
    }
    public abstract String keepCmKaishaId_ExistsReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CM_KAISHA_ID from CM_KISH_RENRAKUSAKI where ...)} <br>
     * CM_KISH_RENRAKUSAKI by CM_KAISHA_ID, named 'cmKishRenrakusakiAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCmKishRenrakusaki</span>(renrakusakiCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     renrakusakiCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CmKishRenrakusakiList for 'exists'. (NotNull)
     */
    public void existsCmKishRenrakusaki(SubQuery<CmKishRenrakusakiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCmKaishaId_ExistsReferrer_CmKishRenrakusakiList(cb.query());
        registerExistsReferrer(cb.query(), "CM_KAISHA_ID", "CM_KAISHA_ID", pp, "cmKishRenrakusakiList");
    }
    public abstract String keepCmKaishaId_ExistsReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select cm_kaisha_id from CM_SHAIN where ...)} <br>
     * CM_SHAIN by CM_KAISHA_ID, named 'cmShainAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCmShain</span>(shainCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shainCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CmShainList for 'exists'. (NotNull)
     */
    public void existsCmShain(SubQuery<CmShainCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmShainCB cb = new CmShainCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCmKaishaId_ExistsReferrer_CmShainList(cb.query());
        registerExistsReferrer(cb.query(), "CM_KAISHA_ID", "cm_kaisha_id", pp, "cmShainList");
    }
    public abstract String keepCmKaishaId_ExistsReferrer_CmShainList(CmShainCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select cm_kaisha_id from CM_KISH_TESURYO where ...)} <br>
     * CM_KISH_TESURYO by CM_KAISHA_ID, named 'cmKishTesuryoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCmKishTesuryo</span>(tesuryoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tesuryoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CmKaishaId_NotExistsReferrer_CmKishTesuryoList for 'not exists'. (NotNull)
     */
    public void notExistsCmKishTesuryo(SubQuery<CmKishTesuryoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmKishTesuryoCB cb = new CmKishTesuryoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCmKaishaId_NotExistsReferrer_CmKishTesuryoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CM_KAISHA_ID", "cm_kaisha_id", pp, "cmKishTesuryoList");
    }
    public abstract String keepCmKaishaId_NotExistsReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CM_KAISHA_ID from CM_KISH_RENRAKUSAKI where ...)} <br>
     * CM_KISH_RENRAKUSAKI by CM_KAISHA_ID, named 'cmKishRenrakusakiAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCmKishRenrakusaki</span>(renrakusakiCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     renrakusakiCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CmKaishaId_NotExistsReferrer_CmKishRenrakusakiList for 'not exists'. (NotNull)
     */
    public void notExistsCmKishRenrakusaki(SubQuery<CmKishRenrakusakiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCmKaishaId_NotExistsReferrer_CmKishRenrakusakiList(cb.query());
        registerNotExistsReferrer(cb.query(), "CM_KAISHA_ID", "CM_KAISHA_ID", pp, "cmKishRenrakusakiList");
    }
    public abstract String keepCmKaishaId_NotExistsReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select cm_kaisha_id from CM_SHAIN where ...)} <br>
     * CM_SHAIN by CM_KAISHA_ID, named 'cmShainAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCmShain</span>(shainCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shainCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CmKaishaId_NotExistsReferrer_CmShainList for 'not exists'. (NotNull)
     */
    public void notExistsCmShain(SubQuery<CmShainCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmShainCB cb = new CmShainCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCmKaishaId_NotExistsReferrer_CmShainList(cb.query());
        registerNotExistsReferrer(cb.query(), "CM_KAISHA_ID", "cm_kaisha_id", pp, "cmShainList");
    }
    public abstract String keepCmKaishaId_NotExistsReferrer_CmShainList(CmShainCQ sq);

    public void xsderiveCmKishTesuryoList(String fn, SubQuery<CmKishTesuryoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishTesuryoCB cb = new CmKishTesuryoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCmKaishaId_SpecifyDerivedReferrer_CmKishTesuryoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CM_KAISHA_ID", "cm_kaisha_id", pp, "cmKishTesuryoList", al, op);
    }
    public abstract String keepCmKaishaId_SpecifyDerivedReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq);

    public void xsderiveCmKishRenrakusakiList(String fn, SubQuery<CmKishRenrakusakiCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCmKaishaId_SpecifyDerivedReferrer_CmKishRenrakusakiList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CM_KAISHA_ID", "CM_KAISHA_ID", pp, "cmKishRenrakusakiList", al, op);
    }
    public abstract String keepCmKaishaId_SpecifyDerivedReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq);

    public void xsderiveCmShainList(String fn, SubQuery<CmShainCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmShainCB cb = new CmShainCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCmKaishaId_SpecifyDerivedReferrer_CmShainList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CM_KAISHA_ID", "cm_kaisha_id", pp, "cmShainList", al, op);
    }
    public abstract String keepCmKaishaId_SpecifyDerivedReferrer_CmShainList(CmShainCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from CM_KISH_TESURYO where ...)} <br>
     * CM_KISH_TESURYO by CM_KAISHA_ID, named 'cmKishTesuryoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCmKishTesuryo()</span>.<span style="color: #CC4747">max</span>(tesuryoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tesuryoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tesuryoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CmKishTesuryoCB> derivedCmKishTesuryo() {
        return xcreateQDRFunctionCmKishTesuryoList();
    }
    protected HpQDRFunction<CmKishTesuryoCB> xcreateQDRFunctionCmKishTesuryoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCmKishTesuryoList(fn, sq, rd, vl, op));
    }
    public void xqderiveCmKishTesuryoList(String fn, SubQuery<CmKishTesuryoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishTesuryoCB cb = new CmKishTesuryoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCmKaishaId_QueryDerivedReferrer_CmKishTesuryoList(cb.query()); String prpp = keepCmKaishaId_QueryDerivedReferrer_CmKishTesuryoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CM_KAISHA_ID", "cm_kaisha_id", sqpp, "cmKishTesuryoList", rd, vl, prpp, op);
    }
    public abstract String keepCmKaishaId_QueryDerivedReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq);
    public abstract String keepCmKaishaId_QueryDerivedReferrer_CmKishTesuryoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from CM_KISH_RENRAKUSAKI where ...)} <br>
     * CM_KISH_RENRAKUSAKI by CM_KAISHA_ID, named 'cmKishRenrakusakiAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCmKishRenrakusaki()</span>.<span style="color: #CC4747">max</span>(renrakusakiCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     renrakusakiCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     renrakusakiCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CmKishRenrakusakiCB> derivedCmKishRenrakusaki() {
        return xcreateQDRFunctionCmKishRenrakusakiList();
    }
    protected HpQDRFunction<CmKishRenrakusakiCB> xcreateQDRFunctionCmKishRenrakusakiList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCmKishRenrakusakiList(fn, sq, rd, vl, op));
    }
    public void xqderiveCmKishRenrakusakiList(String fn, SubQuery<CmKishRenrakusakiCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList(cb.query()); String prpp = keepCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CM_KAISHA_ID", "CM_KAISHA_ID", sqpp, "cmKishRenrakusakiList", rd, vl, prpp, op);
    }
    public abstract String keepCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq);
    public abstract String keepCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from CM_SHAIN where ...)} <br>
     * CM_SHAIN by CM_KAISHA_ID, named 'cmShainAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCmShain()</span>.<span style="color: #CC4747">max</span>(shainCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shainCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     shainCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CmShainCB> derivedCmShain() {
        return xcreateQDRFunctionCmShainList();
    }
    protected HpQDRFunction<CmShainCB> xcreateQDRFunctionCmShainList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCmShainList(fn, sq, rd, vl, op));
    }
    public void xqderiveCmShainList(String fn, SubQuery<CmShainCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmShainCB cb = new CmShainCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCmKaishaId_QueryDerivedReferrer_CmShainList(cb.query()); String prpp = keepCmKaishaId_QueryDerivedReferrer_CmShainListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CM_KAISHA_ID", "cm_kaisha_id", sqpp, "cmShainList", rd, vl, prpp, op);
    }
    public abstract String keepCmKaishaId_QueryDerivedReferrer_CmShainList(CmShainCQ sq);
    public abstract String keepCmKaishaId_QueryDerivedReferrer_CmShainListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCmKaishaId_IsNull() { regCmKaishaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCmKaishaId_IsNotNull() { regCmKaishaId(CK_ISNN, DOBJ); }

    protected void regCmKaishaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmKaishaId(), "CM_KAISHA_ID"); }
    protected abstract ConditionValue xgetCValueCmKaishaId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMei The value of kaishaMei as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMei_Equal(String kaishaMei) {
        doSetKaishaMei_Equal(fRES(kaishaMei));
    }

    protected void doSetKaishaMei_Equal(String kaishaMei) {
        regKaishaMei(CK_EQ, kaishaMei);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMei The value of kaishaMei as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMei_NotEqual(String kaishaMei) {
        doSetKaishaMei_NotEqual(fRES(kaishaMei));
    }

    protected void doSetKaishaMei_NotEqual(String kaishaMei) {
        regKaishaMei(CK_NES, kaishaMei);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMei The value of kaishaMei as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMei_GreaterThan(String kaishaMei) {
        regKaishaMei(CK_GT, fRES(kaishaMei));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMei The value of kaishaMei as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMei_LessThan(String kaishaMei) {
        regKaishaMei(CK_LT, fRES(kaishaMei));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMei The value of kaishaMei as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMei_GreaterEqual(String kaishaMei) {
        regKaishaMei(CK_GE, fRES(kaishaMei));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMei The value of kaishaMei as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMei_LessEqual(String kaishaMei) {
        regKaishaMei(CK_LE, fRES(kaishaMei));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMeiList The collection of kaishaMei as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMei_InScope(Collection<String> kaishaMeiList) {
        doSetKaishaMei_InScope(kaishaMeiList);
    }

    protected void doSetKaishaMei_InScope(Collection<String> kaishaMeiList) {
        regINS(CK_INS, cTL(kaishaMeiList), xgetCValueKaishaMei(), "KAISHA_MEI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMeiList The collection of kaishaMei as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMei_NotInScope(Collection<String> kaishaMeiList) {
        doSetKaishaMei_NotInScope(kaishaMeiList);
    }

    protected void doSetKaishaMei_NotInScope(Collection<String> kaishaMeiList) {
        regINS(CK_NINS, cTL(kaishaMeiList), xgetCValueKaishaMei(), "KAISHA_MEI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setKaishaMei_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param kaishaMei The value of kaishaMei as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKaishaMei_LikeSearch(String kaishaMei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKaishaMei_LikeSearch(kaishaMei, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setKaishaMei_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kaishaMei The value of kaishaMei as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setKaishaMei_LikeSearch(String kaishaMei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kaishaMei), xgetCValueKaishaMei(), "KAISHA_MEI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMei The value of kaishaMei as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKaishaMei_NotLikeSearch(String kaishaMei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKaishaMei_NotLikeSearch(kaishaMei, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KAISHA_MEI: {UQ, NotNull, VARCHAR(50)}
     * @param kaishaMei The value of kaishaMei as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setKaishaMei_NotLikeSearch(String kaishaMei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kaishaMei), xgetCValueKaishaMei(), "KAISHA_MEI", likeSearchOption);
    }

    protected void regKaishaMei(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKaishaMei(), "KAISHA_MEI"); }
    protected abstract ConditionValue xgetCValueKaishaMei();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEn The value of kaishaMeiEn as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMeiEn_Equal(String kaishaMeiEn) {
        doSetKaishaMeiEn_Equal(fRES(kaishaMeiEn));
    }

    protected void doSetKaishaMeiEn_Equal(String kaishaMeiEn) {
        regKaishaMeiEn(CK_EQ, kaishaMeiEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEn The value of kaishaMeiEn as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMeiEn_NotEqual(String kaishaMeiEn) {
        doSetKaishaMeiEn_NotEqual(fRES(kaishaMeiEn));
    }

    protected void doSetKaishaMeiEn_NotEqual(String kaishaMeiEn) {
        regKaishaMeiEn(CK_NES, kaishaMeiEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEn The value of kaishaMeiEn as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMeiEn_GreaterThan(String kaishaMeiEn) {
        regKaishaMeiEn(CK_GT, fRES(kaishaMeiEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEn The value of kaishaMeiEn as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMeiEn_LessThan(String kaishaMeiEn) {
        regKaishaMeiEn(CK_LT, fRES(kaishaMeiEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEn The value of kaishaMeiEn as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMeiEn_GreaterEqual(String kaishaMeiEn) {
        regKaishaMeiEn(CK_GE, fRES(kaishaMeiEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEn The value of kaishaMeiEn as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMeiEn_LessEqual(String kaishaMeiEn) {
        regKaishaMeiEn(CK_LE, fRES(kaishaMeiEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEnList The collection of kaishaMeiEn as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMeiEn_InScope(Collection<String> kaishaMeiEnList) {
        doSetKaishaMeiEn_InScope(kaishaMeiEnList);
    }

    protected void doSetKaishaMeiEn_InScope(Collection<String> kaishaMeiEnList) {
        regINS(CK_INS, cTL(kaishaMeiEnList), xgetCValueKaishaMeiEn(), "KAISHA_MEI_EN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEnList The collection of kaishaMeiEn as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKaishaMeiEn_NotInScope(Collection<String> kaishaMeiEnList) {
        doSetKaishaMeiEn_NotInScope(kaishaMeiEnList);
    }

    protected void doSetKaishaMeiEn_NotInScope(Collection<String> kaishaMeiEnList) {
        regINS(CK_NINS, cTL(kaishaMeiEnList), xgetCValueKaishaMeiEn(), "KAISHA_MEI_EN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setKaishaMeiEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param kaishaMeiEn The value of kaishaMeiEn as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKaishaMeiEn_LikeSearch(String kaishaMeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKaishaMeiEn_LikeSearch(kaishaMeiEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setKaishaMeiEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kaishaMeiEn The value of kaishaMeiEn as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setKaishaMeiEn_LikeSearch(String kaishaMeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kaishaMeiEn), xgetCValueKaishaMeiEn(), "KAISHA_MEI_EN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEn The value of kaishaMeiEn as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKaishaMeiEn_NotLikeSearch(String kaishaMeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKaishaMeiEn_NotLikeSearch(kaishaMeiEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     * @param kaishaMeiEn The value of kaishaMeiEn as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setKaishaMeiEn_NotLikeSearch(String kaishaMeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kaishaMeiEn), xgetCValueKaishaMeiEn(), "KAISHA_MEI_EN", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     */
    public void setKaishaMeiEn_IsNull() { regKaishaMeiEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     */
    public void setKaishaMeiEn_IsNullOrEmpty() { regKaishaMeiEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KAISHA_MEI_EN: {VARCHAR(100)}
     */
    public void setKaishaMeiEn_IsNotNull() { regKaishaMeiEn(CK_ISNN, DOBJ); }

    protected void regKaishaMeiEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKaishaMeiEn(), "KAISHA_MEI_EN"); }
    protected abstract ConditionValue xgetCValueKaishaMeiEn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_Equal(String regUserId) {
        doSetRegUserId_Equal(fRES(regUserId));
    }

    protected void doSetRegUserId_Equal(String regUserId) {
        regRegUserId(CK_EQ, regUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_NotEqual(String regUserId) {
        doSetRegUserId_NotEqual(fRES(regUserId));
    }

    protected void doSetRegUserId_NotEqual(String regUserId) {
        regRegUserId(CK_NES, regUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_GreaterThan(String regUserId) {
        regRegUserId(CK_GT, fRES(regUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_LessThan(String regUserId) {
        regRegUserId(CK_LT, fRES(regUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_GreaterEqual(String regUserId) {
        regRegUserId(CK_GE, fRES(regUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_LessEqual(String regUserId) {
        regRegUserId(CK_LE, fRES(regUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserIdList The collection of regUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_InScope(Collection<String> regUserIdList) {
        doSetRegUserId_InScope(regUserIdList);
    }

    protected void doSetRegUserId_InScope(Collection<String> regUserIdList) {
        regINS(CK_INS, cTL(regUserIdList), xgetCValueRegUserId(), "REG_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserIdList The collection of regUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_NotInScope(Collection<String> regUserIdList) {
        doSetRegUserId_NotInScope(regUserIdList);
    }

    protected void doSetRegUserId_NotInScope(Collection<String> regUserIdList) {
        regINS(CK_NINS, cTL(regUserIdList), xgetCValueRegUserId(), "REG_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setRegUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regUserId The value of regUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegUserId_LikeSearch(String regUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegUserId_LikeSearch(regUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setRegUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regUserId The value of regUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegUserId_LikeSearch(String regUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regUserId), xgetCValueRegUserId(), "REG_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegUserId_NotLikeSearch(String regUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegUserId_NotLikeSearch(regUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegUserId_NotLikeSearch(String regUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regUserId), xgetCValueRegUserId(), "REG_USER_ID", likeSearchOption);
    }

    protected void regRegUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegUserId(), "REG_USER_ID"); }
    protected abstract ConditionValue xgetCValueRegUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as equal. (NullAllowed: if null, no condition)
     */
    public void setRegTm_Equal(java.time.LocalDateTime regTm) {
        regRegTm(CK_EQ,  regTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegTm_GreaterThan(java.time.LocalDateTime regTm) {
        regRegTm(CK_GT,  regTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegTm_LessThan(java.time.LocalDateTime regTm) {
        regRegTm(CK_LT,  regTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegTm_GreaterEqual(java.time.LocalDateTime regTm) {
        regRegTm(CK_GE,  regTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegTm_LessEqual(java.time.LocalDateTime regTm) {
        regRegTm(CK_LE, regTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setRegTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setRegTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REG_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegTm(), nm, op);
    }

    protected void regRegTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegTm(), "REG_TM"); }
    protected abstract ConditionValue xgetCValueRegTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_Equal(String regFuncCd) {
        doSetRegFuncCd_Equal(fRES(regFuncCd));
    }

    protected void doSetRegFuncCd_Equal(String regFuncCd) {
        regRegFuncCd(CK_EQ, regFuncCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_NotEqual(String regFuncCd) {
        doSetRegFuncCd_NotEqual(fRES(regFuncCd));
    }

    protected void doSetRegFuncCd_NotEqual(String regFuncCd) {
        regRegFuncCd(CK_NES, regFuncCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_GreaterThan(String regFuncCd) {
        regRegFuncCd(CK_GT, fRES(regFuncCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_LessThan(String regFuncCd) {
        regRegFuncCd(CK_LT, fRES(regFuncCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_GreaterEqual(String regFuncCd) {
        regRegFuncCd(CK_GE, fRES(regFuncCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_LessEqual(String regFuncCd) {
        regRegFuncCd(CK_LE, fRES(regFuncCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCdList The collection of regFuncCd as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_InScope(Collection<String> regFuncCdList) {
        doSetRegFuncCd_InScope(regFuncCdList);
    }

    protected void doSetRegFuncCd_InScope(Collection<String> regFuncCdList) {
        regINS(CK_INS, cTL(regFuncCdList), xgetCValueRegFuncCd(), "REG_FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCdList The collection of regFuncCd as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_NotInScope(Collection<String> regFuncCdList) {
        doSetRegFuncCd_NotInScope(regFuncCdList);
    }

    protected void doSetRegFuncCd_NotInScope(Collection<String> regFuncCdList) {
        regINS(CK_NINS, cTL(regFuncCdList), xgetCValueRegFuncCd(), "REG_FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setRegFuncCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regFuncCd The value of regFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegFuncCd_LikeSearch(String regFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegFuncCd_LikeSearch(regFuncCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setRegFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regFuncCd The value of regFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegFuncCd_LikeSearch(String regFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regFuncCd), xgetCValueRegFuncCd(), "REG_FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegFuncCd_NotLikeSearch(String regFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegFuncCd_NotLikeSearch(regFuncCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegFuncCd_NotLikeSearch(String regFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regFuncCd), xgetCValueRegFuncCd(), "REG_FUNC_CD", likeSearchOption);
    }

    protected void regRegFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegFuncCd(), "REG_FUNC_CD"); }
    protected abstract ConditionValue xgetCValueRegFuncCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_Equal(String updUserId) {
        doSetUpdUserId_Equal(fRES(updUserId));
    }

    protected void doSetUpdUserId_Equal(String updUserId) {
        regUpdUserId(CK_EQ, updUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_NotEqual(String updUserId) {
        doSetUpdUserId_NotEqual(fRES(updUserId));
    }

    protected void doSetUpdUserId_NotEqual(String updUserId) {
        regUpdUserId(CK_NES, updUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_GreaterThan(String updUserId) {
        regUpdUserId(CK_GT, fRES(updUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_LessThan(String updUserId) {
        regUpdUserId(CK_LT, fRES(updUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_GreaterEqual(String updUserId) {
        regUpdUserId(CK_GE, fRES(updUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_LessEqual(String updUserId) {
        regUpdUserId(CK_LE, fRES(updUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserIdList The collection of updUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_InScope(Collection<String> updUserIdList) {
        doSetUpdUserId_InScope(updUserIdList);
    }

    protected void doSetUpdUserId_InScope(Collection<String> updUserIdList) {
        regINS(CK_INS, cTL(updUserIdList), xgetCValueUpdUserId(), "UPD_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserIdList The collection of updUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_NotInScope(Collection<String> updUserIdList) {
        doSetUpdUserId_NotInScope(updUserIdList);
    }

    protected void doSetUpdUserId_NotInScope(Collection<String> updUserIdList) {
        regINS(CK_NINS, cTL(updUserIdList), xgetCValueUpdUserId(), "UPD_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUpdUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updUserId The value of updUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdUserId_LikeSearch(String updUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdUserId_LikeSearch(updUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUpdUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updUserId The value of updUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdUserId_LikeSearch(String updUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updUserId), xgetCValueUpdUserId(), "UPD_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdUserId_NotLikeSearch(String updUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdUserId_NotLikeSearch(updUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdUserId_NotLikeSearch(String updUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updUserId), xgetCValueUpdUserId(), "UPD_USER_ID", likeSearchOption);
    }

    protected void regUpdUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUserId(), "UPD_USER_ID"); }
    protected abstract ConditionValue xgetCValueUpdUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdTm_Equal(java.time.LocalDateTime updTm) {
        regUpdTm(CK_EQ,  updTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdTm_GreaterThan(java.time.LocalDateTime updTm) {
        regUpdTm(CK_GT,  updTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdTm_LessThan(java.time.LocalDateTime updTm) {
        regUpdTm(CK_LT,  updTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdTm_GreaterEqual(java.time.LocalDateTime updTm) {
        regUpdTm(CK_GE,  updTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdTm_LessEqual(java.time.LocalDateTime updTm) {
        regUpdTm(CK_LE, updTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPD_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdTm(), nm, op);
    }

    protected void regUpdTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdTm(), "UPD_TM"); }
    protected abstract ConditionValue xgetCValueUpdTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_Equal(String updFuncCd) {
        doSetUpdFuncCd_Equal(fRES(updFuncCd));
    }

    protected void doSetUpdFuncCd_Equal(String updFuncCd) {
        regUpdFuncCd(CK_EQ, updFuncCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_NotEqual(String updFuncCd) {
        doSetUpdFuncCd_NotEqual(fRES(updFuncCd));
    }

    protected void doSetUpdFuncCd_NotEqual(String updFuncCd) {
        regUpdFuncCd(CK_NES, updFuncCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_GreaterThan(String updFuncCd) {
        regUpdFuncCd(CK_GT, fRES(updFuncCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_LessThan(String updFuncCd) {
        regUpdFuncCd(CK_LT, fRES(updFuncCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_GreaterEqual(String updFuncCd) {
        regUpdFuncCd(CK_GE, fRES(updFuncCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_LessEqual(String updFuncCd) {
        regUpdFuncCd(CK_LE, fRES(updFuncCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCdList The collection of updFuncCd as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_InScope(Collection<String> updFuncCdList) {
        doSetUpdFuncCd_InScope(updFuncCdList);
    }

    protected void doSetUpdFuncCd_InScope(Collection<String> updFuncCdList) {
        regINS(CK_INS, cTL(updFuncCdList), xgetCValueUpdFuncCd(), "UPD_FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCdList The collection of updFuncCd as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_NotInScope(Collection<String> updFuncCdList) {
        doSetUpdFuncCd_NotInScope(updFuncCdList);
    }

    protected void doSetUpdFuncCd_NotInScope(Collection<String> updFuncCdList) {
        regINS(CK_NINS, cTL(updFuncCdList), xgetCValueUpdFuncCd(), "UPD_FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setUpdFuncCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updFuncCd The value of updFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdFuncCd_LikeSearch(String updFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdFuncCd_LikeSearch(updFuncCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setUpdFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updFuncCd The value of updFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdFuncCd_LikeSearch(String updFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updFuncCd), xgetCValueUpdFuncCd(), "UPD_FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdFuncCd_NotLikeSearch(String updFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdFuncCd_NotLikeSearch(updFuncCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdFuncCd_NotLikeSearch(String updFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updFuncCd), xgetCValueUpdFuncCd(), "UPD_FUNC_CD", likeSearchOption);
    }

    protected void regUpdFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdFuncCd(), "UPD_FUNC_CD"); }
    protected abstract ConditionValue xgetCValueUpdFuncCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_NotEqual(Integer versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Integer versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmKaishaCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CmKaishaCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmKaishaCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CmKaishaCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmKaishaCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CmKaishaCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmKaishaCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CmKaishaCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmKaishaCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CmKaishaCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CmKaishaCB&gt;() {
     *     public void query(CmKaishaCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmKaishaCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CmKaishaCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKaishaCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CmKaishaCQ sq);

    protected CmKaishaCB xcreateScalarConditionCB() {
        CmKaishaCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CmKaishaCB xcreateScalarConditionPartitionByCB() {
        CmKaishaCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CmKaishaCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKaishaCB cb = new CmKaishaCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CM_KAISHA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CmKaishaCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CmKaishaCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CmKaishaCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKaishaCB cb = new CmKaishaCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CM_KAISHA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CmKaishaCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CmKaishaCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmKaishaCB cb = new CmKaishaCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CmKaishaCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected CmKaishaCB newMyCB() {
        return new CmKaishaCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CmKaishaCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
