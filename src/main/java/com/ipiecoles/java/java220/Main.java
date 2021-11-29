package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Commercial commercial = new Commercial("Doe", "John", "T12345", new LocalDate(2019, 12, 15), 2000.0, 5000.0);
    Employe cadre = new Cadre("Besiat","ivan","IBE0FF1N", LocalDate.now(), 50000.00, false, "M", 1.75);

        //System.out.println(cadre.getPrenom());
        //System.out.println(cadre.getNom());
        //System.out.println(cadre.getMatricule());
        //System.out.println(cadre.getDateEmbauche());
        //System.out.println(cadre.getSalaire());
        //System.out.println(cadre.getTempsPartiel());
        //System.out.println(cadre.getSexe());

        System.out.println(cadre.getNbConges());
        System.out.println(cadre.getPrimeAnnuelle());
    }

}



