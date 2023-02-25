package be.technobel.ylorth.fermedelacroixblanche.model.form.champs;

import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class FaucheUpdateForm {
    //TODO annotation pour date
    Long champId;
    int annee;
    LocalDate fauche1;
    @Positive
    Integer fauche1Rendement;
    LocalDate fauche2;
    Integer fauche2Rendement;
    LocalDate fauche3;
    Integer fauche3Rendement;
    LocalDate fauche4;
    Integer fauche4Rendement;
}
