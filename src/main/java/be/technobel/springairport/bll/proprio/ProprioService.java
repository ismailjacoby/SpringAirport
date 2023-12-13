package be.technobel.springairport.bll.proprio;

import be.technobel.springairport.dal.models.Proprio;
import be.technobel.springairport.pl.models.proprio.form.ProprioForm;

import java.util.List;

public interface ProprioService {
    void create(ProprioForm form);
    Proprio getOne(long id);
    List<Proprio> getAll();
    void update(long id, ProprioForm form);
    void delete(long id);
}
