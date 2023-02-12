package be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO;


import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter @Setter
public class MelangeDTO {

    private long id;

    private String nomMelange;
    private String Description;

    private Set<BovinEngraissementDTO> bovinEngraissementsDTO = new LinkedHashSet<>();

}
