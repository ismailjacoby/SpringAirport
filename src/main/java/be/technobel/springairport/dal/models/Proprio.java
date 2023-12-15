package be.technobel.springairport.dal.models;

import be.technobel.springairport.dal.models.joinTables.A;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Proprio extends Personne {
    @OneToMany(mappedBy = "proprio", cascade = CascadeType.ALL)
    private List<A> possessions;
}
