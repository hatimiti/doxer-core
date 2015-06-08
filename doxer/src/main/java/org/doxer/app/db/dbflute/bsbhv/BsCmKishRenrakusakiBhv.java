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
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.bsbhv.loader.*;
import org.doxer.app.db.dbflute.exentity.*;
import org.doxer.app.db.dbflute.bsentity.dbmeta.*;
import org.doxer.app.db.dbflute.cbean.*;

/**
 * The behavior of CM_KISH_RENRAKUSAKI as TABLE. <br>
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
public abstract class BsCmKishRenrakusakiBhv extends AbstractBehaviorWritable<CmKishRenrakusaki, CmKishRenrakusakiCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public CmKishRenrakusakiDbm asDBMeta() { return CmKishRenrakusakiDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "CM_KISH_RENRAKUSAKI"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public CmKishRenrakusakiCB newConditionBean() { return new CmKishRenrakusakiCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<CmKishRenrakusakiCB> cbLambda) {
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
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">cmKishRenrakusaki</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">cmKishRenrakusaki</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">cmKishRenrakusaki</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">cmKishRenrakusaki</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<CmKishRenrakusaki> selectEntity(CBCall<CmKishRenrakusakiCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<CmKishRenrakusaki> facadeSelectEntity(CmKishRenrakusakiCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends CmKishRenrakusaki> OptionalEntity<ENTITY> doSelectOptionalEntity(CmKishRenrakusakiCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * CmKishRenrakusaki <span style="color: #553000">cmKishRenrakusaki</span> = <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">cmKishRenrakusaki</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public CmKishRenrakusaki selectEntityWithDeletedCheck(CBCall<CmKishRenrakusakiCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param cmKishRenrakusakiId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<CmKishRenrakusaki> selectByPK(Long cmKishRenrakusakiId) {
        return facadeSelectByPK(cmKishRenrakusakiId);
    }

    protected OptionalEntity<CmKishRenrakusaki> facadeSelectByPK(Long cmKishRenrakusakiId) {
        return doSelectOptionalByPK(cmKishRenrakusakiId, typeOfSelectedEntity());
    }

    protected <ENTITY extends CmKishRenrakusaki> ENTITY doSelectByPK(Long cmKishRenrakusakiId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(cmKishRenrakusakiId), tp);
    }

    protected <ENTITY extends CmKishRenrakusaki> OptionalEntity<ENTITY> doSelectOptionalByPK(Long cmKishRenrakusakiId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(cmKishRenrakusakiId, tp), cmKishRenrakusakiId);
    }

    protected CmKishRenrakusakiCB xprepareCBAsPK(Long cmKishRenrakusakiId) {
        assertObjectNotNull("cmKishRenrakusakiId", cmKishRenrakusakiId);
        return newConditionBean().acceptPK(cmKishRenrakusakiId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;CmKishRenrakusaki&gt; <span style="color: #553000">cmKishRenrakusakiList</span> = <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (CmKishRenrakusaki <span style="color: #553000">cmKishRenrakusaki</span> : <span style="color: #553000">cmKishRenrakusakiList</span>) {
     *     ... = <span style="color: #553000">cmKishRenrakusaki</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<CmKishRenrakusaki> selectList(CBCall<CmKishRenrakusakiCB> cbLambda) {
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
     * PagingResultBean&lt;CmKishRenrakusaki&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (CmKishRenrakusaki cmKishRenrakusaki : <span style="color: #553000">page</span>) {
     *     ... = cmKishRenrakusaki.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<CmKishRenrakusaki> selectPage(CBCall<CmKishRenrakusakiCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @param entityLambda The handler of entity row of CmKishRenrakusaki. (NotNull)
     */
    public void selectCursor(CBCall<CmKishRenrakusakiCB> cbLambda, EntityRowHandler<CmKishRenrakusaki> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<CmKishRenrakusakiCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param cmKishRenrakusakiList The entity list of cmKishRenrakusaki. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<CmKishRenrakusaki> cmKishRenrakusakiList, ReferrerLoaderHandler<LoaderOfCmKishRenrakusaki> loaderLambda) {
        xassLRArg(cmKishRenrakusakiList, loaderLambda);
        loaderLambda.handle(new LoaderOfCmKishRenrakusaki().ready(cmKishRenrakusakiList, _behaviorSelector));
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
     * @param cmKishRenrakusaki The entity of cmKishRenrakusaki. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(CmKishRenrakusaki cmKishRenrakusaki, ReferrerLoaderHandler<LoaderOfCmKishRenrakusaki> loaderLambda) {
        xassLRArg(cmKishRenrakusaki, loaderLambda);
        loaderLambda.handle(new LoaderOfCmKishRenrakusaki().ready(xnewLRAryLs(cmKishRenrakusaki), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'CmKaisha'.
     * @param cmKishRenrakusakiList The list of cmKishRenrakusaki. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<CmKaisha> pulloutCmKaisha(List<CmKishRenrakusaki> cmKishRenrakusakiList)
    { return helpPulloutInternally(cmKishRenrakusakiList, "cmKaisha"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key cmKishRenrakusakiId.
     * @param cmKishRenrakusakiList The list of cmKishRenrakusaki. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCmKishRenrakusakiIdList(List<CmKishRenrakusaki> cmKishRenrakusakiList)
    { return helpExtractListInternally(cmKishRenrakusakiList, "cmKishRenrakusakiId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * cmKishRenrakusaki.setFoo...(value);
     * cmKishRenrakusaki.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.set...;</span>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">insert</span>(cmKishRenrakusaki);
     * ... = cmKishRenrakusaki.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param cmKishRenrakusaki The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(CmKishRenrakusaki cmKishRenrakusaki) {
        doInsert(cmKishRenrakusaki, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * cmKishRenrakusaki.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cmKishRenrakusaki.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cmKishRenrakusaki.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">update</span>(cmKishRenrakusaki);
     * </pre>
     * @param cmKishRenrakusaki The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(CmKishRenrakusaki cmKishRenrakusaki) {
        doUpdate(cmKishRenrakusaki, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * cmKishRenrakusaki.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cmKishRenrakusaki.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(cmKishRenrakusaki);
     * </pre>
     * @param cmKishRenrakusaki The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(CmKishRenrakusaki cmKishRenrakusaki) {
        doUpdateNonstrict(cmKishRenrakusaki, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param cmKishRenrakusaki The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(CmKishRenrakusaki cmKishRenrakusaki) {
        doInsertOrUpdate(cmKishRenrakusaki, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param cmKishRenrakusaki The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(CmKishRenrakusaki cmKishRenrakusaki) {
        doInsertOrUpdateNonstrict(cmKishRenrakusaki, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * cmKishRenrakusaki.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cmKishRenrakusaki.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">delete</span>(cmKishRenrakusaki);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param cmKishRenrakusaki The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(CmKishRenrakusaki cmKishRenrakusaki) {
        doDelete(cmKishRenrakusaki, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * cmKishRenrakusaki.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(cmKishRenrakusaki);
     * </pre>
     * @param cmKishRenrakusaki The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(CmKishRenrakusaki cmKishRenrakusaki) {
        doDeleteNonstrict(cmKishRenrakusaki, null);
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
     *     CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     *     cmKishRenrakusaki.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cmKishRenrakusaki.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     cmKishRenrakusakiList.add(cmKishRenrakusaki);
     * }
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">batchInsert</span>(cmKishRenrakusakiList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<CmKishRenrakusaki> cmKishRenrakusakiList) {
        return doBatchInsert(cmKishRenrakusakiList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     *     cmKishRenrakusaki.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cmKishRenrakusaki.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         cmKishRenrakusaki.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//cmKishRenrakusaki.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     cmKishRenrakusakiList.add(cmKishRenrakusaki);
     * }
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">batchUpdate</span>(cmKishRenrakusakiList);
     * </pre>
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<CmKishRenrakusaki> cmKishRenrakusakiList) {
        return doBatchUpdate(cmKishRenrakusakiList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     *     cmKishRenrakusaki.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cmKishRenrakusaki.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         cmKishRenrakusaki.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//cmKishRenrakusaki.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     cmKishRenrakusakiList.add(cmKishRenrakusaki);
     * }
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">batchUpdate</span>(cmKishRenrakusakiList);
     * </pre>
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<CmKishRenrakusaki> cmKishRenrakusakiList) {
        return doBatchUpdateNonstrict(cmKishRenrakusakiList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<CmKishRenrakusaki> cmKishRenrakusakiList) {
        return doBatchDelete(cmKishRenrakusakiList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<CmKishRenrakusaki> cmKishRenrakusakiList) {
        return doBatchDeleteNonstrict(cmKishRenrakusakiList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;CmKishRenrakusaki, CmKishRenrakusakiCB&gt;() {
     *     public ConditionBean setup(CmKishRenrakusaki entity, CmKishRenrakusakiCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<CmKishRenrakusaki, CmKishRenrakusakiCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setPK...(value);</span>
     * cmKishRenrakusaki.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">queryUpdate</span>(cmKishRenrakusaki, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cmKishRenrakusaki The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(CmKishRenrakusaki cmKishRenrakusaki, CBCall<CmKishRenrakusakiCB> cbLambda) {
        return doQueryUpdate(cmKishRenrakusaki, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">queryDelete</span>(cmKishRenrakusaki, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<CmKishRenrakusakiCB> cbLambda) {
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
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * cmKishRenrakusaki.setFoo...(value);
     * cmKishRenrakusaki.setBar...(value);
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">varyingInsert</span>(cmKishRenrakusaki, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = cmKishRenrakusaki.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param cmKishRenrakusaki The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(CmKishRenrakusaki cmKishRenrakusaki, WritableOptionCall<CmKishRenrakusakiCB, InsertOption<CmKishRenrakusakiCB>> opLambda) {
        doInsert(cmKishRenrakusaki, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * cmKishRenrakusaki.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cmKishRenrakusaki.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cmKishRenrakusaki.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(cmKishRenrakusaki, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param cmKishRenrakusaki The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(CmKishRenrakusaki cmKishRenrakusaki, WritableOptionCall<CmKishRenrakusakiCB, UpdateOption<CmKishRenrakusakiCB>> opLambda) {
        doUpdate(cmKishRenrakusaki, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * cmKishRenrakusaki.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cmKishRenrakusaki.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(cmKishRenrakusaki, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param cmKishRenrakusaki The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(CmKishRenrakusaki cmKishRenrakusaki, WritableOptionCall<CmKishRenrakusakiCB, UpdateOption<CmKishRenrakusakiCB>> opLambda) {
        doUpdateNonstrict(cmKishRenrakusaki, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param cmKishRenrakusaki The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(CmKishRenrakusaki cmKishRenrakusaki, WritableOptionCall<CmKishRenrakusakiCB, InsertOption<CmKishRenrakusakiCB>> insertOpLambda, WritableOptionCall<CmKishRenrakusakiCB, UpdateOption<CmKishRenrakusakiCB>> updateOpLambda) {
        doInsertOrUpdate(cmKishRenrakusaki, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param cmKishRenrakusaki The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(CmKishRenrakusaki cmKishRenrakusaki, WritableOptionCall<CmKishRenrakusakiCB, InsertOption<CmKishRenrakusakiCB>> insertOpLambda, WritableOptionCall<CmKishRenrakusakiCB, UpdateOption<CmKishRenrakusakiCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(cmKishRenrakusaki, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param cmKishRenrakusaki The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(CmKishRenrakusaki cmKishRenrakusaki, WritableOptionCall<CmKishRenrakusakiCB, DeleteOption<CmKishRenrakusakiCB>> opLambda) {
        doDelete(cmKishRenrakusaki, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param cmKishRenrakusaki The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(CmKishRenrakusaki cmKishRenrakusaki, WritableOptionCall<CmKishRenrakusakiCB, DeleteOption<CmKishRenrakusakiCB>> opLambda) {
        doDeleteNonstrict(cmKishRenrakusaki, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<CmKishRenrakusaki> cmKishRenrakusakiList, WritableOptionCall<CmKishRenrakusakiCB, InsertOption<CmKishRenrakusakiCB>> opLambda) {
        return doBatchInsert(cmKishRenrakusakiList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<CmKishRenrakusaki> cmKishRenrakusakiList, WritableOptionCall<CmKishRenrakusakiCB, UpdateOption<CmKishRenrakusakiCB>> opLambda) {
        return doBatchUpdate(cmKishRenrakusakiList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<CmKishRenrakusaki> cmKishRenrakusakiList, WritableOptionCall<CmKishRenrakusakiCB, UpdateOption<CmKishRenrakusakiCB>> opLambda) {
        return doBatchUpdateNonstrict(cmKishRenrakusakiList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<CmKishRenrakusaki> cmKishRenrakusakiList, WritableOptionCall<CmKishRenrakusakiCB, DeleteOption<CmKishRenrakusakiCB>> opLambda) {
        return doBatchDelete(cmKishRenrakusakiList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param cmKishRenrakusakiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<CmKishRenrakusaki> cmKishRenrakusakiList, WritableOptionCall<CmKishRenrakusakiCB, DeleteOption<CmKishRenrakusakiCB>> opLambda) {
        return doBatchDeleteNonstrict(cmKishRenrakusakiList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<CmKishRenrakusaki, CmKishRenrakusakiCB> manyArgLambda, WritableOptionCall<CmKishRenrakusakiCB, InsertOption<CmKishRenrakusakiCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * CmKishRenrakusaki cmKishRenrakusaki = <span style="color: #70226C">new</span> CmKishRenrakusaki();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setPK...(value);</span>
     * cmKishRenrakusaki.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cmKishRenrakusaki.setVersionNo(value);</span>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(cmKishRenrakusaki, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param cmKishRenrakusaki The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(CmKishRenrakusaki cmKishRenrakusaki, CBCall<CmKishRenrakusakiCB> cbLambda, WritableOptionCall<CmKishRenrakusakiCB, UpdateOption<CmKishRenrakusakiCB>> opLambda) {
        return doQueryUpdate(cmKishRenrakusaki, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">cmKishRenrakusakiBhv</span>.<span style="color: #CC4747">queryDelete</span>(cmKishRenrakusaki, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CmKishRenrakusaki. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<CmKishRenrakusakiCB> cbLambda, WritableOptionCall<CmKishRenrakusakiCB, DeleteOption<CmKishRenrakusakiCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * cmKishRenrakusakiBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * cmKishRenrakusakiBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * cmKishRenrakusakiBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * cmKishRenrakusakiBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * cmKishRenrakusakiBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * cmKishRenrakusakiBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * cmKishRenrakusakiBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * cmKishRenrakusakiBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * cmKishRenrakusakiBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * cmKishRenrakusakiBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * cmKishRenrakusakiBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * cmKishRenrakusakiBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * cmKishRenrakusakiBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * cmKishRenrakusakiBhv.outideSql().removeBlockComment().selectList()
     * cmKishRenrakusakiBhv.outideSql().removeLineComment().selectList()
     * cmKishRenrakusakiBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<CmKishRenrakusakiBhv> outsideSql() {
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
    protected Class<? extends CmKishRenrakusaki> typeOfSelectedEntity() { return CmKishRenrakusaki.class; }
    protected Class<CmKishRenrakusaki> typeOfHandlingEntity() { return CmKishRenrakusaki.class; }
    protected Class<CmKishRenrakusakiCB> typeOfHandlingConditionBean() { return CmKishRenrakusakiCB.class; }

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
