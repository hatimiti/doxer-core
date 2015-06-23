package org.doxer.app.db.dbflute.cbean.nss;

import org.doxer.app.db.dbflute.cbean.cq.CmShainCQ;

/**
 * The nest select set-upper of CM_SHAIN.
 * @author DBFlute(AutoGenerator)
 */
public class CmShainNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CmShainCQ _query;
    public CmShainNss(CmShainCQ query) { _query = query; }
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
}
