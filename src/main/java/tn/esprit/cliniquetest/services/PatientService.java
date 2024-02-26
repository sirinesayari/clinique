package tn.esprit.cliniquetest.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.cliniquetest.entites.Patient;
import tn.esprit.cliniquetest.repositories.IRepoClinique;
import tn.esprit.cliniquetest.repositories.IRepoPatient;

@Service
@AllArgsConstructor
public class PatientService implements IPatientService{
    IRepoPatient iRepoPatient;
    public Patient addPatient(Patient patient){
        return iRepoPatient.save(patient);
    }
}
