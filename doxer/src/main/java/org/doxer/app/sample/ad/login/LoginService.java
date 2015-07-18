package org.doxer.app.sample.ad.login;

import static com.github.hatimiti.flutist.common.util._Str.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.dbflute.optional.OptionalEntity;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.service.DoxService;
import org.springframework.stereotype.Service;

@Service
public class LoginService extends DoxService {

	@Resource AccessUser accessUser;
	@Resource CmShainBhv cmShainBhv;

	@Resource HttpSession session;

	/*
	 * 一覧検索
	 */

	public void login(
			LoginForm form) {

		OptionalEntity<CmShain> shain = this.cmShainBhv.selectEntity(cb -> {
			cb.query().setLoginCd_Equal(form.getLoginCd().getVal());
			cb.query().setPassword_Equal(form.getPassword().getVal());
		});

		session.invalidate();
		shain.ifPresent(this::setAccessUserDto);
	}

	public void dummyLogin() {

		session.invalidate();

		CmShain shain = new CmShain();
		shain.setCmShainId(0L);
		shain.setShainSei("ダミー");
		shain.setShainMei("ログイン");
		setAccessUserDto(shain);
	}

	private void setAccessUserDto(CmShain shain) {
		this.accessUser.setId(asStrOrNull(shain.getCmShainId()));
		this.accessUser.setNameSei(shain.getShainSei());
		this.accessUser.setNameMei(shain.getShainMei());
		this.accessUser.setLogged(true);
	}
}
