package be.technobel.springairport.pl.models.possede.form;

import be.technobel.springairport.dal.models.Avion;
import be.technobel.springairport.dal.models.TypeAvion;

public record PossedeForm(Avion avion, TypeAvion typeAvion) {
}
