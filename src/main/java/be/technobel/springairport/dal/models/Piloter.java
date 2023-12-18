package be.technobel.springairport.dal.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.io.Serializable;

@Entity @Data @IdClass(Piloter.PiloterId.class)
public class Piloter {
    @Min(0)
    private int nbVols;

    @Id
    @ManyToOne
    @JoinColumn(name = "pilote_id")
    private Pilote pilote;

    @Id
    @ManyToOne
    @JoinColumn(name = "type_avion_id")
    private TypeAvion typeAvion;


    @Embeddable
    public class PiloterId implements Serializable {
        private long pilote;
        private long typeAvion;

        public PiloterId(){

        }
        public PiloterId(long pilote, long typeAvion){
            this.pilote = pilote;
            this.typeAvion = typeAvion;
        }
    }
}