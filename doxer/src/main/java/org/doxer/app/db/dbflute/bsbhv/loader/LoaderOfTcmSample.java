package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The referrer loader of TCM_SAMPLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TCM_SAMPLE_ID
 *
 * [column]
 *     TCM_SAMPLE_ID, SAMPLE_NAME, SAMPLE_NAME_EN
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TCM_SAMPLE_ID
 *
 * [version-no]
 *     
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
public class LoaderOfTcmSample {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TcmSample> _selectedList;
    protected BehaviorSelector _selector;
    protected TcmSampleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTcmSample ready(List<TcmSample> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TcmSampleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TcmSampleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TcmSample> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
