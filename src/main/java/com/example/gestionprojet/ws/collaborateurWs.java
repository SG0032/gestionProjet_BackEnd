package com.example.gestionprojet.ws;

import com.example.gestionprojet.bean.collaborateur;
import com.example.gestionprojet.service.collaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/collaborateur")
public class collaborateurWs {
    @Autowired
    private collaborateurService service;
    @PostMapping("/")
    public int save(@RequestBody collaborateur collaborateur) {
        return service.save(collaborateur);
    }

    @GetMapping("id/{id}")
    public collaborateur findById(@PathVariable Long id) {
        return service.findById(id);
    }
    @DeleteMapping("id/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);

    }

    @DeleteMapping("/")
    public void deleteAll() {
        service.deleteAll();
    }
    @GetMapping("/")
    public List<collaborateur> findAll() {
        return service.findAll();
    }
}
