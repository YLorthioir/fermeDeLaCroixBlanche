package be.technobel.ylorth.fermedelacroixblanche.model.form.bovins;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class BovinEngraissementUpdateForm {
    //TODO annotation pour sexe, dateDeNaissance,poidscarcasse et poidssurpattes
    private char sexe;
    private LocalDate dateDeNaissance;
    private double poidsNaissance;
    private String nom;
    private boolean enCharge;
    private boolean neCesarienne;
    private Long raceId;
    private Long champsId;
    private Set<Long> a = new LinkedHashSet<>();
    private Long pereId;
    private Long mereId;
    private double poidsSurPattes;
    private double poidsCarcasse;
    private LocalDate dateEngraissement;
    private Long melangeId;
}
