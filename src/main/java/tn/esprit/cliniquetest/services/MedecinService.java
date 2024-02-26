package tn.esprit.cliniquetest.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.cliniquetest.entites.Clinique;
import tn.esprit.cliniquetest.entites.Medecin;
import tn.esprit.cliniquetest.repositories.IRepoClinique;
import tn.esprit.cliniquetest.repositories.IRepoMedecin;

import java.util.List;

@Service
@AllArgsConstructor
public class MedecinService  implements IMedecinService{
    IRepoClinique iRepoClinique;
    IRepoMedecin iRepoMedecin;
    public Medecin addMedecinAndAssignToClinique (Medecin medecin, Long cliniqueId){
          Clinique clinique =iRepoClinique.findByIdClinique(cliniqueId) ;
         Medecin  med = iRepoMedecin.save(medecin);
        clinique.getMedecins().add(med);
        iRepoClinique.save(clinique);
        return med;
    }



}
