package utils;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpClient {
    private static final OkHttpClient CLIENT = new OkHttpClient();
   

    public static String sendGETRequest(String url) {
        Request request = new Request.Builder().url(url).build();
        return executeRequest(request);
    }

    private static String executeRequest(Request request) {
        String res = "";
         try (Response response = CLIENT.newCall(request).execute()) {
             res= response.body().string();
         } catch (IOException e) {
             System.err.println(e);
         }
         return res;
    }
}
