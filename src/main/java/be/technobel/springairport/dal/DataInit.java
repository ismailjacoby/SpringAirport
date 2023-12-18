package be.technobel.springairport.dal;

import be.technobel.springairport.dal.models.*;
import be.technobel.springairport.dal.repositories.*;
import net.datafaker.Faker;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

@Component
public class DataInit implements InitializingBean {

    private final AvionRepository avionRepository;
    private final InterventionRepository interventionRepository;
    private final MecanoRepository mecanoRepository;
    private final PiloteRepository piloteRepository;
    private final PiloterRepository piloterRepository;

    private final ProprioRepository proprioRepository;
    private final TypeAvionRepository typeAvionRepository;


    public DataInit(AvionRepository avionRepository, InterventionRepository interventionRepository, MecanoRepository mecanoRepository, PiloteRepository piloteRepository, PiloterRepository piloterRepository, ProprioRepository proprioRepository, TypeAvionRepository typeAvionRepository) {
        this.avionRepository = avionRepository;
        this.interventionRepository = interventionRepository;
        this.mecanoRepository = mecanoRepository;
        this.piloteRepository = piloteRepository;
        this.piloterRepository = piloterRepository;

        this.proprioRepository = proprioRepository;
        this.typeAvionRepository = typeAvionRepository;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        Faker faker = new Faker(new Locale("fr"));

        for (int i = 0; i < 20; i++) {
            Proprio proprio = new Proprio();
            proprio.setNom(faker.name().fullName());
            proprio.setAdresse(faker.address().fullAddress());
            proprio.setTel(faker.phoneNumber().cellPhone());
            proprioRepository.save(proprio);

            Mecano mecano = new Mecano();
            mecano.setNom(faker.name().fullName());
            mecano.setAdresse(faker.address().fullAddress());
            mecano.setTel(faker.phoneNumber().cellPhone());
            mecanoRepository.save(mecano);

            Avion avion = new Avion();
            avion.setImmatriculation(faker.number().digits(8));
            avionRepository.save(avion);

            Pilote pilote = new Pilote();
            pilote.setNom(faker.name().fullName());
            pilote.setAdresse(faker.address().fullAddress());
            pilote.setTel(faker.phoneNumber().cellPhone());
            pilote.setNumBrevet(faker.number().digits(5));
            piloteRepository.save(pilote);

            Intervention intervention = new Intervention();
            intervention.setObjet(faker.appliance().equipment());
            intervention.setDate(LocalDate.now());
            intervention.setDuree(faker.time().hashCode());
            interventionRepository.save(intervention);

            TypeAvion typeAvion = new TypeAvion();
            typeAvion.setNom(faker.aviation().aircraft());
            typeAvion.setConstucteur(faker.aviation().airline());
            typeAvion.setPuissance(faker.number().numberBetween(100,999));
            typeAvion.setNbPlaces(faker.number().numberBetween(10,500));
            typeAvionRepository.save(typeAvion);
        }

    }
}
