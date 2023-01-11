package com.meteo.TP1;

public class Chien extends Animals {

    public Chien(String nomAnimals) {
        super(nomAnimals, TypeAnimaux.CHIEN);
    }

    public String getNomAnimals() {
        return super.getNomAnimals();
    }
}