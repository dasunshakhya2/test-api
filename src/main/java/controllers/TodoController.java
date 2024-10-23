package controllers;

import utils.HttpClient;

public class TodoController {



    public static String getToDoById(int todoId) {
        String url = "https://jsonplaceholder.typicode.com/todos/" + todoId;
       return HttpClient.sendGETRequest(url);
    }
    
}
