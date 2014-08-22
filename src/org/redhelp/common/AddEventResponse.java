package org.redhelp.common;

import org.redhelp.common.types.AddEventResponseType;

public class AddEventResponse {

    private int number_of_volunteers;
    private int number_of_attendees;
    
    private AddEventResponseType response_types;

    public int getNumber_of_volunteers() {
        return number_of_volunteers;
    }

    public void setNumber_of_volunteers(int number_of_volunteers) {
        this.number_of_volunteers = number_of_volunteers;
    }

    public int getNumber_of_attendees() {
        return number_of_attendees;
    }

    public void setNumber_of_attendees(int number_of_attendees) {
        this.number_of_attendees = number_of_attendees;
    }

    public AddEventResponseType getResponse_types() {
        return response_types;
    }

    public void setResponse_types(AddEventResponseType response_types) {
        this.response_types = response_types;
    }
    
}
