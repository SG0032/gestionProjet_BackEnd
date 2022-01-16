package com.example.gestionprojet.dao;

import com.example.gestionprojet.bean.projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface idaoProjet extends JpaRepository<projet, Long> {
}
