package be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class CultureDTO {

    private long id;
    private boolean estTemporaire;
    private LocalDate dateMiseEnCulture;
    private LocalDate dateDeFin;
    private String analysePDF;
    private LocalDate dateEpendage;
    private double qttFumier;
    private ChampDTO champDTO;
    private FaucheDTO faucheDTO;
    private TypeDeGrainDTO typeDeGrainDTO;

}
