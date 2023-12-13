package be.technobel.springairport.pl.models.avion.dto;

import be.technobel.springairport.dal.models.Avion;

public record AvionDto (String immatriculation){
    public static AvionDto toDto(Avion avion){
        return new AvionDto(avion.getImmatriculation());
    }
}
