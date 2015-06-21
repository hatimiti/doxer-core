package org.doxer.app.db;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;

public final class DBMetaManager {

	private DBMetaManager() {
	}

	private static final CmKaishaDbm CM_KAISHA_DBM = CmKaishaDbm.getInstance();

	public static final String CM_KAISHA$CM_KAISHA_ID = CM_KAISHA_DBM.columnCmKaishaId().getColumnDbName();
	public static final String CM_KAISHA$KAISHA_MEI = CM_KAISHA_DBM.columnKaishaMei().getColumnDbName();
	public static final String CM_KAISHA$KAISHA_MEI_EN = CM_KAISHA_DBM.columnKaishaMeiEn().getColumnDbName();

}
