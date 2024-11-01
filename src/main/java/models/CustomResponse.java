package models;

public class CustomResponse {
    private  String body;
    private  int statusCode;


    public CustomResponse(){

    }

    public CustomResponse(String body, int statusCode){
        this.body=body;
        this.statusCode=statusCode;
    }

    public String getBody() {
        return body;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
