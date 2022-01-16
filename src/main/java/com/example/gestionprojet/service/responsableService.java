package com.example.gestionprojet.service;

import com.example.gestionprojet.bean.responsable;
import com.example.gestionprojet.dao.idaoResponsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class responsableService {
    @Autowired
    private idaoResponsable dao;

    public List<responsable> findAll() {
        return dao.findAll();
    }

    public int save(responsable responsable) {
        if (responsable == null) return -1;
        else {
            dao.save(responsable);
            return 1;
        }

    }

    public responsable findById(Long id) {
        return dao.findById(id).get();
    }

    public void delete(responsable entity) {
        dao.delete(entity);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
