package org.doxer.app.db.dbflute.allcommon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.dbflute.Entity;
import org.dbflute.hook.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class ImplementedCommonColumnAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(ImplementedCommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /** {@inheritDoc} */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final EntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }
        doHandleCommonColumnOfInsertIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfInsertIfNeeds(EntityDefinedCommonColumn entity) {
        final String regUserId = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setRegUserId(regUserId);
        final java.time.LocalDateTime regTm = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setRegTm(regTm);
        final String regFuncCd = org.dbflute.hook.AccessContext.getAccessProcessOnThread();
        entity.setRegFuncCd(regFuncCd);
        final String updUserId = entity.getRegUserId();
        entity.setUpdUserId(updUserId);
        final java.time.LocalDateTime updTm = entity.getRegTm();
        entity.setUpdTm(updTm);
        final String updFuncCd = entity.getRegFuncCd();
        entity.setUpdFuncCd(updFuncCd);
        final Integer versionNo = 1;
        entity.setVersionNo(versionNo);
    }

    /** {@inheritDoc} */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final EntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }
        doHandleCommonColumnOfUpdateIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfUpdateIfNeeds(EntityDefinedCommonColumn entity) {
        final String updUserId = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setUpdUserId(updUserId);
        final java.time.LocalDateTime updTm = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setUpdTm(updTm);
        final String updFuncCd = org.dbflute.hook.AccessContext.getAccessProcessOnThread();
        entity.setUpdFuncCd(updFuncCd);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected EntityDefinedCommonColumn askIfEntitySetup(Entity targetEntity) {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        return downcastEntity(targetEntity);
    }

    protected boolean hasCommonColumn(Entity targetEntity) {
        return targetEntity instanceof EntityDefinedCommonColumn;
    }

    protected EntityDefinedCommonColumn downcastEntity(Entity targetEntity) {
        return (EntityDefinedCommonColumn)targetEntity;
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected boolean isInternalDebugEnabled() {
        return DBFluteConfig.getInstance().isInternalDebug() && _log.isDebugEnabled();
    }

    protected void logSettingUp(EntityDefinedCommonColumn entity, String keyword) {
        _log.debug("...Setting up column columns of " + entity.asTableDbName() + " before " + keyword);
    }
}
