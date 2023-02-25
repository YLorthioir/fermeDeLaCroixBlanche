package be.technobel.ylorth.fermedelacroixblanche.utils;

import be.technobel.ylorth.fermedelacroixblanche.model.entity.User;
import be.technobel.ylorth.fermedelacroixblanche.model.entity.UserRole;
import be.technobel.ylorth.fermedelacroixblanche.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
@Log4j2
public class DataInit implements InitializingBean {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    public DataInit(UserRepository userRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }


    @Override
    public void afterPropertiesSet() throws Exception {

        log.info("-- INITIALIZING DB DATA --");

        User admin = new User();
        admin.setEnabled(true);
        admin.setPassword("Charlotte");
        admin.setLogin("Yann");
        admin.getRoles().add(UserRole.ADMIN);
        admin.setPassword(encoder.encode(admin.getPassword()));

        admin = userRepository.save(admin);

        log.info("-- DATA INIT FINISHED --");
    }

}
