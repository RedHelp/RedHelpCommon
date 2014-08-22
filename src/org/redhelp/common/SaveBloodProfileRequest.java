package org.redhelp.common;

import java.util.Date;

import org.redhelp.common.types.BloodGroupType;
import org.redhelp.common.types.Gender;

public class SaveBloodProfileRequest {

    private Long u_id;
    private Long b_p_id;
    private Double last_known_location_lat;
    private Double last_known_location_long;
    private Gender gender;
    private BloodGroupType blood_group_type;
    private String city;
    private String birth_date;
   
    
    public Long getU_id() {
        return u_id;
    }
    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }
    public Long getB_p_id() {
        return b_p_id;
    }
    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }
    public Double getLast_known_location_lat() {
        return last_known_location_lat;
    }
    public void setLast_known_location_lat(Double last_known_location_lat) {
        this.last_known_location_lat = last_known_location_lat;
    }
    public Double getLast_known_location_long() {
        return last_known_location_long;
    }
    public void setLast_known_location_long(Double last_known_location_long) {
        this.last_known_location_long = last_known_location_long;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public BloodGroupType getBlood_group_type() {
        return blood_group_type;
    }
    public void setBlood_group_type(BloodGroupType blood_group_type) {
        this.blood_group_type = blood_group_type;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getBirth_date() {
        return birth_date;
    }
    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }    
    @Override
    public String toString() {
	return "CreateBloodProfileRequest [u_id=" + u_id + ", last_known_location_lat=" + last_known_location_lat
	        + ", last_known_location_long=" + last_known_location_long + ", gender=" + gender
	        + ", blood_group_type=" + blood_group_type + ", city=" + city + ", birth_date=" + birth_date + "]";
    }
    
}
