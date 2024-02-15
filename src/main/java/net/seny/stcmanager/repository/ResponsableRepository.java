package net.seny.stcmanager.repository;

import net.seny.stcmanager.model.Responsables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepository extends JpaRepository <Responsables, Long> {
}
