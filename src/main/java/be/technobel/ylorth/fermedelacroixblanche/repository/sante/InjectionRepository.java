package be.technobel.ylorth.fermedelacroixblanche.repository.sante;

import be.technobel.ylorth.fermedelacroixblanche.model.entity.sante.Injection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InjectionRepository extends JpaRepository<Injection,Long> {

}