package com.codemyth.jackson.jsonAutoDetect;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonAutoDetectTest {

	public static String json = "{\r\n" + "\"pid\" : 1234,\r\n" + "\"pname\" : \"Hrishabkumar\",\r\n" + "}";

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		PersonAutoDetect per = new PersonAutoDetect();
		System.out.println(per);
		
		String jsonData = new ObjectMapper().writeValueAsString(per);
		System.out.println(jsonData);
	}
}
