package org.launchcode.Ch15practice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class DinoEgg {

    @Id
    @GeneratedValue
    private int id;

    private int sizeInches;
    private int weightKg;
    private String dateLaid;

    @ManyToOne
    @NotNull(message = "Category is required")
    private Dinosaur dinosaur;

    public DinoEgg(){ }

    public DinoEgg(int sizeInches, int weightKg, String dateLaid) {
        this.sizeInches = sizeInches;
        this.weightKg = weightKg;
        this.dateLaid = dateLaid;
    }

    public int getId() {
        return id;
    }

    public int getSizeInches() {
        return sizeInches;
    }

    public void setSizeInches(int sizeInches) {
        this.sizeInches = sizeInches;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public String getDateLaid() {
        return dateLaid;
    }

    public void setDateLaid(String dateLaid) {
        this.dateLaid = dateLaid;
    }

    public Dinosaur getDinosaur() {
        return dinosaur;
    }

    public void setDinosaur(Dinosaur dinosaur) {
        this.dinosaur = dinosaur;
    }
}
