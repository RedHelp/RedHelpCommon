package org.redhelp.common;

import org.redhelp.common.types.RegisterResponseTypes;

public class RegisterResponse {

	private long u_id;
	private Long uaa_id;
	private RegisterResponseTypes registerResponseType;
	
	public long getU_id() {
		return u_id;
	}

	public void setU_id(long u_id) {
		this.u_id = u_id;
	}
	
	public Long getUaa_id() {
	    return uaa_id;
	}

	public void setUaa_id(Long uaa_id) {
	    this.uaa_id = uaa_id;
	}

	public RegisterResponseTypes getRegisterResponseType() {
		return registerResponseType;
	}

	public void setRegisterResponseType(RegisterResponseTypes registerResponseType) {
		this.registerResponseType = registerResponseType;
	}

	@Override
        public String toString() {
	    return "RegisterResponse [u_id=" + u_id + ", uaa_id=" + uaa_id + ", registerResponseType="
	            + registerResponseType + "]";
        }
}
