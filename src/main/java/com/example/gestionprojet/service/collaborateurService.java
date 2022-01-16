package com.example.gestionprojet.service;

import com.example.gestionprojet.bean.collaborateur;
import com.example.gestionprojet.dao.idaoCollaborateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class collaborateurService {
    @Autowired
    private idaoCollaborateur dao;

    public List<collaborateur> findAll() {
        return dao.findAll();
    }

    public int save(collaborateur collaborateur) {
        if (collaborateur == null) return -1;
        else {
            dao.save(collaborateur);
            return 1;
        }

    }

    public collaborateur findById(Long id) {
        return dao.findById(id).get();
    }

    public void delete(collaborateur entity) {
        dao.delete(entity);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
