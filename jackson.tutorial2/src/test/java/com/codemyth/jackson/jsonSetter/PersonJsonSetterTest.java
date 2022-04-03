package com.codemyth.jackson.jsonSetter;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonJsonSetterTest {

	public static String json = "{\r\n" + "\"pid\" : 1234,\r\n" + "\"pname\" : \"Hrishabkumar\"\r\n" + "}";
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		System.out.println(json);
		PersonJsonSetter per = new ObjectMapper().readValue(json, PersonJsonSetter.class);
		System.out.println(per);
	}

}
