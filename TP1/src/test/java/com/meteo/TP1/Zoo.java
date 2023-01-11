package com.meteo.TP1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    private int nbVisiteursMaxParSecteur;

    public Zoo(int nbVisiteursMaxParSecteur) {
        this.visiteurs = 0;
        this.secteursAnimaux = new ArrayList<Secteur>();
        this.nbVisiteursMaxParSecteur = nbVisiteursMaxParSecteur;
    }

    public Secteur ajouterSecteur(TypeAnimaux typeAnimaux) {
        Secteur secteur = new Secteur(typeAnimaux);
        this.secteursAnimaux.add(secteur);
        return secteur;
    }

    public void nouveauVisiteur() throws Exception {
        if(this.visiteurs >= this.nbVisiteursMaxParSecteur * this.secteursAnimaux.size()) {
            throw new Exception("Nombre maximum de visiteurs atteint");
        }
        this.visiteurs++;
    }

    public int getLimiteVisiteurs() {
        return this.nbVisiteursMaxParSecteur;
    }

    public void nouvelAnimal(Animals animal) {
        for(Secteur secteur : this.secteursAnimaux) {
            if(secteur.getTypeAnimaux() == animal.getTypeAnimaux()) {
                secteur.ajouterAnimals(animal);
                break;
            }
        }
    }

    public int nombreAnimaux() {
        int nombreAnimaux = 0;
        for(Secteur secteur : this.secteursAnimaux) {
            nombreAnimaux += secteur.getNombreAnimaux();
        }
        return nombreAnimaux;
    }
}
