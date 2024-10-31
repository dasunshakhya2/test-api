package controllers;

import com.jayway.jsonpath.JsonPath;

import utils.HttpClient;

public class PostController {

   public static String getToDoById(int todoId) {
       String url = "https://jsonplaceholder.typicode.com/posts/" + todoId;
       return HttpClient.sendGETRequest(url);
   }
}
