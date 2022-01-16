package com.example.gestionprojet.dao;

import com.example.gestionprojet.bean.responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface idaoResponsable extends JpaRepository<responsable, Long> {
}
