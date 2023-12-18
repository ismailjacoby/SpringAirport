package be.technobel.springairport.dal.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Proprio extends Personne {

    @OneToMany
    @JoinColumn(name = "Proprio_Id")
    private List<Avion> avions;
}
