package controllers;

import configs.Configurations;
import core.HttpClient;
import core.Response;
import core.Result;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import models.ToDo;
import utils.JsonParser;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TodoController {


    public static Response<ToDo> getToDoById(int todoId) {
        String url = Configurations.BASE_URL + "/todos/" + todoId;
        Result result = HttpClient.sendGetRequest(url);
        ToDo toDo = JsonParser.convertJsonStringToObject(ToDo.class, result.getResBody());

        return new Response<>(toDo, result.getStatusCode());

    }

    public static Response<List<ToDo>> getToDos() {
        String url = Configurations.BASE_URL + "/todos/";
        Result result = HttpClient.sendGetRequest(url);
        List<ToDo> toDoList = JsonParser.convertJsonStringToObjectList(ToDo.class, result.getResBody());
        return new Response<>(toDoList, result.getStatusCode());
    }

}
