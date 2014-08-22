package org.redhelp.common;

import org.redhelp.common.types.EventRequestType;

public class AddEventRequest {

    private Long b_p_id;
    private Long s_id;
    
    private EventRequestType request_type;

    public Long getB_p_id() {
        return b_p_id;
    }

    public void setB_p_id(Long b_p_id) {
        this.b_p_id = b_p_id;
    }

    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }

    public EventRequestType getRequest_type() {
        return request_type;
    }

    public void setRequest_type(EventRequestType request_type) {
        this.request_type = request_type;
    }

    @Override
    public String toString() {
	return "AddAttendEventRequest [b_p_id=" + b_p_id + ", s_id=" + s_id + ", request_type=" + request_type + "]";
    }
    
    
}
