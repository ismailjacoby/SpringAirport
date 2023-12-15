package be.technobel.springairport.dal.models;

import be.technobel.springairport.dal.models.joinTables.Piloter;
import be.technobel.springairport.dal.models.joinTables.Possede;
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

    @OneToMany(mappedBy = "typeAvion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Piloter> pilotes;

    @OneToMany(mappedBy = "typeAvion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Possede> avionsPossedes;
}
