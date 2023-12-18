package be.technobel.springairport.bll.intervention;

import be.technobel.springairport.bll.exception.NotFoundException;
import be.technobel.springairport.dal.models.Intervention;
import be.technobel.springairport.dal.repositories.InterventionRepository;
import be.technobel.springairport.dal.repositories.PiloteRepository;
import be.technobel.springairport.pl.models.intervention.form.InterventionForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterventionServiceImpl implements InterventionService{
    public final InterventionRepository interventionRepository;
    private final PiloteRepository piloteRepository;

    public InterventionServiceImpl(InterventionRepository interventionRepository,
                                   PiloteRepository piloteRepository) {
        this.interventionRepository = interventionRepository;
        this.piloteRepository = piloteRepository;
    }

    @Override
    public void create(InterventionForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut pas etre null");
        }
        Intervention intervention = new Intervention();
        intervention.setObjet(form.objet());
        intervention.setDate(form.date());
        intervention.setDuree(form.duree());
        interventionRepository.save(intervention);
    }

    @Override
    public Intervention getOne(long id) {
        return interventionRepository.findById(id).orElseThrow(()->new NotFoundException("Intervention non trouvé!"));
    }

    @Override
    public Page<Intervention> getAll(Pageable pageable) {
        return interventionRepository.findAll(pageable);
    }

    @Override
    public void update(long id, InterventionForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut pas etre null");
        }
        Intervention intervention = interventionRepository.findById(id).orElseThrow(()->new NotFoundException("Intervention non trouvé!"));
        intervention.setObjet(form.objet());
        intervention.setDate(form.date());
        intervention.setDuree(form.duree());
        interventionRepository.save(intervention);
    }

    @Override
    public void delete(long id) {
        interventionRepository.deleteById(id);
    }
}
