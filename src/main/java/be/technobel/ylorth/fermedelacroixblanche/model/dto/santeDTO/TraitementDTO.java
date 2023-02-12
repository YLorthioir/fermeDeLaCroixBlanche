package be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.A;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter @Setter
public class TraitementDTO {

    private long id;
    private String nomTraitement;
    private boolean actif;
    private Set<ADTO> aDTO = new LinkedHashSet<>();

}
