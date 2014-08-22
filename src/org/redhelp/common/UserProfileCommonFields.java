package org.redhelp.common;

import java.util.Arrays;

public class UserProfileCommonFields {

    private String name;
    private String email;
    private String phone_number;
    private byte[] user_image;
   
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
    public byte[] getUser_image() {
        return user_image;
    }
    public void setUser_image(byte[] user_image) {
        this.user_image = user_image;
    }
    
    @Override
    public String toString() {
	return "UserProfileCommonFields [name=" + name + ", email=" + email + ", phone_number=" + phone_number
	        + ", user_image=" + Arrays.toString(user_image) + "]";
    }
}
