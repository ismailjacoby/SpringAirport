package be.technobel.springairport.pl.models.typeAvion.dto;

import be.technobel.springairport.dal.models.TypeAvion;

public record TypeAvionDto(
        String nom,
        String constucteur,
        int puissance,
        int nbPlaces) {
    public static TypeAvionDto toDto(TypeAvion typeAvion){
        return new TypeAvionDto(typeAvion.getNom(), typeAvion.getConstucteur(), typeAvion.getPuissance(), typeAvion.getNbPlaces());
    }
}
