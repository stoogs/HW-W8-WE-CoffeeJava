package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="recipes")
public class Recipe {
    private int id;
    private String name;
    private EquipmentType brewMethod;
    private double grams;
    private int waterTemp;
    private int waterWeight;
    private String grind;
    private String brewTime;
    private double ratio;
    private String info;
    //TODO ADD PATRON
    public Recipe(String name, EquipmentType brewMethod, double grams, int waterTemp, int waterWeight, String grind, String brewTime, String info) {
        this.name = name;
        this.brewMethod = brewMethod;
        this.grams = grams;
        this.waterTemp = waterTemp;
        this.waterWeight = waterWeight;
        this.grind = grind;
        this.brewTime = brewTime;
        this.info = info;
    }

    public Recipe() {} //HB constructor

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //@Column(name="brewmethod")
    @Enumerated(value=EnumType.STRING)
    public EquipmentType getBrewMethod() {
        return brewMethod;
    }

    public void setBrewMethod(EquipmentType brewMethod) {
        this.brewMethod = brewMethod;
    }
    @Column(name="grams")
    public double getGrams() {
        return grams;
    }

    public void setGrams(double grams) {
        this.grams = grams;
    }
    @Column(name="temperature")
    public int getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(int waterTemp) {
        this.waterTemp = waterTemp;
    }
    @Column(name="water_ml")
    public int getWaterWeight() {
        return waterWeight;
    }

    public void setWaterWeight(int waterWeight) {
        this.waterWeight = waterWeight;
    }
    @Column(name="grind")
    public String getGrind() {
        return grind;
    }

    public void setGrind(String grind) {
        this.grind = grind;
    }
    @Column(name="brew_time")
    public String getBrewTime() {
        return brewTime;
    }

    public void setBrewTime(String brewTime) {
        this.brewTime = brewTime;
    }
    @Column(name="ratio")
    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
    @Column(name="info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

} //end
