package com.example.gestionprojet.service;

import com.example.gestionprojet.bean.tache;
import com.example.gestionprojet.dao.idaoTache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tacheService {
    @Autowired
    private idaoTache dao;

    public List<tache> findAll() {
        return dao.findAll();
    }

    public int save(tache tache) {
        if (tache == null) return -1;
        else {
            dao.save(tache);
            return 1;
        }

    }

    public tache findById(Long id) {
        return dao.findById(id).get();
    }

    public void delete(tache entity) {
        dao.delete(entity);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
