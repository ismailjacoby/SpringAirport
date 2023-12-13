package be.technobel.springairport.bll.typeAvion;

import be.technobel.springairport.dal.models.TypeAvion;
import be.technobel.springairport.pl.models.typeAvion.form.TypeAvionForm;

import java.util.List;


public interface TypeAvionService {
    void create(TypeAvionForm form);
    TypeAvion getOne(long id);
    List<TypeAvion> getAll();
    void update(long id, TypeAvionForm form);
    void delete(long id);
}
