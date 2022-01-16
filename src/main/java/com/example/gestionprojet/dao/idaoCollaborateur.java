package com.example.gestionprojet.dao;

import com.example.gestionprojet.bean.collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface idaoCollaborateur extends JpaRepository<collaborateur, Long> {

}
