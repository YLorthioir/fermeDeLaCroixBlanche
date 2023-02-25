package be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.BovinEngraissementDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter @Setter
public class VenteBovinDTO {

    private long id;
    private double quantite;
    private LocalDate dateDeVente;
    private double prixCoutant;
    private double prixRevente;
    private BovinEngraissementDTO bovinEngraissementDTO;

}
