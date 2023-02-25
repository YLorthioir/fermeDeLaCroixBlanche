package be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@SuperBuilder
@Getter @Setter
public class FemelleReproductionDTO extends BovinDTO {

    private LocalDate derniereInsemination;
    private int perteGrossesse;

}
