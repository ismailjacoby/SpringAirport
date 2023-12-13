package be.technobel.springairport.bll.typeAvion;

import be.technobel.springairport.bll.exception.NotFoundException;
import be.technobel.springairport.dal.models.TypeAvion;
import be.technobel.springairport.dal.repositories.TypeAvionRepository;
import be.technobel.springairport.pl.models.typeAvion.form.TypeAvionForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeAvionServiceImpl implements TypeAvionService{

    public final TypeAvionRepository typeAvionRepository;

    public TypeAvionServiceImpl(TypeAvionRepository typeAvionRepository) {
        this.typeAvionRepository = typeAvionRepository;
    }

    @Override
    public void create(TypeAvionForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut etre null");
        }
        TypeAvion typeAvion = new TypeAvion();
        typeAvion.setNom(form.nom());
        typeAvion.setConstucteur(form.constucteur());
        typeAvion.setPuissance(form.puissance());
        typeAvion.setNbPlaces(form.nbPlaces());
        typeAvionRepository.save(typeAvion);
    }

    @Override
    public TypeAvion getOne(long id) {
        return typeAvionRepository.findById(id).orElseThrow(()->new NotFoundException("Type Avion non trouvé"));
    }

    @Override
    public List<TypeAvion> getAll() {
        return typeAvionRepository.findAll();
    }

    @Override
    public void update(long id, TypeAvionForm form) {
        if(form==null){
            throw new IllegalArgumentException("Le formulaire ne peut etre null");
        }
        TypeAvion typeAvion = typeAvionRepository.findById(id).orElseThrow(()->new NotFoundException("Type Avion non trouvé"));
        typeAvion.setNom(form.nom());
        typeAvion.setConstucteur(form.constucteur());
        typeAvion.setPuissance(form.puissance());
        typeAvion.setNbPlaces(form.nbPlaces());
        typeAvionRepository.save(typeAvion);
    }

    @Override
    public void delete(long id) {
        typeAvionRepository.deleteById(id);
    }
}
