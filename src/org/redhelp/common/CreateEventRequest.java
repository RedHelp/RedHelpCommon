package org.redhelp.common;

import java.util.Date;
import java.util.SortedSet;


public class CreateEventRequest {

    private Long b_p_id;
    
    // Event related fields
    private String name;
    private String phone_number;
    private String additional_email;
    private String organization;
    
    //Location related fields
    private String location_name;
    private String location_address;
    private Double location_lat;
    private Double location_long;
    
    
    //Time and slots related fields
    private Date master_start_datetime;
    private Date master_end_datetime;
    
    private SortedSet<SlotsCommonFields> slots;
}
