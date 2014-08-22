package org.redhelp.common;

import java.io.Serializable;

import org.redhelp.common.types.Location;
import org.redhelp.interfaces.ISearchResult;

public class BloodProfileSearchResponse implements ISearchResult, Serializable{

    
    private Location last_updated_location;
    private String title;
    private String summary;
    
    private String blood_grp;
    private byte[] user_image;
    
    private Long b_p_id;
    
    public Long getB_p_id() {
        return b_p_id;
    }

    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }

    @Override
    public Location getLocation() {
	// TODO Auto-generated method stub
	return last_updated_location;
    }

    @Override
    public String getTitle() {
	// TODO Auto-generated method stub
	return title;
    }

    @Override
    public String getSummary() {
	// TODO Auto-generated method stub
	return summary;
    }

    public Location getLast_updated_location() {
        return last_updated_location;
    }

    public void setLast_updated_location(Location last_updated_location) {
        this.last_updated_location = last_updated_location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
	return "BloodProfileSearchResponse [last_updated_location=" + last_updated_location + ", title=" + title
	        + ", summary=" + summary + "]";
    }

    @Override
    public int getColorCode() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public Long getId() {
	return b_p_id;
    }

    @Override
    public String getVenue() {
	// TODO Auto-generated method stub
	return null;
    }

    public String getBlood_grp() {
	return blood_grp;
    }

    public void setBlood_grp(String blood_grp) {
	this.blood_grp = blood_grp;
    }

    public byte[] getUser_image() {
	return user_image;
    }

    public void setUser_image(byte[] user_image) {
	this.user_image = user_image;
    }
    
    

}
