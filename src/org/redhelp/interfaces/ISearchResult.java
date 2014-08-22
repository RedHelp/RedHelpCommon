package org.redhelp.interfaces;

import org.redhelp.common.types.Location;

public interface ISearchResult {
    public Location getLocation();
    public String getTitle();
    public String getSummary();
    public int getColorCode();
    public Long getId();
    public String getVenue();
}
