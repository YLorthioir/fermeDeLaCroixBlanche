package be.technobel.ylorth.fermedelacroixblanche.service.sante.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.santeDTO.VaccinDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.Vaccin;
import org.springframework.stereotype.Service;

@Service
public class VaccinMapper {

    public VaccinDTO toDTO(Vaccin entity){

        if(entity==null)
            return null;

        return VaccinDTO.builder()
                .id(entity.getId())
                .actif(entity.isActif())
                .delai(entity.getDelai())
                .dosage(entity.getDosage())
                .nbDose(entity.getNbDose())
                .nom(entity.getNom())
                .build();

    }
}
