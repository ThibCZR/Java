package cpeEnseignant;
import common.CaMarchePasException;
import common.Enseignant;
import common.Specialite;
import common.Formation;


public class Vacantaire extends Enseignant{
    public Vacantaire(String nom, String prenom, Specialite enseigne,Formation apprend, int heuresCours) throws CaMarchePasException{
        super(nom, prenom, enseigne, apprend, heuresCours);
    }
    @Override 
    public int salaire(){
        return 60 * heuresCours;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
