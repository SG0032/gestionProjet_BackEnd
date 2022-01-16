package com.example.gestionprojet.dao;

import com.example.gestionprojet.bean.categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface idaoCategorie extends JpaRepository<categorie, Long> {
}
