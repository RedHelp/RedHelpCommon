package org.redhelp.common;

import org.redhelp.common.types.LoginReponseTypes;

public class LoginResponse {
    
    	private Long u_id;
    	private Long uaa_id;
    	private String name;
    	private String email;
    	private String phone_number;
    	private Long b_p_id;
	private LoginReponseTypes loginResponseType;
	
	public Long getU_id() {
	    return u_id;
	}

	public void setU_id(Long u_id) {
	    this.u_id = u_id;
	}

	public Long getUaa_id() {
	    return uaa_id;
	}

	public void setUaa_id(Long uaa_id) {
	    this.uaa_id = uaa_id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

	public String getPhone_number() {
	    return phone_number;
	}

	public void setPhone_number(String phone_number) {
	    this.phone_number = phone_number;
	}

	public LoginReponseTypes getLoginResponseType() {
		return loginResponseType;
	}

	public void setLoginResponseType(LoginReponseTypes loginResponseType) {
		this.loginResponseType = loginResponseType;
	}

	@Override
        public String toString() {
	    return "LoginResponse [u_id=" + u_id + ", uaa_id=" + uaa_id + ", name=" + name + ", email=" + email
	            + ", phone_number=" + phone_number + ", loginResponseType=" + loginResponseType + "]";
        }

	public Long getB_p_id() {
	    return b_p_id;
        }

	public void setB_p_id(Long b_p_id) {
	    this.b_p_id = b_p_id;
        }

}
