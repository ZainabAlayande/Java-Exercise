package json.deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.Cat;

import java.io.IOException;

public class CatDeserializer {

    public static Cat deserializeJsonToCat(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json.getBytes(), Cat.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        return null;
    }
}
