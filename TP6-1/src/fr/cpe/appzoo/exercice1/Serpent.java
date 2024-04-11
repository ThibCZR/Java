package fr.cpe.appzoo.exercice1;

import fr.cpe.appzoo.common.Animal;
import fr.cpe.appzoo.common.CaMarchePasException;
import fr.cpe.appzoo.common.SexeAnimal;

public class Serpent extends Animal implements lCarnivore{
    private EspeceSerpent espece;
    private boolean venimeux;
    

    public EspeceSerpent getEspece() {
        return this.espece;
    }

    public void setEspece(EspeceSerpent espece) {
        this.espece = espece;
    }


    public boolean getVenimeux() {
        return this.venimeux;
    }

    public void setVenimeux(boolean venimeux) {
        if (espece.equals(EspeceSerpent.Boa) || espece.equals(EspeceSerpent.Couleuvre)) {
            this.venimeux = false;
        } else {
            this.venimeux = true;
        }
    }
    
    public Serpent(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille, EspeceSerpent espece) throws CaMarchePasException {
        super(sexe, nom, anneeNaissance, poids, taille);       
        setEspece(espece);
        setVenimeux(venimeux); 
    }

    @Override
    public String cri() {
        if (espece.equals(EspeceSerpent.Crotale) || espece.equals(EspeceSerpent.A_Sonnette)) {
            return "GUILING GUILING";
        } else if (espece.equals(EspeceSerpent.Cornu) || espece.equals(EspeceSerpent.Echide)) {
            return "Criiiiiiiiiiiii";
        } else {
            return "HUIIIIIIIIIIIII";
        } 
    }

    @Override
    public boolean estAdulte() {        
        return getAge() >= 2;
    }


    public double qtteViandeSemaine(){
        if(getAge() < 1){
            return 0.05;
        } else if(getAge() < 2) {
            return 0.1;
        } else {
            return 1;
        }
    }

    public String proiesPreferees(){
        if(getAge() < 1){
            return "sourcieaux";
        } else if(getAge() < 2) {
            return "souris";
        } else {
            return "cochon d'inde";
        }
    }

    public String tue() {
        if (venimeux) {
            return "mort sa proie";
        } else {
            if (espece == EspeceSerpent.Couleuvre) {
                return "avalant sa proie vivante";
            } else {
                return "etouffant sa proie";}
            }
        }

    @Override
    public String toString() {
        String type = getClass().getSimpleName();
        return super.toString() +                
                "\nEspèce : " + espece +
                "\nVenimeux : " + getVenimeux() +              
                "\n" + nom + " mange "  + proiesPreferees() + " ou équivalents en quantité " + qtteViandeSemaine() + UM_POIDS + " par jour. " + type + " " + espece + " " + tue();
    }    

   

    

}
