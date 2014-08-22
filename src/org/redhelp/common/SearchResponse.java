package org.redhelp.common;

import java.io.Serializable;
import java.util.Set;

public class SearchResponse implements Serializable {

    private Set<BloodProfileSearchResponse> set_blood_profiles;
    private Set<BloodRequestSearchResponse> set_blood_requests;
    private Set<EventSearchResponse> set_events;
    
    public Set<BloodProfileSearchResponse> getSet_blood_profiles() {
        return set_blood_profiles;
    }
    public void setSet_blood_profiles(Set<BloodProfileSearchResponse> set_blood_profiles) {
        this.set_blood_profiles = set_blood_profiles;
    }
    public Set<BloodRequestSearchResponse> getSet_blood_requests() {
        return set_blood_requests;
    }
    public void setSet_blood_requests(Set<BloodRequestSearchResponse> set_blood_requests) {
        this.set_blood_requests = set_blood_requests;
    } 
    public Set<EventSearchResponse> getSet_events() {
	return set_events;
    }
    public void setSet_events(Set<EventSearchResponse> set_events) {
	this.set_events = set_events;
    }
    
    @Override
    public String toString() {
	return "SearchResponse [set_blood_profiles=" + set_blood_profiles + ", set_blood_requests="
	        + set_blood_requests + ", set_events=" + set_events + "]";
    }
    
}
