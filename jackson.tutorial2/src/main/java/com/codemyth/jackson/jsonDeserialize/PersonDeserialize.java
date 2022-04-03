package com.codemyth.jackson.jsonDeserialize;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class PersonDeserialize {
	
	private int pid;
	
	private String pname;
	
	private boolean isOsm;

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@JsonProperty("isOsm")
	@JsonDeserialize(using = PersonOsmAttributeDeserialize.class)
	public void setOsm(boolean isOsm) {
		this.isOsm = isOsm;
	}

	@Override
	public String toString() {
		return "PersonDeserialize [pid=" + pid + ", pname=" + pname + ", isOsm=" + isOsm + "]";
	}
	
	
	
	

}
