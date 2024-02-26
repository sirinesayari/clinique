package tn.esprit.cliniquetest.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.cliniquetest.entites.Clinique;
import tn.esprit.cliniquetest.repositories.IRepoClinique;

@Service
@AllArgsConstructor
public class CliniqueService implements ICliniqueService {
    IRepoClinique iRepoClinique;
    public Clinique addClinique (Clinique clinique){
        return iRepoClinique.save(clinique);
    }

}
