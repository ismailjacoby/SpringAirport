package be.technobel.springairport.bll.proprio;

import be.technobel.springairport.dal.models.Proprio;
import be.technobel.springairport.pl.models.proprio.form.ProprioForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProprioService {
    void create(ProprioForm form);
    Proprio getOne(long id);
    Page<Proprio> getAll(Pageable pageable);
    void update(long id, ProprioForm form);
    void delete(long id);
}
