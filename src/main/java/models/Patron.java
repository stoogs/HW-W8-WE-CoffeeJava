package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patrons")
public class Patron {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="username")
    private String username;
    @Transient
    private String bio;
    //TODO NEW
    @OneToMany(mappedBy="patron")
    private List<Review> reviews;

    //TODO ONE Patron has many recipes and many reviews.

    public Patron(String username, String bio) {
        this.username = username;
        this.bio = bio;
        this.reviews = new ArrayList<Review>();
    }
    public Patron(){} //Blank HB constructor

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

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

}//end
