import java.util.Calendar;

public class Elephant extends Animal{
    
    private Continent origine;

    
    public enum Continent {
        Asie,
        Afrique;
    }   

    public Elephant(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille, Continent origine) {
        super(sexe, nom, anneeNaissance, poids, taille);
        this.origine = origine;
    }

    @Override
    public String cri() {
        return "Barrit";
    }

    @Override
    public boolean estAdulte() {
        
        return getAge() >= 13;
    }

    @Override 
    public String toString(){
        return "Animal{" +
                "anneeNaissance=" + anneeNaissance +
                ", nom='" + nom + '\'' +
                ", poids=" + poids + " " + UM_POIDS +
                ", sexe=" + sexe +
                ", taille=" + taille + " " + UM_TAILLE +
                ", cri=" + cri() + " " + 
                ", origine=" + origine +
                ", origine=" + estAdulte() +
                '}';
    }
}   

