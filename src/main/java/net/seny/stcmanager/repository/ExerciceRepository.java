package net.seny.stcmanager.repository;

import net.seny.stcmanager.model.Exercices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciceRepository extends JpaRepository<Exercices, Long> {
}
