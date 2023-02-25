package be.technobel.ylorth.fermedelacroixblanche.service.sante.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO.ADTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.A;
import be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper.BovinMapper;
import org.springframework.stereotype.Service;

@Service
public class AMapper {

    private final BovinMapper bovinMapper;
    private final MaladieMapper maladieMapper;
    private final TraitementMapper traitementMapper;

    public AMapper(BovinMapper bovinMapper, MaladieMapper maladieMapper, TraitementMapper traitementMapper) {
        this.bovinMapper = bovinMapper;
        this.maladieMapper = maladieMapper;
        this.traitementMapper = traitementMapper;
    }

    public ADTO toDTO (A entity){

        if(entity==null)
            return null;

        return ADTO.builder()
                .id(entity.getId())
                .anneeMaladie(entity.getAnneeMaladie())
                .bovinsDTO(bovinMapper.toDTO(entity.getBovins()))
                .maladieDTO(maladieMapper.toDTO(entity.getMaladie()))
                .traitementDTO(traitementMapper.toDTO(entity.getTraitement()))
                .build();
    }
}
