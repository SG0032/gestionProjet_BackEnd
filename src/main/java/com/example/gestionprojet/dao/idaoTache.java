package com.example.gestionprojet.dao;

import com.example.gestionprojet.bean.tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface idaoTache extends JpaRepository<tache, Long> {
}
