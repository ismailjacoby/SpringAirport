package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Mecano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MecanoRepository extends JpaRepository<Mecano,Long> {
}
