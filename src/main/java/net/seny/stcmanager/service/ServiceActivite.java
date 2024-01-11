package net.seny.stcmanager.service;

import jakarta.transaction.Transactional;
import net.seny.stcmanager.model.Activites;
import net.seny.stcmanager.repository.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ServiceActivite implements InterfaceService<Activites>{

@Autowired
ActiviteRepository activiteRepository;
    @Override
    public void save(Activites activite) {
         activiteRepository.save(activite);
    }

    @Override
    public List getAll() {

        return activiteRepository.findAll() ;
    }

    @Override
    public Activites getById(long id) {

        return activiteRepository.findById(id).get();
    }

    @Override
    public void update(Activites activite, long id) {
activiteRepository.save(activite);
    }


    @Override
    public void delete(long id) {
activiteRepository.deleteById(id);
    }
}
