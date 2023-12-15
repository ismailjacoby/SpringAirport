package be.technobel.springairport.dal.models;

import be.technobel.springairport.dal.models.joinTables.EstHabilite;
import be.technobel.springairport.dal.models.joinTables.Repare;
import be.technobel.springairport.dal.models.joinTables.Verifie;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Mecano extends Personne{

    @OneToMany(mappedBy = "verificateur", cascade = CascadeType.ALL)
    private List<Verifie> verifications;

    @OneToMany(mappedBy = "reparateur", cascade = CascadeType.ALL)
    private List<Repare> reparations;

    @OneToMany(mappedBy = "mecano", cascade = CascadeType.ALL)
    private List<EstHabilite> habilites;

}
