package be.technobel.springairport.dal.models;

import be.technobel.springairport.dal.models.joinTables.A;
import be.technobel.springairport.dal.models.joinTables.Possede;
import be.technobel.springairport.dal.models.joinTables.Subit;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Avion {
    @Id
    private String immatriculation;

    @OneToMany(mappedBy = "avion")
    private List<A> proprietes;

    @OneToMany(mappedBy = "avion")
    private List<Possede> avionsPossedes;

    @OneToMany(mappedBy = "avion")
    private List<Subit> interventionsSubies;

}
