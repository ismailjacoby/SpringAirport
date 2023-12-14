package be.technobel.springairport.dal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Pilote extends Personne {
    private String numBrevet;

    @OneToMany(mappedBy = "pilote")
    private List<Piloter> avionsPilotes;
}
