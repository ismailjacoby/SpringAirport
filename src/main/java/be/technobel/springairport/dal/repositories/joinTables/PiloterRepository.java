package be.technobel.springairport.dal.repositories.joinTables;

import be.technobel.springairport.dal.models.joinTables.Piloter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiloterRepository extends JpaRepository<Piloter,Long> {
}
