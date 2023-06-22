package json.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.Cat;

public class CatSerializer {

    public static String convertCatToJSON(Cat cat) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }


    }

}

