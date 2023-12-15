package be.technobel.springairport.pl.models.piloter.form;

import be.technobel.springairport.dal.models.Pilote;
import be.technobel.springairport.dal.models.TypeAvion;
import jakarta.validation.constraints.Min;

public record PiloterForm(
        @Min(0)
        int nbVols,
        Pilote pilote,
        TypeAvion typeAvion) {
}
