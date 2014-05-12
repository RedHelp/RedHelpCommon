package org.redhelp.common;

public class GetUserAccountRequest {
	
	private String email;
	private Long u_id;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getU_id() {
		return u_id;
	}
	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}
	@Override
	public String toString() {
		return "GetUserAccountRequest [email=" + email + ", u_id=" + u_id + "]";
	}
	
	
	
}
