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
 * The entity of CM_KISH_RENRAKUSAKI as TABLE. <br>
 * <pre>
 * [primary-key]
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
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long cmKishRenrakusakiId = entity.getCmKishRenrakusakiId();
 * Long cmKaishaId = entity.getCmKaishaId();
 * Integer telNo1 = entity.getTelNo1();
 * Integer telNo2 = entity.getTelNo2();
 * Integer telNo3 = entity.getTelNo3();
 * String mailAddress = entity.getMailAddress();
 * String renrakusakiYotoKb = entity.getRenrakusakiYotoKb();
 * String regUserId = entity.getRegUserId();
 * java.time.LocalDateTime regTm = entity.getRegTm();
 * String regFuncCd = entity.getRegFuncCd();
 * String updUserId = entity.getUpdUserId();
 * java.time.LocalDateTime updTm = entity.getUpdTm();
 * String updFuncCd = entity.getUpdFuncCd();
 * Integer versionNo = entity.getVersionNo();
 * entity.setCmKishRenrakusakiId(cmKishRenrakusakiId);
 * entity.setCmKaishaId(cmKaishaId);
 * entity.setTelNo1(telNo1);
 * entity.setTelNo2(telNo2);
 * entity.setTelNo3(telNo3);
 * entity.setMailAddress(mailAddress);
 * entity.setRenrakusakiYotoKb(renrakusakiYotoKb);
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
public abstract class BsCmKishRenrakusaki extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _cmKishRenrakusakiId;

    /** CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha} */
    protected Long _cmKaishaId;

    /** TEL_NO1: {DECIMAL(5)} */
    protected Integer _telNo1;

    /** TEL_NO2: {DECIMAL(5)} */
    protected Integer _telNo2;

    /** TEL_NO3: {DECIMAL(5)} */
    protected Integer _telNo3;

    /** MAIL_ADDRESS: {VARCHAR(253)} */
    protected String _mailAddress;

    /** RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} */
    protected String _renrakusakiYotoKb;

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
        return "CM_KISH_RENRAKUSAKI";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_cmKishRenrakusakiId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of renrakusakiYotoKb as the classification of RenrakusakiYotoKb. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.RenrakusakiYotoKb getRenrakusakiYotoKbAsRenrakusakiYotoKb() {
        return CDef.RenrakusakiYotoKb.codeOf(getRenrakusakiYotoKb());
    }

    /**
     * Set the value of renrakusakiYotoKb as the classification of RenrakusakiYotoKb. <br>
     * RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRenrakusakiYotoKbAsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb cdef) {
        setRenrakusakiYotoKb(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of renrakusakiYotoKb as Normal (NRM). <br>
     * Normal
     */
    public void setRenrakusakiYotoKb_Normal() {
        setRenrakusakiYotoKbAsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Normal);
    }

    /**
     * Set the value of renrakusakiYotoKb as Emergency (EMG). <br>
     * Emergency
     */
    public void setRenrakusakiYotoKb_Emergency() {
        setRenrakusakiYotoKbAsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Emergency);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of renrakusakiYotoKb Normal? <br>
     * Normal
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRenrakusakiYotoKbNormal() {
        CDef.RenrakusakiYotoKb cdef = getRenrakusakiYotoKbAsRenrakusakiYotoKb();
        return cdef != null ? cdef.equals(CDef.RenrakusakiYotoKb.Normal) : false;
    }

    /**
     * Is the value of renrakusakiYotoKb Emergency? <br>
     * Emergency
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRenrakusakiYotoKbEmergency() {
        CDef.RenrakusakiYotoKb cdef = getRenrakusakiYotoKbAsRenrakusakiYotoKb();
        return cdef != null ? cdef.equals(CDef.RenrakusakiYotoKb.Emergency) : false;
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
        if (obj instanceof BsCmKishRenrakusaki) {
            BsCmKishRenrakusaki other = (BsCmKishRenrakusaki)obj;
            if (!xSV(_cmKishRenrakusakiId, other._cmKishRenrakusakiId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cmKishRenrakusakiId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_cmKaisha != null && _cmKaisha.isPresent())
        { sb.append(li).append(xbRDS(_cmKaisha, "cmKaisha")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_cmKishRenrakusakiId));
        sb.append(dm).append(xfND(_cmKaishaId));
        sb.append(dm).append(xfND(_telNo1));
        sb.append(dm).append(xfND(_telNo2));
        sb.append(dm).append(xfND(_telNo3));
        sb.append(dm).append(xfND(_mailAddress));
        sb.append(dm).append(xfND(_renrakusakiYotoKb));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CmKishRenrakusaki clone() {
        return (CmKishRenrakusaki)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'CM_KISH_RENRAKUSAKI_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCmKishRenrakusakiId() {
        checkSpecifiedProperty("cmKishRenrakusakiId");
        return _cmKishRenrakusakiId;
    }

    /**
     * [set] CM_KISH_RENRAKUSAKI_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param cmKishRenrakusakiId The value of the column 'CM_KISH_RENRAKUSAKI_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCmKishRenrakusakiId(Long cmKishRenrakusakiId) {
        registerModifiedProperty("cmKishRenrakusakiId");
        _cmKishRenrakusakiId = cmKishRenrakusakiId;
    }

    /**
     * [get] CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha} <br>
     * @return The value of the column 'CM_KAISHA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCmKaishaId() {
        checkSpecifiedProperty("cmKaishaId");
        return _cmKaishaId;
    }

    /**
     * [set] CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha} <br>
     * @param cmKaishaId The value of the column 'CM_KAISHA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCmKaishaId(Long cmKaishaId) {
        registerModifiedProperty("cmKaishaId");
        _cmKaishaId = cmKaishaId;
    }

    /**
     * [get] TEL_NO1: {DECIMAL(5)} <br>
     * @return The value of the column 'TEL_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTelNo1() {
        checkSpecifiedProperty("telNo1");
        return _telNo1;
    }

    /**
     * [set] TEL_NO1: {DECIMAL(5)} <br>
     * @param telNo1 The value of the column 'TEL_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo1(Integer telNo1) {
        registerModifiedProperty("telNo1");
        _telNo1 = telNo1;
    }

    /**
     * [get] TEL_NO2: {DECIMAL(5)} <br>
     * @return The value of the column 'TEL_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTelNo2() {
        checkSpecifiedProperty("telNo2");
        return _telNo2;
    }

    /**
     * [set] TEL_NO2: {DECIMAL(5)} <br>
     * @param telNo2 The value of the column 'TEL_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo2(Integer telNo2) {
        registerModifiedProperty("telNo2");
        _telNo2 = telNo2;
    }

    /**
     * [get] TEL_NO3: {DECIMAL(5)} <br>
     * @return The value of the column 'TEL_NO3'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTelNo3() {
        checkSpecifiedProperty("telNo3");
        return _telNo3;
    }

    /**
     * [set] TEL_NO3: {DECIMAL(5)} <br>
     * @param telNo3 The value of the column 'TEL_NO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo3(Integer telNo3) {
        registerModifiedProperty("telNo3");
        _telNo3 = telNo3;
    }

    /**
     * [get] MAIL_ADDRESS: {VARCHAR(253)} <br>
     * @return The value of the column 'MAIL_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMailAddress() {
        checkSpecifiedProperty("mailAddress");
        return _mailAddress;
    }

    /**
     * [set] MAIL_ADDRESS: {VARCHAR(253)} <br>
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMailAddress(String mailAddress) {
        registerModifiedProperty("mailAddress");
        _mailAddress = mailAddress;
    }

    /**
     * [get] RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * @return The value of the column 'RENRAKUSAKI_YOTO_KB'. (basically NotNull if selected: for the constraint)
     */
    public String getRenrakusakiYotoKb() {
        checkSpecifiedProperty("renrakusakiYotoKb");
        return _renrakusakiYotoKb;
    }

    /**
     * [set] RENRAKUSAKI_YOTO_KB: {NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * @param renrakusakiYotoKb The value of the column 'RENRAKUSAKI_YOTO_KB'. (basically NotNull if update: for the constraint)
     */
    protected void setRenrakusakiYotoKb(String renrakusakiYotoKb) {
        checkClassificationCode("RENRAKUSAKI_YOTO_KB", CDef.DefMeta.RenrakusakiYotoKb, renrakusakiYotoKb);
        registerModifiedProperty("renrakusakiYotoKb");
        _renrakusakiYotoKb = renrakusakiYotoKb;
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
     * @param renrakusakiYotoKb The value of the column 'RENRAKUSAKI_YOTO_KB'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingRenrakusakiYotoKb(String renrakusakiYotoKb) {
        setRenrakusakiYotoKb(renrakusakiYotoKb);
    }
}
