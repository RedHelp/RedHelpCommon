package org.redhelp.common;

import java.util.Date;
import java.util.LinkedList;

import org.redhelp.common.types.BloodGroupType;
import org.redhelp.common.types.BloodRequestType;
import org.redhelp.common.types.Gender;
import org.redhelp.common.types.GetBloodProfileType;


public class GetBloodProfileResponse {

    private Long b_p_id;
    private String name;
    private String email;
    private String phone_number;
    private Double last_known_location_lat;
    private Double last_known_location_long;
    private Date last_known_location_datetime;
    private Gender gender;
    private BloodGroupType blood_group_type;
    private String city;
    private Date birth_date;
    private LinkedList<BloodRequestType> blood_requests;
    private GetBloodProfileType response_type;
    
    
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
    public Date getLast_known_location_datetime() {
        return last_known_location_datetime;
    }
    public void setLast_known_location_datetime(Date last_known_location_datetime) {
        this.last_known_location_datetime = last_known_location_datetime;
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
    public Date getBirth_date() {
        return birth_date;
    }
    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
    public LinkedList<BloodRequestType> getBlood_requests() {
        return blood_requests;
    }
    public void setBlood_requests(LinkedList<BloodRequestType> blood_requests) {
        this.blood_requests = blood_requests;
    }
    public GetBloodProfileType getResponse_type() {
        return response_type;
    }
    public void setResponse_type(GetBloodProfileType response_type) {
        this.response_type = response_type;
    }
    @Override
    public String toString() {
	return "GetBloodProfileResponse [b_p_id=" + b_p_id + ", name=" + name + ", email=" + email + ", phone_number="
	        + phone_number + ", last_known_location_lat=" + last_known_location_lat + ", last_known_location_long="
	        + last_known_location_long + ", last_known_location_datetime=" + last_known_location_datetime
	        + ", gender=" + gender + ", blood_group_type=" + blood_group_type + ", city=" + city + ", birth_date="
	        + birth_date + ", blood_requests=" + blood_requests + "]";
    }
    
}
