package common;

import java.util.ArrayList;

import cpeEnseignant.Doctorant;
import cpeEnseignant.Etudiant;
import cpeEnseignant.Permanent;
import cpeEnseignant.Vacantaire;

public class App {
    public static void main(String[] args) {
        ArrayList<Enseignant> enseignants = new ArrayList<>();
        try {
            // Ajout des enseignants
            enseignants.add(new Doctorant("Durant", "Georges", Specialite.Electronique, null, 25));
            enseignants.add(new Permanent("Martin", "Jeanne", Specialite.Informatique, null, 35));
            enseignants.add(new Vacantaire("Malherbe", "Jean", Specialite.Chimie, null, 25));
            enseignants.add(new Etudiant("Cizeron", "Thibaut", null, Formation.ICS, 45));
        } catch (Exception e) {
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }

        for (Enseignant enseignant : enseignants) {
            System.out.println(enseignant.toString());
        }
    }
}
