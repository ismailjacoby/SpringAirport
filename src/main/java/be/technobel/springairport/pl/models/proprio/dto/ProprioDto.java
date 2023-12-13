package be.technobel.springairport.pl.models.proprio.dto;

import be.technobel.springairport.dal.models.Proprio;

public record ProprioDto(
        String nom,
        String adresse,
        String tel) {
    public static ProprioDto toDto(Proprio proprio){
        return new ProprioDto(proprio.getNom(), proprio.getAdresse(), proprio.getTel());
    }
}
