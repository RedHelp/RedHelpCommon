package org.redhelp.common;

public class AcceptBloodRequestResponse {
    private boolean response;
    
    

    public boolean isResponse() {
        return response;
    }



    public void setResponse(boolean response) {
        this.response = response;
    }



    @Override
    public String toString() {
	return "AcceptBloodRequestResponse [response=" + response + "]";
    }
    
}
