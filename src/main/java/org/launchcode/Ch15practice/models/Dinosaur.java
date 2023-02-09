package org.launchcode.Ch15practice.models;

public class Dinosaur {
    private int id;
    private static int nextId = 1;
    private String species;
    private String diet;
    private boolean aquatic;

    public Dinosaur(){
        this.id = nextId;
        nextId++;
    }
    public Dinosaur(String species, String diet, boolean aquatic) {
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

    public boolean isAquatic() {
        return aquatic;
    }

    public void setAquatic(boolean aquatic) {
        this.aquatic = aquatic;
    }
}
