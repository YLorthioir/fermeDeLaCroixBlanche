package be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.BovinDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins.Bovin;
import org.springframework.stereotype.Service;

@Service
public class BovinMapper {


    public BovinDTO toDTO(Bovin entity){
        if(entity==null)
            return null;

        return BovinDTO.builder()
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
                .build();

    }
}
