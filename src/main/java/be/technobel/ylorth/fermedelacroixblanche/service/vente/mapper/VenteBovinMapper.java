package be.technobel.ylorth.fermedelacroixblanche.service.vente.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO.VenteBovinDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO.VenteFaucheDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.vente.VenteBovin;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.vente.VenteFauche;
import be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper.BovinEngraissementMapper;
import be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper.BovinMapper;
import be.technobel.ylorth.fermedelacroixblanche.service.champs.mapper.FaucheMapper;
import org.springframework.stereotype.Service;

@Service
public class VenteBovinMapper {

    private final BovinEngraissementMapper bovinEngraissementMapper;

    public VenteBovinMapper(BovinEngraissementMapper bovinEngraissementMapper) {
        this.bovinEngraissementMapper = bovinEngraissementMapper;
    }

    public VenteBovinDTO toDTO(VenteBovin entity){

        if(entity==null)
            return null;

        return VenteBovinDTO.builder()
                .id(entity.getId())
                .dateDeVente(entity.getDateDeVente())
                .prixCoutant(entity.getPrixCoutant())
                .prixRevente(entity.getPrixRevente())
                .quantite(entity.getQuantite())
                .bovinEngraissementDTO(bovinEngraissementMapper.toDTO(entity.getBovinEngraissement()))
                .build();
    }
}
