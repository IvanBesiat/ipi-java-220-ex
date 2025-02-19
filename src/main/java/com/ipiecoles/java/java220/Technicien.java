package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Technicien extends Employe implements Comparable<Technicien>{

    // attributs
    private Integer grade;

    // getters
    public Integer getGrade() { return grade; }

    // setters
    public void setGrade(Integer newGrade){this.grade = newGrade;}
    @Override
    public void setSalaire(Double newSalaire) {
        super.setSalaire(newSalaire *(1+ (double) grade / 10));
    }

    public Technicien(){

    }

    public Technicien(String newNom, String newPrenom, String newMatricule, LocalDate newDateEmbauche, Double newSalaire, Integer newGrade){
        super(newNom, newPrenom, newMatricule, newDateEmbauche, newSalaire);
        this.grade = newGrade;
    }

    public Integer getNbConges(){
        try {
            return super.getNbConges()+ this.getNombreAnneeAnciennete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Double getPrimeAnnuelle() {
        try {
            return Entreprise.primeAnnuelleBase() * (1 + (double) grade / 10) + Entreprise.PRIME_ANCIENNETE * this.getNombreAnneeAnciennete() ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int compareTo(Technicien o) {
        return Integer.compare(this.grade, o.getGrade());
    }

    @Override
    public int hashCode() {
        int employeHash = super.hashCode();
        return Objects.hash(employeHash, this.grade);
    }
}
