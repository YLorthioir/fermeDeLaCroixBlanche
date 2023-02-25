package be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@Getter @Setter
public class TypeDeGrainDTO {

    private long id;
    private String nomGrain;
    private Set<Long> culturesId = new LinkedHashSet<>();

}
