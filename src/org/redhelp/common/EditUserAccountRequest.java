package org.redhelp.common;

public class EditUserAccountRequest {
	
    	private Long u_id;
	private String email;
	private String name;
	private String password;
	private String phoneNo;
	
	
	public Long getU_id() {
	    return u_id;
	}
	public void setU_id(Long u_id) {
	    this.u_id = u_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
        public String toString() {
	    return "EditUserAccountRequest [u_id=" + u_id + ", email=" + email + ", name=" + name + ", password="
	            + password + ", phoneNo=" + phoneNo + "]";
        }	
	
}
