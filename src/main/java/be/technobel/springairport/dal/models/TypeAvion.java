package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class TypeAvion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "modeleId")
    private long id;
    private String nom;
    private String constucteur;
    private int puissance;
    private int nbPlaces;

    @OneToMany(mappedBy = "typeAvion")
    private List<Piloter> pilotes;

    @ManyToMany(mappedBy = "habilitations")
    private List<Mecano> mecanoList;


}
