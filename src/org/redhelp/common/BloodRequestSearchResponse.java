package org.redhelp.common;

import java.io.Serializable;

import org.redhelp.common.types.Location;
import org.redhelp.interfaces.ISearchResult;

public class BloodRequestSearchResponse implements ISearchResult, Serializable{
    

    private Location location;
    private String title;
    private String summary;
    
    private Long b_r_id;
    
    private String blood_grps_requested_str;
    
    public Long getB_r_id() {
        return b_r_id;
    }

    public void setB_r_id(Long b_r_id) {
        this.b_r_id = b_r_id;
    }

    @Override
    public Location getLocation() {
	return location;
    }

    @Override
    public String getTitle() {
	return title;
    }

    @Override
    public String getSummary() {
	return summary;
    }

    public Location getlocation() {
        return location;
    }

    public void setlocation(Location location) {
        this.location = location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
	return "BloodRequestSearchResponse [location=" + location + ", title=" + title
	        + ", summary=" + summary + "]";
    }

    @Override
    public int getColorCode() {
	return 0;
    }

    @Override
    public Long getId() {
	return b_r_id;
    }

    @Override
    public String getVenue() {
	// TODO Auto-generated method stub
	return null;
    }

    public String getBlood_grps_requested_str() {
	return blood_grps_requested_str;
    }

    public void setBlood_grps_requested_str(String blood_grps_requested_str) {
	this.blood_grps_requested_str = blood_grps_requested_str;
    }
    
    

}
