package com.codemyth.jackson.jsonPropertyOrder;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersoJsonPropertyOrderTest {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		PersoJsonPropertyOrder per = new PersoJsonPropertyOrder(2212,"Hrishabkumar");
		String json = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(per);
		
		System.out.println(json);
	}

}
