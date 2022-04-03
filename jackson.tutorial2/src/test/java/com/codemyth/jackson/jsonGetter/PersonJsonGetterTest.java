package com.codemyth.jackson.jsonGetter;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonJsonGetterTest {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		PersonJsonGetter per = new PersonJsonGetter("Hrishabkumar", 23);
		String json = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(per);
		System.out.println(json);
	}

}
