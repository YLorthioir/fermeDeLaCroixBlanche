package be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO.FaucheDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter @Setter
public class VenteFaucheDTO {

    private long id;
    private double quantite;
    private LocalDate dateDeVente;
    private double prixCoutant;
    private double prixRevente;

    private FaucheDTO faucheDTO;

}
