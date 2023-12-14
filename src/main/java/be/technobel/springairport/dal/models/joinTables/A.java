package be.technobel.springairport.dal.models.joinTables;

import be.technobel.springairport.dal.models.Avion;
import be.technobel.springairport.dal.models.Proprio;
import jakarta.persistence.*;
import lombok.Data;

@Entity@Data
public class A {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "proprio_id")
    private Proprio proprio;

    @ManyToOne
    @JoinColumn(name = "avion_immatriculation", referencedColumnName = "immatriculation")
    private Avion avion;
}
