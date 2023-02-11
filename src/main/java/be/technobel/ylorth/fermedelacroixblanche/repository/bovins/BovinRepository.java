package be.technobel.ylorth.fermedelacroixblanche.repository.bovins;

import be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins.Bovin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BovinRepository extends JpaRepository<Bovin,Long> {

}