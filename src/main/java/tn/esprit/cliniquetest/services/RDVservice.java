package tn.esprit.cliniquetest.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.cliniquetest.entites.Medecin;
import tn.esprit.cliniquetest.entites.Patient;
import tn.esprit.cliniquetest.entites.Rendez_vous;
import tn.esprit.cliniquetest.entites.Specialite;
import tn.esprit.cliniquetest.repositories.IRepoMedecin;
import tn.esprit.cliniquetest.repositories.IRepoPatient;
import tn.esprit.cliniquetest.repositories.IRepoRDV;

import java.util.List;

@Service
@AllArgsConstructor
public class RDVservice implements IRDVservice {
    @Autowired
    IRepoRDV iRepoRDV;
    @Autowired
    IRepoMedecin iRepoMedecin;
    @Autowired
    IRepoPatient iRepoPatient;

    public void addRDVAndAssignMedAndPatient(Rendez_vous rdv, Long idMedecin, Long
            idPatient) {
        Patient patient = iRepoPatient.findByIdPatient(idPatient);
        Medecin medecin = iRepoMedecin.findByIdMedecin(idMedecin);
        if (patient != null && medecin != null) {
            rdv.setPatient(patient);
            rdv.setMedecin(medecin);
            iRepoRDV.save(rdv);
        }

    }
    public List<Rendez_vous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return iRepoRDV.getRendezVousByCliniqueAndSpecialite(idClinique, specialite);
    }

    public int getNbrRendezVousMedecin(Long idMedecin){
        return  iRepoRDV.getNbrRendezVousMedecin(idMedecin);
    }
}
