package org.redhelp.common;

import java.util.Arrays;

import org.redhelp.common.types.BloodGroupType;

public class UserProfileCommonFields {

    private String name;
    private String email;
    private String phone_number;
    private byte[] user_image;
    
    private Long b_p_id;
    private BloodGroupType blood_group_type;
    
    //Specific to blood request
    private Boolean isRequestAccepted;
    
    
   
    public Long getB_p_id() {
        return b_p_id;
    }
    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }
    public BloodGroupType getBlood_group_type() {
        return blood_group_type;
    }
    public void setBlood_group_type(BloodGroupType blood_group_type) {
        this.blood_group_type = blood_group_type;
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
    public Boolean getIsRequestAccepted() {
	return isRequestAccepted;
    }
    public void setIsRequestAccepted(Boolean isRequestAccepted) {
	this.isRequestAccepted = isRequestAccepted;
    }
    
   
}
