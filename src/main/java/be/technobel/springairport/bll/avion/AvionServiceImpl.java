package be.technobel.springairport.bll.avion;

import be.technobel.springairport.bll.exception.NotFoundException;
import be.technobel.springairport.dal.models.Avion;
import be.technobel.springairport.dal.repositories.AvionRepository;
import be.technobel.springairport.pl.models.avion.form.AvionForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionServiceImpl implements AvionService{

    private final AvionRepository avionRepository;

    public AvionServiceImpl(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    @Override
    public void create(AvionForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut etre null");
        }
        Avion avion = new Avion();
        avion.setImmatriculation(form.immatriculation());
        avionRepository.save(avion);
    }

    @Override
    public Avion getOne(String immatriculation) {
        return avionRepository.findByImmatriculation(immatriculation).orElseThrow(()->new NotFoundException("Avion non trouvé!"));
    }

    @Override
    public List<Avion> getAll() {
        return avionRepository.findAll();
    }

    @Override
    public void update(String immatriculation,AvionForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut etre null");
        }
        Avion avion = avionRepository.findByImmatriculation(immatriculation).orElseThrow(()->new NotFoundException("Avion non trouvé"));
        avion.setImmatriculation(form.immatriculation());
        avionRepository.save(avion);
    }

    @Override
    public void delete(String immatriculation) {
        avionRepository.deleteByImmatriculation(immatriculation);
    }
}
