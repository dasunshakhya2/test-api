package configs;

public class Configurations {

    public static final String BASE_URL = System.getenv("BASE_URL") != null ? System.getenv("BASE_URL") : "https://jsonplaceholder.typicode.com";
}
