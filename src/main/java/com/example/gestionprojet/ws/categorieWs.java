package com.example.gestionprojet.ws;

import com.example.gestionprojet.bean.categorie;
import com.example.gestionprojet.service.categorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/categorie")
public class categorieWs {
    @Autowired
    private categorieService service;
    @PostMapping("/")
    public int save(@RequestBody categorie categorie) {
        return service.save(categorie);
    }

    @GetMapping("id/{id}")
    public categorie findById(@PathVariable Long id) {
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
    public List<categorie> findAll() {
        return service.findAll();
    }
}
