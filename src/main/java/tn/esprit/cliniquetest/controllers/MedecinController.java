package tn.esprit.cliniquetest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cliniquetest.entites.Medecin;
import tn.esprit.cliniquetest.services.ICliniqueService;
import tn.esprit.cliniquetest.services.IMedecinService;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class MedecinController {
IMedecinService iMedecinService;
@PostMapping("ajoutermedecin")
public Medecin addMedecinAndAssignToClinique (@RequestBody Medecin medecin, @RequestParam Long cliniqueId){
    return iMedecinService.addMedecinAndAssignToClinique(medecin,cliniqueId);
}


}
