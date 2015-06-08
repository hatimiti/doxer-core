package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;
import org.doxer.app.db.dbflute.cbean.*;

/**
 * The referrer loader of CM_TESURYO_KB as TABLE. <br>
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
 *     CM_KISH_TESURYO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     cmKishTesuryoList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCmTesuryoKb {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CmTesuryoKb> _selectedList;
    protected BehaviorSelector _selector;
    protected CmTesuryoKbBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCmTesuryoKb ready(List<CmTesuryoKb> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CmTesuryoKbBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CmTesuryoKbBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CmKishTesuryo> _referrerCmKishTesuryo;

    /**
     * Load referrer of cmKishTesuryoList by the set-upper of referrer. <br>
     * CM_KISH_TESURYO by TESURYO_KB, named 'cmKishTesuryoList'.
     * <pre>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cmTesuryoKbList</span>, <span style="color: #553000">kbLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">kbLoader</span>.<span style="color: #CC4747">loadCmKishTesuryo</span>(<span style="color: #553000">tesuryoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tesuryoCB</span>.setupSelect...
     *         <span style="color: #553000">tesuryoCB</span>.query().set...
     *         <span style="color: #553000">tesuryoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tesuryoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tesuryoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CmTesuryoKb cmTesuryoKb : <span style="color: #553000">cmTesuryoKbList</span>) {
     *     ... = cmTesuryoKb.<span style="color: #CC4747">getCmKishTesuryoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTesuryoKb_InScope(pkList);
     * cb.query().addOrderBy_TesuryoKb_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCmKishTesuryo> loadCmKishTesuryo(ReferrerConditionSetupper<CmKishTesuryoCB> refCBLambda) {
        myBhv().loadCmKishTesuryo(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCmKishTesuryo = refLs);
        return hd -> hd.handle(new LoaderOfCmKishTesuryo().ready(_referrerCmKishTesuryo, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CmTesuryoKb> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
