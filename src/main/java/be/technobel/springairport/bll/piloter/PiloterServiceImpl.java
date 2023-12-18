package be.technobel.springairport.bll.piloter;

import be.technobel.springairport.bll.exception.NotFoundException;
import be.technobel.springairport.dal.models.Piloter;
import be.technobel.springairport.dal.repositories.PiloterRepository;
import be.technobel.springairport.pl.models.piloter.form.PiloterForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiloterServiceImpl implements PiloterService {

    public final PiloterRepository piloterRepository;

    public PiloterServiceImpl(PiloterRepository piloterRepository) {
        this.piloterRepository = piloterRepository;
    }


    @Override
    public void create(PiloterForm form) {
        if(form==null){
            throw new IllegalArgumentException("Form ne peut pas etre null");
        }
        Piloter piloter = new Piloter();
        piloter.setNbVols(form.nbVols());
        piloter.setPilote(form.pilote());
        piloter.setTypeAvion(form.typeAvion());
        piloterRepository.save(piloter);
    }

    @Override
    public Piloter getOne(long id) {
        return piloterRepository.findById(id).orElseThrow(()-> new NotFoundException("Aucun piloteur trouvé"));
    }

    @Override
    public Page<Piloter> getAll(Pageable pageable) {
        return piloterRepository.findAll(pageable);
    }

    @Override
    public void update(long id, PiloterForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut pas etre null");
        }
        Piloter piloter = piloterRepository.findById(id).orElseThrow(() -> new NotFoundException("Aucun piloteur trouvé"));
        piloter.setNbVols(form.nbVols());
        piloter.setPilote(form.pilote());
        piloter.setTypeAvion(form.typeAvion());
        piloterRepository.save(piloter);
    }

    @Override
    public void delete(long id) {
        piloterRepository.deleteById(id);
    }
}
