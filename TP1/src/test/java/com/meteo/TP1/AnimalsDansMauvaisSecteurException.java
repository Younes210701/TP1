package com.meteo.TP1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalsDansMauvaisSecteurException extends Exception {
    @Test
    public void testAjoutChienDansBonSecteur() {
        // Arrange
        Zoo zoo = new Zoo(15);
        zoo.ajouterSecteur(TypeAnimaux.CHIEN);

        Animals chien = new Chien("Medor");
        // Act
        try {
            zoo.nouvelAnimal(chien);
            // Assert
            Secteur secteurChien = zoo.ajouterSecteur(TypeAnimaux.CHIEN);
            assertTrue(secteurChien.animauxDansSecteur.contains(chien));
        } catch (Exception e) {
            fail("Ajout d'un chien dans le mauvais secteur: " + e.getMessage());
        }
    }
}
