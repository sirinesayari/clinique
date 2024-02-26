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
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMedecin;
    String nomMedecin;
    @Enumerated(value = EnumType.STRING)
    Specialite specialite;
    int telephone;
    int prixConsultation;
    @ManyToMany(mappedBy = "medecins",cascade = CascadeType.ALL)
    List<Clinique> cliniques;

    @OneToMany(mappedBy = "medecin",cascade = CascadeType.ALL)
    List<Rendez_vous>rendez_vousList;


}
