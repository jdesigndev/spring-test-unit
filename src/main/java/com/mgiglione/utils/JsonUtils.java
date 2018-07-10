package com.mgiglione.utils;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
 
/**
 * Util class to do:
 * - MARSHALLING: convert string json or file into Object
 * @return an object
 *  
 * - UNMARSHALLING: convert Object into string json
 * @return a string json
 *   
 */
public class JsonUtils {
	
	//request by sonar
	private JsonUtils() {
	}

	public static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

	public static <T> T json2Object(String str, Class<T> clazz)
			throws   IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		return objectMapper.readValue(str, clazz);
	}

	public static <T> String object2Json(T obj) throws   IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		return objectMapper.writeValueAsString(obj);
	}

	public static <T> T jsonFile2Object(String fileName, Class<T> clazz)
			throws  IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		//Ignoring missing fields in model objects
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return objectMapper.readValue(new File(concatenate(fileName)), clazz);
	}

	private static String concatenate(String fileName) {
		return "src/test/resources/"+fileName;
	}
	
	
}
