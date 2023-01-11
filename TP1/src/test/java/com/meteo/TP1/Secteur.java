package com.meteo.TP1;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
    private TypeAnimaux typeAnimauxDansSecteur;
    List<Animals> animauxDansSecteur;

    public Secteur(TypeAnimaux typeAnimaux) {
        this.typeAnimauxDansSecteur = typeAnimaux;
        this.animauxDansSecteur = new ArrayList<Animals>();
    }

    public void ajouterAnimals(Animals animal) {
        this.animauxDansSecteur.add(animal);
    }

    public int getNombreAnimaux() {
        return this.animauxDansSecteur.size();
    }

    public TypeAnimaux getTypeAnimaux() {
        return this.typeAnimauxDansSecteur;
    }
}
