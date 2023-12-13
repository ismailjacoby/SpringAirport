package be.technobel.springairport.pl.models.intervention.dto;

import be.technobel.springairport.dal.models.Intervention;

import java.time.LocalDate;
import java.time.LocalTime;

public record InterventionShortDto (
        String objet,
        LocalDate date,
        LocalTime time){
    public static InterventionShortDto toDto(Intervention intervention){
        return new InterventionShortDto(intervention.getObjet(), intervention.getDate(),intervention.getTime());
    }
}
