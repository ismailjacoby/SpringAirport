package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<Avion,Long> {
}
