package com.codemyth.jackson.jsonSerialize;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class PersonJsonSerialize {
	
	private String name;
	
	private String address;
	
	@JsonSerialize(using = PersonJsonIsGoodSerialize.class)
	private boolean isGood;

	public PersonJsonSerialize(String name, String address, boolean isGood) {
		this.name = name;
		this.address = address;
		this.isGood = isGood;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	

}
