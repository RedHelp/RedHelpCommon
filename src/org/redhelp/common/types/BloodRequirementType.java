package org.redhelp.common.types;

public enum BloodRequirementType {
    RBC,
    WHOLE_BLOOD,
    PLASMA,
    PLATELETS;
    
    @Override
    public String toString() {
	switch (this) {
	case RBC:
	    return "Red Blood Cells";
	case WHOLE_BLOOD:
	    return  "Whole Blood";
	case PLASMA:
	    return "Plasma";
	case PLATELETS:
	    return "Platelets";
	default:
	    return "null";
	}
    }
}
