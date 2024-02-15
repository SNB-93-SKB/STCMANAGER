package net.seny.stcmanager.web;

import net.seny.stcmanager.model.Activites;
import net.seny.stcmanager.service.ServiceActivite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/stcactivite")
public class ActiviteController {

//injection de dépendances
    @Autowired
    ServiceActivite service;


    @PostMapping("/save")
    public Activites save(@RequestBody Activites activite){
      service.save(activite);
      return activite;

    }
    @GetMapping("/list")
    public List<Activites>list(){

        return  service.getAll();
    }
    @GetMapping("/list/{id}")
    public Activites finById(@PathVariable Long id){

        return service.getById(id);
    }
    public  String delete(@PathVariable(value = "id") Long id){
service.delete(id);
return "supprésion réusite";
    }
    @GetMapping("/Update/{id}")
    public  String Update(@PathVariable(value = "id")Model model, Long id){
        Activites activite=service.getById(id);
        model.addAttribute("activite", activite);
        return "modification réussite";
    }
}
