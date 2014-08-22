package org.redhelp.common;

import java.util.Set;

import org.redhelp.common.types.Location;
import org.redhelp.common.types.SearchItemTypes;
import org.redhelp.common.types.SearchRequestType;

public class SearchRequest {

    private Location southWestLocation;
    private Location northEastLocation;
    private Location cameraPositionLocation;  
    private Location userCurrentLocation;
    
    private Double radius;
    
    private SearchRequestType searchRequestType;
    
    private Set<SearchItemTypes> searchItems;

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
