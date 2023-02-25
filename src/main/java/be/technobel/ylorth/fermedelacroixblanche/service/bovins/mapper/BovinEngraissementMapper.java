package be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.BovinEngraissementDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins.BovinEngraissement;
import org.springframework.stereotype.Service;

@Service
public class BovinEngraissementMapper{

    public BovinEngraissementDTO toDTO(BovinEngraissement entity){
        if(entity==null)
            return null;

        return BovinEngraissementDTO.builder()
                .id(entity.getId())
                .dateDeNaissance(entity.getDateDeNaissance())
                .enCharge(entity.isEnCharge())
                .neCesarienne(entity.isNeCesarienne())
                .nom(entity.getNom())
                .numeroInscription(entity.getNumeroInscription())
                .poidsNaissance(entity.getPoidsNaissance())
                .sexe(entity.getSexe())
                .champId(entity.getChamp().getId())
                .mereId(entity.getMere().getId())
                .pereId(entity.getPere().getId())
                .raceId(entity.getRace().getId())
                .dateEngraissement(entity.getDateEngraissement())
                .poidsCarcasse(entity.getPoidsCarcasse())
                .poidsSurPattes(entity.getPoidsSurPattes())
                .melangeId(entity.getMelange().getId())
                .build();

    }
}
