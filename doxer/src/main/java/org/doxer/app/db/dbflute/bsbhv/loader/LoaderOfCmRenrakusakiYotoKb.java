package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The referrer loader of CM_RENRAKUSAKI_YOTO_KB as TABLE. <br>
 * <pre>
 * [primary key]
 *     KB_VAL
 *
 * [column]
 *     KB_VAL, KB_MEI, KB_MEI_EN, KB_REM, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public class LoaderOfCmRenrakusakiYotoKb {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CmRenrakusakiYotoKb> _selectedList;
    protected BehaviorSelector _selector;
    protected CmRenrakusakiYotoKbBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCmRenrakusakiYotoKb ready(List<CmRenrakusakiYotoKb> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CmRenrakusakiYotoKbBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CmRenrakusakiYotoKbBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CmRenrakusakiYotoKb> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
