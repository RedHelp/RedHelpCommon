package org.redhelp.common;

import java.io.Serializable;

import org.redhelp.common.types.Location;
import org.redhelp.interfaces.ISearchResult;

public class EventSearchResponse implements ISearchResult, Serializable {

    
    private Location last_updated_location;
    private String title;
    private String summary;
    
    private Long e_id;
    private String venue;
    
    private String scheduled_date_time;
    
    
    
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

    public Long getE_id() {
        return e_id;
    }

    public void setE_id(Long e_id) {
        this.e_id = e_id;
    }

    public void setVenue(String venue) {
        this.venue = venue;
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
	return "EventSearchResponse [last_updated_location=" + last_updated_location + ", title=" + title
	        + ", summary=" + summary + ", e_id=" + e_id + ", venue=" + venue + ", scheduled_date_time="
	        + scheduled_date_time + "]";
    }

    @Override
    public int getColorCode() {
	return 0;
    }

    @Override
    public Long getId() {
	return e_id;
    }

    @Override
    public String getVenue() {
	return venue;
    }

    public String getScheduled_date_time() {
	return scheduled_date_time;
    }

    public void setScheduled_date_time(String scheduled_date_time) {
	this.scheduled_date_time = scheduled_date_time;
    }
    
    

}
