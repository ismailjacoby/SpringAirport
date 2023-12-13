package be.technobel.springairport.pl.models.avion.dto;

import be.technobel.springairport.dal.models.Avion;

public record AvionShortDto (String immatriculation){
    public static AvionShortDto toDto(Avion avion){
        return new AvionShortDto(avion.getImmatriculation());
    }
}
