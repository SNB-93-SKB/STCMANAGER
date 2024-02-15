
package net.seny.stcmanager.repository;

import net.seny.stcmanager.model.Participents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParticipentRepository extends JpaRepository<Participents, Long>  {
}
