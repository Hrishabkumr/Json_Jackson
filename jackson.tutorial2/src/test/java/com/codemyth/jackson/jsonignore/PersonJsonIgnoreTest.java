package com.codemyth.jackson.jsonignore;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonJsonIgnoreTest {

	public static String json = "{\r\n" + "\"pid\" : 1234,\r\n" + "\"pname\" : \"Hrishabkumar\",\r\n"
			+ "\"paddress\" : \"Mumbai\"\r\n" + "}";

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		PersonJsonIgnore per = new ObjectMapper().readValue(json, PersonJsonIgnore.class);
		System.out.println(per);

		String jsonData = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(per);
		System.out.println(jsonData);
	}
}
