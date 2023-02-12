package be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO.VenteBovinDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class BovinEngraissementDTO extends BovinDTO {

    private double poidsSurPattes;
    private double poidsCarcasse;
    private LocalDate dateEngraissement;
    private MelangeDTO melangeDTO;
    private VenteBovinDTO venteBovinDTO;

}
