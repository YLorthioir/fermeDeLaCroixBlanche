package be.technobel.ylorth.fermedelacroixblanche.service.bovins;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.MelangeDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.form.bovins.MelangeForm;

import java.util.List;

public interface MelangeService {
    List<MelangeDTO> getAll();
    void insert(MelangeForm form);
    void update(Long id, MelangeForm form);
}
