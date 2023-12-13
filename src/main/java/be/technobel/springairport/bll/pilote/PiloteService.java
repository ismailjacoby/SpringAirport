package be.technobel.springairport.bll.pilote;

import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.pl.models.pilote.form.PiloteForm;

import java.util.List;
import java.util.Optional;

public interface PiloteService {
    void create(PiloteForm form);
    Optional<Pilote> getOne(long id);
    List<Pilote> getAll();
    void update(long id, PiloteForm form);
    void delete(long id);

}
