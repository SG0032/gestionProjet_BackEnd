package com.example.gestionprojet.bean;

import javax.persistence.*;
import java.util.List;


@Entity
public class projet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProjet;
    private String titreProjet;
    private String descriptionProjet;
    @OneToMany(targetEntity = responsable.class, mappedBy = "projet")
    private List<responsable> responsables;
    @OneToMany(targetEntity = tache.class, mappedBy = "projet")
    private List<tache> taches;
    @OneToMany(targetEntity = collaborateur.class, mappedBy = "projet")
    private List<collaborateur> collaborateurs;
    @ManyToOne
    @JoinColumn(nullable = false, name="idCategorie")
    private categorie categorie;


    @Override
    public String toString() {
        return "projet{" +
                "idProjet=" + idProjet +
                ", titreProjet='" + titreProjet + '\'' +
                ", descriptionProjet='" + descriptionProjet + '\'' +
                '}';
    }
    @Id
    public Long getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }

    public String getTitreProjet() {
        return titreProjet;
    }

    public void setTitreProjet(String titreProjet) {
        this.titreProjet = titreProjet;
    }

    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    public void setDescriptionProjet(String descriptionProjet) {
        this.descriptionProjet = descriptionProjet;
    }
}
