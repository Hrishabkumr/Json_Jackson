package com.codemyth.jackson.jsonSetter;

import org.codehaus.jackson.annotate.JsonSetter;

public class PersonJsonSetter {
	
	private int pid;
	
	private String pname;

	@JsonSetter("pid")
	public void setPid(int pid) {
		this.pid = pid;
	}

	@JsonSetter("pname")
	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "PersonJsonSetter [pid=" + pid + ", pname=" + pname + "]";
	}
	
	

}
