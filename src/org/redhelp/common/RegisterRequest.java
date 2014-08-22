package org.redhelp.common;

public class RegisterRequest {

    private String email;
    private String name;
    private String password;
    private String phoneNo;
    private byte[] user_image;

    // Additional Account related variables
    private String externalAccountId;
    private Long additionalAccountType;

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

    public String getExternalAccountId() {
	return externalAccountId;
    }

    public void setExternalAccountId(String externalAccountId) {
	this.externalAccountId = externalAccountId;
    }

    public Long getAdditionalAccountType() {
	return additionalAccountType;
    }

    public void setAdditionalAccountType(Long additionalAccountType) {
	this.additionalAccountType = additionalAccountType;
    }

    public byte[] getUser_image() {
	return user_image;
    }

    public void setUser_image(byte[] user_image) {
	this.user_image = user_image;
    }

    @Override
    public String toString() {
	return "RegisterRequest [email=" + email + ", name=" + name + ", password=" + password + ", phoneNo=" + phoneNo
	        + ", externalAccountId=" + externalAccountId + ", additionalAccountType=" + additionalAccountType + "]";
    }
}
