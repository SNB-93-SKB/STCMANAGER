package net.seny.stcmanager.repository;

import net.seny.stcmanager.model.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepository extends JpaRepository <Responsable, Long> {
}
