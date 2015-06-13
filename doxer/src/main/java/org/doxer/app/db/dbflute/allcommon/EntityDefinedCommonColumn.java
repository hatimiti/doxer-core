package org.doxer.app.db.dbflute.allcommon;

import org.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of regUserId.
     * @return The instance of the property type. (NullAllowed)
     */
    String getRegUserId();

    /**
     * Set the value of regUserId.
     * @param regUserId The instance of the property type. (NullAllowed)
     */
    void setRegUserId(String regUserId);

    /**
     * Get the value of regTm.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getRegTm();

    /**
     * Set the value of regTm.
     * @param regTm The instance of the property type. (NullAllowed)
     */
    void setRegTm(java.time.LocalDateTime regTm);

    /**
     * Get the value of regFuncCd.
     * @return The instance of the property type. (NullAllowed)
     */
    String getRegFuncCd();

    /**
     * Set the value of regFuncCd.
     * @param regFuncCd The instance of the property type. (NullAllowed)
     */
    void setRegFuncCd(String regFuncCd);

    /**
     * Get the value of updUserId.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUpdUserId();

    /**
     * Set the value of updUserId.
     * @param updUserId The instance of the property type. (NullAllowed)
     */
    void setUpdUserId(String updUserId);

    /**
     * Get the value of updTm.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getUpdTm();

    /**
     * Set the value of updTm.
     * @param updTm The instance of the property type. (NullAllowed)
     */
    void setUpdTm(java.time.LocalDateTime updTm);

    /**
     * Get the value of updFuncCd.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUpdFuncCd();

    /**
     * Set the value of updFuncCd.
     * @param updFuncCd The instance of the property type. (NullAllowed)
     */
    void setUpdFuncCd(String updFuncCd);

    /**
     * Get the value of versionNo.
     * @return The instance of the property type. (NullAllowed)
     */
    Integer getVersionNo();

    /**
     * Set the value of versionNo.
     * @param versionNo The instance of the property type. (NullAllowed)
     */
    void setVersionNo(Integer versionNo);
}
