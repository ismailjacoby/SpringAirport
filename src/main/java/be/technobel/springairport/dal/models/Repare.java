package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Repare {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "reparateur_id")
    private Mecano reparateur;

    @OneToOne
    @JoinColumn(name = "intervention_id")
    private Intervention intervention;
}
