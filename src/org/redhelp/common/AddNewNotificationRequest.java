package org.redhelp.common;

public class AddNewNotificationRequest {
    
    private Long n_id;
    private Long b_p_id;
    private String title;
    public Long getN_id() {
        return n_id;
    }
    public void setN_id(Long n_id) {
        this.n_id = n_id;
    }
    public Long getB_p_id() {
        return b_p_id;
    }
    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
	return "AddNewNotification [n_id=" + n_id + ", b_p_id=" + b_p_id + ", title=" + title + "]";
    }
}
