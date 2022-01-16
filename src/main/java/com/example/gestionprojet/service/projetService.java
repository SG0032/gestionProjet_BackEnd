package com.example.gestionprojet.service;

import com.example.gestionprojet.bean.projet;
import com.example.gestionprojet.dao.idaoProjet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projetService {
    @Autowired
    private idaoProjet dao;

    public List<projet> findAll() {
        return dao.findAll();
    }

    public int save(projet projet) {
        if (projet == null) return -1;
        else {
            dao.save(projet);
            return 1;
        }

    }

    public projet findById(Long id) {
        return dao.findById(id).get();
    }

    public void delete(projet entity) {
        dao.delete(entity);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
