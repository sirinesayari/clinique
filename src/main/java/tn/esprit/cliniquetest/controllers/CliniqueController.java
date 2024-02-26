package tn.esprit.cliniquetest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.cliniquetest.entites.Clinique;
import tn.esprit.cliniquetest.services.ICliniqueService;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class CliniqueController {
    ICliniqueService iCliniqueService;
    @PostMapping("/ajouterclinique")
    public Clinique addClinique (@RequestBody Clinique clinique){
        return iCliniqueService.addClinique(clinique);

    }



}
