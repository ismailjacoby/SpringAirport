package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AvionRepository extends JpaRepository<Avion,Long> {
    Optional<Avion> findByImmatriculation(String immatriculation);
    Optional<Avion> deleteByImmatriculation(String immatriculation);
}
