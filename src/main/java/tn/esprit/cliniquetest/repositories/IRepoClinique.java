package tn.esprit.cliniquetest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.cliniquetest.entites.Clinique;

@Repository
public interface IRepoClinique  extends JpaRepository<Clinique,Long> {
Clinique findByIdClinique(Long idClinique);
}
