package be.technobel.springairport.bll.intervention;

import be.technobel.springairport.dal.models.Intervention;
import be.technobel.springairport.pl.models.intervention.form.InterventionForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface InterventionService {
    void create(InterventionForm form);
    Intervention getOne(long id);
    Page<Intervention> getAll(Pageable pageable);
    void update(long id, InterventionForm form);
    void delete(long id);
}
