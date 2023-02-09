package org.launchcode.Ch15practice.models;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Dinosaur {
    private int id;
    private static int nextId = 1;
    @NotBlank(message = "Species required!")
    @Size(min = 3)
    private String species;

    @NotNull
    private String diet;
    @NotNull
    private String aquatic;

    public Dinosaur(){
        this.id = nextId;
        nextId++;
    }
    public Dinosaur(String species, String diet, String aquatic) {
        this();
        this.species = species;
        this.diet = diet;
        this.aquatic = aquatic;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String isAquatic() {
        return aquatic;
    }

    public void setAquatic(String aquatic) {
        this.aquatic = aquatic;
    }
}
