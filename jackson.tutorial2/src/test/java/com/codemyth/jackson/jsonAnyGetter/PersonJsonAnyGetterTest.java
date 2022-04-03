package com.codemyth.jackson.jsonAnyGetter;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonJsonAnyGetterTest {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		PersonJsonAnyGetter per = new PersonJsonAnyGetter(1, "Hrishab");
		per.add("paddress", "Mumbai");
		per.add("pnumber", "9876343432");

		String json = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(per);
		System.out.println(json);
	}

}
