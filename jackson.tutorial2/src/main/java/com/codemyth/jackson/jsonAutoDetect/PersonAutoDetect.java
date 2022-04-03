package com.codemyth.jackson.jsonAutoDetect;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class PersonAutoDetect {

	private int pid = 10;

	public String pname = "hrishab";

	@Override
	public String toString() {
		return "PersonAutoDetect [pid=" + pid + ", pname=" + pname + "]";
	}

}
