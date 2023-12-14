package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class Subit {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "intervention_id")
    private Intervention intervention;

    @ManyToOne
    @JoinColumn(name = "avion_immatriculation", referencedColumnName = "immatriculation")
    private Avion avion;
}
