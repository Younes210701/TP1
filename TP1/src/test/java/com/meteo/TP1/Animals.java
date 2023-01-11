package com.meteo.TP1;

public class Animals {
    private String nomAnimals;
    private TypeAnimaux typeAnimals;

    public Animals(String nomAnimals, TypeAnimaux typeAnimals) {
        this.nomAnimals = nomAnimals;
        this.typeAnimals = typeAnimals;
    }

    public String getNomAnimals() {
        return nomAnimals;
    }

    public TypeAnimaux getTypeAnimaux() {
        return typeAnimals;
    }
}
