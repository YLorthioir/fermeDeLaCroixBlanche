package be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO.ChampDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO.ADTO;
import be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO.InjectionDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@SuperBuilder
@Getter @Setter
public class BovinDTO {

    private long id;
    private String numeroInscription;
    private char sexe;
    private LocalDate dateDeNaissance;
    private double poidsNaissance;
    private String nom;
    private boolean enCharge;
    private boolean neCesarienne;
    private Long raceId;
    private Long champId;
    private Set<InjectionDTO> injectionsDTO = new LinkedHashSet<>();
    private Set<ADTO> aDTO = new LinkedHashSet<>();
    private Long pereId;
    private Long mereId;
}
