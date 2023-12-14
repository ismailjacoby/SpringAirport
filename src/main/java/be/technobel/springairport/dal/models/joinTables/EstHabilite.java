package be.technobel.springairport.dal.models.joinTables;

import be.technobel.springairport.dal.models.Mecano;
import be.technobel.springairport.dal.models.TypeAvion;
import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class EstHabilite {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "mecano_id")
    private Mecano mecano;

    @ManyToOne
    @JoinColumn(name = "type_avion_id")
    private TypeAvion typeAvion;
}
