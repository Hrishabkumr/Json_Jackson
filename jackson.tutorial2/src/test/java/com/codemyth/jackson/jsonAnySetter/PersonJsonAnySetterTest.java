package com.codemyth.jackson.jsonAnySetter;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonJsonAnySetterTest {

	public static String json = "{\r\n" + "\"pid\" : 1234,\r\n" + "\"pname\" : \"Hrishabkumar\"\r\n" + "}";
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		PersonJsonAnySetter per = new ObjectMapper().readValue(json, PersonJsonAnySetter.class);
		System.out.println(per);
	}

}
