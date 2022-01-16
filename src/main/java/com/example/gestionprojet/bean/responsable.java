package com.example.gestionprojet.bean;

import javax.persistence.*;

@Entity
public class responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idResponsable;
    @ManyToOne
    @JoinColumn(nullable = false, name="idProjet")
    private projet projet;

    @Override
    public String toString() {
        return "responsable{" +
                "idResponsable=" + idResponsable +
                '}';
    }
    @Id
    public Long getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Long idResponsable) {
        this.idResponsable = idResponsable;
    }
}
