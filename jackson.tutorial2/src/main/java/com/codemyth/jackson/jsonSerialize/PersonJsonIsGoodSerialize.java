package com.codemyth.jackson.jsonSerialize;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class PersonJsonIsGoodSerialize extends JsonSerializer<Boolean> {

	@Override
	public void serialize(Boolean value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {

		if (value)
			jgen.writeString("1");
		else
			jgen.writeString("0");

	}

}
