package org.redhelp.common;

public class GetBloodProfileAccessRequest {
    
    private Long requester_b_p_id;
    private Long receiver_b_p_id;
    
    public Long getRequester_b_p_id() {
        return requester_b_p_id;
    }
    public void setRequester_b_p_id(Long requester_b_p_id) {
        this.requester_b_p_id = requester_b_p_id;
    }
    public Long getReceiver_b_p_id() {
        return receiver_b_p_id;
    }
    public void setReceiver_b_p_id(Long receiver_b_p_id) {
        this.receiver_b_p_id = receiver_b_p_id;
    }
    @Override
    public String toString() {
	return "GetBloodProfileAccessRequest [requester_b_p_id=" + requester_b_p_id + ", receiver_b_p_id="
	        + receiver_b_p_id + "]";
    }
    
    

}
