package be.technobel.ylorth.fermedelacroixblanche.repository.sante;

import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.Maladie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaladieRepository extends JpaRepository<Maladie,Long> {

}