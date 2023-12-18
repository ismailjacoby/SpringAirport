package be.technobel.springairport.bll.pilote;

import be.technobel.springairport.bll.exception.NotFoundException;
import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.dal.repositories.PiloteRepository;
import be.technobel.springairport.pl.models.pilote.form.PiloteForm;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PiloteServiceImpl implements PiloteService {

    public final PiloteRepository piloteRepository;

    public PiloteServiceImpl(PiloteRepository piloteRepository) {
        this.piloteRepository = piloteRepository;
    }


    @Override
    public void create(PiloteForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut pas etre null");
        }
        Pilote pilote = new Pilote();
        pilote.setNom(form.nom());
        pilote.setAdresse(form.adresse());
        pilote.setTel(form.tel());
        pilote.setNumBrevet(form.numBrevet());
        piloteRepository.save(pilote);
    }

    @Override
    public Pilote getOne(long id) {
        return piloteRepository.findById(id).orElseThrow(()-> new NotFoundException("Pilote non trouvé!"));
    }

    @Override
    public Page<Pilote> getAll(Pageable pageable) {
        return piloteRepository.findAll(pageable);
    }

    @Override
    public void update(long id, PiloteForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut pas etre null");
        }
        Pilote pilote = piloteRepository.findById(id).orElseThrow(() -> new NotFoundException("Pilote pas trouvé!"));
        pilote.setNom(form.nom());
        pilote.setAdresse(form.adresse());
        pilote.setTel(form.tel());
        pilote.setNumBrevet(form.numBrevet());
        piloteRepository.save(pilote);
    }

    @Override
    public void delete(long id) {
        piloteRepository.deleteById(id);
    }
}
