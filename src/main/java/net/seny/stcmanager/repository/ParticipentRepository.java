
package net.seny.stcmanager.repository;

import net.seny.stcmanager.model.Participent;
import net.seny.stcmanager.model.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParticipentRepository extends JpaRepository<Participent, Long>  {
}
