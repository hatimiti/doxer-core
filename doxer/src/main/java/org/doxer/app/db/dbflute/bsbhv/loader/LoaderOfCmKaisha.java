package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The referrer loader of CM_KAISHA as TABLE. <br>
 * <pre>
 * [primary key]
 *     CM_KAISHA_ID
 *
 * [column]
 *     CM_KAISHA_ID, KAISHA_MEI, KAISHA_MEI_EN, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CM_KAISHA_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCmKaisha {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CmKaisha> _selectedList;
    protected BehaviorSelector _selector;
    protected CmKaishaBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCmKaisha ready(List<CmKaisha> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CmKaishaBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CmKaishaBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CmKaisha> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
