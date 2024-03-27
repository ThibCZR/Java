public class Girafe extends Animal {


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
                "\nCri : " + cri();
    }    
}
