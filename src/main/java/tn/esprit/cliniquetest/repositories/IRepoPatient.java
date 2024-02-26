package tn.esprit.cliniquetest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.cliniquetest.entites.Clinique;
import tn.esprit.cliniquetest.entites.Patient;

@Repository
public interface IRepoPatient  extends JpaRepository<Patient,Long> {
    Patient findByIdPatient(Long idPatient);
}
