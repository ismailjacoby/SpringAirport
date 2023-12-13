package be.technobel.springairport.pl.models.mecano.dto;

import be.technobel.springairport.dal.models.Mecano;

public record MecanoShortDto (
        String nom,
        String adresse){
    public static MecanoShortDto toDto(Mecano mecano){
        return new MecanoShortDto(mecano.getNom(), mecano.getAdresse());
    }
}
