package api;

import controllers.TodoController;
import models.Result;
import models.ToDo;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestTodo {

    @Test
    public void testGetPostById() {
        Result<ToDo> result = TodoController.getToDoById(1);
        Assert.assertEquals(result.getStatusCode(), 200);
        Assert.assertEquals(result.getData().getTitle(), "delectus aut autem");
    }
}
