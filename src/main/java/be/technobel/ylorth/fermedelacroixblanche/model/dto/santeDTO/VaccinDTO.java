package be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VaccinDTO {

    private long id;
    private String nom;
    private int nbDose;
    private int delai;
    private String dosage;
    private boolean actif;

}
