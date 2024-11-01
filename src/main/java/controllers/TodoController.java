package controllers;

import models.CustomResponse;
import models.Result;
import models.ToDo;
import utils.HttpClient;
import utils.JsonParser;

public class TodoController {


    public static Result<ToDo> getToDoById(int todoId) {
        String url = "https://jsonplaceholder.typicode.com/todos/" + todoId;
        CustomResponse r = HttpClient.sendGETRequest(url);

        ToDo toDo = JsonParser.convertJsonStringToObject(ToDo.class, r.getBody());
        return new Result<>(toDo, r.getStatusCode());
    }

}
