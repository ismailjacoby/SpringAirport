package be.technobel.springairport.pl.models.proprio.dto;

import be.technobel.springairport.dal.models.Proprio;

public record ProprioDto(
        long id,
        String nom,
        String adresse,
        String tel) {
    public static ProprioDto toDto(Proprio proprio){
        return new ProprioDto(proprio.getId(),proprio.getNom(), proprio.getAdresse(), proprio.getTel());
    }
}
