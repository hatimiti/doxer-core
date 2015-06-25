package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The referrer loader of CM_SHAIN as TABLE. <br>
 * <pre>
 * [primary key]
 *     CM_SHAIN_ID
 *
 * [column]
 *     CM_SHAIN_ID, CM_KAISHA_ID, SHAIN_SEI, SHAIN_MEI, SHAIN_SEI_EN, SHAIN_MEI_EN, LOGIN_CD, PASSWORD, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CM_SHAIN_ID
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
public class LoaderOfCmShain {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CmShain> _selectedList;
    protected BehaviorSelector _selector;
    protected CmShainBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCmShain ready(List<CmShain> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CmShainBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CmShainBhv.class); return _myBhv; } }

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
    public List<CmShain> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
