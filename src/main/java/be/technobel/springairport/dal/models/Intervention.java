package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "numUnique")
    private long id;
    private String objet;
    @FutureOrPresent
    private LocalDate date;
    private int duree;


    @ManyToOne
    @JoinColumn(name = "Mecano_Id")
    private Mecano mecano;

    @ManyToOne
    @JoinColumn(name = "avion_id")
    private Avion avion;
}
