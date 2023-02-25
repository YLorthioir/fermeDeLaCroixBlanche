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
                .dateEngraissement(entity.getDateEngraissement())
                .poidsCarcasse(entity.getPoidsCarcasse())
                .poidsSurPattes(entity.getPoidsSurPattes())
                .melangeId(entity.getMelange().getId())
                .build();

    }
}
