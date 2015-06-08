package org.doxer.app.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.doxer.app.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The entity of CM_KAISHA as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *     CM_KISH_TESURYO, CM_KISH_RENRAKUSAKI
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     cmKishTesuryoList, cmKishRenrakusakiList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long cmKaishaId = entity.getCmKaishaId();
 * String kaishaMei = entity.getKaishaMei();
 * String kaishaMeiEn = entity.getKaishaMeiEn();
 * String regUserId = entity.getRegUserId();
 * java.time.LocalDateTime regTm = entity.getRegTm();
 * String regFuncCd = entity.getRegFuncCd();
 * String updUserId = entity.getUpdUserId();
 * java.time.LocalDateTime updTm = entity.getUpdTm();
 * String updFuncCd = entity.getUpdFuncCd();
 * Integer versionNo = entity.getVersionNo();
 * entity.setCmKaishaId(cmKaishaId);
 * entity.setKaishaMei(kaishaMei);
 * entity.setKaishaMeiEn(kaishaMeiEn);
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
public abstract class BsCmKaisha extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _cmKaishaId;

    /** KAISHA_MEI: {UQ, NotNull, VARCHAR(50)} */
    protected String _kaishaMei;

    /** KAISHA_MEI_EN: {VARCHAR(100)} */
    protected String _kaishaMeiEn;

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
        return "CM_KAISHA";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_cmKaishaId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param kaishaMei : UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String kaishaMei) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("kaishaMei");
        setKaishaMei(kaishaMei);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** CM_KISH_TESURYO by CM_KAISHA_ID, named 'cmKishTesuryoList'. */
    protected List<CmKishTesuryo> _cmKishTesuryoList;

    /**
     * [get] CM_KISH_TESURYO by CM_KAISHA_ID, named 'cmKishTesuryoList'.
     * @return The entity list of referrer property 'cmKishTesuryoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CmKishTesuryo> getCmKishTesuryoList() {
        if (_cmKishTesuryoList == null) { _cmKishTesuryoList = newReferrerList(); }
        return _cmKishTesuryoList;
    }

    /**
     * [set] CM_KISH_TESURYO by CM_KAISHA_ID, named 'cmKishTesuryoList'.
     * @param cmKishTesuryoList The entity list of referrer property 'cmKishTesuryoList'. (NullAllowed)
     */
    public void setCmKishTesuryoList(List<CmKishTesuryo> cmKishTesuryoList) {
        _cmKishTesuryoList = cmKishTesuryoList;
    }

    /** CM_KISH_RENRAKUSAKI by CM_KAISHA_ID, named 'cmKishRenrakusakiList'. */
    protected List<CmKishRenrakusaki> _cmKishRenrakusakiList;

    /**
     * [get] CM_KISH_RENRAKUSAKI by CM_KAISHA_ID, named 'cmKishRenrakusakiList'.
     * @return The entity list of referrer property 'cmKishRenrakusakiList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CmKishRenrakusaki> getCmKishRenrakusakiList() {
        if (_cmKishRenrakusakiList == null) { _cmKishRenrakusakiList = newReferrerList(); }
        return _cmKishRenrakusakiList;
    }

    /**
     * [set] CM_KISH_RENRAKUSAKI by CM_KAISHA_ID, named 'cmKishRenrakusakiList'.
     * @param cmKishRenrakusakiList The entity list of referrer property 'cmKishRenrakusakiList'. (NullAllowed)
     */
    public void setCmKishRenrakusakiList(List<CmKishRenrakusaki> cmKishRenrakusakiList) {
        _cmKishRenrakusakiList = cmKishRenrakusakiList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCmKaisha) {
            BsCmKaisha other = (BsCmKaisha)obj;
            if (!xSV(_cmKaishaId, other._cmKaishaId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cmKaishaId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_cmKishTesuryoList != null) { for (CmKishTesuryo et : _cmKishTesuryoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "cmKishTesuryoList")); } } }
        if (_cmKishRenrakusakiList != null) { for (CmKishRenrakusaki et : _cmKishRenrakusakiList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "cmKishRenrakusakiList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_cmKaishaId));
        sb.append(dm).append(xfND(_kaishaMei));
        sb.append(dm).append(xfND(_kaishaMeiEn));
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
        if (_cmKishTesuryoList != null && !_cmKishTesuryoList.isEmpty())
        { sb.append(dm).append("cmKishTesuryoList"); }
        if (_cmKishRenrakusakiList != null && !_cmKishRenrakusakiList.isEmpty())
        { sb.append(dm).append("cmKishRenrakusakiList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CmKaisha clone() {
        return (CmKaisha)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'CM_KAISHA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCmKaishaId() {
        checkSpecifiedProperty("cmKaishaId");
        return _cmKaishaId;
    }

    /**
     * [set] CM_KAISHA_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param cmKaishaId The value of the column 'CM_KAISHA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCmKaishaId(Long cmKaishaId) {
        registerModifiedProperty("cmKaishaId");
        _cmKaishaId = cmKaishaId;
    }

    /**
     * [get] KAISHA_MEI: {UQ, NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'KAISHA_MEI'. (basically NotNull if selected: for the constraint)
     */
    public String getKaishaMei() {
        checkSpecifiedProperty("kaishaMei");
        return _kaishaMei;
    }

    /**
     * [set] KAISHA_MEI: {UQ, NotNull, VARCHAR(50)} <br>
     * @param kaishaMei The value of the column 'KAISHA_MEI'. (basically NotNull if update: for the constraint)
     */
    public void setKaishaMei(String kaishaMei) {
        registerModifiedProperty("kaishaMei");
        _kaishaMei = kaishaMei;
    }

    /**
     * [get] KAISHA_MEI_EN: {VARCHAR(100)} <br>
     * @return The value of the column 'KAISHA_MEI_EN'. (NullAllowed even if selected: for no constraint)
     */
    public String getKaishaMeiEn() {
        checkSpecifiedProperty("kaishaMeiEn");
        return _kaishaMeiEn;
    }

    /**
     * [set] KAISHA_MEI_EN: {VARCHAR(100)} <br>
     * @param kaishaMeiEn The value of the column 'KAISHA_MEI_EN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKaishaMeiEn(String kaishaMeiEn) {
        registerModifiedProperty("kaishaMeiEn");
        _kaishaMeiEn = kaishaMeiEn;
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
