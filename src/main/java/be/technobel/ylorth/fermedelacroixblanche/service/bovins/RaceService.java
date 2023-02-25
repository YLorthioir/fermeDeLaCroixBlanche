package be.technobel.ylorth.fermedelacroixblanche.service.bovins;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.RaceDTO;

import java.util.List;

public interface RaceService {
    List<RaceDTO> getAll();
    void insert(String nom);
}
