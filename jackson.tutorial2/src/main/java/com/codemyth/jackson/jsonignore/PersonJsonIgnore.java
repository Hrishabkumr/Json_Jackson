package com.codemyth.jackson.jsonignore;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIgnoreProperties({ "paddress" })
public class PersonJsonIgnore {

	@JsonProperty("pid")
	private int pid;

	@JsonIgnore
	@JsonProperty("pname")
	private String pname;

	@JsonProperty("paddress")
	private String pAddress;

	@Override
	public String toString() {
		return "PersonJsonIgnore [pid=" + pid + ", pname=" + pname + "]";
	}

}
