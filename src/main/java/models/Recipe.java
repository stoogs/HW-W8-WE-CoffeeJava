package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Enumerated(value=EnumType.STRING)
    private EquipmentType brewMethod;
    @Column(name="grams")
    private double grams;
    @Column(name="temperature")
    private int waterTemp;
    @Column(name="water_ml")
    private int waterWeight;
    @Column(name="grind")
    private String grind;
    @Column(name="brew_time")
    private String brewTime;
    @Column(name="ratio")
    private double ratio;
    @Column(name="info")
    private String info;
    @OneToMany(mappedBy = "recipe")
//    @JoinColumn(name="recipe_id") NOT REQUIRED
    private List<Review> reviews;

    //TODO ADD PATRON
    @ManyToOne
    @JoinColumn(name="patron_id", nullable=false)
    private Patron patron;


    public Recipe(String name, EquipmentType brewMethod, double grams, int waterTemp, int waterWeight, String grind, String brewTime, String info, Patron patron) {
        this.name = name;
        this.brewMethod = brewMethod;
        this.grams = grams;
        this.waterTemp = waterTemp;
        this.waterWeight = waterWeight;
        this.grind = grind;
        this.brewTime = brewTime;
        this.info = info;
        this.reviews = new ArrayList<Review>();
        this.patron = patron;
    }

    public Recipe() {} //HB constructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipmentType getBrewMethod() {
        return brewMethod;
    }

    public void setBrewMethod(EquipmentType brewMethod) {
        this.brewMethod = brewMethod;
    }

    public double getGrams() {
        return grams;
    }

    public void setGrams(double grams) {
        this.grams = grams;
    }
    public int getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(int waterTemp) {
        this.waterTemp = waterTemp;
    }
    public int getWaterWeight() {
        return waterWeight;
    }

    public void setWaterWeight(int waterWeight) {
        this.waterWeight = waterWeight;
    }
    public String getGrind() {
        return grind;
    }

    public void setGrind(String grind) {
        this.grind = grind;
    }
    public String getBrewTime() {
        return brewTime;
    }

    public void setBrewTime(String brewTime) {
        this.brewTime = brewTime;
    }
    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }
} //end
