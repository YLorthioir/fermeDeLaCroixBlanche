package be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@Getter @Setter
public class TraitementDTO {

    private long id;
    private String nomTraitement;
    private boolean actif;
    private Set<Long> aId = new LinkedHashSet<>();

}
