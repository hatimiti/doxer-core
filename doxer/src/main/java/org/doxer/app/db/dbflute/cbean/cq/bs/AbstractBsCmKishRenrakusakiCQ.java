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
 * The abstract condition-query of CM_KISH_RENRAKUSAKI.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCmKishRenrakusakiCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCmKishRenrakusakiCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CM_KISH_RENRAKUSAKI";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishRenrakusakiId The value of cmKishRenrakusakiId as equal. (NullAllowed: if null, no condition)
     */
    public void setCmKishRenrakusakiId_Equal(Long cmKishRenrakusakiId) {
        doSetCmKishRenrakusakiId_Equal(cmKishRenrakusakiId);
    }

    protected void doSetCmKishRenrakusakiId_Equal(Long cmKishRenrakusakiId) {
        regCmKishRenrakusakiId(CK_EQ, cmKishRenrakusakiId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishRenrakusakiId The value of cmKishRenrakusakiId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKishRenrakusakiId_NotEqual(Long cmKishRenrakusakiId) {
        doSetCmKishRenrakusakiId_NotEqual(cmKishRenrakusakiId);
    }

    protected void doSetCmKishRenrakusakiId_NotEqual(Long cmKishRenrakusakiId) {
        regCmKishRenrakusakiId(CK_NES, cmKishRenrakusakiId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishRenrakusakiId The value of cmKishRenrakusakiId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCmKishRenrakusakiId_GreaterThan(Long cmKishRenrakusakiId) {
        regCmKishRenrakusakiId(CK_GT, cmKishRenrakusakiId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishRenrakusakiId The value of cmKishRenrakusakiId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCmKishRenrakusakiId_LessThan(Long cmKishRenrakusakiId) {
        regCmKishRenrakusakiId(CK_LT, cmKishRenrakusakiId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishRenrakusakiId The value of cmKishRenrakusakiId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKishRenrakusakiId_GreaterEqual(Long cmKishRenrakusakiId) {
        regCmKishRenrakusakiId(CK_GE, cmKishRenrakusakiId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishRenrakusakiId The value of cmKishRenrakusakiId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKishRenrakusakiId_LessEqual(Long cmKishRenrakusakiId) {
        regCmKishRenrakusakiId(CK_LE, cmKishRenrakusakiId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cmKishRenrakusakiId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cmKishRenrakusakiId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCmKishRenrakusakiId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCmKishRenrakusakiId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cmKishRenrakusakiId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cmKishRenrakusakiId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCmKishRenrakusakiId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCmKishRenrakusakiId(), "CM_KISH_RENRAKUSAKI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishRenrakusakiIdList The collection of cmKishRenrakusakiId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCmKishRenrakusakiId_InScope(Collection<Long> cmKishRenrakusakiIdList) {
        doSetCmKishRenrakusakiId_InScope(cmKishRenrakusakiIdList);
    }

    protected void doSetCmKishRenrakusakiId_InScope(Collection<Long> cmKishRenrakusakiIdList) {
        regINS(CK_INS, cTL(cmKishRenrakusakiIdList), xgetCValueCmKishRenrakusakiId(), "CM_KISH_RENRAKUSAKI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmKishRenrakusakiIdList The collection of cmKishRenrakusakiId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCmKishRenrakusakiId_NotInScope(Collection<Long> cmKishRenrakusakiIdList) {
        doSetCmKishRenrakusakiId_NotInScope(cmKishRenrakusakiIdList);
    }

    protected void doSetCmKishRenrakusakiId_NotInScope(Collection<Long> cmKishRenrakusakiIdList) {
        regINS(CK_NINS, cTL(cmKishRenrakusakiIdList), xgetCValueCmKishRenrakusakiId(), "CM_KISH_RENRAKUSAKI_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCmKishRenrakusakiId_IsNull() { regCmKishRenrakusakiId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCmKishRenrakusakiId_IsNotNull() { regCmKishRenrakusakiId(CK_ISNN, DOBJ); }

    protected void regCmKishRenrakusakiId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmKishRenrakusakiId(), "CM_KISH_RENRAKUSAKI_ID"); }
    protected abstract ConditionValue xgetCValueCmKishRenrakusakiId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
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
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
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
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_GreaterThan(Long cmKaishaId) {
        regCmKaishaId(CK_GT, cmKaishaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_LessThan(Long cmKaishaId) {
        regCmKaishaId(CK_LT, cmKaishaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_GreaterEqual(Long cmKaishaId) {
        regCmKaishaId(CK_GE, cmKaishaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCmKaishaId_LessEqual(Long cmKaishaId) {
        regCmKaishaId(CK_LE, cmKaishaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
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
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param minNumber The min number of cmKaishaId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cmKaishaId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCmKaishaId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCmKaishaId(), "CM_KAISHA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
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
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param telNo1 The value of telNo1 as equal. (NullAllowed: if null, no condition)
     */
    public void setTelNo1_Equal(Integer telNo1) {
        doSetTelNo1_Equal(telNo1);
    }

    protected void doSetTelNo1_Equal(Integer telNo1) {
        regTelNo1(CK_EQ, telNo1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param telNo1 The value of telNo1 as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo1_NotEqual(Integer telNo1) {
        doSetTelNo1_NotEqual(telNo1);
    }

    protected void doSetTelNo1_NotEqual(Integer telNo1) {
        regTelNo1(CK_NES, telNo1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param telNo1 The value of telNo1 as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTelNo1_GreaterThan(Integer telNo1) {
        regTelNo1(CK_GT, telNo1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param telNo1 The value of telNo1 as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTelNo1_LessThan(Integer telNo1) {
        regTelNo1(CK_LT, telNo1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param telNo1 The value of telNo1 as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo1_GreaterEqual(Integer telNo1) {
        regTelNo1(CK_GE, telNo1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param telNo1 The value of telNo1 as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo1_LessEqual(Integer telNo1) {
        regTelNo1(CK_LE, telNo1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param minNumber The min number of telNo1. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of telNo1. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTelNo1_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTelNo1_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param minNumber The min number of telNo1. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of telNo1. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTelNo1_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTelNo1(), "TEL_NO1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param telNo1List The collection of telNo1 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTelNo1_InScope(Collection<Integer> telNo1List) {
        doSetTelNo1_InScope(telNo1List);
    }

    protected void doSetTelNo1_InScope(Collection<Integer> telNo1List) {
        regINS(CK_INS, cTL(telNo1List), xgetCValueTelNo1(), "TEL_NO1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     * @param telNo1List The collection of telNo1 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTelNo1_NotInScope(Collection<Integer> telNo1List) {
        doSetTelNo1_NotInScope(telNo1List);
    }

    protected void doSetTelNo1_NotInScope(Collection<Integer> telNo1List) {
        regINS(CK_NINS, cTL(telNo1List), xgetCValueTelNo1(), "TEL_NO1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     */
    public void setTelNo1_IsNull() { regTelNo1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEL_NO1: {DECIMAL(5)}
     */
    public void setTelNo1_IsNotNull() { regTelNo1(CK_ISNN, DOBJ); }

    protected void regTelNo1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTelNo1(), "TEL_NO1"); }
    protected abstract ConditionValue xgetCValueTelNo1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param telNo2 The value of telNo2 as equal. (NullAllowed: if null, no condition)
     */
    public void setTelNo2_Equal(Integer telNo2) {
        doSetTelNo2_Equal(telNo2);
    }

    protected void doSetTelNo2_Equal(Integer telNo2) {
        regTelNo2(CK_EQ, telNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param telNo2 The value of telNo2 as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo2_NotEqual(Integer telNo2) {
        doSetTelNo2_NotEqual(telNo2);
    }

    protected void doSetTelNo2_NotEqual(Integer telNo2) {
        regTelNo2(CK_NES, telNo2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param telNo2 The value of telNo2 as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTelNo2_GreaterThan(Integer telNo2) {
        regTelNo2(CK_GT, telNo2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param telNo2 The value of telNo2 as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTelNo2_LessThan(Integer telNo2) {
        regTelNo2(CK_LT, telNo2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param telNo2 The value of telNo2 as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo2_GreaterEqual(Integer telNo2) {
        regTelNo2(CK_GE, telNo2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param telNo2 The value of telNo2 as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo2_LessEqual(Integer telNo2) {
        regTelNo2(CK_LE, telNo2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param minNumber The min number of telNo2. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of telNo2. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTelNo2_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTelNo2_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param minNumber The min number of telNo2. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of telNo2. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTelNo2_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTelNo2(), "TEL_NO2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param telNo2List The collection of telNo2 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTelNo2_InScope(Collection<Integer> telNo2List) {
        doSetTelNo2_InScope(telNo2List);
    }

    protected void doSetTelNo2_InScope(Collection<Integer> telNo2List) {
        regINS(CK_INS, cTL(telNo2List), xgetCValueTelNo2(), "TEL_NO2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     * @param telNo2List The collection of telNo2 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTelNo2_NotInScope(Collection<Integer> telNo2List) {
        doSetTelNo2_NotInScope(telNo2List);
    }

    protected void doSetTelNo2_NotInScope(Collection<Integer> telNo2List) {
        regINS(CK_NINS, cTL(telNo2List), xgetCValueTelNo2(), "TEL_NO2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     */
    public void setTelNo2_IsNull() { regTelNo2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEL_NO2: {DECIMAL(5)}
     */
    public void setTelNo2_IsNotNull() { regTelNo2(CK_ISNN, DOBJ); }

    protected void regTelNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTelNo2(), "TEL_NO2"); }
    protected abstract ConditionValue xgetCValueTelNo2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param telNo3 The value of telNo3 as equal. (NullAllowed: if null, no condition)
     */
    public void setTelNo3_Equal(Integer telNo3) {
        doSetTelNo3_Equal(telNo3);
    }

    protected void doSetTelNo3_Equal(Integer telNo3) {
        regTelNo3(CK_EQ, telNo3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param telNo3 The value of telNo3 as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo3_NotEqual(Integer telNo3) {
        doSetTelNo3_NotEqual(telNo3);
    }

    protected void doSetTelNo3_NotEqual(Integer telNo3) {
        regTelNo3(CK_NES, telNo3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param telNo3 The value of telNo3 as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTelNo3_GreaterThan(Integer telNo3) {
        regTelNo3(CK_GT, telNo3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param telNo3 The value of telNo3 as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTelNo3_LessThan(Integer telNo3) {
        regTelNo3(CK_LT, telNo3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param telNo3 The value of telNo3 as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo3_GreaterEqual(Integer telNo3) {
        regTelNo3(CK_GE, telNo3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param telNo3 The value of telNo3 as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTelNo3_LessEqual(Integer telNo3) {
        regTelNo3(CK_LE, telNo3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param minNumber The min number of telNo3. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of telNo3. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTelNo3_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTelNo3_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param minNumber The min number of telNo3. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of telNo3. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTelNo3_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTelNo3(), "TEL_NO3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param telNo3List The collection of telNo3 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTelNo3_InScope(Collection<Integer> telNo3List) {
        doSetTelNo3_InScope(telNo3List);
    }

    protected void doSetTelNo3_InScope(Collection<Integer> telNo3List) {
        regINS(CK_INS, cTL(telNo3List), xgetCValueTelNo3(), "TEL_NO3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     * @param telNo3List The collection of telNo3 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTelNo3_NotInScope(Collection<Integer> telNo3List) {
        doSetTelNo3_NotInScope(telNo3List);
    }

    protected void doSetTelNo3_NotInScope(Collection<Integer> telNo3List) {
        regINS(CK_NINS, cTL(telNo3List), xgetCValueTelNo3(), "TEL_NO3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     */
    public void setTelNo3_IsNull() { regTelNo3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEL_NO3: {DECIMAL(5)}
     */
    public void setTelNo3_IsNotNull() { regTelNo3(CK_ISNN, DOBJ); }

    protected void regTelNo3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTelNo3(), "TEL_NO3"); }
    protected abstract ConditionValue xgetCValueTelNo3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddress The value of mailAddress as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_Equal(String mailAddress) {
        doSetMailAddress_Equal(fRES(mailAddress));
    }

    protected void doSetMailAddress_Equal(String mailAddress) {
        regMailAddress(CK_EQ, mailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddress The value of mailAddress as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_NotEqual(String mailAddress) {
        doSetMailAddress_NotEqual(fRES(mailAddress));
    }

    protected void doSetMailAddress_NotEqual(String mailAddress) {
        regMailAddress(CK_NES, mailAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddress The value of mailAddress as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_GreaterThan(String mailAddress) {
        regMailAddress(CK_GT, fRES(mailAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddress The value of mailAddress as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_LessThan(String mailAddress) {
        regMailAddress(CK_LT, fRES(mailAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddress The value of mailAddress as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_GreaterEqual(String mailAddress) {
        regMailAddress(CK_GE, fRES(mailAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddress The value of mailAddress as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_LessEqual(String mailAddress) {
        regMailAddress(CK_LE, fRES(mailAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddressList The collection of mailAddress as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_InScope(Collection<String> mailAddressList) {
        doSetMailAddress_InScope(mailAddressList);
    }

    protected void doSetMailAddress_InScope(Collection<String> mailAddressList) {
        regINS(CK_INS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddressList The collection of mailAddress as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_NotInScope(Collection<String> mailAddressList) {
        doSetMailAddress_NotInScope(mailAddressList);
    }

    protected void doSetMailAddress_NotInScope(Collection<String> mailAddressList) {
        regINS(CK_NINS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMailAddress_LikeSearch(String mailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMailAddress_LikeSearch(mailAddress, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMailAddress_LikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMailAddress_NotLikeSearch(String mailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMailAddress_NotLikeSearch(mailAddress, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMailAddress_NotLikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     */
    public void setMailAddress_IsNull() { regMailAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     */
    public void setMailAddress_IsNullOrEmpty() { regMailAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {VARCHAR(253)}
     */
    public void setMailAddress_IsNotNull() { regMailAddress(CK_ISNN, DOBJ); }

    protected void regMailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailAddress(), "MAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @param renrakusakiYotoKb The value of renrakusakiYotoKb as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setRenrakusakiYotoKb_Equal(String renrakusakiYotoKb) {
        doSetRenrakusakiYotoKb_Equal(fRES(renrakusakiYotoKb));
    }

    /**
     * Equal(=). As RenrakusakiYotoKb. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setRenrakusakiYotoKb_Equal_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb cdef) {
        doSetRenrakusakiYotoKb_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Normal (NRM). And OnlyOnceRegistered. <br>
     * Normal
     */
    public void setRenrakusakiYotoKb_Equal_Normal() {
        setRenrakusakiYotoKb_Equal_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Normal);
    }

    /**
     * Equal(=). As Emergency (EMG). And OnlyOnceRegistered. <br>
     * Emergency
     */
    public void setRenrakusakiYotoKb_Equal_Emergency() {
        setRenrakusakiYotoKb_Equal_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Emergency);
    }

    protected void doSetRenrakusakiYotoKb_Equal(String renrakusakiYotoKb) {
        regRenrakusakiYotoKb(CK_EQ, renrakusakiYotoKb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @param renrakusakiYotoKb The value of renrakusakiYotoKb as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setRenrakusakiYotoKb_NotEqual(String renrakusakiYotoKb) {
        doSetRenrakusakiYotoKb_NotEqual(fRES(renrakusakiYotoKb));
    }

    /**
     * NotEqual(&lt;&gt;). As RenrakusakiYotoKb. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setRenrakusakiYotoKb_NotEqual_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb cdef) {
        doSetRenrakusakiYotoKb_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Normal (NRM). And OnlyOnceRegistered. <br>
     * Normal
     */
    public void setRenrakusakiYotoKb_NotEqual_Normal() {
        setRenrakusakiYotoKb_NotEqual_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Normal);
    }

    /**
     * NotEqual(&lt;&gt;). As Emergency (EMG). And OnlyOnceRegistered. <br>
     * Emergency
     */
    public void setRenrakusakiYotoKb_NotEqual_Emergency() {
        setRenrakusakiYotoKb_NotEqual_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Emergency);
    }

    protected void doSetRenrakusakiYotoKb_NotEqual(String renrakusakiYotoKb) {
        regRenrakusakiYotoKb(CK_NES, renrakusakiYotoKb);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @param renrakusakiYotoKbList The collection of renrakusakiYotoKb as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRenrakusakiYotoKb_InScope(Collection<String> renrakusakiYotoKbList) {
        doSetRenrakusakiYotoKb_InScope(renrakusakiYotoKbList);
    }

    /**
     * InScope {in ('a', 'b')}. As RenrakusakiYotoKb. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setRenrakusakiYotoKb_InScope_AsRenrakusakiYotoKb(Collection<CDef.RenrakusakiYotoKb> cdefList) {
        doSetRenrakusakiYotoKb_InScope(cTStrL(cdefList));
    }

    protected void doSetRenrakusakiYotoKb_InScope(Collection<String> renrakusakiYotoKbList) {
        regINS(CK_INS, cTL(renrakusakiYotoKbList), xgetCValueRenrakusakiYotoKb(), "RENRAKUSAKI_YOTO_KB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @param renrakusakiYotoKbList The collection of renrakusakiYotoKb as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRenrakusakiYotoKb_NotInScope(Collection<String> renrakusakiYotoKbList) {
        doSetRenrakusakiYotoKb_NotInScope(renrakusakiYotoKbList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As RenrakusakiYotoKb. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setRenrakusakiYotoKb_NotInScope_AsRenrakusakiYotoKb(Collection<CDef.RenrakusakiYotoKb> cdefList) {
        doSetRenrakusakiYotoKb_NotInScope(cTStrL(cdefList));
    }

    protected void doSetRenrakusakiYotoKb_NotInScope(Collection<String> renrakusakiYotoKbList) {
        regINS(CK_NINS, cTL(renrakusakiYotoKbList), xgetCValueRenrakusakiYotoKb(), "RENRAKUSAKI_YOTO_KB");
    }

    protected void regRenrakusakiYotoKb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRenrakusakiYotoKb(), "RENRAKUSAKI_YOTO_KB"); }
    protected abstract ConditionValue xgetCValueRenrakusakiYotoKb();

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
    public HpSLCFunction<CmKishRenrakusakiCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CmKishRenrakusakiCB.class);
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
    public HpSLCFunction<CmKishRenrakusakiCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CmKishRenrakusakiCB.class);
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
    public HpSLCFunction<CmKishRenrakusakiCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CmKishRenrakusakiCB.class);
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
    public HpSLCFunction<CmKishRenrakusakiCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CmKishRenrakusakiCB.class);
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
    public HpSLCFunction<CmKishRenrakusakiCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CmKishRenrakusakiCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CmKishRenrakusakiCB&gt;() {
     *     public void query(CmKishRenrakusakiCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmKishRenrakusakiCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CmKishRenrakusakiCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishRenrakusakiCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CmKishRenrakusakiCQ sq);

    protected CmKishRenrakusakiCB xcreateScalarConditionCB() {
        CmKishRenrakusakiCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CmKishRenrakusakiCB xcreateScalarConditionPartitionByCB() {
        CmKishRenrakusakiCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CmKishRenrakusakiCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CM_KISH_RENRAKUSAKI_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CmKishRenrakusakiCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CmKishRenrakusakiCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CmKishRenrakusakiCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CM_KISH_RENRAKUSAKI_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CmKishRenrakusakiCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CmKishRenrakusakiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CmKishRenrakusakiCQ sq);

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
    protected CmKishRenrakusakiCB newMyCB() {
        return new CmKishRenrakusakiCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CmKishRenrakusakiCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
