package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The referrer loader of CM_KISH_RENRAKUSAKI as TABLE. <br>
 * <pre>
 * [primary key]
 *     CM_KISH_RENRAKUSAKI_ID
 *
 * [column]
 *     CM_KISH_RENRAKUSAKI_ID, CM_KAISHA_ID, TEL_NO1, TEL_NO2, TEL_NO3, MAIL_ADDRESS, RENRAKUSAKI_YOTO_KB, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CM_KISH_RENRAKUSAKI_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CM_KAISHA
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     cmKaisha
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCmKishRenrakusaki {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CmKishRenrakusaki> _selectedList;
    protected BehaviorSelector _selector;
    protected CmKishRenrakusakiBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCmKishRenrakusaki ready(List<CmKishRenrakusaki> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CmKishRenrakusakiBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CmKishRenrakusakiBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCmKaisha _foreignCmKaishaLoader;
    public LoaderOfCmKaisha pulloutCmKaisha() {
        if (_foreignCmKaishaLoader == null)
        { _foreignCmKaishaLoader = new LoaderOfCmKaisha().ready(myBhv().pulloutCmKaisha(_selectedList), _selector); }
        return _foreignCmKaishaLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CmKishRenrakusaki> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
