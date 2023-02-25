package be.technobel.ylorth.fermedelacroixblanche.service.champs.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO.TypeDeGrainDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.champs.TypeDeGrain;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class GrainMapper {

    public TypeDeGrainDTO toDTO(TypeDeGrain entity){
        if(entity==null)
            return null;

        return TypeDeGrainDTO.builder()
                .id(entity.getId())
                .nomGrain(entity.getNomGrain())
                .culturesId(entity.getCultures().stream()
                        .map(c -> c.getId())
                        .collect(Collectors.toSet()))
                .build();
    }

}
