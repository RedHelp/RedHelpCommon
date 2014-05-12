package org.redhelp.common;

import org.redhelp.common.types.LoginReponseTypes;

public class LoginResponse {
	private LoginReponseTypes loginResponseType;

	public LoginReponseTypes getLoginResponseType() {
		return loginResponseType;
	}

	public void setLoginResponseType(LoginReponseTypes loginResponseType) {
		this.loginResponseType = loginResponseType;
	}

	@Override
	public String toString() {
		return "LoginResponse [loginResponseType=" + loginResponseType + "]";
	}

}
