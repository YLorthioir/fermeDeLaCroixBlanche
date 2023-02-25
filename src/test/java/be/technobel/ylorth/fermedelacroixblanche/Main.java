package be.technobel.ylorth.fermedelacroixblanche;

import be.technobel.ylorth.fermedelacroixblanche.model.dto.bovinsDTO.BovinEngraissementDTO;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins.Bovin;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins.BovinEngraissement;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins.Melange;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins.Race;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.champs.Champ;
import be.technobel.ylorth.fermedelacroixblanche.service.bovins.mapper.BovinEngraissementMapper;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BovinEngraissementMapper bovinEngraissementMapper = new BovinEngraissementMapper();



        Race race= new Race();
        race.setId(1L);
        race.setNom("Limousine");
        
        Melange melange = new Melange();
        melange.setId(1L);
        melange.setNomMelange("test");
        melange.setDescription("Test aussi");
        
        
        BovinEngraissement bovin = new BovinEngraissement();
        bovin.setId(1L);
        bovin.setDateDeNaissance(LocalDate.now().minusDays(3));
        bovin.setEnCharge(true);
        bovin.setNeCesarienne(true);
        bovin.setNom("test");
        bovin.setNumeroInscription("1234");
        bovin.setPoidsNaissance(123);
        bovin.setSexe('M');
        bovin.setRace(race);
        bovin.setDateEngraissement(LocalDate.now().minusDays(1));
        bovin.setMelange(melange);
        bovin.setChamp(new Champ());
        bovin.setPere(new Bovin());
        bovin.setMere(new Bovin());
        
        BovinEngraissementDTO bovinDTO = bovinEngraissementMapper.toDTO(bovin);

        System.out.println(bovinDTO.getDateEngraissement());
        
    }
}
