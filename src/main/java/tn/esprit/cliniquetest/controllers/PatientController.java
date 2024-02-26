package tn.esprit.cliniquetest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.cliniquetest.entites.Patient;
import tn.esprit.cliniquetest.services.IPatientService;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class PatientController {
    IPatientService iPatientService;
    @PostMapping("/ajouterpatient")

        public Patient addPatient( @RequestBody Patient patient){
        return iPatientService.addPatient(patient);
    }
}
