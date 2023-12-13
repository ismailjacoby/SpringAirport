package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiloteRepository extends JpaRepository<Pilote,Long> {
}
