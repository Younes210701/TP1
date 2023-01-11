package com.meteo.TP1;
import  org.junit.Test;
import static org.junit.Assert.*;

public class LimiteVisiteurException extends Throwable {

    @Test(expected = LimiteVisiteurException.class)
    public void testLimiteVisiteurException() throws LimiteVisiteurException, Exception {
        // Arrange
        int maxVisiteurs = 15;
        Zoo zoo = new Zoo(maxVisiteurs);
        // Act
        for (int i = 0; i < maxVisiteurs + 1; i++) {
            zoo.nouveauVisiteur();
        }
    }
}
