package be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO.ChampDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO.ADTO;
import be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO.InjectionDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

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
    private RaceDTO raceDTO;
    private ChampDTO champDTO;
    private Set<InjectionDTO> injectionsDTO = new LinkedHashSet<>();
    private Set<ADTO> aDTO = new LinkedHashSet<>();
    private BovinDTO pereDTO;
    private BovinDTO mereDTO;
    private Set<BovinDTO> enfantPereDTO;
    private Set<BovinDTO> enfantsMereDTO;

}
