package be.technobel.springairport.pl.models.intervention.dto;

import be.technobel.springairport.dal.models.Intervention;

import java.time.LocalDate;
import java.time.LocalTime;

public record InterventionDto(
        long id,
        String objet,
        LocalDate date,
        LocalTime time) {
    public static InterventionDto toDto(Intervention intervention){
        return new InterventionDto(intervention.getId(),intervention.getObjet(), intervention.getDate(),intervention.getTime());
    }
}
