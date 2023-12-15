package be.technobel.springairport.dal.models;

import be.technobel.springairport.dal.models.joinTables.Repare;
import be.technobel.springairport.dal.models.joinTables.Subit;
import be.technobel.springairport.dal.models.joinTables.Verifie;
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

    @OneToOne(mappedBy = "intervention")
    private Verifie verifie;
    @OneToOne(mappedBy = "intervention")
    private Repare repare;
    @OneToOne(mappedBy = "intervention")
    private Subit subit;
}
