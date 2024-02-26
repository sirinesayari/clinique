package tn.esprit.cliniquetest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cliniquetest.entites.Rendez_vous;
import tn.esprit.cliniquetest.entites.Specialite;
import tn.esprit.cliniquetest.services.IRDVservice;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class RDVcontroller {
    IRDVservice irdVservice;
    @PostMapping("ajouterRDV")
    public void addRDVAndAssignMedAndPatient(@RequestBody Rendez_vous rdv, @RequestParam Long idMedecin, @RequestParam Long
            idPatient) {
         irdVservice.addRDVAndAssignMedAndPatient(rdv,idMedecin,idPatient);

    }
   @GetMapping("afficherRDV")
        public List<Rendez_vous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite){
            return irdVservice.getRendezVousByCliniqueAndSpecialite(idClinique,specialite);
        }

    @GetMapping("afficherNBrdv")
    public int getNbrRendezVousMedecin(@RequestParam Long idMedecin){
       return irdVservice.getNbrRendezVousMedecin(idMedecin);
    }
}
