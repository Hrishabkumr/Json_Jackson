package com.codemyth.jackson.jsonGetter;

public class PersonJsonGetter {

	private String pname;

	private int pid;

	public PersonJsonGetter(String pname, int pid) {
		this.pname = pname;
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public int getPid() {
		return pid;
	}

}
