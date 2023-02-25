package be.technobel.ylorth.fermedelacroixblanche.model.form.champs;

import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class FaucheInsertForm {
    //TODO annotation pour date
    Long champId;
    @Positive
    int annee;
    LocalDate date;
    @Positive
    int rendement;
}
