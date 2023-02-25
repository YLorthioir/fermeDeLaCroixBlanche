package be.technobel.ylorth.fermedelacroixblanche.model.form.sante;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public class TraitementUpdateForm {

    @NotBlank
    private String nomTraitement;
    private boolean actif;
    private Set<Long> maladie;

}
