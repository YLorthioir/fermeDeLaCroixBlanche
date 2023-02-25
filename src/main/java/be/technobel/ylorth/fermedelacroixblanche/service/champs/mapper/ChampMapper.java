package be.technobel.ylorth.fermedelacroixblanche.service.champs.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO.ChampDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.champs.Champ;
import be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper.BovinMapper;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ChampMapper {

    private BovinMapper bovinMapper;
    private CultureMapper cultureMapper;

    public ChampMapper(BovinMapper bovinMapper, CultureMapper cultureMapper) {
        this.bovinMapper = bovinMapper;
        this.cultureMapper = cultureMapper;
    }

    public ChampDTO toDTO (Champ entity){
        if (entity==null)
            return null;

        return ChampDTO.builder()
                .id(entity.getId())
                .dateDerniereChaux(entity.getDateDerniereChaux())
                .lieu(entity.getLieu())
                .superficie(entity.getSuperficie())
                .bovins(entity.getBovins().stream()
                        .map(bovinMapper::toDTO)
                        .collect(Collectors.toSet()))
                .culturesDTO(entity.getCultures().stream()
                        .map(cultureMapper::toDTO)
                        .collect(Collectors.toSet()))
                .build();
    }
}
