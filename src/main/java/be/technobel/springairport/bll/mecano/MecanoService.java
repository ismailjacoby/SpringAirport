package be.technobel.springairport.bll.mecano;

import be.technobel.springairport.dal.models.Mecano;
import be.technobel.springairport.pl.models.mecano.form.MecanoForm;

import java.util.List;

public interface MecanoService {
    void create(MecanoForm form);
    Mecano getOne(long id);
    List<Mecano> getAll();
    void update(long id, MecanoForm form);
    void delete(long id);
}
