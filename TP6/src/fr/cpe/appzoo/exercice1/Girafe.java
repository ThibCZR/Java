package fr.cpe.appzoo.exercice1;

import fr.cpe.appzoo.common.Animal;
import fr.cpe.appzoo.common.CaMarchePasException;
import fr.cpe.appzoo.common.SexeAnimal;

public class Girafe extends Animal implements lHerbivore {
    
    public Girafe(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille) throws CaMarchePasException {
        super(sexe, nom, anneeNaissance, poids, taille);        
    }
    
    @Override
    public String cri() {

        if (estAdulte() == true){
            return "Muuuuuuuuuuuuuu";            
        } else {
            return "MUUUUUUUUUUUUUU";
        }
    }

    @Override
    public boolean estAdulte() {
        
        return getAge() >= 4;
    }

    public String plantePreferee(){
        if (getAge() < 2){
            return "lait";
        }else {
        return "acacias";
        }
    }

    public double qttePlanteJour(){
       return poids * 0.05;
    }

    @Override
    public String toString() {
        return super.toString()+
            "\n" + nom + " mange " + plantePreferee() + " en quantité " + qttePlanteJour() + UM_POIDS  + " par jour";
    }    


}
