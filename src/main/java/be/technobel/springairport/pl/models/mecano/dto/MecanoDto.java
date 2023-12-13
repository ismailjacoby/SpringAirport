package be.technobel.springairport.pl.models.mecano.dto;

import be.technobel.springairport.dal.models.Mecano;

public record MecanoDto(
        long id,
        String nom,
        String adresse,
        String tel
        ) {
    public static MecanoDto toDto(Mecano mecano){
        return new MecanoDto(mecano.getId(),mecano.getNom(),mecano.getAdresse(),mecano.getTel());
    }
}
