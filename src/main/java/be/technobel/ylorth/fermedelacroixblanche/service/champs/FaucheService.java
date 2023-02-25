package be.technobel.ylorth.fermedelacroixblanche.service.champs;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO.FaucheDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.form.champs.FaucheInsertForm;
import be.technobel.ylorth.fermedelacroixblanche.model.form.champs.FaucheUpdateForm;

import java.util.Set;

public interface FaucheService {
    FaucheDTO getOne(Long id);
    void insert(FaucheInsertForm form);
    void update(FaucheUpdateForm form);
    Set<FaucheDTO> getAll(Long id);
    Set<FaucheDTO> getAll(int annee);

}
