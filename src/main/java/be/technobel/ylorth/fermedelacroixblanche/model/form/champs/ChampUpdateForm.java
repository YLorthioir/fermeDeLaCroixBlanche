package be.technobel.ylorth.fermedelacroixblanche.model.form.champs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class ChampUpdateForm {
    @NotBlank
    String nom;
    @Positive
    double superficie;
    String uniteDeMesure;
    @Past
    LocalDate dateDerniereChaux;
}
