package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionRepository extends JpaRepository<Intervention,Long> {
}
