package org.redhelp.common;

import java.io.Serializable;
import java.util.Date;

public class SlotsCommonFields implements Comparable<SlotsCommonFields>, Serializable{

    //Date time related fields
    private String start_datetime;
    private String end_datetime;
    
    private int max_attendees;
    private int current_attendees;
    private int max_volunteers;
    private int current_volunteers;
    
    private Long s_id;
    
    public String getStart_datetime() {
        return start_datetime;
    }
    public void setStart_datetime(String start_datetime) {
        this.start_datetime = start_datetime;
    }
    public String getEnd_datetime() {
        return end_datetime;
    }
    public void setEnd_datetime(String end_datetime) {
        this.end_datetime = end_datetime;
    }
    public int getMax_attendees() {
        return max_attendees;
    }
    public void setMax_attendees(int max_attendees) {
        this.max_attendees = max_attendees;
    }
    public int getCurrent_attendees() {
        return current_attendees;
    }
    public void setCurrent_attendees(int current_attendees) {
        this.current_attendees = current_attendees;
    }
    public int getMax_volunteers() {
        return max_volunteers;
    }
    public void setMax_volunteers(int max_volunteers) {
        this.max_volunteers = max_volunteers;
    }
    public int getCurrent_volunteers() {
        return current_volunteers;
    }
    public void setCurrent_volunteers(int current_volunteers) {
        this.current_volunteers = current_volunteers;
    }
    
    @Override
    public String toString() {
	return "SlotsCommonFields [start_datetime=" + start_datetime + ", end_datetime=" + end_datetime
	        + ", max_attendees=" + max_attendees + ", current_attendees=" + current_attendees + ", max_volunteers="
	        + max_volunteers + ", current_volunteers=" + current_volunteers + ", s_id=" + s_id + "]";
    }
    @Override
    public int compareTo(SlotsCommonFields that) {
	return (this.start_datetime.compareTo(that.start_datetime) > 1) ? 1 : -1;
    }
    public Long getS_id() {
	return s_id;
    }
    public void setS_id(Long s_id) {
	this.s_id = s_id;
    }
    
    
}
