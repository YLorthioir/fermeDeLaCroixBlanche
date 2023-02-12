package be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter @Setter
public class RaceDTO {

    private long idRace;

    private String nom;

    private Set<BovinDTO> bovinsDTO = new LinkedHashSet<>();

}
