package org.redhelp.common;

import java.util.Set;

import org.redhelp.common.types.BloodGroupType;
import org.redhelp.common.types.BloodRequirementType;

public class SaveBloodRequestRequest {
    //System related fields
    private Long b_p_id;
    private String creation_datetime;
    
    //Functional fields
    private String patient_name;
    private Set<BloodGroupType> list_blood_group;
    private BloodRequirementType blood_requirement_type;
    private String description;
    private String units;
    private String phone_number;
    
    //Location fields
    private Double gps_location_lat;
    private Double gps_location_long;
    private Double place_location_lat;
    private Double place_location_long;
    private String place_string;
    public Long getB_p_id() {
        return b_p_id;
    }
    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
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
    public Set<BloodGroupType> getList_blood_group() {
        return list_blood_group;
    }
    public void setList_blood_group(Set<BloodGroupType> list_blood_group) {
        this.list_blood_group = list_blood_group;
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
	return "SaveBloodRequestRequest [b_p_id=" + b_p_id + ", creation_datetime=" + creation_datetime
	        + ", patient_name=" + patient_name + ", list_blood_group=" + list_blood_group
	        + ", blood_requirement_type=" + blood_requirement_type + ", description=" + description + ", units="
	        + units + ", phone_number=" + phone_number + ", gps_location_lat=" + gps_location_lat
	        + ", gps_location_long=" + gps_location_long + ", place_location_lat=" + place_location_lat
	        + ", place_location_long=" + place_location_long + ", place_string=" + place_string + "]";
    }
    
}
