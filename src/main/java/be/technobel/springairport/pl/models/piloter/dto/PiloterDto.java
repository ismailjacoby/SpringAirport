package be.technobel.springairport.pl.models.piloter.dto;

import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.dal.models.TypeAvion;
import be.technobel.springairport.dal.models.joinTables.Piloter;

public record PiloterDto(
        long id,
        int nbVols,
        Pilote pilote,
        TypeAvion typeAvion) {

    public static PiloterDto toDto(Piloter piloter){
        return new PiloterDto(piloter.getId(), piloter.getNbVols(), piloter.getPilote(), piloter.getTypeAvion());
    }
}
