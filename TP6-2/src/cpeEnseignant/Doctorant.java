package cpeEnseignant;
import common.CaMarchePasException;
import common.Enseignant;
import common.Formation;
import common.Specialite;


public class Doctorant extends Enseignant{
    public Doctorant(String nom, String prenom, Specialite enseigne,Formation apprend, int heuresCours) throws CaMarchePasException{
        super(nom, prenom, enseigne, apprend, heuresCours);
    }
    @Override 
    public int salaire(){
        int heureCoursMax = 100;
        if (heuresCours < heureCoursMax){
            return 40 * heuresCours;
        }
        return 40 * heureCoursMax;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
