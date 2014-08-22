package org.redhelp.common;

import java.util.List;

public class MarkNotificaionAsReadRequest {

    private List<Long> n_id_list;

    public List<Long> getN_id_list() {
	return n_id_list;
    }

    public void setN_id_list(List<Long> n_id_list) {
	this.n_id_list = n_id_list;
    }

    @Override
    public String toString() {
	return "MarkNotificaionAsReadRequest [n_id_list=" + n_id_list + "]";
    }
    
    
}
