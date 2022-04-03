package com.codemyth.jackson.jsonCreator;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class PersonJsonCreator {

	private int pid;

	private String pname;

	@JsonCreator
	public PersonJsonCreator(@JsonProperty("pid") int pid, @JsonProperty("pname") String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "PersonJsonCreator [pid=" + pid + ", pname=" + pname + "]";
	}

}
