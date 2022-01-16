package com.example.gestionprojet.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategorie;
    private String nomCategorie;
    private String sousCategorie;
    @OneToMany(targetEntity = projet.class, mappedBy = "categorie")
    private List<projet> projets;

    @Override
    public String toString() {
        return "categorie{" +
                "idCategorie=" + idCategorie +
                ", nomCategorie='" + nomCategorie + '\'' +
                ", sousCategorie='" + sousCategorie + '\'' +
                '}';
    }
    @Id
    public Long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getSousCategorie() {
        return sousCategorie;
    }

    public void setSousCategorie(String sousCategorie) {
        this.sousCategorie = sousCategorie;
    }
}
