package be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.BovinDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class InjectionDTO {

    private long id;
    private LocalDate dateInjection;
    private BovinDTO bovinDTO;
    private VaccinDTO vaccinDTO;

}
