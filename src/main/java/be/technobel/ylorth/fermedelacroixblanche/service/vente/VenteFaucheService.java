package be.technobel.ylorth.fermedelacroixblanche.service.vente;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO.VenteFaucheDTO;

import java.util.List;
import java.util.Optional;

public interface VenteFaucheService {

    List<VenteFaucheDTO> getAll();
    VenteFaucheDTO getOne(Long id);

}
