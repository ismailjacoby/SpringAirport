package be.technobel.springairport.dal.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter
public abstract class Personne {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personneId")
    private long id;
    private String nom;
    private String adresse;
    private String tel;
}
