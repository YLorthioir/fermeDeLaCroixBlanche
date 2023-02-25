package be.technobel.ylorth.fermedelacroixblanche.model.form.vente;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class VenteFaucheForm {
    Long faucheId;
    @Positive
    int qtt;
    @Past
    LocalDate date;
    @Positive
    int prixCoutant;
    @Positive
    int prixRevente;
}
