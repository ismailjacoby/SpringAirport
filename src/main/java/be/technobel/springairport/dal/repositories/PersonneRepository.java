package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
