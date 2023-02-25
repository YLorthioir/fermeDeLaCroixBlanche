package be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.FemelleReproductionDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins.FemelleReproduction;
import org.springframework.stereotype.Service;

@Service
public class FemelleReproductionMapper {

    public FemelleReproductionDTO toDTO(FemelleReproduction entity){
        if(entity==null)
            return null;

        return FemelleReproductionDTO.builder()
                .derniereInsemination(entity.getDerniereInsemination())
                .perteGrossesse(entity.getPerteGrossesse())
                .build();

    }

}
