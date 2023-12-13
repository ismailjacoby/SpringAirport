package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterventionRepository extends JpaRepository<Intervention,Long> {
}
