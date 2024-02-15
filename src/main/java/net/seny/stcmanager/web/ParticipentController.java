package net.seny.stcmanager.web;

import net.seny.stcmanager.model.Participents;
import net.seny.stcmanager.service.ServiceParticpent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/stcparticipent")
@CrossOrigin(origins="http://localhost:4200")
public class ParticipentController {

    //Injection de dépendance
    @Autowired
    ServiceParticpent service;

    //insérer des données dans la base de donnéé avec la méthode save.
    @PostMapping("/save")
    public Participents save(@RequestBody Participents p){
        service.save(p);
       return p;
    }
    //Lister le nombre de participents
    @GetMapping("/list")
    public List <Participents>list(){
        return service.getAll();
    }
    //lister les participents par leurs identifiants
    @GetMapping("/list/{id}")
    public Participents findById(@PathVariable Long  id){

        return service.getById(id);
    }
    @DeleteMapping("/delete")
    public  String delete(@PathVariable(value = "id") Long id){
        service.delete(id);
        return ("spprésion réussite");
    }
    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable(value = "id")Long id){
      Participents p=service.getById(id);
      return "modification réussite";
    }
}
