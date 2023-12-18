package be.technobel.springairport.bll.pilote;

import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.pl.models.pilote.form.PiloteForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PiloteService {
    void create(PiloteForm form);
    Pilote getOne(long id);
    Page<Pilote> getAll(Pageable pageable);
    void update(long id, PiloteForm form);
    void delete(long id);

}
