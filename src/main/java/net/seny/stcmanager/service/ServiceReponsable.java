package net.seny.stcmanager.service;

import net.seny.stcmanager.model.Responsable;
import net.seny.stcmanager.repository.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Service
public class ServiceReponsable implements  InterfaceService<Responsable>{
    @Autowired
    ResponsableRepository responsableRepository;
//ajouter des responsables
    @Override
    public void save(Responsable resp) {

      responsableRepository.save(resp);
    }
//lister tous les responsable
    @Override
    public List<Responsable> getAll() {

        return responsableRepository.findAll();
    }

    @Override
    public Responsable getById(  long id) {

        return responsableRepository.findById(id).get();
    }
//modifier par son entité responsable ou par id
    @Override
    public void update(Responsable resp, long id) {

responsableRepository.save(resp);
    }
//supprimer par son id
    @Override
    public void delete(long id) {
responsableRepository.deleteById(id);
    }
}
