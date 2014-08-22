package org.redhelp.common;

import java.util.Date;

public class GetUserAccountResponse {

    private UserProfileCommonFields userProfileCommonFields;

    public UserProfileCommonFields getUserProfileCommonFields() {
	return userProfileCommonFields;
    }

    public void setUserProfileCommonFields(UserProfileCommonFields userProfileCommonFields) {
	this.userProfileCommonFields = userProfileCommonFields;
    }

    @Override
    public String toString() {
	return "GetUserAccountResponse [userProfileCommonFields=" + userProfileCommonFields + "]";
    }
}
