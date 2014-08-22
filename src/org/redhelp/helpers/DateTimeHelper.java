package org.redhelp.helpers;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeHelper {

    public static String convertJavaDateToString(Date javaDate, DateTimeFormatter formatter) {
	DateTime jodaDateTime = new DateTime(javaDate);
	return formatter.print(jodaDateTime);	
    }
    
    public static Date convertStringToJavaDate(String stringDate, DateTimeFormatter formatter) {
	DateTime jodaDateTime = formatter.parseDateTime(stringDate);
	return jodaDateTime.toDate();
    }
}
