package models;

public class User {
    private int id;
    private String username;
    private String bio;

    public User(String username, String bio) {
        this.username = username;
        this.bio = bio;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}//end
