package be.technobel.ylorth.fermedelacroixblanche.service.champs;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO.ChampDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.dto.champsDTO.CultureDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.form.champs.ChampInsertForm;
import be.technobel.ylorth.fermedelacroixblanche.model.form.champs.ChampUpdateForm;
import be.technobel.ylorth.fermedelacroixblanche.model.form.champs.CultureUpdateForm;

public interface ChampService {
    ChampDTO getChamp(Long id);
    CultureDTO getCulture(Long id);
    void insert(ChampInsertForm form);
    void updateChamp(Long id, ChampUpdateForm form);
    void updateCulture(Long id, CultureUpdateForm form);
    void getHistorique(Long id);
    void insertGrain(String nom);

}
