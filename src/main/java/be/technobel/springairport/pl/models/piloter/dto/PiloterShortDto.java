package be.technobel.springairport.pl.models.piloter.dto;

import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.dal.models.TypeAvion;
import be.technobel.springairport.dal.models.Piloter;

public record PiloterShortDto (
        int nbVols,
        Pilote pilote,
        TypeAvion typeAvion){

    public static PiloterShortDto toDto(Piloter piloter){
        return new PiloterShortDto(piloter.getNbVols(), piloter.getPilote(), piloter.getTypeAvion());
    }
}
