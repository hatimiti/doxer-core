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
 * The abstract condition-query of CM_KISH_TESURYO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCmKishTesuryoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCmKishTesuryoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CM_KISH_TESURYO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishTesuryoId The value of cmKishTesuryoId as equal. (NullAllowed: if null, no condition)
     */
    public void setCmKishTesuryoId_Equal(Long cmKishTesuryoId) {
        doSetCmKishTesuryoId_Equal(cmKishTesuryoId);
    }

    protected void doSetCmKishTesuryoId_Equal(Long cmKishTesuryoId) {
        regCmKishTesuryoId(CK_EQ, cmKishTesuryoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishTesuryoId The value of cmKishTesuryoId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKishTesuryoId_NotEqual(Long cmKishTesuryoId) {
        doSetCmKishTesuryoId_NotEqual(cmKishTesuryoId);
    }

    protected void doSetCmKishTesuryoId_NotEqual(Long cmKishTesuryoId) {
        regCmKishTesuryoId(CK_NES, cmKishTesuryoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishTesuryoId The value of cmKishTesuryoId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCmKishTesuryoId_GreaterThan(Long cmKishTesuryoId) {
        regCmKishTesuryoId(CK_GT, cmKishTesuryoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishTesuryoId The value of cmKishTesuryoId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCmKishTesuryoId_LessThan(Long cmKishTesuryoId) {
        regCmKishTesuryoId(CK_LT, cmKishTesuryoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishTesuryoId The value of cmKishTesuryoId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKishTesuryoId_GreaterEqual(Long cmKishTesuryoId) {
        regCmKishTesuryoId(CK_GE, cmKishTesuryoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishTesuryoId The value of cmKishTesuryoId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKishTesuryoId_LessEqual(Long cmKishTesuryoId) {
        regCmKishTesuryoId(CK_LE, cmKishTesuryoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cmKishTesuryoId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cmKishTesuryoId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCmKishTesuryoId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCmKishTesuryoId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cmKishTesuryoId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cmKishTesuryoId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCmKishTesuryoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCmKishTesuryoId(), "CM_KISH_TESURYO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishTesuryoIdList The collection of cmKishTesuryoId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCmKishTesuryoId_InScope(Collection<Long> cmKishTesuryoIdList) {
        doSetCmKishTesuryoId_InScope(cmKishTesuryoIdList);
    }

    protected void doSetCmKishTesuryoId_InScope(Collection<Long> cmKishTesuryoIdList) {
        regINS(CK_INS, cTL(cmKishTesuryoIdList), xgetCValueCmKishTesuryoId(), "CM_KISH_TESURYO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishTesuryoIdList The collection of cmKishTesuryoId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCmKishTesuryoId_NotInScope(Collection<Long> cmKishTesuryoIdList) {
        doSetCmKishTesuryoId_NotInScope(cmKishTesuryoIdList);
    }

    protected void doSetCmKishTesuryoId_NotInScope(Collection<Long> cmKishTesuryoIdList) {
        regINS(CK_NINS, cTL(cmKishTesuryoIdList), xgetCValueCmKishTesuryoId(), "CM_KISH_TESURYO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCmKishTesuryoId_IsNull() { regCmKishTesuryoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCmKishTesuryoId_IsNotNull() { regCmKishTesuryoId(CK_ISNN, DOBJ); }

    protected void regCmKishTesuryoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmKishTesuryoId(), "CM_KISH_TESURYO_ID"); }
    protected abstract ConditionValue xgetCValueCmKishTesuryoId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
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
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
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
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_GreaterThan(Long cmKaishaId) {
        regCmKaishaId(CK_GT, cmKaishaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_LessThan(Long cmKaishaId) {
        regCmKaishaId(CK_LT, cmKaishaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_GreaterEqual(Long cmKaishaId) {
        regCmKaishaId(CK_GE, cmKaishaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_LessEqual(Long cmKaishaId) {
        regCmKaishaId(CK_LE, cmKaishaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
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
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @param minNumber The min number of cmKaishaId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cmKaishaId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCmKaishaId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCmKaishaId(), "CM_KAISHA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
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
     * CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaIdList The collection of cmKaishaId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCmKaishaId_NotInScope(Collection<Long> cmKaishaIdList) {
        doSetCmKaishaId_NotInScope(cmKaishaIdList);
    }

    protected void doSetCmKaishaId_NotInScope(Collection<Long> cmKaishaIdList) {
        regINS(CK_NINS, cTL(cmKaishaIdList), xgetCValueCmKaishaId(), "CM_KAISHA_ID");
    }

    protected void regCmKaishaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmKaishaId(), "CM_KAISHA_ID"); }
    protected abstract ConditionValue xgetCValueCmKaishaId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanFromDt_Equal(String tekiyoKikanFromDt) {
        doSetTekiyoKikanFromDt_Equal(fRES(tekiyoKikanFromDt));
    }

    protected void doSetTekiyoKikanFromDt_Equal(String tekiyoKikanFromDt) {
        regTekiyoKikanFromDt(CK_EQ, tekiyoKikanFromDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanFromDt_NotEqual(String tekiyoKikanFromDt) {
        doSetTekiyoKikanFromDt_NotEqual(fRES(tekiyoKikanFromDt));
    }

    protected void doSetTekiyoKikanFromDt_NotEqual(String tekiyoKikanFromDt) {
        regTekiyoKikanFromDt(CK_NES, tekiyoKikanFromDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanFromDt_GreaterThan(String tekiyoKikanFromDt) {
        regTekiyoKikanFromDt(CK_GT, fRES(tekiyoKikanFromDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanFromDt_LessThan(String tekiyoKikanFromDt) {
        regTekiyoKikanFromDt(CK_LT, fRES(tekiyoKikanFromDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanFromDt_GreaterEqual(String tekiyoKikanFromDt) {
        regTekiyoKikanFromDt(CK_GE, fRES(tekiyoKikanFromDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanFromDt_LessEqual(String tekiyoKikanFromDt) {
        regTekiyoKikanFromDt(CK_LE, fRES(tekiyoKikanFromDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDtList The collection of tekiyoKikanFromDt as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanFromDt_InScope(Collection<String> tekiyoKikanFromDtList) {
        doSetTekiyoKikanFromDt_InScope(tekiyoKikanFromDtList);
    }

    protected void doSetTekiyoKikanFromDt_InScope(Collection<String> tekiyoKikanFromDtList) {
        regINS(CK_INS, cTL(tekiyoKikanFromDtList), xgetCValueTekiyoKikanFromDt(), "TEKIYO_KIKAN_FROM_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDtList The collection of tekiyoKikanFromDt as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanFromDt_NotInScope(Collection<String> tekiyoKikanFromDtList) {
        doSetTekiyoKikanFromDt_NotInScope(tekiyoKikanFromDtList);
    }

    protected void doSetTekiyoKikanFromDt_NotInScope(Collection<String> tekiyoKikanFromDtList) {
        regINS(CK_NINS, cTL(tekiyoKikanFromDtList), xgetCValueTekiyoKikanFromDt(), "TEKIYO_KIKAN_FROM_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)} <br>
     * <pre>e.g. setTekiyoKikanFromDt_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTekiyoKikanFromDt_LikeSearch(String tekiyoKikanFromDt, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTekiyoKikanFromDt_LikeSearch(tekiyoKikanFromDt, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)} <br>
     * <pre>e.g. setTekiyoKikanFromDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTekiyoKikanFromDt_LikeSearch(String tekiyoKikanFromDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tekiyoKikanFromDt), xgetCValueTekiyoKikanFromDt(), "TEKIYO_KIKAN_FROM_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTekiyoKikanFromDt_NotLikeSearch(String tekiyoKikanFromDt, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTekiyoKikanFromDt_NotLikeSearch(tekiyoKikanFromDt, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)}
     * @param tekiyoKikanFromDt The value of tekiyoKikanFromDt as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTekiyoKikanFromDt_NotLikeSearch(String tekiyoKikanFromDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tekiyoKikanFromDt), xgetCValueTekiyoKikanFromDt(), "TEKIYO_KIKAN_FROM_DT", likeSearchOption);
    }

    protected void regTekiyoKikanFromDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTekiyoKikanFromDt(), "TEKIYO_KIKAN_FROM_DT"); }
    protected abstract ConditionValue xgetCValueTekiyoKikanFromDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanToDt_Equal(String tekiyoKikanToDt) {
        doSetTekiyoKikanToDt_Equal(fRES(tekiyoKikanToDt));
    }

    protected void doSetTekiyoKikanToDt_Equal(String tekiyoKikanToDt) {
        regTekiyoKikanToDt(CK_EQ, tekiyoKikanToDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanToDt_NotEqual(String tekiyoKikanToDt) {
        doSetTekiyoKikanToDt_NotEqual(fRES(tekiyoKikanToDt));
    }

    protected void doSetTekiyoKikanToDt_NotEqual(String tekiyoKikanToDt) {
        regTekiyoKikanToDt(CK_NES, tekiyoKikanToDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanToDt_GreaterThan(String tekiyoKikanToDt) {
        regTekiyoKikanToDt(CK_GT, fRES(tekiyoKikanToDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanToDt_LessThan(String tekiyoKikanToDt) {
        regTekiyoKikanToDt(CK_LT, fRES(tekiyoKikanToDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanToDt_GreaterEqual(String tekiyoKikanToDt) {
        regTekiyoKikanToDt(CK_GE, fRES(tekiyoKikanToDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanToDt_LessEqual(String tekiyoKikanToDt) {
        regTekiyoKikanToDt(CK_LE, fRES(tekiyoKikanToDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDtList The collection of tekiyoKikanToDt as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanToDt_InScope(Collection<String> tekiyoKikanToDtList) {
        doSetTekiyoKikanToDt_InScope(tekiyoKikanToDtList);
    }

    protected void doSetTekiyoKikanToDt_InScope(Collection<String> tekiyoKikanToDtList) {
        regINS(CK_INS, cTL(tekiyoKikanToDtList), xgetCValueTekiyoKikanToDt(), "TEKIYO_KIKAN_TO_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDtList The collection of tekiyoKikanToDt as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTekiyoKikanToDt_NotInScope(Collection<String> tekiyoKikanToDtList) {
        doSetTekiyoKikanToDt_NotInScope(tekiyoKikanToDtList);
    }

    protected void doSetTekiyoKikanToDt_NotInScope(Collection<String> tekiyoKikanToDtList) {
        regINS(CK_NINS, cTL(tekiyoKikanToDtList), xgetCValueTekiyoKikanToDt(), "TEKIYO_KIKAN_TO_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)} <br>
     * <pre>e.g. setTekiyoKikanToDt_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTekiyoKikanToDt_LikeSearch(String tekiyoKikanToDt, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTekiyoKikanToDt_LikeSearch(tekiyoKikanToDt, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)} <br>
     * <pre>e.g. setTekiyoKikanToDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTekiyoKikanToDt_LikeSearch(String tekiyoKikanToDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tekiyoKikanToDt), xgetCValueTekiyoKikanToDt(), "TEKIYO_KIKAN_TO_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTekiyoKikanToDt_NotLikeSearch(String tekiyoKikanToDt, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTekiyoKikanToDt_NotLikeSearch(tekiyoKikanToDt, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)}
     * @param tekiyoKikanToDt The value of tekiyoKikanToDt as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTekiyoKikanToDt_NotLikeSearch(String tekiyoKikanToDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tekiyoKikanToDt), xgetCValueTekiyoKikanToDt(), "TEKIYO_KIKAN_TO_DT", likeSearchOption);
    }

    protected void regTekiyoKikanToDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTekiyoKikanToDt(), "TEKIYO_KIKAN_TO_DT"); }
    protected abstract ConditionValue xgetCValueTekiyoKikanToDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param tesuryoSu The value of tesuryoSu as equal. (NullAllowed: if null, no condition)
     */
    public void setTesuryoSu_Equal(java.math.BigDecimal tesuryoSu) {
        doSetTesuryoSu_Equal(tesuryoSu);
    }

    protected void doSetTesuryoSu_Equal(java.math.BigDecimal tesuryoSu) {
        regTesuryoSu(CK_EQ, tesuryoSu);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param tesuryoSu The value of tesuryoSu as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTesuryoSu_NotEqual(java.math.BigDecimal tesuryoSu) {
        doSetTesuryoSu_NotEqual(tesuryoSu);
    }

    protected void doSetTesuryoSu_NotEqual(java.math.BigDecimal tesuryoSu) {
        regTesuryoSu(CK_NES, tesuryoSu);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param tesuryoSu The value of tesuryoSu as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTesuryoSu_GreaterThan(java.math.BigDecimal tesuryoSu) {
        regTesuryoSu(CK_GT, tesuryoSu);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param tesuryoSu The value of tesuryoSu as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTesuryoSu_LessThan(java.math.BigDecimal tesuryoSu) {
        regTesuryoSu(CK_LT, tesuryoSu);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param tesuryoSu The value of tesuryoSu as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTesuryoSu_GreaterEqual(java.math.BigDecimal tesuryoSu) {
        regTesuryoSu(CK_GE, tesuryoSu);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param tesuryoSu The value of tesuryoSu as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTesuryoSu_LessEqual(java.math.BigDecimal tesuryoSu) {
        regTesuryoSu(CK_LE, tesuryoSu);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param minNumber The min number of tesuryoSu. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of tesuryoSu. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTesuryoSu_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTesuryoSu_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param minNumber The min number of tesuryoSu. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of tesuryoSu. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTesuryoSu_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTesuryoSu(), "TESURYO_SU", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param tesuryoSuList The collection of tesuryoSu as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTesuryoSu_InScope(Collection<java.math.BigDecimal> tesuryoSuList) {
        doSetTesuryoSu_InScope(tesuryoSuList);
    }

    protected void doSetTesuryoSu_InScope(Collection<java.math.BigDecimal> tesuryoSuList) {
        regINS(CK_INS, cTL(tesuryoSuList), xgetCValueTesuryoSu(), "TESURYO_SU");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TESURYO_SU: {NotNull, DECIMAL(7, 1)}
     * @param tesuryoSuList The collection of tesuryoSu as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTesuryoSu_NotInScope(Collection<java.math.BigDecimal> tesuryoSuList) {
        doSetTesuryoSu_NotInScope(tesuryoSuList);
    }

    protected void doSetTesuryoSu_NotInScope(Collection<java.math.BigDecimal> tesuryoSuList) {
        regINS(CK_NINS, cTL(tesuryoSuList), xgetCValueTesuryoSu(), "TESURYO_SU");
    }

    protected void regTesuryoSu(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTesuryoSu(), "TESURYO_SU"); }
    protected abstract ConditionValue xgetCValueTesuryoSu();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb}
     * @param tesuryoKb The value of tesuryoKb as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTesuryoKb_Equal(String tesuryoKb) {
        doSetTesuryoKb_Equal(fRES(tesuryoKb));
    }

    /**
     * Equal(=). As TesuryoKb. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} <br>
     * 手数料区分(率、円)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setTesuryoKb_Equal_AsTesuryoKb(CDef.TesuryoKb cdef) {
        doSetTesuryoKb_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Percent (PCT). And OnlyOnceRegistered. <br>
     * Percent
     */
    public void setTesuryoKb_Equal_Percent() {
        setTesuryoKb_Equal_AsTesuryoKb(CDef.TesuryoKb.Percent);
    }

    /**
     * Equal(=). As Fixed (FIX). And OnlyOnceRegistered. <br>
     * Fixed
     */
    public void setTesuryoKb_Equal_Fixed() {
        setTesuryoKb_Equal_AsTesuryoKb(CDef.TesuryoKb.Fixed);
    }

    protected void doSetTesuryoKb_Equal(String tesuryoKb) {
        regTesuryoKb(CK_EQ, tesuryoKb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb}
     * @param tesuryoKb The value of tesuryoKb as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTesuryoKb_NotEqual(String tesuryoKb) {
        doSetTesuryoKb_NotEqual(fRES(tesuryoKb));
    }

    /**
     * NotEqual(&lt;&gt;). As TesuryoKb. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} <br>
     * 手数料区分(率、円)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setTesuryoKb_NotEqual_AsTesuryoKb(CDef.TesuryoKb cdef) {
        doSetTesuryoKb_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Percent (PCT). And OnlyOnceRegistered. <br>
     * Percent
     */
    public void setTesuryoKb_NotEqual_Percent() {
        setTesuryoKb_NotEqual_AsTesuryoKb(CDef.TesuryoKb.Percent);
    }

    /**
     * NotEqual(&lt;&gt;). As Fixed (FIX). And OnlyOnceRegistered. <br>
     * Fixed
     */
    public void setTesuryoKb_NotEqual_Fixed() {
        setTesuryoKb_NotEqual_AsTesuryoKb(CDef.TesuryoKb.Fixed);
    }

    protected void doSetTesuryoKb_NotEqual(String tesuryoKb) {
        regTesuryoKb(CK_NES, tesuryoKb);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb}
     * @param tesuryoKbList The collection of tesuryoKb as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTesuryoKb_InScope(Collection<String> tesuryoKbList) {
        doSetTesuryoKb_InScope(tesuryoKbList);
    }

    /**
     * InScope {in ('a', 'b')}. As TesuryoKb. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} <br>
     * 手数料区分(率、円)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setTesuryoKb_InScope_AsTesuryoKb(Collection<CDef.TesuryoKb> cdefList) {
        doSetTesuryoKb_InScope(cTStrL(cdefList));
    }

    protected void doSetTesuryoKb_InScope(Collection<String> tesuryoKbList) {
        regINS(CK_INS, cTL(tesuryoKbList), xgetCValueTesuryoKb(), "TESURYO_KB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb}
     * @param tesuryoKbList The collection of tesuryoKb as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTesuryoKb_NotInScope(Collection<String> tesuryoKbList) {
        doSetTesuryoKb_NotInScope(tesuryoKbList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TesuryoKb. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} <br>
     * 手数料区分(率、円)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setTesuryoKb_NotInScope_AsTesuryoKb(Collection<CDef.TesuryoKb> cdefList) {
        doSetTesuryoKb_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTesuryoKb_NotInScope(Collection<String> tesuryoKbList) {
        regINS(CK_NINS, cTL(tesuryoKbList), xgetCValueTesuryoKb(), "TESURYO_KB");
    }

    protected void regTesuryoKb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTesuryoKb(), "TESURYO_KB"); }
    protected abstract ConditionValue xgetCValueTesuryoKb();

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
    public HpSLCFunction<CmKishTesuryoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CmKishTesuryoCB.class);
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
    public HpSLCFunction<CmKishTesuryoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CmKishTesuryoCB.class);
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
    public HpSLCFunction<CmKishTesuryoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CmKishTesuryoCB.class);
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
    public HpSLCFunction<CmKishTesuryoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CmKishTesuryoCB.class);
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
    public HpSLCFunction<CmKishTesuryoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CmKishTesuryoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CmKishTesuryoCB&gt;() {
     *     public void query(CmKishTesuryoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmKishTesuryoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CmKishTesuryoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishTesuryoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CmKishTesuryoCQ sq);

    protected CmKishTesuryoCB xcreateScalarConditionCB() {
        CmKishTesuryoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CmKishTesuryoCB xcreateScalarConditionPartitionByCB() {
        CmKishTesuryoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CmKishTesuryoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishTesuryoCB cb = new CmKishTesuryoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CM_KISH_TESURYO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CmKishTesuryoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CmKishTesuryoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CmKishTesuryoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishTesuryoCB cb = new CmKishTesuryoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CM_KISH_TESURYO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CmKishTesuryoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CmKishTesuryoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmKishTesuryoCB cb = new CmKishTesuryoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CmKishTesuryoCQ sq);

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
    protected CmKishTesuryoCB newMyCB() {
        return new CmKishTesuryoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CmKishTesuryoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
