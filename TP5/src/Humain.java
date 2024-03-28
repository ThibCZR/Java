public class Humain extends Animal implements lOmnivore {
    public Humain(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille, Continent origine) {
        super(sexe, nom, anneeNaissance, poids, taille);

    }

    @Override
    public String cri() {
        return "AIIIILLLLLLLLLL";
    }         

    @Override
    public boolean estAdulte() {
        
        return getAge() >= 18;
    }

    public String mangerAvec(){
        return "";
    }

    public double qtteViandeSemaine(){
        return 3;
     }
 
     public double qttePlanteJour(){
         return poids * 0.035;
     }
 
     public double qtteTotalJour(){
         return qtteViandeSemaine()/7 + qttePlanteJour();
     }
 
 
     public String proiesPreferees(){
        return "";
        
     }
 
     public String plantePreferee(){
         return "fruits et racines";
     }
 
     public String tue() {
         return "mort sa proie";
     }
 
}
