package net.seny.stcmanager.service;

import net.seny.stcmanager.model.Participent;
import net.seny.stcmanager.repository.ParticipentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service

public class ServiceParticpent implements InterfaceService <Participent>{
@Autowired
    ParticipentRepository repository;

    @Override
    public void save(Participent p) {
    repository.save(p);
    }

    @Override
    public List<Participent> getAll() {
        return repository.findAll();
    }

    @Override
    public Participent getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void update(Participent p, long id) {
     repository.save(p);
    }

    @Override
    public void delete(long id) {
    repository.deleteById(id);
    }
}
