package com.codemyth.jackson.jsonDeserialize;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class PersonOsmAttributeDeserialize extends JsonDeserializer<Boolean> {

	@Override
	public Boolean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		String text = jp.getText();
		return "0".equals(text) ? false : true;
	}

}
