package net.seny.stcmanager.web;

import net.seny.stcmanager.model.Responsables;
import net.seny.stcmanager.service.ServiceReponsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/stcresponsables")
@EnableAutoConfiguration
@RestController
public class ResponsableController {
    @Autowired
    ServiceReponsable service;
    @PostMapping("/save")
    public Responsables save(@RequestBody Responsables resp){

        service.save(resp);
        return  resp;
    }
    @GetMapping("/list")
    public List<Responsables>list(){

        return service.getAll();
    }
    @GetMapping("/list/{id}")
    public Responsables findById(@PathVariable Long id){

     return service.getById(id);
    }
    @DeleteMapping ("/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id){
     service.delete(id);
     return "supprésion réussite";
    }
    public String update(Model model, Long id){
        Responsables resp=service.getById(id);
        model.addAttribute("resp",resp);
        return "modification réussite";
    }

}
