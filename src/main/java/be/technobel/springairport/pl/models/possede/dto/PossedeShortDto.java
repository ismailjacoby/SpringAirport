package be.technobel.springairport.pl.models.possede.dto;

import be.technobel.springairport.dal.models.Avion;
import be.technobel.springairport.dal.models.TypeAvion;
import be.technobel.springairport.dal.models.joinTables.Possede;

public record PossedeShortDto(
        Avion avion,
        TypeAvion typeAvion) {

    public static PossedeShortDto toDto(Possede possede){
        return new PossedeShortDto(possede.getAvion(),possede.getTypeAvion());
    }
}
