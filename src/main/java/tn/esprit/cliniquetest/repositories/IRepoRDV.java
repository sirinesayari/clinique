package tn.esprit.cliniquetest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.cliniquetest.entites.Clinique;
import tn.esprit.cliniquetest.entites.Rendez_vous;
import tn.esprit.cliniquetest.entites.Specialite;

import java.util.List;

@Repository
public interface IRepoRDV extends JpaRepository<Rendez_vous,Long> {
    @Query("SELECT rdv FROM Rendez_vous rdv JOIN rdv.medecin m  JOIN m.cliniques c  WHERE c.idClinique =?1 and  m.specialite = ?2 ")
    public List<Rendez_vous> getRendezVousByCliniqueAndSpecialite(@Param("idClinique") Long idClinique, @Param("specialite") Specialite specialite);

    @Query("SELECT COUNT(rdv) FROM Rendez_vous rdv WHERE rdv.medecin.idMedecin = :idMedecin")
    public int getNbrRendezVousMedecin(@Param("idMedecin") Long idMedecin);


    List<Rendez_vous> findByMedecinIdMedecin(Long idMedecin);
}