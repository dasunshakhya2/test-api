package api;

import controllers.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;
import controllers.TodoController;


public class TestTodo {

    @Test
    public void testGetPostById() {
        String response = TodoController.getToDoById(1);
        String title = JsonPath.read(response, "$.title");
        Assert.assertEquals(title, "delectus aut autem");
    }

    @Test
    public void testtestGetPostById() {
        String response = TodoController.getconfiguration(1);
        String title = JsonPath.read(response, "$.title");
        Assert.assertEquals(title, "delectus aut autem");

    }
}