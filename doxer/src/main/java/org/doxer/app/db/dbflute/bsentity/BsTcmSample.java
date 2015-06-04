package org.doxer.app.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.doxer.app.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The entity of TCM_SAMPLE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TCM_SAMPLE_ID
 * 
 * [column]
 *     TCM_SAMPLE_ID, SAMPLE_NAME, SAMPLE_NAME_EN
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     TCM_SAMPLE_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tcmSampleId = entity.getTcmSampleId();
 * String sampleName = entity.getSampleName();
 * String sampleNameEn = entity.getSampleNameEn();
 * entity.setTcmSampleId(tcmSampleId);
 * entity.setSampleName(sampleName);
 * entity.setSampleNameEn(sampleNameEn);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTcmSample extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _tcmSampleId;

    /** SAMPLE_NAME: {VARCHAR(50)} */
    protected String _sampleName;

    /** SAMPLE_NAME_EN: {VARCHAR(50)} */
    protected String _sampleNameEn;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TCM_SAMPLE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_tcmSampleId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsTcmSample) {
            BsTcmSample other = (BsTcmSample)obj;
            if (!xSV(_tcmSampleId, other._tcmSampleId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tcmSampleId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tcmSampleId));
        sb.append(dm).append(xfND(_sampleName));
        sb.append(dm).append(xfND(_sampleNameEn));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public TcmSample clone() {
        return (TcmSample)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TCM_SAMPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTcmSampleId() {
        checkSpecifiedProperty("tcmSampleId");
        return _tcmSampleId;
    }

    /**
     * [set] TCM_SAMPLE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param tcmSampleId The value of the column 'TCM_SAMPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTcmSampleId(Long tcmSampleId) {
        registerModifiedProperty("tcmSampleId");
        _tcmSampleId = tcmSampleId;
    }

    /**
     * [get] SAMPLE_NAME: {VARCHAR(50)} <br>
     * @return The value of the column 'SAMPLE_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSampleName() {
        checkSpecifiedProperty("sampleName");
        return _sampleName;
    }

    /**
     * [set] SAMPLE_NAME: {VARCHAR(50)} <br>
     * @param sampleName The value of the column 'SAMPLE_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSampleName(String sampleName) {
        registerModifiedProperty("sampleName");
        _sampleName = sampleName;
    }

    /**
     * [get] SAMPLE_NAME_EN: {VARCHAR(50)} <br>
     * @return The value of the column 'SAMPLE_NAME_EN'. (NullAllowed even if selected: for no constraint)
     */
    public String getSampleNameEn() {
        checkSpecifiedProperty("sampleNameEn");
        return _sampleNameEn;
    }

    /**
     * [set] SAMPLE_NAME_EN: {VARCHAR(50)} <br>
     * @param sampleNameEn The value of the column 'SAMPLE_NAME_EN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSampleNameEn(String sampleNameEn) {
        registerModifiedProperty("sampleNameEn");
        _sampleNameEn = sampleNameEn;
    }
}
