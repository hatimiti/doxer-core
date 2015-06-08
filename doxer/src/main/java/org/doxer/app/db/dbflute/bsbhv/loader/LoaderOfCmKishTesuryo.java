package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The referrer loader of CM_KISH_TESURYO as TABLE. <br>
 * <pre>
 * [primary key]
 *     CM_KISH_TESURYO_ID
 *
 * [column]
 *     CM_KISH_TESURYO_ID, CM_KAISHA_ID, TEKIYO_KIKAN_FROM_DT, TEKIYO_KIKAN_TO_DT, TESURYO_SU, TESURYO_KB, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CM_KISH_TESURYO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CM_KAISHA, CM_TESURYO_KB
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     cmKaisha, cmTesuryoKb
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCmKishTesuryo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CmKishTesuryo> _selectedList;
    protected BehaviorSelector _selector;
    protected CmKishTesuryoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCmKishTesuryo ready(List<CmKishTesuryo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CmKishTesuryoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CmKishTesuryoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCmKaisha _foreignCmKaishaLoader;
    public LoaderOfCmKaisha pulloutCmKaisha() {
        if (_foreignCmKaishaLoader == null)
        { _foreignCmKaishaLoader = new LoaderOfCmKaisha().ready(myBhv().pulloutCmKaisha(_selectedList), _selector); }
        return _foreignCmKaishaLoader;
    }

    protected LoaderOfCmTesuryoKb _foreignCmTesuryoKbLoader;
    public LoaderOfCmTesuryoKb pulloutCmTesuryoKb() {
        if (_foreignCmTesuryoKbLoader == null)
        { _foreignCmTesuryoKbLoader = new LoaderOfCmTesuryoKb().ready(myBhv().pulloutCmTesuryoKb(_selectedList), _selector); }
        return _foreignCmTesuryoKbLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CmKishTesuryo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
