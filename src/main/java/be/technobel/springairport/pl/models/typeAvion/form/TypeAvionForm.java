package be.technobel.springairport.pl.models.typeAvion.form;

public record TypeAvionForm(
        String nom,
        String constucteur,
        int puissance,
        int nbPlaces) {
}
