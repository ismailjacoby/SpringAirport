package be.technobel.springairport.pl.models.typeAvion.form;

import jakarta.validation.constraints.Min;

public record TypeAvionForm(
        String nom,
        String constucteur,
        @Min(value = 1)
        int puissance,
        @Min(value = 1)
        int nbPlaces) {
}
