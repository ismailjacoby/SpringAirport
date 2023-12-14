package be.technobel.springairport.dal.models.joinTables;

import be.technobel.springairport.dal.models.Intervention;
import be.technobel.springairport.dal.models.Mecano;
import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class Verifie {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "verificateur_id")
    private Mecano verificateur;

    @OneToOne
    @JoinColumn(name = "intervention_id")
    private Intervention intervention;
}
