package models;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="review")
    private String review;
    @Column(name="bean_rating")
    private double beanRating;
    @ManyToOne
    //@JoinColumn(name="recipe_id") NOT REQUIRED
    private Recipe recipe;
    @ManyToOne
    private Patron patron;


    public Review(String review, double beanRating, Recipe recipe, Patron patron) {
        this.review = review;
        this.beanRating = beanRating;
        this.recipe = recipe;
        this.patron = patron;
    }

    public Review(){} //HB constructor

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
    public double getBeanRating() {
        return beanRating;
    }
    public void setBeanRating(double beanRating) {
        this.beanRating = beanRating;
    }

    public Recipe getRecipe() {
        return recipe;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

} //end

