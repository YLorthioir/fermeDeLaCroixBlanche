package be.technobel.ylorth.fermedelacroixblanche.model.form.champs;

import java.time.LocalDate;

public class CultureUpdateForm {
    String nom;
    double superficie;
    String uniteDeMesure;
    boolean temporaire;
    LocalDate dateMiseEnCulture;
    LocalDate dateDeFin;
    LocalDate dateDernierEpandage;
    int qttFumier;
    String referenceAnalyse;
    Long grainId;

}
