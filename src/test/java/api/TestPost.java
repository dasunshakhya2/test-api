package api;

import com.jayway.jsonpath.JsonPath;
import controllers.PostController;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPost {

    @Test
    public void testGetPostById() {
        String response = PostController.getToDoById(1);
        String title = JsonPath.read(response, "$.title");
        Assert.assertEquals(title,  "delectus aut autem");
    }
}
