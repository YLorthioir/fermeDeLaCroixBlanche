package be.technobel.ylorth.fermedelacroixblanche.repository.sante;

import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.Traitement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraitementRepository extends JpaRepository<Traitement,Long> {

}