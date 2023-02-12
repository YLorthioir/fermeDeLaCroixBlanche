package be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class FemelleReproductionDTO extends BovinDTO {

    private LocalDate derniereInsemination;
    private int perteGrossesse;

}
