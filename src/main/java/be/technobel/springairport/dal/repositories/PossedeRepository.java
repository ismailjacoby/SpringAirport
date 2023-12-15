package be.technobel.springairport.dal.repositories;

import be.technobel.springairport.dal.models.joinTables.Possede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PossedeRepository extends JpaRepository<Possede,Long> {
}
