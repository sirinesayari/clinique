package tn.esprit.cliniquetest.services;

import tn.esprit.cliniquetest.entites.Rendez_vous;
import tn.esprit.cliniquetest.entites.Specialite;

import java.util.List;

public interface IRDVservice {
    public void addRDVAndAssignMedAndPatient(Rendez_vous rdv, Long idMedecin, Long
            idPatient);

    public List<Rendez_vous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);
    public int getNbrRendezVousMedecin(Long idMedecin);

    //public void retrieveRendezVous();
}
