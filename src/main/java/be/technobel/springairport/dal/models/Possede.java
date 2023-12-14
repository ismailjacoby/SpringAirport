package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class Possede {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "proprio_id")
    private Proprio proprio;

    @ManyToOne
    @JoinColumn(name = "avion_immatriculation", referencedColumnName = "immatriculation")
    private Avion avion;

    @ManyToOne
    @JoinColumn(name = "type_avion_id")
    private TypeAvion typeAvion;
}
