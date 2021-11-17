package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Commercial commercial = new Commercial("Doe", "John", "T12345", new LocalDate(2019, 12, 15), 2000.0, 5000.0);
        Technicien tech = new Technicien("nom", "prenom", "matricule", LocalDate.now(), 500.0, 2);


    }

}



