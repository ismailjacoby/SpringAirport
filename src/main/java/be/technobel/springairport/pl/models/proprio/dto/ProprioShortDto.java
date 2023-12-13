package be.technobel.springairport.pl.models.proprio.dto;

import be.technobel.springairport.dal.models.Proprio;

public record ProprioShortDto(
        String nom,
        String adresse) {
    public static ProprioShortDto toDto(Proprio proprio){
        return new ProprioShortDto(proprio.getNom(), proprio.getAdresse());
    }
}
