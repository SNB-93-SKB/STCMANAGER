package net.seny.stcmanager.service;

import net.seny.stcmanager.model.Responsables;
import net.seny.stcmanager.repository.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceReponsable implements  InterfaceService<Responsables>{
    @Autowired
    ResponsableRepository responsableRepository;
//ajouter des responsables
    @Override
    public void save(Responsables resp) {

      responsableRepository.save(resp);
    }
//lister tous les responsable
    @Override
    public List<Responsables> getAll() {

        return responsableRepository.findAll();
    }

    @Override
    public Responsables getById(long id) {

        return responsableRepository.findById(id).get();
    }
//modifier par son entité responsable ou par id
    @Override
    public void update(Responsables resp, long id) {

responsableRepository.save(resp);
    }
//supprimer par son id
    @Override
    public void delete(long id) {
responsableRepository.deleteById(id);
    }
}
