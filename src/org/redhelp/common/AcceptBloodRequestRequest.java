package org.redhelp.common;

public class AcceptBloodRequestRequest {
    private Long b_r_id;
    private Long b_p_id;
    
    public Long getB_r_id() {
        return b_r_id;
    }
    public void setB_r_id(Long b_r_id) {
        this.b_r_id = b_r_id;
    }
    public Long getB_p_id() {
        return b_p_id;
    }
    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }
    @Override
    public String toString() {
	return "AcceptBloodRequestRequest [b_r_id=" + b_r_id + ", b_p_id=" + b_p_id + "]";
    }
    
    

}
