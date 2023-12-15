package be.technobel.springairport.bll.possede;

import be.technobel.springairport.bll.exception.NotFoundException;
import be.technobel.springairport.dal.models.joinTables.Possede;
import be.technobel.springairport.dal.repositories.PossedeRepository;
import be.technobel.springairport.pl.models.possede.form.PossedeForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PossedeServiceImpl implements PossedeService {
    public final PossedeRepository possedeRepository;

    public PossedeServiceImpl(PossedeRepository possedeRepository) {
        this.possedeRepository = possedeRepository;
    }

    @Override
    public void create(PossedeForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut etre null");
        }
        Possede possede = new Possede();
        possede.setAvion(form.avion());
        possede.setTypeAvion(form.typeAvion());
        possedeRepository.save(possede);
    }

    @Override
    public Possede getOne(long id) {
        return possedeRepository.findById(id).orElseThrow(()-> new NotFoundException("Possesion pas trouvé!"));
    }

    @Override
    public List<Possede> getAll() {
        return possedeRepository.findAll();
    }

    @Override
    public void update(long id, PossedeForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut etre null");
        }
        Possede possede = possedeRepository.findById(id).orElseThrow(() -> new NotFoundException("Possesion pas trouvé!"));
        possede.setAvion(form.avion());
        possede.setTypeAvion(form.typeAvion());
        possedeRepository.save(possede);
    }

    @Override
    public void delete(long id) {
        possedeRepository.deleteById(id);
    }
}
