package be.technobel.springairport.dal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Proprio extends Personne {
    @OneToMany(mappedBy = "proprio")
    private List<A> possessions;
}
