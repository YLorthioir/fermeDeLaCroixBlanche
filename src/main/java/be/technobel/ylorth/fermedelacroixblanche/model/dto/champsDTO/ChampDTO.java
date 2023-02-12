package be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.BovinDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter @Setter
public class ChampDTO {

    private long id;
    private String lieu;
    private double superficie;
    private LocalDate dateDerniereChaux;

    private Set<BovinDTO> bovins = new LinkedHashSet<>();


    private Set<CultureDTO> culturesDTO = new LinkedHashSet<>();

}
