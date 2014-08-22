package org.redhelp.common;


public class GetBloodProfileRequest {
    private Long requester_b_p_id;
    private Long b_p_id;
    
    public Long getB_p_id() {
        return b_p_id;
    }
    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }
    public Long getRequester_b_p_id() {
        return requester_b_p_id;
    }
    public void setRequester_b_p_id(Long requester_b_p_id) {
        this.requester_b_p_id = requester_b_p_id;
    }
    @Override
    public String toString() {
	return "GetBloodProfileRequest [requester_b_p_id=" + requester_b_p_id + ", b_p_id=" + b_p_id + "]";
    }
}
