package be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.A;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter @Setter
public class MaladieDTO {

    private long id;
    private String nom;
    private Set<ADTO> aDTO = new LinkedHashSet<>();

}
