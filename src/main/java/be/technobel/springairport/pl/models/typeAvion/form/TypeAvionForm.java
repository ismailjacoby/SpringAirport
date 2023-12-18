package be.technobel.springairport.pl.models.typeAvion.form;

import jakarta.validation.constraints.Min;

public record TypeAvionForm(
        String nom,
        String constucteur,
        int puissance,
        int nbPlaces) {
}
