package org.doxer.app.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.doxer.app.db.dbflute.allcommon.EntityDefinedCommonColumn;
import org.doxer.app.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.doxer.app.db.dbflute.allcommon.CDef;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The entity of CM_KISH_TESURYO as TABLE. <br>
 * <pre>
 * [primary-key]
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
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long cmKishTesuryoId = entity.getCmKishTesuryoId();
 * Long cmKaishaId = entity.getCmKaishaId();
 * String tekiyoKikanFromDt = entity.getTekiyoKikanFromDt();
 * String tekiyoKikanToDt = entity.getTekiyoKikanToDt();
 * java.math.BigDecimal tesuryoSu = entity.getTesuryoSu();
 * String tesuryoKb = entity.getTesuryoKb();
 * String regUserId = entity.getRegUserId();
 * java.time.LocalDateTime regTm = entity.getRegTm();
 * String regFuncCd = entity.getRegFuncCd();
 * String updUserId = entity.getUpdUserId();
 * java.time.LocalDateTime updTm = entity.getUpdTm();
 * String updFuncCd = entity.getUpdFuncCd();
 * Integer versionNo = entity.getVersionNo();
 * entity.setCmKishTesuryoId(cmKishTesuryoId);
 * entity.setCmKaishaId(cmKaishaId);
 * entity.setTekiyoKikanFromDt(tekiyoKikanFromDt);
 * entity.setTekiyoKikanToDt(tekiyoKikanToDt);
 * entity.setTesuryoSu(tesuryoSu);
 * entity.setTesuryoKb(tesuryoKb);
 * entity.setRegUserId(regUserId);
 * entity.setRegTm(regTm);
 * entity.setRegFuncCd(regFuncCd);
 * entity.setUpdUserId(updUserId);
 * entity.setUpdTm(updTm);
 * entity.setUpdFuncCd(updFuncCd);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCmKishTesuryo extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _cmKishTesuryoId;

    /** CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha} */
    protected Long _cmKaishaId;

    /** TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)} */
    protected String _tekiyoKikanFromDt;

    /** TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)} */
    protected String _tekiyoKikanToDt;

    /** TESURYO_SU: {NotNull, DECIMAL(7, 1)} */
    protected java.math.BigDecimal _tesuryoSu;

    /** TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} */
    protected String _tesuryoKb;

    /** REG_USER_ID: {NotNull, VARCHAR(10)} */
    protected String _regUserId;

    /** REG_TM: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _regTm;

    /** REG_FUNC_CD: {NotNull, VARCHAR(9)} */
    protected String _regFuncCd;

    /** UPD_USER_ID: {NotNull, VARCHAR(10)} */
    protected String _updUserId;

    /** UPD_TM: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _updTm;

    /** UPD_FUNC_CD: {NotNull, VARCHAR(9)} */
    protected String _updFuncCd;

    /** VERSION_NO: {NotNull, DECIMAL(9)} */
    protected Integer _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "CM_KISH_TESURYO";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_cmKishTesuryoId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param cmKaishaId : UQ+, NotNull, BIGINT(19), FK to cm_kaisha. (NotNull)
     * @param tekiyoKikanFromDt : +UQ, NotNull, CHAR(8). (NotNull)
     */
    public void uniqueBy(Long cmKaishaId, String tekiyoKikanFromDt) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("cmKaishaId");
        __uniqueDrivenProperties.addPropertyName("tekiyoKikanFromDt");
        setCmKaishaId(cmKaishaId);setTekiyoKikanFromDt(tekiyoKikanFromDt);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of tesuryoKb as the classification of TesuryoKb. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} <br>
     * 手数料区分(率、円)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TesuryoKb getTesuryoKbAsTesuryoKb() {
        return CDef.TesuryoKb.codeOf(getTesuryoKb());
    }

    /**
     * Set the value of tesuryoKb as the classification of TesuryoKb. <br>
     * TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} <br>
     * 手数料区分(率、円)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTesuryoKbAsTesuryoKb(CDef.TesuryoKb cdef) {
        setTesuryoKb(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of tesuryoKb as Percent (PCT). <br>
     * Percent
     */
    public void setTesuryoKb_Percent() {
        setTesuryoKbAsTesuryoKb(CDef.TesuryoKb.Percent);
    }

    /**
     * Set the value of tesuryoKb as Fixed (FIX). <br>
     * Fixed
     */
    public void setTesuryoKb_Fixed() {
        setTesuryoKbAsTesuryoKb(CDef.TesuryoKb.Fixed);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of tesuryoKb Percent? <br>
     * Percent
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTesuryoKbPercent() {
        CDef.TesuryoKb cdef = getTesuryoKbAsTesuryoKb();
        return cdef != null ? cdef.equals(CDef.TesuryoKb.Percent) : false;
    }

    /**
     * Is the value of tesuryoKb Fixed? <br>
     * Fixed
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTesuryoKbFixed() {
        CDef.TesuryoKb cdef = getTesuryoKbAsTesuryoKb();
        return cdef != null ? cdef.equals(CDef.TesuryoKb.Fixed) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** CM_KAISHA by my CM_KAISHA_ID, named 'cmKaisha'. */
    protected OptionalEntity<CmKaisha> _cmKaisha;

    /**
     * [get] CM_KAISHA by my CM_KAISHA_ID, named 'cmKaisha'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'cmKaisha'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CmKaisha> getCmKaisha() {
        if (_cmKaisha == null) { _cmKaisha = OptionalEntity.relationEmpty(this, "cmKaisha"); }
        return _cmKaisha;
    }

    /**
     * [set] CM_KAISHA by my CM_KAISHA_ID, named 'cmKaisha'.
     * @param cmKaisha The entity of foreign property 'cmKaisha'. (NullAllowed)
     */
    public void setCmKaisha(OptionalEntity<CmKaisha> cmKaisha) {
        _cmKaisha = cmKaisha;
    }

    /** CM_TESURYO_KB by my TESURYO_KB, named 'cmTesuryoKb'. */
    protected OptionalEntity<CmTesuryoKb> _cmTesuryoKb;

    /**
     * [get] CM_TESURYO_KB by my TESURYO_KB, named 'cmTesuryoKb'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'cmTesuryoKb'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CmTesuryoKb> getCmTesuryoKb() {
        if (_cmTesuryoKb == null) { _cmTesuryoKb = OptionalEntity.relationEmpty(this, "cmTesuryoKb"); }
        return _cmTesuryoKb;
    }

    /**
     * [set] CM_TESURYO_KB by my TESURYO_KB, named 'cmTesuryoKb'.
     * @param cmTesuryoKb The entity of foreign property 'cmTesuryoKb'. (NullAllowed)
     */
    public void setCmTesuryoKb(OptionalEntity<CmTesuryoKb> cmTesuryoKb) {
        _cmTesuryoKb = cmTesuryoKb;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCmKishTesuryo) {
            BsCmKishTesuryo other = (BsCmKishTesuryo)obj;
            if (!xSV(_cmKishTesuryoId, other._cmKishTesuryoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cmKishTesuryoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_cmKaisha != null && _cmKaisha.isPresent())
        { sb.append(li).append(xbRDS(_cmKaisha, "cmKaisha")); }
        if (_cmTesuryoKb != null && _cmTesuryoKb.isPresent())
        { sb.append(li).append(xbRDS(_cmTesuryoKb, "cmTesuryoKb")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_cmKishTesuryoId));
        sb.append(dm).append(xfND(_cmKaishaId));
        sb.append(dm).append(xfND(_tekiyoKikanFromDt));
        sb.append(dm).append(xfND(_tekiyoKikanToDt));
        sb.append(dm).append(xfND(_tesuryoSu));
        sb.append(dm).append(xfND(_tesuryoKb));
        sb.append(dm).append(xfND(_regUserId));
        sb.append(dm).append(xfND(_regTm));
        sb.append(dm).append(xfND(_regFuncCd));
        sb.append(dm).append(xfND(_updUserId));
        sb.append(dm).append(xfND(_updTm));
        sb.append(dm).append(xfND(_updFuncCd));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_cmKaisha != null && _cmKaisha.isPresent())
        { sb.append(dm).append("cmKaisha"); }
        if (_cmTesuryoKb != null && _cmTesuryoKb.isPresent())
        { sb.append(dm).append("cmTesuryoKb"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CmKishTesuryo clone() {
        return (CmKishTesuryo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'CM_KISH_TESURYO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCmKishTesuryoId() {
        checkSpecifiedProperty("cmKishTesuryoId");
        return _cmKishTesuryoId;
    }

    /**
     * [set] CM_KISH_TESURYO_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param cmKishTesuryoId The value of the column 'CM_KISH_TESURYO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCmKishTesuryoId(Long cmKishTesuryoId) {
        registerModifiedProperty("cmKishTesuryoId");
        _cmKishTesuryoId = cmKishTesuryoId;
    }

    /**
     * [get] CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha} <br>
     * @return The value of the column 'CM_KAISHA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCmKaishaId() {
        checkSpecifiedProperty("cmKaishaId");
        return _cmKaishaId;
    }

    /**
     * [set] CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha} <br>
     * @param cmKaishaId The value of the column 'CM_KAISHA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCmKaishaId(Long cmKaishaId) {
        registerModifiedProperty("cmKaishaId");
        _cmKaishaId = cmKaishaId;
    }

    /**
     * [get] TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)} <br>
     * @return The value of the column 'TEKIYO_KIKAN_FROM_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getTekiyoKikanFromDt() {
        checkSpecifiedProperty("tekiyoKikanFromDt");
        return _tekiyoKikanFromDt;
    }

    /**
     * [set] TEKIYO_KIKAN_FROM_DT: {+UQ, NotNull, CHAR(8)} <br>
     * @param tekiyoKikanFromDt The value of the column 'TEKIYO_KIKAN_FROM_DT'. (basically NotNull if update: for the constraint)
     */
    public void setTekiyoKikanFromDt(String tekiyoKikanFromDt) {
        registerModifiedProperty("tekiyoKikanFromDt");
        _tekiyoKikanFromDt = tekiyoKikanFromDt;
    }

    /**
     * [get] TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)} <br>
     * @return The value of the column 'TEKIYO_KIKAN_TO_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getTekiyoKikanToDt() {
        checkSpecifiedProperty("tekiyoKikanToDt");
        return _tekiyoKikanToDt;
    }

    /**
     * [set] TEKIYO_KIKAN_TO_DT: {NotNull, CHAR(8)} <br>
     * @param tekiyoKikanToDt The value of the column 'TEKIYO_KIKAN_TO_DT'. (basically NotNull if update: for the constraint)
     */
    public void setTekiyoKikanToDt(String tekiyoKikanToDt) {
        registerModifiedProperty("tekiyoKikanToDt");
        _tekiyoKikanToDt = tekiyoKikanToDt;
    }

    /**
     * [get] TESURYO_SU: {NotNull, DECIMAL(7, 1)} <br>
     * @return The value of the column 'TESURYO_SU'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTesuryoSu() {
        checkSpecifiedProperty("tesuryoSu");
        return _tesuryoSu;
    }

    /**
     * [set] TESURYO_SU: {NotNull, DECIMAL(7, 1)} <br>
     * @param tesuryoSu The value of the column 'TESURYO_SU'. (basically NotNull if update: for the constraint)
     */
    public void setTesuryoSu(java.math.BigDecimal tesuryoSu) {
        registerModifiedProperty("tesuryoSu");
        _tesuryoSu = tesuryoSu;
    }

    /**
     * [get] TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} <br>
     * @return The value of the column 'TESURYO_KB'. (basically NotNull if selected: for the constraint)
     */
    public String getTesuryoKb() {
        checkSpecifiedProperty("tesuryoKb");
        return _tesuryoKb;
    }

    /**
     * [set] TESURYO_KB: {NotNull, CHAR(3), FK to cm_tesuryo_kb, classification=TesuryoKb} <br>
     * @param tesuryoKb The value of the column 'TESURYO_KB'. (basically NotNull if update: for the constraint)
     */
    protected void setTesuryoKb(String tesuryoKb) {
        checkClassificationCode("TESURYO_KB", CDef.DefMeta.TesuryoKb, tesuryoKb);
        registerModifiedProperty("tesuryoKb");
        _tesuryoKb = tesuryoKb;
    }

    /**
     * [get] REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'REG_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getRegUserId() {
        checkSpecifiedProperty("regUserId");
        return _regUserId;
    }

    /**
     * [set] REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * @param regUserId The value of the column 'REG_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRegUserId(String regUserId) {
        registerModifiedProperty("regUserId");
        _regUserId = regUserId;
    }

    /**
     * [get] REG_TM: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'REG_TM'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegTm() {
        checkSpecifiedProperty("regTm");
        return _regTm;
    }

    /**
     * [set] REG_TM: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param regTm The value of the column 'REG_TM'. (basically NotNull if update: for the constraint)
     */
    public void setRegTm(java.time.LocalDateTime regTm) {
        registerModifiedProperty("regTm");
        _regTm = regTm;
    }

    /**
     * [get] REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * @return The value of the column 'REG_FUNC_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getRegFuncCd() {
        checkSpecifiedProperty("regFuncCd");
        return _regFuncCd;
    }

    /**
     * [set] REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * @param regFuncCd The value of the column 'REG_FUNC_CD'. (basically NotNull if update: for the constraint)
     */
    public void setRegFuncCd(String regFuncCd) {
        registerModifiedProperty("regFuncCd");
        _regFuncCd = regFuncCd;
    }

    /**
     * [get] UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'UPD_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdUserId() {
        checkSpecifiedProperty("updUserId");
        return _updUserId;
    }

    /**
     * [set] UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * @param updUserId The value of the column 'UPD_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUpdUserId(String updUserId) {
        registerModifiedProperty("updUserId");
        _updUserId = updUserId;
    }

    /**
     * [get] UPD_TM: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'UPD_TM'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdTm() {
        checkSpecifiedProperty("updTm");
        return _updTm;
    }

    /**
     * [set] UPD_TM: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param updTm The value of the column 'UPD_TM'. (basically NotNull if update: for the constraint)
     */
    public void setUpdTm(java.time.LocalDateTime updTm) {
        registerModifiedProperty("updTm");
        _updTm = updTm;
    }

    /**
     * [get] UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * @return The value of the column 'UPD_FUNC_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdFuncCd() {
        checkSpecifiedProperty("updFuncCd");
        return _updFuncCd;
    }

    /**
     * [set] UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * @param updFuncCd The value of the column 'UPD_FUNC_CD'. (basically NotNull if update: for the constraint)
     */
    public void setUpdFuncCd(String updFuncCd) {
        registerModifiedProperty("updFuncCd");
        _updFuncCd = updFuncCd;
    }

    /**
     * [get] VERSION_NO: {NotNull, DECIMAL(9)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, DECIMAL(9)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param tesuryoKb The value of the column 'TESURYO_KB'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingTesuryoKb(String tesuryoKb) {
        setTesuryoKb(tesuryoKb);
    }
}
