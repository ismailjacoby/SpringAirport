package be.technobel.springairport.bll.mecano;

import be.technobel.springairport.dal.models.Mecano;
import be.technobel.springairport.pl.models.mecano.form.MecanoForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MecanoService {
    void create(MecanoForm form);
    Mecano getOne(long id);
    Page<Mecano> getAll(Pageable pageable);
    void update(long id, MecanoForm form);
    void delete(long id);
}
