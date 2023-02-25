package be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO.VenteBovinDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@SuperBuilder
@Getter @Setter
public class BovinEngraissementDTO extends BovinDTO {

    private double poidsSurPattes;
    private double poidsCarcasse;
    private LocalDate dateEngraissement;
    private Long melangeId;
    private Long venteBovinId;

}
