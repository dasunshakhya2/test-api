package models;

public class ToDo {
    private String title;
    private int userId;
    private int id;
    private boolean completed;

    public String getTitle() {
        return title;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }
}
