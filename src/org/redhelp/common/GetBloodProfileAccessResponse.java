package org.redhelp.common;

import org.redhelp.common.types.GetBloodProfileAccessResponseType;

public class GetBloodProfileAccessResponse {
    private GetBloodProfileAccessResponseType accessResponseType;

    public GetBloodProfileAccessResponseType getAccessResponseType() {
        return accessResponseType;
    }

    public void setAccessResponseType(GetBloodProfileAccessResponseType accessResponseType) {
        this.accessResponseType = accessResponseType;
    }

    @Override
    public String toString() {
	return "GetBloodProfileAccessResponse [accessResponseType=" + accessResponseType + "]";
    }
    

}
