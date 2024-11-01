package utils;

import models.CustomResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpClient {
    private static final OkHttpClient CLIENT = new OkHttpClient();


    public static CustomResponse sendGETRequest(String url) {
        Request request = new Request.Builder().url(url).build();
        return executeRequest(request);
    }

    private static CustomResponse executeRequest(Request request) {
        CustomResponse customResponse = null;

        try (Response response = CLIENT.newCall(request).execute()) {
            String res = response.body().string();
            int statusCode = response.code();
            customResponse = new CustomResponse(res,statusCode );
        } catch (IOException e) {
            System.err.println(e);
        }
        return customResponse;
    }
}
