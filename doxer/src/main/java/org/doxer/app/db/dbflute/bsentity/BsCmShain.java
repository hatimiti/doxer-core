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
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The entity of CM_SHAIN as TABLE. <br>
 * <pre>
 * [primary-key]
 *     CM_SHAIN_ID
 * 
 * [column]
 *     CM_SHAIN_ID, CM_KAISHA_ID, SHAIN_SEI, SHAIN_MEI, SHAIN_SEI_EN, SHAIN_MEI_EN, LOGIN_CD, PASSWORD, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     CM_SHAIN_ID
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
 * Long cmShainId = entity.getCmShainId();
 * Long cmKaishaId = entity.getCmKaishaId();
 * String shainSei = entity.getShainSei();
 * String shainMei = entity.getShainMei();
 * String shainSeiEn = entity.getShainSeiEn();
 * String shainMeiEn = entity.getShainMeiEn();
 * String loginCd = entity.getLoginCd();
 * String password = entity.getPassword();
 * String regUserId = entity.getRegUserId();
 * java.time.LocalDateTime regTm = entity.getRegTm();
 * String regFuncCd = entity.getRegFuncCd();
 * String updUserId = entity.getUpdUserId();
 * java.time.LocalDateTime updTm = entity.getUpdTm();
 * String updFuncCd = entity.getUpdFuncCd();
 * Integer versionNo = entity.getVersionNo();
 * entity.setCmShainId(cmShainId);
 * entity.setCmKaishaId(cmKaishaId);
 * entity.setShainSei(shainSei);
 * entity.setShainMei(shainMei);
 * entity.setShainSeiEn(shainSeiEn);
 * entity.setShainMeiEn(shainMeiEn);
 * entity.setLoginCd(loginCd);
 * entity.setPassword(password);
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
public abstract class BsCmShain extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _cmShainId;

    /** CM_KAISHA_ID: {UQ+, NotNull, BIGINT(19), FK to cm_kaisha} */
    protected Long _cmKaishaId;

    /** SHAIN_SEI: {NotNull, VARCHAR(50)} */
    protected String _shainSei;

    /** SHAIN_MEI: {NotNull, VARCHAR(50)} */
    protected String _shainMei;

    /** SHAIN_SEI_EN: {VARCHAR(100)} */
    protected String _shainSeiEn;

    /** SHAIN_MEI_EN: {VARCHAR(100)} */
    protected String _shainMeiEn;

    /** LOGIN_CD: {+UQ, NotNull, VARCHAR(50)} */
    protected String _loginCd;

    /** PASSWORD: {NotNull, VARCHAR(50)} */
    protected String _password;

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
        return "CM_SHAIN";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_cmShainId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param cmKaishaId : UQ+, NotNull, BIGINT(19), FK to cm_kaisha. (NotNull)
     * @param loginCd : +UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(Long cmKaishaId, String loginCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("cmKaishaId");
        __uniqueDrivenProperties.addPropertyName("loginCd");
        setCmKaishaId(cmKaishaId);setLoginCd(loginCd);
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
        if (obj instanceof BsCmShain) {
            BsCmShain other = (BsCmShain)obj;
            if (!xSV(_cmShainId, other._cmShainId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cmShainId);
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
        sb.append(dm).append(xfND(_cmShainId));
        sb.append(dm).append(xfND(_cmKaishaId));
        sb.append(dm).append(xfND(_shainSei));
        sb.append(dm).append(xfND(_shainMei));
        sb.append(dm).append(xfND(_shainSeiEn));
        sb.append(dm).append(xfND(_shainMeiEn));
        sb.append(dm).append(xfND(_loginCd));
        sb.append(dm).append(xfND(_password));
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
    public CmShain clone() {
        return (CmShain)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'CM_SHAIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCmShainId() {
        checkSpecifiedProperty("cmShainId");
        return _cmShainId;
    }

    /**
     * [set] CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param cmShainId The value of the column 'CM_SHAIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCmShainId(Long cmShainId) {
        registerModifiedProperty("cmShainId");
        _cmShainId = cmShainId;
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
     * [get] SHAIN_SEI: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'SHAIN_SEI'. (basically NotNull if selected: for the constraint)
     */
    public String getShainSei() {
        checkSpecifiedProperty("shainSei");
        return _shainSei;
    }

    /**
     * [set] SHAIN_SEI: {NotNull, VARCHAR(50)} <br>
     * @param shainSei The value of the column 'SHAIN_SEI'. (basically NotNull if update: for the constraint)
     */
    public void setShainSei(String shainSei) {
        registerModifiedProperty("shainSei");
        _shainSei = shainSei;
    }

    /**
     * [get] SHAIN_MEI: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'SHAIN_MEI'. (basically NotNull if selected: for the constraint)
     */
    public String getShainMei() {
        checkSpecifiedProperty("shainMei");
        return _shainMei;
    }

    /**
     * [set] SHAIN_MEI: {NotNull, VARCHAR(50)} <br>
     * @param shainMei The value of the column 'SHAIN_MEI'. (basically NotNull if update: for the constraint)
     */
    public void setShainMei(String shainMei) {
        registerModifiedProperty("shainMei");
        _shainMei = shainMei;
    }

    /**
     * [get] SHAIN_SEI_EN: {VARCHAR(100)} <br>
     * @return The value of the column 'SHAIN_SEI_EN'. (NullAllowed even if selected: for no constraint)
     */
    public String getShainSeiEn() {
        checkSpecifiedProperty("shainSeiEn");
        return _shainSeiEn;
    }

    /**
     * [set] SHAIN_SEI_EN: {VARCHAR(100)} <br>
     * @param shainSeiEn The value of the column 'SHAIN_SEI_EN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShainSeiEn(String shainSeiEn) {
        registerModifiedProperty("shainSeiEn");
        _shainSeiEn = shainSeiEn;
    }

    /**
     * [get] SHAIN_MEI_EN: {VARCHAR(100)} <br>
     * @return The value of the column 'SHAIN_MEI_EN'. (NullAllowed even if selected: for no constraint)
     */
    public String getShainMeiEn() {
        checkSpecifiedProperty("shainMeiEn");
        return _shainMeiEn;
    }

    /**
     * [set] SHAIN_MEI_EN: {VARCHAR(100)} <br>
     * @param shainMeiEn The value of the column 'SHAIN_MEI_EN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShainMeiEn(String shainMeiEn) {
        registerModifiedProperty("shainMeiEn");
        _shainMeiEn = shainMeiEn;
    }

    /**
     * [get] LOGIN_CD: {+UQ, NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'LOGIN_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getLoginCd() {
        checkSpecifiedProperty("loginCd");
        return _loginCd;
    }

    /**
     * [set] LOGIN_CD: {+UQ, NotNull, VARCHAR(50)} <br>
     * @param loginCd The value of the column 'LOGIN_CD'. (basically NotNull if update: for the constraint)
     */
    public void setLoginCd(String loginCd) {
        registerModifiedProperty("loginCd");
        _loginCd = loginCd;
    }

    /**
     * [get] PASSWORD: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] PASSWORD: {NotNull, VARCHAR(50)} <br>
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
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
}
