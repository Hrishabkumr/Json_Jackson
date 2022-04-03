package com.codemyth.jackson.jsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;

public class PersonJsonAnyGetter {

	private int pid;

	private String pname;

	private String paddress;

	private String pnumber;

	private Map<String, Object> properties = new HashMap<String, Object>();

	public PersonJsonAnyGetter(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void add(String key, String value) {
		properties.put(key, value);
	}

	@JsonAnyGetter
	public Map<String, Object> getProperties() {
		return this.properties;
	}

}
