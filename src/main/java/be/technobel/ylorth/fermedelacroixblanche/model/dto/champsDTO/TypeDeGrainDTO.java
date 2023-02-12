package be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter @Setter
public class TypeDeGrainDTO {

    private long id;
    private String nomGrain;
    private Set<CultureDTO> culturesDTO = new LinkedHashSet<>();

}
