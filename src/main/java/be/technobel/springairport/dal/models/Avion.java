package be.technobel.springairport.dal.models;

import be.technobel.springairport.dal.models.joinTables.A;
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

    @ManyToOne
    @JoinColumn(name = "type_avion_id")
    private TypeAvion typeAvion;

    @OneToMany(mappedBy = "avion")
    private List<Subit> interventionsSubies;

}
