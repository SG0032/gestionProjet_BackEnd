package com.example.gestionprojet.ws;

import com.example.gestionprojet.bean.projet;
import com.example.gestionprojet.service.projetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/projet")
public class projetWs {
    @Autowired
    private projetService service;
    @PostMapping("/")
    public int save(@RequestBody projet projet) {
        return service.save(projet);
    }

    @GetMapping("id/{id}")
    public projet findById(@PathVariable Long id) {
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
    public List<projet> findAll() {
        return service.findAll();
    }

}
