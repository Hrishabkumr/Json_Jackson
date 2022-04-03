package com.codemyth.jackson.jsonSerialize;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonJsonSerializeTest {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		PersonJsonSerialize per = new PersonJsonSerialize("Hrishab", "Mumbai", true);
		String json = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(per);

		System.out.println(json);
	}

}
