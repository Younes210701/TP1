package com.meteo.TP1;

public enum TypeAnimaux {
    CHIEN("Chien"),
    CHAT("Chat"),
    LION("Lion"),
    TIGRE("Tigre"),
    LAPIN("Lapin");

    private String nom;

    TypeAnimaux(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}