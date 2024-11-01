package utils;

import com.google.gson.Gson;

public class JsonParser {

    private static final Gson gson = new Gson();


    public static <T> T convertJsonStringToObject(Class<T> type, String json) {
        return gson.fromJson(json, type);
    }
}
