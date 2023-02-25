package be.technobel.ylorth.fermedelacroixblanche.model.form.sante;

import jakarta.persistence.Column;

import java.util.Set;

public class TraitementUpdateForm {

    private String nomTraitement;
    private boolean actif;
    private Set<Long> maladie;

}
