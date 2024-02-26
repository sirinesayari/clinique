package tn.esprit.cliniquetest.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rendez_vous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idRDV;
    Date dateRDV;
    String remarque;
    @ManyToOne
    Medecin medecin;

    @ManyToOne
    Patient patient;


}
