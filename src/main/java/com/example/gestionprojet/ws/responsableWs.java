package com.example.gestionprojet.ws;

import com.example.gestionprojet.bean.responsable;
import com.example.gestionprojet.service.responsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/responsable")
public class responsableWs {
    @Autowired
    private responsableService service;
    @PostMapping("/")
    public int save(@RequestBody responsable responsable) {
        return service.save(responsable);
    }

    @GetMapping("id/{id}")
    public responsable findById(@PathVariable Long id) {
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
    public List<responsable> findAll() {
        return service.findAll();
    }

}
