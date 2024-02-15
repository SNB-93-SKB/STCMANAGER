package net.seny.stcmanager.web;

import net.seny.stcmanager.model.Exercices;
import net.seny.stcmanager.service.ServiceExercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/stcExercice")
@RestController
public class ExerciceContoller {
    @Autowired
    ServiceExercice service;
    @PostMapping("/save")
    public Exercices save(@RequestBody Exercices exer){
      service.save(exer);
      return exer;
    }
    @GetMapping("/list")
    public List<Exercices>list(){

        return service.getAll();
    }
    @GetMapping("/list/{id}")
public Exercices findById(@PathVariable Long id){

        return  service.getById(id);
}
@DeleteMapping("/delete/{id}")
public  String delete(@PathVariable(value="id") Long id){
service.delete(id);

return "supprésion réussite id"+id;
}
public  String update( @PathVariable(value = "id") Model model, Long id){
Exercices ex=service.getById(id);

model.addAttribute("ex",ex);
    return "modification réussite";
}
}
