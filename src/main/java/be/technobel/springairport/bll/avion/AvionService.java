package be.technobel.springairport.bll.avion;

import be.technobel.springairport.dal.models.Avion;
import be.technobel.springairport.pl.models.avion.form.AvionForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AvionService {
    void create(AvionForm form);
    Avion getOne(String immatriculation);
    Page<Avion> getAll(Pageable pageable);
    void update(String immatriculation,AvionForm form);
    void delete(String immatriculation);

}
