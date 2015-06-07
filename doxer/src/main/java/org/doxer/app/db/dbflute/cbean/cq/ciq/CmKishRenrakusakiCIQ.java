package org.doxer.app.db.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.bs.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of CM_KISH_RENRAKUSAKI.
 * @author DBFlute(AutoGenerator)
 */
public class CmKishRenrakusakiCIQ extends AbstractBsCmKishRenrakusakiCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsCmKishRenrakusakiCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CmKishRenrakusakiCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsCmKishRenrakusakiCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueCmKishRenrakusakiId() { return _myCQ.xdfgetCmKishRenrakusakiId(); }
    protected ConditionValue xgetCValueCmKaishaId() { return _myCQ.xdfgetCmKaishaId(); }
    protected ConditionValue xgetCValueTelNo1() { return _myCQ.xdfgetTelNo1(); }
    protected ConditionValue xgetCValueTelNo2() { return _myCQ.xdfgetTelNo2(); }
    protected ConditionValue xgetCValueTelNo3() { return _myCQ.xdfgetTelNo3(); }
    protected ConditionValue xgetCValueMailAddress() { return _myCQ.xdfgetMailAddress(); }
    protected ConditionValue xgetCValueRenrakusakiYotoKb() { return _myCQ.xdfgetRenrakusakiYotoKb(); }
    protected ConditionValue xgetCValueRegUserId() { return _myCQ.xdfgetRegUserId(); }
    protected ConditionValue xgetCValueRegTm() { return _myCQ.xdfgetRegTm(); }
    protected ConditionValue xgetCValueRegFuncCd() { return _myCQ.xdfgetRegFuncCd(); }
    protected ConditionValue xgetCValueUpdUserId() { return _myCQ.xdfgetUpdUserId(); }
    protected ConditionValue xgetCValueUpdTm() { return _myCQ.xdfgetUpdTm(); }
    protected ConditionValue xgetCValueUpdFuncCd() { return _myCQ.xdfgetUpdFuncCd(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(CmKishRenrakusakiCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(CmKishRenrakusakiCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(CmKishRenrakusakiCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(CmKishRenrakusakiCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return CmKishRenrakusakiCB.class.getName(); }
    protected String xinCQ() { return CmKishRenrakusakiCQ.class.getName(); }
}
