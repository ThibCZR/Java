public class Ours extends Animal implements lCarnivore, lHerbivore {
    private EspeceOurs espece;

    public EspeceOurs getEspece() {
        return this.espece;
    }

    public void setEspece(EspeceOurs espece) {
        this.espece = espece;
    }


    public Ours(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille, EspeceOurs espece) {
        super(sexe, nom, anneeNaissance, poids, taille);       
        setEspece(espece);
       
    }

    @Override
    public boolean estAdulte() {        
        if(espece == EspeceOurs.Brun){
            return getAge() >= 4;
        } else {
            return getAge() >=3 ;
        }
    }

    @Override
    public String cri() {
        if (espece.equals(EspeceOurs.Polaire)){
            return "GRRRRRRRRRRRRRR";
        } else {
            return "Grrrrrrrrrrrrrr";
        } 
    }

    public double qtteViandeSemaine(){
       return poids * 0.035;
    }

    public double qttePlanteJour(){
        return poids * 0.035;
    }

    public double qtteTotalJour(){
        return qtteViandeSemaine()/7 + qttePlanteJour();
    }


    public String proiesPreferees(){
        String proiesOurs = "insectes, oiseaux, petits mammifères";
        if(espece.equals(EspeceOurs.Polaire) || espece.equals(EspeceOurs.Brun)){            
            return proiesOurs + ", phoques, saumons";
        } else {
            return proiesOurs;
        }
    }

    public String plantePreferee(){
        return "fruits et racines";
    }

    public String tue() {
        return "mort sa proie";
    }

    @Override
    public String toString() {
        String type = getClass().getSimpleName();
        return super.toString() +                
            "\nEspèce : " + espece +             
            "\n" + nom + " mange "  + proiesPreferees() + " en quantité " + qtteViandeSemaine() + UM_POIDS + " par jour. " + type + " " + espece + " " + tue() +
            "\nson régime contient aussi " + plantePreferee() + " en quantité " + qttePlanteJour() + UM_POIDS + " par jour";
}   

}
