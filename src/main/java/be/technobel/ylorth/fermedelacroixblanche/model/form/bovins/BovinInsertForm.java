package be.technobel.ylorth.fermedelacroixblanche.model.form.bovins;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class BovinInsertForm {
    @NotBlank
    private String numeroInscription;
    //Annotation Sexe
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
