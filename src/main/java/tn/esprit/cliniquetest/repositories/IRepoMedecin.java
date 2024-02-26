package tn.esprit.cliniquetest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.cliniquetest.entites.Clinique;
import tn.esprit.cliniquetest.entites.Medecin;

@Repository
public interface IRepoMedecin  extends JpaRepository<Medecin,Long> {
    Medecin findByIdMedecin(Long idMedecin);
}
