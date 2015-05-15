package com.garman.ofx.objectgraph.shared;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	public String marshal(Date date) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss'.'SSS'['X']'");
		String string = formatter.format(date);

		return string;
	}

	public Date unmarshal(String string) throws Exception {
		string = string.trim();
		Integer timeZoneStartIndex = string.indexOf("-") + 1;
		Integer timeZoneEndIndex = string.indexOf(":");
		String timeZone = string.substring(timeZoneStartIndex, timeZoneEndIndex);
		String adjustedTimeZone = (timeZone.length() == 1) ? "0" + timeZone : timeZone;
		String adjustedDtPosted = string.substring(0, timeZoneStartIndex) + adjustedTimeZone + "]";

		SimpleDateFormat parser = new SimpleDateFormat("yyyyMMddHHmmss.SSS'['X']'");
		Date date = parser.parse(adjustedDtPosted);

		return date;
	}
}

