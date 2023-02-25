package be.technobel.ylorth.fermedelacroixblanche.model.form.champs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class CultureUpdateForm {
    //TODO annotation pour dates
    @NotBlank
    String nom;
    @Positive
    double superficie;
    String uniteDeMesure;
    boolean temporaire;
    LocalDate dateMiseEnCulture;
    LocalDate dateDeFin;
    LocalDate dateDernierEpandage;
    @Positive
    int qttFumier;
    String referenceAnalyse;
    Long grainId;

}
