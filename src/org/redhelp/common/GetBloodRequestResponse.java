package org.redhelp.common;

import java.util.Set;

import org.redhelp.common.types.BloodGroupType;
import org.redhelp.common.types.BloodRequestType;
import org.redhelp.common.types.BloodRequirementType;

public class GetBloodRequestResponse {

    //System related fields
    private Long b_r_id;
    private boolean active;
    private Long b_p_id;
    private UserProfileCommonFields creator_profile;
    private String creation_datetime;
    
    //Functional fields
    private String patient_name;
    private Set<BloodGroupType> set_blood_group;
    private String blood_groups_str;
    private BloodRequirementType blood_requirement_type;
    private String description;
    private String units;
    private String phone_number;
    
    private Set<UserProfileCommonFields> blood_request_receivers_profiles;
    
    //Location fields
    private Double gps_location_lat;
    private Double gps_location_long;
    private Double place_location_lat;
    private Double place_location_long;
    private String place_string;
    
    private BloodRequestType bloodRequestType;
    
    public Long getB_r_id() {
        return b_r_id;
    }
    public void setB_r_id(Long b_r_id) {
        this.b_r_id = b_r_id;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public Long getB_p_id() {
        return b_p_id;
    }
    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }

    public UserProfileCommonFields getCreator_profile() {
        return creator_profile;
    }
    public void setCreator_profile(UserProfileCommonFields creator_profile) {
        this.creator_profile = creator_profile;
    }
    public String getCreation_datetime() {
        return creation_datetime;
    }
    public void setCreation_datetime(String creation_datetime) {
        this.creation_datetime = creation_datetime;
    }
    public String getPatient_name() {
        return patient_name;
    }
    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }
    public Set<BloodGroupType> getSet_blood_group() {
        return set_blood_group;
    }
    public void setSet_blood_group(Set<BloodGroupType> set_blood_group) {
        this.set_blood_group = set_blood_group;
    }
    public BloodRequirementType getBlood_requirement_type() {
        return blood_requirement_type;
    }
    public void setBlood_requirement_type(BloodRequirementType blood_requirement_type) {
        this.blood_requirement_type = blood_requirement_type;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public Set<UserProfileCommonFields> getBlood_request_receivers_profiles() {
        return blood_request_receivers_profiles;
    }
    public void setBlood_request_receivers_profiles(Set<UserProfileCommonFields> blood_request_receivers_profiles) {
        this.blood_request_receivers_profiles = blood_request_receivers_profiles;
    }
    public Double getGps_location_lat() {
        return gps_location_lat;
    }
    public void setGps_location_lat(Double gps_location_lat) {
        this.gps_location_lat = gps_location_lat;
    }
    public Double getGps_location_long() {
        return gps_location_long;
    }
    public void setGps_location_long(Double gps_location_long) {
        this.gps_location_long = gps_location_long;
    }
    public Double getPlace_location_lat() {
        return place_location_lat;
    }
    public void setPlace_location_lat(Double place_location_lat) {
        this.place_location_lat = place_location_lat;
    }
    public Double getPlace_location_long() {
        return place_location_long;
    }
    public void setPlace_location_long(Double place_location_long) {
        this.place_location_long = place_location_long;
    }
    public String getPlace_string() {
        return place_string;
    }
    public void setPlace_string(String place_string) {
        this.place_string = place_string;
    }
    @Override
    public String toString() {
	return "GetBloodRequestResponse [b_r_id=" + b_r_id + ", active=" + active + ", b_p_id=" + b_p_id
	        + ", creator_profile=" + creator_profile + ", creation_datetime=" + creation_datetime
	        + ", patient_name=" + patient_name + ", set_blood_group=" + set_blood_group
	        + ", blood_requirement_type=" + blood_requirement_type + ", description=" + description + ", units="
	        + units + ", phone_number=" + phone_number + ", blood_request_receivers_profiles="
	        + blood_request_receivers_profiles + ", gps_location_lat=" + gps_location_lat + ", gps_location_long="
	        + gps_location_long + ", place_location_lat=" + place_location_lat + ", place_location_long="
	        + place_location_long + ", place_string=" + place_string + "BloodRequestType"+bloodRequestType+"]";
    }
    public String getBlood_groups_str() {
	return blood_groups_str;
    }
    public void setBlood_groups_str(String blood_groups_str) {
	this.blood_groups_str = blood_groups_str;
    }
    public BloodRequestType getBloodRequestType() {
	return bloodRequestType;
    }
    public void setBloodRequestType(BloodRequestType bloodRequestType) {
	this.bloodRequestType = bloodRequestType;
    }
    
    
    
}
