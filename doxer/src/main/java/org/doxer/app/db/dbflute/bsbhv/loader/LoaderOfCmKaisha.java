package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;
import org.doxer.app.db.dbflute.cbean.*;

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
 *     CM_KISH_TESURYO, CM_KISH_RENRAKUSAKI, CM_SHAIN
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     cmKishTesuryoList, cmKishRenrakusakiList, cmShainList
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
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CmKishTesuryo> _referrerCmKishTesuryo;

    /**
     * Load referrer of cmKishTesuryoList by the set-upper of referrer. <br>
     * CM_KISH_TESURYO by CM_KAISHA_ID, named 'cmKishTesuryoList'.
     * <pre>
     * <span style="color: #0000C0">cmKaishaBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cmKaishaList</span>, <span style="color: #553000">kaishaLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">kaishaLoader</span>.<span style="color: #CC4747">loadCmKishTesuryo</span>(<span style="color: #553000">tesuryoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tesuryoCB</span>.setupSelect...
     *         <span style="color: #553000">tesuryoCB</span>.query().set...
     *         <span style="color: #553000">tesuryoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tesuryoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tesuryoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CmKaisha cmKaisha : <span style="color: #553000">cmKaishaList</span>) {
     *     ... = cmKaisha.<span style="color: #CC4747">getCmKishTesuryoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCmKaishaId_InScope(pkList);
     * cb.query().addOrderBy_CmKaishaId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCmKishTesuryo> loadCmKishTesuryo(ReferrerConditionSetupper<CmKishTesuryoCB> refCBLambda) {
        myBhv().loadCmKishTesuryo(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCmKishTesuryo = refLs);
        return hd -> hd.handle(new LoaderOfCmKishTesuryo().ready(_referrerCmKishTesuryo, _selector));
    }

    protected List<CmKishRenrakusaki> _referrerCmKishRenrakusaki;

    /**
     * Load referrer of cmKishRenrakusakiList by the set-upper of referrer. <br>
     * CM_KISH_RENRAKUSAKI by CM_KAISHA_ID, named 'cmKishRenrakusakiList'.
     * <pre>
     * <span style="color: #0000C0">cmKaishaBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cmKaishaList</span>, <span style="color: #553000">kaishaLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">kaishaLoader</span>.<span style="color: #CC4747">loadCmKishRenrakusaki</span>(<span style="color: #553000">renrakusakiCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">renrakusakiCB</span>.setupSelect...
     *         <span style="color: #553000">renrakusakiCB</span>.query().set...
     *         <span style="color: #553000">renrakusakiCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">renrakusakiLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    renrakusakiLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CmKaisha cmKaisha : <span style="color: #553000">cmKaishaList</span>) {
     *     ... = cmKaisha.<span style="color: #CC4747">getCmKishRenrakusakiList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCmKaishaId_InScope(pkList);
     * cb.query().addOrderBy_CmKaishaId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCmKishRenrakusaki> loadCmKishRenrakusaki(ReferrerConditionSetupper<CmKishRenrakusakiCB> refCBLambda) {
        myBhv().loadCmKishRenrakusaki(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCmKishRenrakusaki = refLs);
        return hd -> hd.handle(new LoaderOfCmKishRenrakusaki().ready(_referrerCmKishRenrakusaki, _selector));
    }

    protected List<CmShain> _referrerCmShain;

    /**
     * Load referrer of cmShainList by the set-upper of referrer. <br>
     * CM_SHAIN by CM_KAISHA_ID, named 'cmShainList'.
     * <pre>
     * <span style="color: #0000C0">cmKaishaBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cmKaishaList</span>, <span style="color: #553000">kaishaLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">kaishaLoader</span>.<span style="color: #CC4747">loadCmShain</span>(<span style="color: #553000">shainCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shainCB</span>.setupSelect...
     *         <span style="color: #553000">shainCB</span>.query().set...
     *         <span style="color: #553000">shainCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shainLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shainLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CmKaisha cmKaisha : <span style="color: #553000">cmKaishaList</span>) {
     *     ... = cmKaisha.<span style="color: #CC4747">getCmShainList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCmKaishaId_InScope(pkList);
     * cb.query().addOrderBy_CmKaishaId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCmShain> loadCmShain(ReferrerConditionSetupper<CmShainCB> refCBLambda) {
        myBhv().loadCmShain(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCmShain = refLs);
        return hd -> hd.handle(new LoaderOfCmShain().ready(_referrerCmShain, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CmKaisha> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
