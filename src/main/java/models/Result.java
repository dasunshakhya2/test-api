package models;

public class Result<T> {

    private final T data;
    private final int statusCode;

    public Result(T data, int statusCode) {
        this.data = data;
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
