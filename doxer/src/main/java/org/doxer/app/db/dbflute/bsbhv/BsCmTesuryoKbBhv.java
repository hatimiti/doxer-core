package org.doxer.app.db.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.doxer.app.db.dbflute.allcommon.CDef;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.bsbhv.loader.*;
import org.doxer.app.db.dbflute.exentity.*;
import org.doxer.app.db.dbflute.bsentity.dbmeta.*;
import org.doxer.app.db.dbflute.cbean.*;

/**
 * The behavior of CM_TESURYO_KB as TABLE. <br>
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
public abstract class BsCmTesuryoKbBhv extends AbstractBehaviorWritable<CmTesuryoKb, CmTesuryoKbCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public CmTesuryoKbDbm asDBMeta() { return CmTesuryoKbDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "CM_TESURYO_KB"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public CmTesuryoKbCB newConditionBean() { return new CmTesuryoKbCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<CmTesuryoKbCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">cmTesuryoKb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">cmTesuryoKb</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">cmTesuryoKb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">cmTesuryoKb</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<CmTesuryoKb> selectEntity(CBCall<CmTesuryoKbCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<CmTesuryoKb> facadeSelectEntity(CmTesuryoKbCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends CmTesuryoKb> OptionalEntity<ENTITY> doSelectOptionalEntity(CmTesuryoKbCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * CmTesuryoKb <span style="color: #553000">cmTesuryoKb</span> = <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">cmTesuryoKb</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public CmTesuryoKb selectEntityWithDeletedCheck(CBCall<CmTesuryoKbCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param kbVal : PK, NotNull, CHAR(3), classification=TesuryoKb. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<CmTesuryoKb> selectByPK(CDef.TesuryoKb kbVal) {
        return facadeSelectByPK(kbVal);
    }

    protected OptionalEntity<CmTesuryoKb> facadeSelectByPK(CDef.TesuryoKb kbVal) {
        return doSelectOptionalByPK(kbVal, typeOfSelectedEntity());
    }

    protected <ENTITY extends CmTesuryoKb> ENTITY doSelectByPK(CDef.TesuryoKb kbVal, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(kbVal), tp);
    }

    protected <ENTITY extends CmTesuryoKb> OptionalEntity<ENTITY> doSelectOptionalByPK(CDef.TesuryoKb kbVal, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(kbVal, tp), kbVal);
    }

    protected CmTesuryoKbCB xprepareCBAsPK(CDef.TesuryoKb kbVal) {
        assertObjectNotNull("kbVal", kbVal);
        return newConditionBean().acceptPK(kbVal);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;CmTesuryoKb&gt; <span style="color: #553000">cmTesuryoKbList</span> = <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (CmTesuryoKb <span style="color: #553000">cmTesuryoKb</span> : <span style="color: #553000">cmTesuryoKbList</span>) {
     *     ... = <span style="color: #553000">cmTesuryoKb</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<CmTesuryoKb> selectList(CBCall<CmTesuryoKbCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;CmTesuryoKb&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (CmTesuryoKb cmTesuryoKb : <span style="color: #553000">page</span>) {
     *     ... = cmTesuryoKb.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<CmTesuryoKb> selectPage(CBCall<CmTesuryoKbCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @param entityLambda The handler of entity row of CmTesuryoKb. (NotNull)
     */
    public void selectCursor(CBCall<CmTesuryoKbCB> cbLambda, EntityRowHandler<CmTesuryoKb> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<CmTesuryoKbCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param cmTesuryoKbList The entity list of cmTesuryoKb. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<CmTesuryoKb> cmTesuryoKbList, ReferrerLoaderHandler<LoaderOfCmTesuryoKb> loaderLambda) {
        xassLRArg(cmTesuryoKbList, loaderLambda);
        loaderLambda.handle(new LoaderOfCmTesuryoKb().ready(cmTesuryoKbList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param cmTesuryoKb The entity of cmTesuryoKb. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(CmTesuryoKb cmTesuryoKb, ReferrerLoaderHandler<LoaderOfCmTesuryoKb> loaderLambda) {
        xassLRArg(cmTesuryoKb, loaderLambda);
        loaderLambda.handle(new LoaderOfCmTesuryoKb().ready(xnewLRAryLs(cmTesuryoKb), _behaviorSelector));
    }

    /**
     * Load referrer of cmKishTesuryoList by the set-upper of referrer. <br>
     * CM_KISH_TESURYO by TESURYO_KB, named 'cmKishTesuryoList'.
     * <pre>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">loadCmKishTesuryo</span>(<span style="color: #553000">cmTesuryoKbList</span>, <span style="color: #553000">tesuryoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tesuryoCB</span>.setupSelect...
     *     <span style="color: #553000">tesuryoCB</span>.query().set...
     *     <span style="color: #553000">tesuryoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (CmTesuryoKb cmTesuryoKb : <span style="color: #553000">cmTesuryoKbList</span>) {
     *     ... = cmTesuryoKb.<span style="color: #CC4747">getCmKishTesuryoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTesuryoKb_InScope(pkList);
     * cb.query().addOrderBy_TesuryoKb_Asc();
     * </pre>
     * @param cmTesuryoKbList The entity list of cmTesuryoKb. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<CmKishTesuryo> loadCmKishTesuryo(List<CmTesuryoKb> cmTesuryoKbList, ReferrerConditionSetupper<CmKishTesuryoCB> refCBLambda) {
        xassLRArg(cmTesuryoKbList, refCBLambda);
        return doLoadCmKishTesuryo(cmTesuryoKbList, new LoadReferrerOption<CmKishTesuryoCB, CmKishTesuryo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of cmKishTesuryoList by the set-upper of referrer. <br>
     * CM_KISH_TESURYO by TESURYO_KB, named 'cmKishTesuryoList'.
     * <pre>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">loadCmKishTesuryo</span>(<span style="color: #553000">cmTesuryoKb</span>, <span style="color: #553000">tesuryoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tesuryoCB</span>.setupSelect...
     *     <span style="color: #553000">tesuryoCB</span>.query().set...
     *     <span style="color: #553000">tesuryoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">cmTesuryoKb</span>.<span style="color: #CC4747">getCmKishTesuryoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTesuryoKb_InScope(pkList);
     * cb.query().addOrderBy_TesuryoKb_Asc();
     * </pre>
     * @param cmTesuryoKb The entity of cmTesuryoKb. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<CmKishTesuryo> loadCmKishTesuryo(CmTesuryoKb cmTesuryoKb, ReferrerConditionSetupper<CmKishTesuryoCB> refCBLambda) {
        xassLRArg(cmTesuryoKb, refCBLambda);
        return doLoadCmKishTesuryo(xnewLRLs(cmTesuryoKb), new LoadReferrerOption<CmKishTesuryoCB, CmKishTesuryo>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<CmKishTesuryo> doLoadCmKishTesuryo(List<CmTesuryoKb> cmTesuryoKbList, LoadReferrerOption<CmKishTesuryoCB, CmKishTesuryo> option) {
        return helpLoadReferrerInternally(cmTesuryoKbList, option, "cmKishTesuryoList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key kbVal.
     * @param cmTesuryoKbList The list of cmTesuryoKb. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractKbValList(List<CmTesuryoKb> cmTesuryoKbList)
    { return helpExtractListInternally(cmTesuryoKbList, "kbVal"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * cmTesuryoKb.setFoo...(value);
     * cmTesuryoKb.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.set...;</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">insert</span>(cmTesuryoKb);
     * ... = cmTesuryoKb.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param cmTesuryoKb The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(CmTesuryoKb cmTesuryoKb) {
        doInsert(cmTesuryoKb, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * cmTesuryoKb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cmTesuryoKb.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cmTesuryoKb.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">update</span>(cmTesuryoKb);
     * </pre>
     * @param cmTesuryoKb The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(CmTesuryoKb cmTesuryoKb) {
        doUpdate(cmTesuryoKb, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * cmTesuryoKb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cmTesuryoKb.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(cmTesuryoKb);
     * </pre>
     * @param cmTesuryoKb The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(CmTesuryoKb cmTesuryoKb) {
        doUpdateNonstrict(cmTesuryoKb, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param cmTesuryoKb The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(CmTesuryoKb cmTesuryoKb) {
        doInsertOrUpdate(cmTesuryoKb, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param cmTesuryoKb The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(CmTesuryoKb cmTesuryoKb) {
        doInsertOrUpdateNonstrict(cmTesuryoKb, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * cmTesuryoKb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cmTesuryoKb.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">delete</span>(cmTesuryoKb);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param cmTesuryoKb The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(CmTesuryoKb cmTesuryoKb) {
        doDelete(cmTesuryoKb, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * cmTesuryoKb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(cmTesuryoKb);
     * </pre>
     * @param cmTesuryoKb The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(CmTesuryoKb cmTesuryoKb) {
        doDeleteNonstrict(cmTesuryoKb, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     *     cmTesuryoKb.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cmTesuryoKb.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     cmTesuryoKbList.add(cmTesuryoKb);
     * }
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">batchInsert</span>(cmTesuryoKbList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<CmTesuryoKb> cmTesuryoKbList) {
        return doBatchInsert(cmTesuryoKbList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     *     cmTesuryoKb.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cmTesuryoKb.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         cmTesuryoKb.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//cmTesuryoKb.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     cmTesuryoKbList.add(cmTesuryoKb);
     * }
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">batchUpdate</span>(cmTesuryoKbList);
     * </pre>
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<CmTesuryoKb> cmTesuryoKbList) {
        return doBatchUpdate(cmTesuryoKbList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     *     cmTesuryoKb.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cmTesuryoKb.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         cmTesuryoKb.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//cmTesuryoKb.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     cmTesuryoKbList.add(cmTesuryoKb);
     * }
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">batchUpdate</span>(cmTesuryoKbList);
     * </pre>
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<CmTesuryoKb> cmTesuryoKbList) {
        return doBatchUpdateNonstrict(cmTesuryoKbList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<CmTesuryoKb> cmTesuryoKbList) {
        return doBatchDelete(cmTesuryoKbList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<CmTesuryoKb> cmTesuryoKbList) {
        return doBatchDeleteNonstrict(cmTesuryoKbList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;CmTesuryoKb, CmTesuryoKbCB&gt;() {
     *     public ConditionBean setup(CmTesuryoKb entity, CmTesuryoKbCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<CmTesuryoKb, CmTesuryoKbCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setPK...(value);</span>
     * cmTesuryoKb.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">queryUpdate</span>(cmTesuryoKb, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cmTesuryoKb The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(CmTesuryoKb cmTesuryoKb, CBCall<CmTesuryoKbCB> cbLambda) {
        return doQueryUpdate(cmTesuryoKb, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">queryDelete</span>(cmTesuryoKb, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<CmTesuryoKbCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * cmTesuryoKb.setFoo...(value);
     * cmTesuryoKb.setBar...(value);
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">varyingInsert</span>(cmTesuryoKb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = cmTesuryoKb.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param cmTesuryoKb The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(CmTesuryoKb cmTesuryoKb, WritableOptionCall<CmTesuryoKbCB, InsertOption<CmTesuryoKbCB>> opLambda) {
        doInsert(cmTesuryoKb, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * cmTesuryoKb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cmTesuryoKb.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cmTesuryoKb.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(cmTesuryoKb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param cmTesuryoKb The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(CmTesuryoKb cmTesuryoKb, WritableOptionCall<CmTesuryoKbCB, UpdateOption<CmTesuryoKbCB>> opLambda) {
        doUpdate(cmTesuryoKb, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * cmTesuryoKb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cmTesuryoKb.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(cmTesuryoKb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param cmTesuryoKb The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(CmTesuryoKb cmTesuryoKb, WritableOptionCall<CmTesuryoKbCB, UpdateOption<CmTesuryoKbCB>> opLambda) {
        doUpdateNonstrict(cmTesuryoKb, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param cmTesuryoKb The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(CmTesuryoKb cmTesuryoKb, WritableOptionCall<CmTesuryoKbCB, InsertOption<CmTesuryoKbCB>> insertOpLambda, WritableOptionCall<CmTesuryoKbCB, UpdateOption<CmTesuryoKbCB>> updateOpLambda) {
        doInsertOrUpdate(cmTesuryoKb, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param cmTesuryoKb The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(CmTesuryoKb cmTesuryoKb, WritableOptionCall<CmTesuryoKbCB, InsertOption<CmTesuryoKbCB>> insertOpLambda, WritableOptionCall<CmTesuryoKbCB, UpdateOption<CmTesuryoKbCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(cmTesuryoKb, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param cmTesuryoKb The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(CmTesuryoKb cmTesuryoKb, WritableOptionCall<CmTesuryoKbCB, DeleteOption<CmTesuryoKbCB>> opLambda) {
        doDelete(cmTesuryoKb, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param cmTesuryoKb The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(CmTesuryoKb cmTesuryoKb, WritableOptionCall<CmTesuryoKbCB, DeleteOption<CmTesuryoKbCB>> opLambda) {
        doDeleteNonstrict(cmTesuryoKb, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<CmTesuryoKb> cmTesuryoKbList, WritableOptionCall<CmTesuryoKbCB, InsertOption<CmTesuryoKbCB>> opLambda) {
        return doBatchInsert(cmTesuryoKbList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<CmTesuryoKb> cmTesuryoKbList, WritableOptionCall<CmTesuryoKbCB, UpdateOption<CmTesuryoKbCB>> opLambda) {
        return doBatchUpdate(cmTesuryoKbList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<CmTesuryoKb> cmTesuryoKbList, WritableOptionCall<CmTesuryoKbCB, UpdateOption<CmTesuryoKbCB>> opLambda) {
        return doBatchUpdateNonstrict(cmTesuryoKbList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<CmTesuryoKb> cmTesuryoKbList, WritableOptionCall<CmTesuryoKbCB, DeleteOption<CmTesuryoKbCB>> opLambda) {
        return doBatchDelete(cmTesuryoKbList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param cmTesuryoKbList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<CmTesuryoKb> cmTesuryoKbList, WritableOptionCall<CmTesuryoKbCB, DeleteOption<CmTesuryoKbCB>> opLambda) {
        return doBatchDeleteNonstrict(cmTesuryoKbList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<CmTesuryoKb, CmTesuryoKbCB> manyArgLambda, WritableOptionCall<CmTesuryoKbCB, InsertOption<CmTesuryoKbCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * CmTesuryoKb cmTesuryoKb = <span style="color: #70226C">new</span> CmTesuryoKb();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setPK...(value);</span>
     * cmTesuryoKb.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmTesuryoKb.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(cmTesuryoKb, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param cmTesuryoKb The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(CmTesuryoKb cmTesuryoKb, CBCall<CmTesuryoKbCB> cbLambda, WritableOptionCall<CmTesuryoKbCB, UpdateOption<CmTesuryoKbCB>> opLambda) {
        return doQueryUpdate(cmTesuryoKb, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">cmTesuryoKbBhv</span>.<span style="color: #CC4747">queryDelete</span>(cmTesuryoKb, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmTesuryoKb. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<CmTesuryoKbCB> cbLambda, WritableOptionCall<CmTesuryoKbCB, DeleteOption<CmTesuryoKbCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * cmTesuryoKbBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * cmTesuryoKbBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * cmTesuryoKbBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * cmTesuryoKbBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * cmTesuryoKbBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * cmTesuryoKbBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * cmTesuryoKbBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * cmTesuryoKbBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * cmTesuryoKbBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * cmTesuryoKbBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * cmTesuryoKbBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * cmTesuryoKbBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * cmTesuryoKbBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * cmTesuryoKbBhv.outideSql().removeBlockComment().selectList()
     * cmTesuryoKbBhv.outideSql().removeLineComment().selectList()
     * cmTesuryoKbBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<CmTesuryoKbBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends CmTesuryoKb> typeOfSelectedEntity() { return CmTesuryoKb.class; }
    protected Class<CmTesuryoKb> typeOfHandlingEntity() { return CmTesuryoKb.class; }
    protected Class<CmTesuryoKbCB> typeOfHandlingConditionBean() { return CmTesuryoKbCB.class; }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @Override
    @javax.annotation.Resource(name="behaviorCommandInvoker")
    public void setBehaviorCommandInvoker(BehaviorCommandInvoker behaviorCommandInvoker) {
        super.setBehaviorCommandInvoker(behaviorCommandInvoker);
    }

    @Override
    @javax.annotation.Resource(name="behaviorSelector")
    public void setBehaviorSelector(BehaviorSelector behaviorSelector) {
        super.setBehaviorSelector(behaviorSelector);
    }

    @Override
    @javax.annotation.Resource(name="commonColumnAutoSetupper")
    public void setCommonColumnAutoSetupper(CommonColumnAutoSetupper commonColumnAutoSetupper) {
        super.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
    }
}
