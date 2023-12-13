package be.technobel.springairport.pl.models.mecano.dto;

import be.technobel.springairport.dal.models.Mecano;

public record MecanoDto(
        String nom,
        String adresse,
        String tel
        ) {
    public static MecanoDto toDto(Mecano mecano){
        return new MecanoDto(mecano.getNom(),mecano.getAdresse(),mecano.getTel());
    }
}
