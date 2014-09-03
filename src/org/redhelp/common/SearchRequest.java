package org.redhelp.common;

import java.util.Set;

import org.redhelp.common.types.Location;
import org.redhelp.common.types.SearchItemTypes;
import org.redhelp.common.types.SearchRequestType;

public class SearchRequest {
    
    private Long b_p_id;
    private boolean require_user_location;
    private Location southWestLocation;
    private Location northEastLocation;
    private Location cameraPositionLocation;  
    private Location userCurrentLocation;
    
    private Double radius;
    
    private SearchRequestType searchRequestType;
    
    private Set<SearchItemTypes> searchItems;

    
    
    public Long getB_p_id() {
        return b_p_id;
    }

    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }

    public boolean isRequire_user_location() {
        return require_user_location;
    }

    public void setRequire_user_location(boolean require_user_location) {
        this.require_user_location = require_user_location;
    }

    public Location getSouthWestLocation() {
        return southWestLocation;
    }

    public void setSouthWestLocation(Location southWestLocation) {
        this.southWestLocation = southWestLocation;
    }

    public Location getNorthEastLocation() {
        return northEastLocation;
    }

    public void setNorthEastLocation(Location northEastLocation) {
        this.northEastLocation = northEastLocation;
    }

    public Location getCameraPositionLocation() {
        return cameraPositionLocation;
    }

    public void setCameraPositionLocation(Location cameraPositionLocation) {
        this.cameraPositionLocation = cameraPositionLocation;
    }

    public Location getUserCurrentLocation() {
        return userCurrentLocation;
    }

    public void setUserCurrentLocation(Location userCurrentLocation) {
        this.userCurrentLocation = userCurrentLocation;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Set<SearchItemTypes> getSearchItems() {
        return searchItems;
    }

    public void setSearchItems(Set<SearchItemTypes> searchItems) {
        this.searchItems = searchItems;
    }

    @Override
    public String toString() {
	return "SearchRequest [southWestLocation=" + southWestLocation + ", northEastLocation=" + northEastLocation
	        + ", cameraPositionLocation=" + cameraPositionLocation + ", userCurrentLocation=" + userCurrentLocation
	        + ", radius=" + radius + ", searchItems=" + searchItems + "]";
    }

    public SearchRequestType getSearchRequestType() {
	return searchRequestType;
    }

    public void setSearchRequestType(SearchRequestType searchRequestType) {
	this.searchRequestType = searchRequestType;
    }   
}
