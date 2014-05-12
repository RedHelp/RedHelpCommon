package org.redhelp.common;

public class DeleteUserAccountRequest {

    private long u_id;
    private String email;
   
    public long getU_id() {
        return u_id;
    }
    public void setU_id(long u_id) {
        this.u_id = u_id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
	return "DeleteUserAccountRequest [u_id=" + u_id + ", email=" + email + "]";
    }
    
    
}
