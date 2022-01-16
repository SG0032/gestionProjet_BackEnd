package com.example.gestionprojet.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class tache {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTache;
    private String titreTache;
    private String descriptionTache;
    private Date dateDebut;
    private Date dateFin;
    private String etatAvancement;
    @ManyToOne
    @JoinColumn(nullable = false, name="idProjet")
    private projet projet;

    @Override
    public String toString() {
        return "tache{" +
                "idTache=" + idTache +
                ", titreTache='" + titreTache + '\'' +
                ", descriptionTache='" + descriptionTache + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", etatAvancement='" + etatAvancement + '\'' +
                '}';
    }
    @Id
    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }

    public String getTitreTache() {
        return titreTache;
    }

    public void setTitreTache(String titreTache) {
        this.titreTache = titreTache;
    }

    public String getDescriptionTache() {
        return descriptionTache;
    }

    public void setDescriptionTache(String descriptionTache) {
        this.descriptionTache = descriptionTache;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getEtatAvancement() {
        return etatAvancement;
    }

    public void setEtatAvancement(String etatAvancement) {
        this.etatAvancement = etatAvancement;
    }
}
