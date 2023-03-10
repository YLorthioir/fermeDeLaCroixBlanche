package be.technobel.ylorth.fermedelacroixblanche.model.form.champs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ChampInsertForm {
    @NotBlank
    String nom;
    @Positive
    double superficie;
    String uniteDeMesure;
}
