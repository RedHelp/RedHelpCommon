package org.redhelp.common.types;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class JodaTimeFormatters {
    public static DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.dateTime();
    public static DateTimeFormatter dateFormatter = ISODateTimeFormat.date();
}
