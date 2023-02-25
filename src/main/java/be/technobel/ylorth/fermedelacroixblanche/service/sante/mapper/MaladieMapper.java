package be.technobel.ylorth.fermedelacroixblanche.service.sante.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO.MaladieDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.Maladie;
import org.springframework.stereotype.Service;

@Service
public class MaladieMapper {

    public MaladieDTO toDTO (Maladie entity){

        if(entity==null)
            return null;

        return MaladieDTO.builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .build();
    }
}
