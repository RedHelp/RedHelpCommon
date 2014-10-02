package org.redhelp.common;

import java.util.List;

import org.redhelp.common.types.UpdateBloodRequestState;

public class UpdateBloodRequest {
    
    private Long b_r_id;
    private List<Long> verified_b_p_ids;
    private UpdateBloodRequestState updateState;
    
    public Long getB_r_id() {
        return b_r_id;
    }
    public void setB_r_id(Long b_r_id) {
        this.b_r_id = b_r_id;
    }
    public List<Long> getVerified_b_p_ids() {
        return verified_b_p_ids;
    }
    public void setVerified_b_p_ids(List<Long> verified_b_p_ids) {
        this.verified_b_p_ids = verified_b_p_ids;
    }
    public UpdateBloodRequestState getUpdateState() {
	return updateState;
    }
    public void setUpdateState(UpdateBloodRequestState updateState) {
	this.updateState = updateState;
    }
    @Override
    public String toString() {
	return "UpdateBloodRequest [b_r_id=" + b_r_id + ", verified_b_p_ids=" + verified_b_p_ids + ", updateState="
	        + updateState + "]";
    }
}
