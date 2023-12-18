package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
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
    private LocalDate date;
    @Min(value = 1)
    private LocalTime duree;


    @ManyToOne
    @JoinColumn(name = "Mecano_Id")
    private Mecano mecano;

    @ManyToOne
    @JoinColumn(name = "avion_id")
    private Avion avion;
}
