package org.redhelp.common;

import org.redhelp.common.types.EditUserResponseTypes;

public class EditUserAccountResponse {

	private long u_id;
	private EditUserResponseTypes editUserResponseType;
	
	public long getU_id() {
		return u_id;
	}

	public void setU_id(long u_id) {
		this.u_id = u_id;
	}
	
	public EditUserResponseTypes getEditUserResponseType() {
		return editUserResponseType;
	}

	public void setEditUserResponseType(EditUserResponseTypes editUserResponseType) {
		this.editUserResponseType = editUserResponseType;
	}

	@Override
	public String toString() {
		return "EditUserRequestResponse [u_id=" + u_id
				+ ", editUserResponseType=" + editUserResponseType + "]";
	}

}
