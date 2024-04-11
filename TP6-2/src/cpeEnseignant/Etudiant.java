package cpeEnseignant;
import common.CaMarchePasException;
import common.Enseignant;
import common.Formation;
import common.Specialite;



public class Etudiant extends Enseignant{
    public Etudiant(String nom, String prenom, Specialite enseigne,Formation apprend, int heuresCours) throws CaMarchePasException{
        super(nom, prenom, enseigne, apprend, heuresCours);
    }
    @Override 
    public int salaire(){
        int heuresMax = 50;
        int heuresAPayer = Math.min(heuresCours, heuresMax);
        return heuresAPayer * 20;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
