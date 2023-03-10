package be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.BovinDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter @Setter
public class ADTO {

    private long id;
    private LocalDate anneeMaladie;
    private BovinDTO bovinsDTO;
    private MaladieDTO maladieDTO;

    private TraitementDTO traitementDTO;

}
