package be.technobel.ylorth.fermedelacroixblanche.service.sante.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO.InjectionDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.Injection;
import be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper.BovinMapper;
import org.springframework.stereotype.Service;

@Service
public class InjectionMapper {

    private final BovinMapper bovinMapper;
    private final VaccinMapper vaccinMapper;

    public InjectionMapper(BovinMapper bovinMapper, VaccinMapper vaccinMapper) {
        this.bovinMapper = bovinMapper;
        this.vaccinMapper = vaccinMapper;
    }

    public InjectionDTO toDTO (Injection entity){

        if(entity==null)
            return null;

        return InjectionDTO.builder()
                .id(entity.getId())
                .dateInjection(entity.getDateInjection())
                .bovinDTO(bovinMapper.toDTO(entity.getBovin()))
                .vaccinDTO(vaccinMapper.toDTO(entity.getVaccin()))
                .build();
    }
}
