package be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@Getter @Setter
public class MaladieDTO {

    private long id;
    private String nom;
    private Set<ADTO> aDTO = new LinkedHashSet<>();

}
