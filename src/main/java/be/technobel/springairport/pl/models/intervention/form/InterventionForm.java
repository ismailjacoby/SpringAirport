package be.technobel.springairport.pl.models.intervention.form;

import java.time.LocalDate;
import java.time.LocalTime;

public record InterventionForm(
        String objet,
        LocalDate date,
        LocalTime time) {
}
