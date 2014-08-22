package org.redhelp.common;

import org.redhelp.common.types.EditBloodProfileResponseType;

public class EditBloodProfileResponse {

    private Long u_id;
    private EditBloodProfileResponseType editBloodProfileType;
  
    public Long getU_id() {
        return u_id;
    }
    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }
    public EditBloodProfileResponseType getEditBloodProfileType() {
        return editBloodProfileType;
    }
    public void setEditBloodProfileType(EditBloodProfileResponseType editBloodProfileType) {
        this.editBloodProfileType = editBloodProfileType;
    }
    
    @Override
    public String toString() {
	return "EditBloodProfileResponse [u_id=" + u_id + ", editBloodProfileType=" + editBloodProfileType + "]";
    }  
}
