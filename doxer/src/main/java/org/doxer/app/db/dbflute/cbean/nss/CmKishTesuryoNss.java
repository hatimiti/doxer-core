package org.doxer.app.db.dbflute.cbean.nss;

import org.doxer.app.db.dbflute.cbean.cq.CmKishTesuryoCQ;

/**
 * The nest select set-upper of CM_KISH_TESURYO.
 * @author DBFlute(AutoGenerator)
 */
public class CmKishTesuryoNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CmKishTesuryoCQ _query;
    public CmKishTesuryoNss(CmKishTesuryoCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * CM_KAISHA by my CM_KAISHA_ID, named 'cmKaisha'.
     */
    public void withCmKaisha() {
        _query.xdoNss(() -> _query.queryCmKaisha());
    }
    /**
     * With nested relation columns to select clause. <br>
     * CM_TESURYO_KB by my TESURYO_KB, named 'cmTesuryoKb'.
     */
    public void withCmTesuryoKb() {
        _query.xdoNss(() -> _query.queryCmTesuryoKb());
    }
}
