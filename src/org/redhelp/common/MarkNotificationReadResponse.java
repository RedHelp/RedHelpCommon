package org.redhelp.common;

import org.redhelp.common.types.MarkNotificationResponseType;

public class MarkNotificationReadResponse {
    private MarkNotificationResponseType responseType;

    public MarkNotificationResponseType getResponseType() {
	return responseType;
    }

    public void setResponseType(MarkNotificationResponseType responseType) {
	this.responseType = responseType;
    }

    @Override
    public String toString() {
	return "MarkNotificationReadResponse [responseType=" + responseType + "]";
    }
    
}
