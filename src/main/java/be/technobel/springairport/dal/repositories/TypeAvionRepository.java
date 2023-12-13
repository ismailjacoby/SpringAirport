package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.TypeAvion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAvionRepository extends JpaRepository<TypeAvion,Long> {
}
