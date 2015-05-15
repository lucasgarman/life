package com.garman.ofx.objectgraph.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="IncTransaction")
public class IncTransaction {

	@XmlElement(name="DTSTART")
	public String dtStart = "20140701000000";

	@XmlElement(name="DTEND")
	public String dtEnd = "20150512120000";

	@XmlElement(name="INCLUDE")
	public String include = "Y";
}
