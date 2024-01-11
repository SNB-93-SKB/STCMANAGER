package net.seny.stcmanager.web;

import net.seny.stcmanager.model.Responsable;
import net.seny.stcmanager.service.ServiceReponsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResponsableController {
    @Autowired
    ServiceReponsable service;
    @PostMapping("/save")
    public Responsable save(@RequestBody Responsable resp){

        service.save(resp);
        return  resp;
    }
    @GetMapping("/list")
    public List<Responsable>list(){

        return service.getAll();
    }
    @GetMapping("/list/{id}")
    public Responsable findById(@PathVariable Long id){

     return service.getById(id);
    }
    @DeleteMapping ("/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id){
     service.delete(id);
     return "supprésion réussite";
    }
    public String update(Model model, Long id){
        Responsable resp=service.getById(id);
        model.addAttribute("resp",resp);
        return "modification réussite";
    }

}
