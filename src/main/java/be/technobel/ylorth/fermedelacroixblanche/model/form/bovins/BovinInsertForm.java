package be.technobel.ylorth.fermedelacroixblanche.model.form.bovins;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class BovinInsertForm {
    //TODO annotation pour sexe, dateDeNaissance
    @NotBlank
    private String numeroInscription;
    private char sexe;
    @NotNull
    private LocalDate dateDeNaissance;
    @Positive
    private double poidsNaissance;
    private boolean neCesarienne;
    private Long raceId;
    private Long pereId;
    private Long mereId;

}
