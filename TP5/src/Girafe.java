public class Girafe extends Animal implements lHerbivore {


    public Girafe(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille) {
        super(sexe, nom, anneeNaissance, poids, taille);        
    }
    
    @Override
    public String cri() {

        if (estAdulte() == true){
            return "Meugle";
        } else {
            return "Meugle fort";
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
        String type = getClass().getSimpleName();
        return "Animal :" +
                "\nNom : '" + nom + '\'' +
                "\nAnnée de Naissance : " + anneeNaissance +
                "\nPoids : " + poids + " " + UM_POIDS +               
                "\nSexe : " + sexe +
                "\nTaille : " + taille + " " + UM_TAILLE +
                "\nAge : " + getAge() + UM_AGE +
                "\nAdulte : " + estAdulte() +
                "\nType : " + type +
                "\nCri : " + cri() +
                "\n" + nom + " mange " + plantePreferee() + " en quantité " + qttePlanteJour() + UM_POIDS  + " par jour";
    }    


}
