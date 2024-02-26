package tn.esprit.cliniquetest.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clinique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClinique;
    String nomClinique;
    String adresse;
    int telephone;

    @ManyToMany
    List<Medecin> medecins;
}
