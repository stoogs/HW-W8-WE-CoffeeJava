package models;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    private int id;
    private String review;
    private double beanRating;
    private Recipe recipe;

    public Review(String review, double beanRating, Recipe recipe) {
        this.review = review;
        this.beanRating = beanRating;
        this.recipe = recipe;
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
    @ManyToOne
    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
} //end

