package be.technobel.springairport.bll.avion;

import be.technobel.springairport.dal.models.Avion;
import be.technobel.springairport.pl.models.avion.form.AvionForm;

import java.util.List;

public interface AvionService {
    void create(AvionForm form);
    Avion getOne(String immatriculation);
    List<Avion> getAll();
    void update(String immatriculation,AvionForm form);
    void delete(String immatriculation);

}
