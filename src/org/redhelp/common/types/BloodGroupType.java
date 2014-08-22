package org.redhelp.common.types;

public enum BloodGroupType {
    A,
    A_,
    B,
    B_,
    O,
    O_,
    AB,
    AB_;
    
    @Override
    public String toString(){
	switch(this) {
	case A:
	    return "A+";
	case A_:
	    return "A-";
	case B:
	    return "B+";
	case B_: 
	    return "B-";
	case O:
	    return "O+";
	case O_:
	    return "O-";
	case AB:
	    return "AB+";
	case AB_:
	    return "AB-";
	default:
	    return "-";
	}
    }
}
