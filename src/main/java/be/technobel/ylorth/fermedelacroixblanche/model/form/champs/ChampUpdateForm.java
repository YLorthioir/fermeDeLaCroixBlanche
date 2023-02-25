package be.technobel.ylorth.fermedelacroixblanche.model.form.champs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class ChampUpdateForm {
    //TODO annotation date
    @NotBlank
    String nom;
    @Positive
    double superficie;
    String uniteDeMesure;
    LocalDate dateDerniereChaux;
}
