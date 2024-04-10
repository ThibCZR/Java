package fr.cpe.appzoo.exercice1;

import fr.cpe.appzoo.common.Animal;
import fr.cpe.appzoo.common.Continent;
import fr.cpe.appzoo.common.SexeAnimal;

public class Elephant extends Animal{    
    private Continent origine; 

    public Elephant(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille, Continent origine) {
        super(sexe, nom, anneeNaissance, poids, taille);
        this.origine = origine;
    }

    @Override
    public String cri() {
        return "HUUUUUUUUUUUUUM";
    }

    @Override
    public boolean estAdulte() {
        
        return getAge() >= 13;
    }

    public String plantePreferee(){
        if (getAge() < 5){
            return "lait";
        }else {
            if(origine == Continent.Afrique){
                return "feuillages et arbustes";
            } else {
                return "herbes";
            }
        }
    }

    public double qttePlanteJour(){
       return poids * 0.25;
    }

    @Override
    public String toString() {

        String infoSupplementaires = "";
        

        if (origine == Continent.Afrique) {
            infoSupplementaires += "Eléphant d'Afrique";
            infoSupplementaires += " avec de très grandes oreilles";
            infoSupplementaires += (sexe == SexeAnimal.Feminin ? " " : " et défenses");
        } else {
            infoSupplementaires += "Eléphant d'Asie";
            infoSupplementaires += " avec de petites oreilles";
            if (sexe == SexeAnimal.Feminin) {
                infoSupplementaires += "";
            }
        }
        return super.toString() +          
                "\nOrigine : " + origine +                
                "\nInfo Supplémentaire : " + infoSupplementaires +
                "\n" + nom + " mange " + plantePreferee() + " en quantité " + qttePlanteJour() + UM_POIDS  + " par jour";
    }    
}   

