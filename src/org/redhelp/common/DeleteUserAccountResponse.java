package org.redhelp.common;

import org.redhelp.common.types.DeleteUserAccountTypes;

public class DeleteUserAccountResponse {

    private DeleteUserAccountTypes deleteUserAccountType;

    public DeleteUserAccountTypes getDeleteUserAccountType() {
	return deleteUserAccountType;
    }

    public void setDeleteUserAccountType(DeleteUserAccountTypes deleteUserAccountType) {
	this.deleteUserAccountType = deleteUserAccountType;
    }

    @Override
    public String toString() {
	return "DeleteUserAccountResponse [deleteUserAccountType=" + deleteUserAccountType + "]";
    }
    
}
