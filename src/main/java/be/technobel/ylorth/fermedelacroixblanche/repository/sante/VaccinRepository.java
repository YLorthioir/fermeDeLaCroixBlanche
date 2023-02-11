package be.technobel.ylorth.fermedelacroixblanche.repository.sante;

import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.Vaccin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinRepository extends JpaRepository<Vaccin,Long> {

}