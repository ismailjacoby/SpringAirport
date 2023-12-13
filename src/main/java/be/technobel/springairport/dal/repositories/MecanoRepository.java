package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Mecano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MecanoRepository extends JpaRepository<Mecano,Long> {
}
