package be.technobel.springairport.dal.models.joinTables;

import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.dal.models.TypeAvion;
import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class Piloter {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int nbVols;

    @ManyToOne
    @JoinColumn(name = "pilote_id")
    private Pilote pilote;

    @ManyToOne
    @JoinColumn(name = "type_avion_id")
    private TypeAvion typeAvion;
}
