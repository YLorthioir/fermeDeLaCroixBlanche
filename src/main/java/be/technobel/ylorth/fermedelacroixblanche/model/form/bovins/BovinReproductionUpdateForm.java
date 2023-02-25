package be.technobel.ylorth.fermedelacroixblanche.model.form.bovins;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class BovinReproductionUpdateForm {
    //TODO annotation pour sexe, dateDeNaissance, pertegrossesse, date insemination
    private char sexe;
    private LocalDate dateDeNaissance;
    private double poidsNaissance;
    private String nom;
    private boolean enCharge;
    private boolean neCesarienne;
    private Long raceId;
    private Long champId;
    private Set<Long> a = new LinkedHashSet<>();
    private Long pereId;
    private Long mereId;
    private LocalDate derniereInsemination;
    private int perteGrossesse;
}
