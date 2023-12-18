package be.technobel.springairport.bll.proprio;

import be.technobel.springairport.bll.exception.NotFoundException;
import be.technobel.springairport.dal.models.Proprio;
import be.technobel.springairport.dal.repositories.ProprioRepository;
import be.technobel.springairport.pl.models.proprio.form.ProprioForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprioServiceImpl implements ProprioService {

    public final ProprioRepository proprioRepository;

    public ProprioServiceImpl(ProprioRepository proprioRepository) {
        this.proprioRepository = proprioRepository;
    }

    @Override
    public void create(ProprioForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut pas etre null");
        }
        Proprio proprio = new Proprio();
        proprio.setNom(form.nom());
        proprio.setAdresse(form.adresse());
        proprio.setTel(form.tel());
        proprioRepository.save(proprio);
    }

    @Override
    public Proprio getOne(long id) {
        return proprioRepository.findById(id).orElseThrow(()->new NotFoundException("Proprio non trouvé"));
    }

    @Override
    public Page<Proprio> getAll(Pageable pageable) {
        return proprioRepository.findAll(pageable);
    }

    @Override
    public void update(long id, ProprioForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut pas etre null");
        }
        Proprio proprio = proprioRepository.findById(id).orElseThrow(()->new NotFoundException("Proprio non trouvé"));
        proprio.setNom(form.nom());
        proprio.setAdresse(form.adresse());
        proprio.setTel(form.tel());
        proprioRepository.save(proprio);
    }

    @Override
    public void delete(long id) {
        proprioRepository.deleteById(id);
    }
}
