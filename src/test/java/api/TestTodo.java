package api;

import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;
import controllers.TodoController;

import static utils.HttpClient.sendGETRequest;


public class TestTodo {

    @Test
    public void testGetPostById() {
        String response = TodoController.getToDoById(1);
        String title = JsonPath.read(response, "$.title");
        Assert.assertEquals(title,  "delectus aut autem");

    }
    @Test
    public void testGetTodos() {

        String response = TodoController.getToDos(1);
        int userid =JsonPath.read(response, "$.userId");

        Assert.assertEquals(userid,  1);

    }
}
