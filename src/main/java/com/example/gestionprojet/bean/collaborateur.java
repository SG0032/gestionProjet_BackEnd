package com.example.gestionprojet.bean;

import javax.persistence.*;

@Entity
public class collaborateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCollab;
    private String nom;
    private String prenom;
    private String cin;
    private String telephone;
    private String adresse;
    @ManyToOne
    @JoinColumn(nullable = false, name="idProjet")
    private projet projet;

    @Override
    public String toString() {
        return "collaborateur{" +
                "idCollab=" + idCollab +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin='" + cin + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
    @Id
    public Long getIdCollab() {
        return idCollab;
    }

    public void setIdCollab(Long idCollab) {
        this.idCollab = idCollab;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
