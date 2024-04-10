import fr.cpe.appzoo.common.Animal;
import fr.cpe.appzoo.common.Continent;
import fr.cpe.appzoo.common.SexeAnimal;

public class Humain extends Animal implements lOmnivore {
    private Continent origine; 

    public Humain(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille, Continent origine) {
        super(sexe, nom, anneeNaissance, poids, taille);
        this.origine = origine;
    }

    @Override
    public String cri() {
        if(estAdulte() == false){
            return "OUIINNNNNNNNNNN";
        } else {
            return "AIIIILLLLLLLLLL";
        }
    }         

    @Override
    public boolean estAdulte() {        
        return getAge() >= 18;
    }

    public String mangerAvec(){
        if(origine == Continent.Asie){
            return "Baguettes";
        } else {
            return "Couverts";
        }
    }

    public double qtteViandeSemaine(){
        return 1;
     }
 
     public double qttePlanteJour(){
         return 0.5;
     }
 
     public double qtteTotalJour(){
         return qtteViandeSemaine()/7 + qttePlanteJour();
     }
 
 
     public String proiesPreferees(){
        return "boeuf";        
     }
 
     public String plantePreferee(){
         return "soja";
     }
 
     public String tue() {
         return "amenant ses proies à l'abatoire";
     }

     @Override
     public String toString() {
         String type = getClass().getSimpleName();
         return super.toString() +                
             "\nEspèce : " + origine +
             "\n" + nom + " mange " + proiesPreferees() + " en quantité " + qtteViandeSemaine() + UM_POIDS  + " par jour. Le " + type + " " + tue() +
             "\nson régime contient aussi du  " + plantePreferee() + " quantité " + qttePlanteJour() + " par jour."  +
             "\nIl mange" +  mangerAvec();           
     }   
 
}
