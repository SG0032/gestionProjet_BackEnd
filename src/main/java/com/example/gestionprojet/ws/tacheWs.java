package com.example.gestionprojet.ws;

import com.example.gestionprojet.bean.tache;
import com.example.gestionprojet.service.tacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tache")
public class tacheWs {
    @Autowired
    private tacheService service;
    @PostMapping("/")
    public int save(@RequestBody tache tache) {
        return service.save(tache);
    }

    @GetMapping("id/{id}")
    public tache findById(@PathVariable Long id) {
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
    public List<tache> findAll() {
        return service.findAll();
    }

}
