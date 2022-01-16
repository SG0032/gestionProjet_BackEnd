package com.example.gestionprojet.service;

import com.example.gestionprojet.bean.categorie;
import com.example.gestionprojet.dao.idaoCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categorieService {
    @Autowired
    private idaoCategorie dao;

    public List<categorie> findAll() {
        return dao.findAll();
    }

    public int save(categorie categorie) {
        if (categorie == null) return -1;
        else {
            dao.save(categorie);
            return 1;
        }

    }

    public categorie findById(Long id) {
        return dao.findById(id).get();
    }

    public void delete(categorie entity) {
        dao.delete(entity);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }

}
