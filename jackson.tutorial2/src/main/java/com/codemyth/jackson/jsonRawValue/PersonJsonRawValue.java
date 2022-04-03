package com.codemyth.jackson.jsonRawValue;

import org.codehaus.jackson.annotate.JsonRawValue;


public class PersonJsonRawValue {

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	@JsonRawValue
	public String getName() {
		return name;
	}

	public PersonJsonRawValue(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
