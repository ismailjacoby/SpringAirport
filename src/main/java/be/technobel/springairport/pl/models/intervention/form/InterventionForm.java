package be.technobel.springairport.pl.models.intervention.form;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;

import java.time.LocalDate;
import java.time.LocalTime;

public record InterventionForm(
        String objet,
        @FutureOrPresent
        LocalDate date,
        LocalTime duree) {
}
