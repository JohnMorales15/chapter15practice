package org.launchcode.Ch15practice.data;

import org.launchcode.Ch15practice.models.Dinosaur;

import java.util.ArrayList;
import java.util.Collection;

public class DinoData {

    private static ArrayList<Dinosaur> allDinos = new ArrayList<>();

    public static ArrayList<Dinosaur> getAllDinos(){
        return allDinos;
    }
}
