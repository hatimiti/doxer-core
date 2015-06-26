package org.doxer.app.sample.ad.login;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.service.DoxService;
import org.springframework.stereotype.Service;

import com.github.hatimiti.flutist.common.util._Obj;

@Service
public class LoginService extends DoxService {

	@Resource AccessUser accessUser;
	@Resource CmShainBhv cmShainBhv;

	/*
	 * 一覧検索
	 */

	public void login(
			LoginForm form) {

		OptionalEntity<CmShain> shain = this.cmShainBhv.selectEntity(cb -> {
			cb.query().setLoginCd_Equal(form.getLoginCd().getVal());
			cb.query().setPassword_Equal(form.getPassword().getVal());
		});

		shain.ifPresent(this::setAccessUserDto);
	}

	private void setAccessUserDto(CmShain shain) {
		this.accessUser.setId(_Obj.toStr(shain.getCmShainId()));
		this.accessUser.setNameSei(shain.getShainSei());
		this.accessUser.setNameMei(shain.getShainMei());
		this.accessUser.setLogged(true);
	}
}
