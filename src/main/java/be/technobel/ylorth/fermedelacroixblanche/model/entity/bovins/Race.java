package be.technobel.ylorth.fermedelacroixblanche.model.entity.bovins;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "race_id", nullable = false)
    private long idRace;
    @Column(nullable = false, unique = true)
    private String nom;
    @OneToMany(mappedBy = "race")
    private Set<Bovin> bovins = new LinkedHashSet<>();

}
