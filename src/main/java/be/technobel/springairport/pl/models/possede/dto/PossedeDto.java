package be.technobel.springairport.pl.models.possede.dto;

import be.technobel.springairport.dal.models.Avion;
import be.technobel.springairport.dal.models.TypeAvion;
import be.technobel.springairport.dal.models.joinTables.Possede;

public record PossedeDto(
        long id,
        Avion avion,
        TypeAvion typeAvion) {

    public static PossedeDto toDto(Possede possede){
        return new PossedeDto(possede.getId(), possede.getAvion(),possede.getTypeAvion());
    }
}
