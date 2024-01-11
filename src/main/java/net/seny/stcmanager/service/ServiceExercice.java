package net.seny.stcmanager.service;

import jakarta.transaction.Transactional;
import net.seny.stcmanager.model.Exercices;
import net.seny.stcmanager.repository.ExerciceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ServiceExercice implements InterfaceService<Exercices>{
   @Autowired
    ExerciceRepository exerciceRepository;
    @Override
    public void save(Exercices exer) {
      exerciceRepository.save(exer);
    }

    @Override
    public List<Exercices> getAll() {

        return exerciceRepository.findAll();
    }

    @Override
    public Exercices getById(long id) {

        return exerciceRepository.findById(id).get();
    }

    @Override
    public void update(Exercices exer, long id) {

        exerciceRepository.save(exer);
    }

    @Override
    public void delete(long id) {
exerciceRepository.deleteById(id);
    }
}
