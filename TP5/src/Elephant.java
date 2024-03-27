public class Elephant extends Animal{
    
    private Continent origine; 

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
    public String toString() {

        String infoSupplementaires = "";
        String type = getClass().getSimpleName();

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
        return "Animal :" +
                "\nNom : '" + nom + '\'' +
                "\nAnnée de Naissance : " + anneeNaissance +
                "\nPoids : " + poids + " " + UM_POIDS +               
                "\nSexe : " + sexe +
                "\nTaille : " + taille + " " + UM_TAILLE +
                "\nAge : " + getAge() +
                "\nAdulte : " + estAdulte() +
                "\nType : " + type +
                "\nCri : " + cri() + " " + 
                "\nOrigine : " + origine +                
                "\nInfo Supplémentaire : " + infoSupplementaires;
    }    
}   

