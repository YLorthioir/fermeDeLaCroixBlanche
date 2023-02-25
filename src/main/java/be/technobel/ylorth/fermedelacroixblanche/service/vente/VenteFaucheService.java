package be.technobel.ylorth.fermedelacroixblanche.service.vente;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO.VenteFaucheDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.form.vente.VenteFaucheForm;

import java.util.List;

public interface VenteFaucheService {

    List<VenteFaucheDTO> getAll();
    VenteFaucheDTO getOne(Long id);
    void insert(VenteFaucheForm form);
    void update(Long id, VenteFaucheForm form);
    void delete(Long id);

}
