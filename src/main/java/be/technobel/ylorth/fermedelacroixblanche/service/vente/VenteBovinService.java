package be.technobel.ylorth.fermedelacroixblanche.service.vente;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.venteDTO.VenteBovinDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.form.vente.VenteBovinForm;

import java.util.List;

public interface VenteBovinService {
    List<VenteBovinDTO> getAll();
    VenteBovinDTO getOne(Long id);
    void insert(VenteBovinForm form);
    void update(Long id, VenteBovinForm form);
    void delete(Long id);
}
