package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
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
    private LocalDate date;
    private LocalTime time;


    @ManyToOne
    @JoinColumn(name = "Mecano_Id")
    private Mecano mecano;

    @ManyToOne
    @JoinColumn(name = "avion_id")
    private Avion avion;
}
