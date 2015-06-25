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
 * The abstract condition-query of TCM_SAMPLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTcmSampleCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTcmSampleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "TCM_SAMPLE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tcmSampleId The value of tcmSampleId as equal. (NullAllowed: if null, no condition)
     */
    public void setTcmSampleId_Equal(Long tcmSampleId) {
        doSetTcmSampleId_Equal(tcmSampleId);
    }

    protected void doSetTcmSampleId_Equal(Long tcmSampleId) {
        regTcmSampleId(CK_EQ, tcmSampleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tcmSampleId The value of tcmSampleId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTcmSampleId_NotEqual(Long tcmSampleId) {
        doSetTcmSampleId_NotEqual(tcmSampleId);
    }

    protected void doSetTcmSampleId_NotEqual(Long tcmSampleId) {
        regTcmSampleId(CK_NES, tcmSampleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tcmSampleId The value of tcmSampleId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTcmSampleId_GreaterThan(Long tcmSampleId) {
        regTcmSampleId(CK_GT, tcmSampleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tcmSampleId The value of tcmSampleId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTcmSampleId_LessThan(Long tcmSampleId) {
        regTcmSampleId(CK_LT, tcmSampleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tcmSampleId The value of tcmSampleId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTcmSampleId_GreaterEqual(Long tcmSampleId) {
        regTcmSampleId(CK_GE, tcmSampleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tcmSampleId The value of tcmSampleId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTcmSampleId_LessEqual(Long tcmSampleId) {
        regTcmSampleId(CK_LE, tcmSampleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of tcmSampleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of tcmSampleId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTcmSampleId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTcmSampleId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of tcmSampleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of tcmSampleId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTcmSampleId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTcmSampleId(), "TCM_SAMPLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tcmSampleIdList The collection of tcmSampleId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTcmSampleId_InScope(Collection<Long> tcmSampleIdList) {
        doSetTcmSampleId_InScope(tcmSampleIdList);
    }

    protected void doSetTcmSampleId_InScope(Collection<Long> tcmSampleIdList) {
        regINS(CK_INS, cTL(tcmSampleIdList), xgetCValueTcmSampleId(), "TCM_SAMPLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tcmSampleIdList The collection of tcmSampleId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTcmSampleId_NotInScope(Collection<Long> tcmSampleIdList) {
        doSetTcmSampleId_NotInScope(tcmSampleIdList);
    }

    protected void doSetTcmSampleId_NotInScope(Collection<Long> tcmSampleIdList) {
        regINS(CK_NINS, cTL(tcmSampleIdList), xgetCValueTcmSampleId(), "TCM_SAMPLE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTcmSampleId_IsNull() { regTcmSampleId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTcmSampleId_IsNotNull() { regTcmSampleId(CK_ISNN, DOBJ); }

    protected void regTcmSampleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTcmSampleId(), "TCM_SAMPLE_ID"); }
    protected abstract ConditionValue xgetCValueTcmSampleId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleName The value of sampleName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleName_Equal(String sampleName) {
        doSetSampleName_Equal(fRES(sampleName));
    }

    protected void doSetSampleName_Equal(String sampleName) {
        regSampleName(CK_EQ, sampleName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleName The value of sampleName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleName_NotEqual(String sampleName) {
        doSetSampleName_NotEqual(fRES(sampleName));
    }

    protected void doSetSampleName_NotEqual(String sampleName) {
        regSampleName(CK_NES, sampleName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleName The value of sampleName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleName_GreaterThan(String sampleName) {
        regSampleName(CK_GT, fRES(sampleName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleName The value of sampleName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleName_LessThan(String sampleName) {
        regSampleName(CK_LT, fRES(sampleName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleName The value of sampleName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleName_GreaterEqual(String sampleName) {
        regSampleName(CK_GE, fRES(sampleName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleName The value of sampleName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleName_LessEqual(String sampleName) {
        regSampleName(CK_LE, fRES(sampleName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleNameList The collection of sampleName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleName_InScope(Collection<String> sampleNameList) {
        doSetSampleName_InScope(sampleNameList);
    }

    protected void doSetSampleName_InScope(Collection<String> sampleNameList) {
        regINS(CK_INS, cTL(sampleNameList), xgetCValueSampleName(), "SAMPLE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleNameList The collection of sampleName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleName_NotInScope(Collection<String> sampleNameList) {
        doSetSampleName_NotInScope(sampleNameList);
    }

    protected void doSetSampleName_NotInScope(Collection<String> sampleNameList) {
        regINS(CK_NINS, cTL(sampleNameList), xgetCValueSampleName(), "SAMPLE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)} <br>
     * <pre>e.g. setSampleName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sampleName The value of sampleName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSampleName_LikeSearch(String sampleName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSampleName_LikeSearch(sampleName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)} <br>
     * <pre>e.g. setSampleName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sampleName The value of sampleName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSampleName_LikeSearch(String sampleName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sampleName), xgetCValueSampleName(), "SAMPLE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleName The value of sampleName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSampleName_NotLikeSearch(String sampleName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSampleName_NotLikeSearch(sampleName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     * @param sampleName The value of sampleName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSampleName_NotLikeSearch(String sampleName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sampleName), xgetCValueSampleName(), "SAMPLE_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     */
    public void setSampleName_IsNull() { regSampleName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     */
    public void setSampleName_IsNullOrEmpty() { regSampleName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAMPLE_NAME: {VARCHAR(50)}
     */
    public void setSampleName_IsNotNull() { regSampleName(CK_ISNN, DOBJ); }

    protected void regSampleName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSampleName(), "SAMPLE_NAME"); }
    protected abstract ConditionValue xgetCValueSampleName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEn The value of sampleNameEn as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleNameEn_Equal(String sampleNameEn) {
        doSetSampleNameEn_Equal(fRES(sampleNameEn));
    }

    protected void doSetSampleNameEn_Equal(String sampleNameEn) {
        regSampleNameEn(CK_EQ, sampleNameEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEn The value of sampleNameEn as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleNameEn_NotEqual(String sampleNameEn) {
        doSetSampleNameEn_NotEqual(fRES(sampleNameEn));
    }

    protected void doSetSampleNameEn_NotEqual(String sampleNameEn) {
        regSampleNameEn(CK_NES, sampleNameEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEn The value of sampleNameEn as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleNameEn_GreaterThan(String sampleNameEn) {
        regSampleNameEn(CK_GT, fRES(sampleNameEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEn The value of sampleNameEn as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleNameEn_LessThan(String sampleNameEn) {
        regSampleNameEn(CK_LT, fRES(sampleNameEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEn The value of sampleNameEn as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleNameEn_GreaterEqual(String sampleNameEn) {
        regSampleNameEn(CK_GE, fRES(sampleNameEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEn The value of sampleNameEn as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleNameEn_LessEqual(String sampleNameEn) {
        regSampleNameEn(CK_LE, fRES(sampleNameEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEnList The collection of sampleNameEn as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleNameEn_InScope(Collection<String> sampleNameEnList) {
        doSetSampleNameEn_InScope(sampleNameEnList);
    }

    protected void doSetSampleNameEn_InScope(Collection<String> sampleNameEnList) {
        regINS(CK_INS, cTL(sampleNameEnList), xgetCValueSampleNameEn(), "SAMPLE_NAME_EN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEnList The collection of sampleNameEn as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSampleNameEn_NotInScope(Collection<String> sampleNameEnList) {
        doSetSampleNameEn_NotInScope(sampleNameEnList);
    }

    protected void doSetSampleNameEn_NotInScope(Collection<String> sampleNameEnList) {
        regINS(CK_NINS, cTL(sampleNameEnList), xgetCValueSampleNameEn(), "SAMPLE_NAME_EN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)} <br>
     * <pre>e.g. setSampleNameEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sampleNameEn The value of sampleNameEn as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSampleNameEn_LikeSearch(String sampleNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSampleNameEn_LikeSearch(sampleNameEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)} <br>
     * <pre>e.g. setSampleNameEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sampleNameEn The value of sampleNameEn as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSampleNameEn_LikeSearch(String sampleNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sampleNameEn), xgetCValueSampleNameEn(), "SAMPLE_NAME_EN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEn The value of sampleNameEn as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSampleNameEn_NotLikeSearch(String sampleNameEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSampleNameEn_NotLikeSearch(sampleNameEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     * @param sampleNameEn The value of sampleNameEn as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSampleNameEn_NotLikeSearch(String sampleNameEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sampleNameEn), xgetCValueSampleNameEn(), "SAMPLE_NAME_EN", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     */
    public void setSampleNameEn_IsNull() { regSampleNameEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     */
    public void setSampleNameEn_IsNullOrEmpty() { regSampleNameEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAMPLE_NAME_EN: {VARCHAR(50)}
     */
    public void setSampleNameEn_IsNotNull() { regSampleNameEn(CK_ISNN, DOBJ); }

    protected void regSampleNameEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSampleNameEn(), "SAMPLE_NAME_EN"); }
    protected abstract ConditionValue xgetCValueSampleNameEn();

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
    public HpSLCFunction<TcmSampleCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TcmSampleCB.class);
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
    public HpSLCFunction<TcmSampleCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TcmSampleCB.class);
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
    public HpSLCFunction<TcmSampleCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TcmSampleCB.class);
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
    public HpSLCFunction<TcmSampleCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TcmSampleCB.class);
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
    public HpSLCFunction<TcmSampleCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TcmSampleCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TcmSampleCB&gt;() {
     *     public void query(TcmSampleCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TcmSampleCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TcmSampleCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TcmSampleCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TcmSampleCQ sq);

    protected TcmSampleCB xcreateScalarConditionCB() {
        TcmSampleCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TcmSampleCB xcreateScalarConditionPartitionByCB() {
        TcmSampleCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TcmSampleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TcmSampleCB cb = new TcmSampleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TCM_SAMPLE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TcmSampleCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TcmSampleCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TcmSampleCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TcmSampleCB cb = new TcmSampleCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TCM_SAMPLE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TcmSampleCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TcmSampleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TcmSampleCB cb = new TcmSampleCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TcmSampleCQ sq);

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
    protected TcmSampleCB newMyCB() {
        return new TcmSampleCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TcmSampleCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
