package be.technobel.springairport.bll.mecano;

import be.technobel.springairport.bll.exception.NotFoundException;
import be.technobel.springairport.dal.models.Mecano;
import be.technobel.springairport.dal.repositories.MecanoRepository;
import be.technobel.springairport.pl.models.mecano.form.MecanoForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MecanoServiceImpl implements MecanoService{
    private final MecanoRepository mecanoRepository;

    public MecanoServiceImpl(MecanoRepository mecanoRepository) {
        this.mecanoRepository = mecanoRepository;
    }

    @Override
    public void create(MecanoForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut etre null");
        }
        Mecano mecano = new Mecano();
        mecano.setNom(form.nom());
        mecano.setAdresse(form.adresse());
        mecano.setTel(form.tel());
        mecanoRepository.save(mecano);
    }

    @Override
    public Mecano getOne(long id) {
        return mecanoRepository.findById(id).orElseThrow(()-> new NotFoundException("Mecano non trouvé"));
    }

    @Override
    public List<Mecano> getAll() {
        return mecanoRepository.findAll();
    }

    @Override
    public void update(long id, MecanoForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut etre null");
        }
        Mecano mecano = mecanoRepository.findById(id).orElseThrow(()-> new NotFoundException("Mecano non trouvé"));
        mecano.setNom(form.nom());
        mecano.setAdresse(form.adresse());
        mecano.setTel(form.tel());
        mecanoRepository.save(mecano);
    }

    @Override
    public void delete(long id) {
        mecanoRepository.deleteById(id);
    }
}
