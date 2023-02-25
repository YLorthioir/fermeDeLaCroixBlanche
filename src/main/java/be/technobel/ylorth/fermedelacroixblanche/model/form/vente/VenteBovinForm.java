package be.technobel.ylorth.fermedelacroixblanche.model.form.vente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class VenteBovinForm {
    //TODO annotation pour date
    @NotBlank
    String numeroIdentification;
    @Positive
    int qtt;
    LocalDate date;
    @Positive
    int prixCoutant;
    @Positive
    int prixRevente;
}
