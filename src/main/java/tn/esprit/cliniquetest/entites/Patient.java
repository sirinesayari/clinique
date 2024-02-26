package tn.esprit.cliniquetest.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long idPatient;
    String nomPatient;
    int telephone;
    Date dateNaissance;
    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    List<Rendez_vous> rendez_vous;


}
