package be.technobel.ylorth.fermedelacroixblanche.service.vente.mapper;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO.VenteFaucheDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.vente.VenteFauche;
import be.technobel.ylorth.fermedelacroixblanche.service.champs.mapper.FaucheMapper;
import org.springframework.stereotype.Service;

@Service
public class VenteFaucheMapper {

    private final FaucheMapper faucheMapper;

    public VenteFaucheMapper(FaucheMapper faucheMapper) {
        this.faucheMapper = faucheMapper;
    }

    public VenteFaucheDTO toDTO(VenteFauche entity){

        if(entity==null)
            return null;

        return VenteFaucheDTO.builder()
                .id(entity.getId())
                .dateDeVente(entity.getDateDeVente())
                .prixCoutant(entity.getPrixCoutant())
                .prixRevente(entity.getPrixRevente())
                .quantite(entity.getQuantite())
                .faucheDTO(faucheMapper.toDTO(entity.getFauche()))
                .build();
    }
}
