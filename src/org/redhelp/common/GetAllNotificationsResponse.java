package org.redhelp.common;

import java.io.Serializable;
import java.util.SortedSet;

public class GetAllNotificationsResponse implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4707033203738781104L;
    
    private SortedSet<NotificationCommonFields> notificationCommonFields;
    
    public SortedSet<NotificationCommonFields> getNotificationCommonFields() {
        return notificationCommonFields;
    }
    public void setNotificationCommonFields(SortedSet<NotificationCommonFields> notificationCommonFields) {
        this.notificationCommonFields = notificationCommonFields;
    }
    
    @Override
    public String toString() {
	return "GetAllNotificationsResponse [ notificationCommonFields="
	        + notificationCommonFields + "]";
    }
}
