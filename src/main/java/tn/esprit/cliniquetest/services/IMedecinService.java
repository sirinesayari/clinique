package tn.esprit.cliniquetest.services;

import tn.esprit.cliniquetest.entites.Medecin;

public interface IMedecinService {
   public Medecin addMedecinAndAssignToClinique (Medecin medecin, Long cliniqueId);

}
