package com.meteo.TP1;

public class App {
    private static Zoo zoo;

    public static void main(String[] args) {
        zoo = new Zoo(15);
        zoo.ajouterSecteur(TypeAnimaux.CHIEN);
        zoo.ajouterSecteur(TypeAnimaux.CHAT);

        Animals chien1 = new Chien("Medor");
        Animals chien2 = new Chien("Rex");
        Animals chat1 = new Chat("Minou");
        Animals chat2 = new Chat("Mistigri");

        try {
            zoo.nouvelAnimal(chien1);
            zoo.nouvelAnimal(chien2);
            zoo.nouvelAnimal(chat1);
            zoo.nouvelAnimal(chat2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
