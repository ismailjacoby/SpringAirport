package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.TypeAvion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeAvionRepository extends JpaRepository<TypeAvion,Long> {
}
