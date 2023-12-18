package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Avion {
    @Id
    private String immatriculation;


    @ManyToOne
    @JoinColumn(name = "Proprio_Id")
    private Proprio proprio;

    @ManyToOne
    @JoinColumn(name = "type_avion_id",referencedColumnName = "modeleId")
    private TypeAvion typeAvion;

}
