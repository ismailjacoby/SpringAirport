package be.technobel.springairport.pl.models.intervention.dto;

import be.technobel.springairport.dal.models.Intervention;

import java.time.LocalDate;
import java.time.LocalTime;

public record InterventionDto(
        String objet,
        LocalDate date,
        LocalTime duree) {
    public static InterventionDto toDto(Intervention intervention){
        return new InterventionDto(intervention.getObjet(), intervention.getDate(),intervention.getDuree());
    }
}
