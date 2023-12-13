package be.technobel.springairport.pl.models.pilote.dto;

import be.technobel.springairport.dal.models.Pilote;

public record PiloteDto(
        String nom,
        String adresse,
        String tel,
        String numBrevet) {
    public static PiloteDto toDto(Pilote pilote){
        return new PiloteDto(pilote.getNom(), pilote.getAdresse(), pilote.getTel(), pilote.getNumBrevet());
    }
}
