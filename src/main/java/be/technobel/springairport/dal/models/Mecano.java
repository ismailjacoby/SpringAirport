package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Mecano extends Personne{


    @ManyToMany
    @JoinTable(
            name = "mecano_Type_avion",
            joinColumns = @JoinColumn(name = "mecano_id"),
            inverseJoinColumns = @JoinColumn(name = "type_avion_id")
    )
    private List<TypeAvion> habilitations;

}
