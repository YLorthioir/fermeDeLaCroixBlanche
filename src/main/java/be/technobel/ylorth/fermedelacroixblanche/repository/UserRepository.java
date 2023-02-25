package be.technobel.ylorth.fermedelacroixblanche.repository;


import be.technobel.ylorth.fermedelacroixblanche.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByLogin(String login);


}
