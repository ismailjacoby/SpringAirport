package be.technobel.springairport.dal.models;

import be.technobel.springairport.dal.models.joinTables.EstHabilite;
import be.technobel.springairport.dal.models.joinTables.Repare;
import be.technobel.springairport.dal.models.joinTables.Verifie;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Mecano extends Personne{
    @Enumerated(EnumType.STRING)
    private MecanoRole role;

    @OneToMany(mappedBy = "verificateur")
    private List<Verifie> verifications;

    @OneToMany(mappedBy = "reparateur")
    private List<Repare> reparations;

    @OneToMany(mappedBy = "mecano")
    private List<EstHabilite> habilites;

}
