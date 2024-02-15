package net.seny.stcmanager.service;

import net.seny.stcmanager.model.Participents;
import net.seny.stcmanager.repository.ParticipentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ServiceParticpent implements InterfaceService <Participents>{
@Autowired
    ParticipentRepository repository;

    @Override
    public void save(Participents p) {
    repository.save(p);
    }

    @Override
    public List<Participents> getAll() {
        return repository.findAll();
    }

    @Override
    public Participents getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void update(Participents p, long id) {
     repository.save(p);
    }

    @Override
    public void delete(long id) {
    repository.deleteById(id);
    }
}
