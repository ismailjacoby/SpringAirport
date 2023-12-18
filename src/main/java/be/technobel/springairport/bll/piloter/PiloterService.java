package be.technobel.springairport.bll.piloter;

import be.technobel.springairport.dal.models.Piloter;
import be.technobel.springairport.pl.models.piloter.form.PiloterForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PiloterService {
    void create(PiloterForm form);
    Piloter getOne(long id);
    Page<Piloter> getAll(Pageable pageable);
    void update(long id, PiloterForm form);
    void delete(long id);
}
