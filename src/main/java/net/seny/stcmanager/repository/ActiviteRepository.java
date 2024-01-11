package net.seny.stcmanager.repository;

import net.seny.stcmanager.model.Activites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviteRepository extends JpaRepository<Activites, Long>{
}
