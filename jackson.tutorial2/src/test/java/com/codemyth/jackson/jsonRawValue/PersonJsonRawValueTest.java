package com.codemyth.jackson.jsonRawValue;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonJsonRawValueTest {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		PersonJsonRawValue per = new PersonJsonRawValue(3344, "Hrishabkumar");
		
		String json = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(per);
		System.out.println(json);
	}

}
