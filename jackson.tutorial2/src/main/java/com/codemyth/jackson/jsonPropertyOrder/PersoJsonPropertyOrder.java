package com.codemyth.jackson.jsonPropertyOrder;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({"name","id"})
public class PersoJsonPropertyOrder {

	private int id;
	private String name;

	public PersoJsonPropertyOrder(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
