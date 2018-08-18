package models;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    private int id;
    private String review;
    private double beanRating;

    public Review(String review, double beanRating) {
        this.review = review;
        this.beanRating = beanRating;
    }

    public Review(){} //HB constructor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="review")
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    @Column(name="bean_rating")
    public double getBeanRating() {
        return beanRating;
    }

    public void setBeanRating(double beanRating) {
        this.beanRating = beanRating;
    }
} //end

