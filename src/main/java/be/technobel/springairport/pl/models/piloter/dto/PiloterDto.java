package be.technobel.springairport.pl.models.piloter.dto;

import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.dal.models.TypeAvion;
import be.technobel.springairport.dal.models.Piloter;

public record PiloterDto(
        int nbVols,
        Pilote pilote,
        TypeAvion typeAvion) {

    public static PiloterDto toDto(Piloter piloter){
        return new PiloterDto(piloter.getNbVols(), piloter.getPilote(), piloter.getTypeAvion());
    }
}
