package org.redhelp.common;
public class RegisterRequest {

	private String email;
	private String name;
	private String password;
	private String phoneNo;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "RegisterRequest [email=" + email + ", name=" + name
				+ ", password=" + password + ", phoneNo=" + phoneNo + "]";
	}
	
}
