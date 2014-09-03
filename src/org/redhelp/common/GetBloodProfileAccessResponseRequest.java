package org.redhelp.common;

public class GetBloodProfileAccessResponseRequest {
    
    private Long requester_b_p_id;
    private Long requestee_b_p_id;
    
    public Long getRequester_b_p_id() {
        return requester_b_p_id;
    }
    public void setRequester_b_p_id(Long requester_b_p_id) {
        this.requester_b_p_id = requester_b_p_id;
    }
   
    public Long getRequestee_b_p_id() {
        return requestee_b_p_id;
    }
    public void setRequestee_b_p_id(Long requestee_b_p_id) {
        this.requestee_b_p_id = requestee_b_p_id;
    }
    @Override
    public String toString() {
	return "GetBloodProfileAccessRequest [requester_b_p_id=" + requester_b_p_id + ", requestee_b_p_id="
	        + requestee_b_p_id + "]";
    }
    
    

}