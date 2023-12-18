package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Mecano extends Personne{


    @ManyToMany
    @JoinTable(name = "Mecano_TypeAvion")
    private List<TypeAvion> habilitations;

}
