package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Piloter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PiloterRepository extends JpaRepository<Piloter,Long> {
}
