package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patrons")
public class Patron {
    private int id;
    private String username;
    private String bio;


    public Patron(String username, String bio) {
        this.username = username;
        this.bio = bio;
    }
    public Patron(){} //Blank HB constructor

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //@Column(name="bio")
    @Transient
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}//end
