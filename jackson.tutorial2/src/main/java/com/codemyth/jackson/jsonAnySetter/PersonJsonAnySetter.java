package com.codemyth.jackson.jsonAnySetter;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnySetter;

public class PersonJsonAnySetter {

	private Map<String, Object> properties = new HashMap<String, Object>();

	@JsonAnySetter
	public void setProperties(String key,String value) {
		this.properties.put(key, value);
	}

	@Override
	public String toString() {
		return "PersonJsonAnySetter [properties=" + properties + "]";
	}

}
