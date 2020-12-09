package fr.content.TP4_spring.jeux.modele;

import javax.persistence.*;

@Entity
@Table(name = "jeu")
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String plateforme;

    public Jeu(){

    }

    public Jeu( int i,String n, String p){
        nom = n;
        id = i;
        plateforme = p;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPlateforme() {
        return plateforme;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlateforme(String plateforme) {
        this.plateforme = plateforme;
    }

    public String toString(){
        return id+" "+nom+" "+plateforme;
    }
}
