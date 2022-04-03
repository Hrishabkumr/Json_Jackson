package com.codemyth.jackson.jsonDeserialize;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.codemyth.jackson.jsonAutoDetect.PersonAutoDetect;

public class PersonDeserializeTest {

	public static String json = "{\r\n" + "\"pid\" : 1234,\r\n" + "\"pname\" : \"Hrishabkumar\",\r\n"
			+ "\"isOsm\" : \"0\"\r\n" + "}";

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		PersonDeserialize per = new ObjectMapper().readValue(json, PersonDeserialize.class);
		System.out.println(per);
	}

}
