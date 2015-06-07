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
 * The condition-query for in-line of CM_RENRAKUSAKI_YOTO_KB.
 * @author DBFlute(AutoGenerator)
 */
public class CmRenrakusakiYotoKbCIQ extends AbstractBsCmRenrakusakiYotoKbCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsCmRenrakusakiYotoKbCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CmRenrakusakiYotoKbCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsCmRenrakusakiYotoKbCQ myCQ) {
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
    protected ConditionValue xgetCValueKbVal() { return _myCQ.xdfgetKbVal(); }
    protected ConditionValue xgetCValueKbMei() { return _myCQ.xdfgetKbMei(); }
    protected ConditionValue xgetCValueKbMeiEn() { return _myCQ.xdfgetKbMeiEn(); }
    protected ConditionValue xgetCValueKbRem() { return _myCQ.xdfgetKbRem(); }
    protected ConditionValue xgetCValueRegUserId() { return _myCQ.xdfgetRegUserId(); }
    protected ConditionValue xgetCValueRegTm() { return _myCQ.xdfgetRegTm(); }
    protected ConditionValue xgetCValueRegFuncCd() { return _myCQ.xdfgetRegFuncCd(); }
    protected ConditionValue xgetCValueUpdUserId() { return _myCQ.xdfgetUpdUserId(); }
    protected ConditionValue xgetCValueUpdTm() { return _myCQ.xdfgetUpdTm(); }
    protected ConditionValue xgetCValueUpdFuncCd() { return _myCQ.xdfgetUpdFuncCd(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(CmRenrakusakiYotoKbCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(CmRenrakusakiYotoKbCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(CmRenrakusakiYotoKbCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(CmRenrakusakiYotoKbCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return CmRenrakusakiYotoKbCB.class.getName(); }
    protected String xinCQ() { return CmRenrakusakiYotoKbCQ.class.getName(); }
}
