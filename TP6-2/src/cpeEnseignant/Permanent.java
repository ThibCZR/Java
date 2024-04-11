package cpeEnseignant;
import common.CaMarchePasException;
import common.Enseignant;
import common.Specialite;
import common.Formation;


public class Permanent extends Enseignant{
    
    public Permanent(String nom, String prenom, Specialite enseigne,Formation apprend, int heuresCours) throws CaMarchePasException{
        super(nom, prenom, enseigne, apprend, heuresCours);
    }

    @Override 
    public int salaire(){
        int heuresComplementaire = heuresCours - 200;
        if (heuresComplementaire < 0){
            return 3000;
        } else {
            return 3000 + 80 * heuresComplementaire;
        }
    }


    @Override
    public String toString(){
        return super.toString();
        
    }
}
