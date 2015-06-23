package org.doxer.app.db;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;

public final class DBMetaManager {

	private DBMetaManager() {
	}

	private static final CmKaishaDbm CM_KAISHA_DBM = CmKaishaDbm.getInstance();

	public static final String CM_KAISHA$CM_KAISHA_ID = CM_KAISHA_DBM.columnCmKaishaId().getColumnDbName();
	public static final String CM_KAISHA$KAISHA_MEI = CM_KAISHA_DBM.columnKaishaMei().getColumnDbName();
	public static final String CM_KAISHA$KAISHA_MEI_EN = CM_KAISHA_DBM.columnKaishaMeiEn().getColumnDbName();

	private static final CmShainDbm CM_SHAIN_DBM = CmShainDbm.getInstance();

	public static final String CM_SHAIN$CM_SHAIN_ID = CM_SHAIN_DBM.columnCmShainId().getColumnDbName();
	public static final String CM_SHAIN$SHAIN_SEI = CM_SHAIN_DBM.columnShainSei().getColumnDbName();
	public static final String CM_SHAIN$SHAIN_MEI = CM_SHAIN_DBM.columnShainMei().getColumnDbName();
	public static final String CM_SHAIN$SHAIN_SEI_EN = CM_SHAIN_DBM.columnShainSeiEn().getColumnDbName();
	public static final String CM_SHAIN$SHAIN_MEI_EN = CM_SHAIN_DBM.columnShainMeiEn().getColumnDbName();

}
