package org.redhelp.common;

import java.io.Serializable;
import java.util.SortedSet;

import org.redhelp.common.types.GetNewNotificationsResponseType;

public class GetNewNotificationsResponse implements Serializable {
    
    /**
     * Generated serialVersionUID
     */
    private static final long serialVersionUID = -7994306807672245387L;
    
    private GetNewNotificationsResponseType responseType;
    private SortedSet<NotificationCommonFields> notificationCommonFields;
    
    public GetNewNotificationsResponseType getResponseType() {
        return responseType;
    }
    public void setResponseType(GetNewNotificationsResponseType responseType) {
        this.responseType = responseType;
    }
    public SortedSet<NotificationCommonFields> getNotificationCommonFields() {
        return notificationCommonFields;
    }
    public void setNotificationCommonFields(SortedSet<NotificationCommonFields> notificationCommonFields) {
        this.notificationCommonFields = notificationCommonFields;
    }
    
    @Override
    public String toString() {
	return "GetNewNotificationsResponse [responseType=" + responseType + ", notificationCommonFields="
	        + notificationCommonFields + "]";
    }
}
