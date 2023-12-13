package be.technobel.springairport.pl.models.pilote.dto;

import be.technobel.springairport.dal.models.Pilote;

public record PiloteShortDto (
        String nom,
        String adresse,
        String tel,
        String numBrevet) {

    public static PiloteShortDto toDto(Pilote pilote){
        return new PiloteShortDto(pilote.getNom(),pilote.getAdresse(), pilote.getTel(), pilote.getNumBrevet());
    }
}
