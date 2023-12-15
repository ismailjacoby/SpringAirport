package be.technobel.springairport.bll.piloter;

import be.technobel.springairport.dal.models.joinTables.Piloter;
import be.technobel.springairport.pl.models.piloter.form.PiloterForm;

import java.util.List;

public interface PiloterService {
    void create(PiloterForm form);
    Piloter getOne(long id);
    List<Piloter> getAll();
    void update(long id, PiloterForm form);
    void delete(long id);
}
