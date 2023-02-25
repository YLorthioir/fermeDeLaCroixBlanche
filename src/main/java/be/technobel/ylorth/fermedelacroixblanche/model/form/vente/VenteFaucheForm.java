package be.technobel.ylorth.fermedelacroixblanche.model.form.vente;

import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class VenteFaucheForm {
    //TODO annotation pour date
    Long faucheId;
    @Positive
    int qtt;
    LocalDate date;
    @Positive
    int prixCoutant;
    @Positive
    int prixRevente;
}
