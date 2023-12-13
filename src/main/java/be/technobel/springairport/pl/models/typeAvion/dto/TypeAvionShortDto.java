package be.technobel.springairport.pl.models.typeAvion.dto;

import be.technobel.springairport.dal.models.TypeAvion;

public record TypeAvionShortDto(
        String nom,
        String constucteur) {
    public static TypeAvionShortDto toDto(TypeAvion typeAvion){
        return new TypeAvionShortDto(typeAvion.getNom(), typeAvion.getConstucteur());
    }
}
