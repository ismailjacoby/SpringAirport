package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.Proprio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprioRepository extends JpaRepository<Proprio,Long> {
}
