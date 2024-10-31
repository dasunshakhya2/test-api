package controllers;

import utils.HttpClient;

public class TodoController {


    public static String getToDoById(int todoId) {
        String url = "https://jsonplaceholder.typicode.com/" + todoId;
        return HttpClient.sendGETRequest(url);


    }

    public static String getconfiguration(int todoId) {
        String url = Configuration.getData()+ todoId;

        return HttpClient.sendGETRequest(url);

    }
}