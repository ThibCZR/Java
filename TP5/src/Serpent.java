public class Serpent extends Animal implements lCarnivore{
    private EspeceSerpent espece;
    private boolean venimeux;
    

    public EspeceSerpent getEspece() {
        return this.espece;
    }

    public void setEspece(EspeceSerpent espece) {
        this.espece = espece;
    }

    public boolean isVenimeux() {
        return this.venimeux;
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
    
    public Serpent(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille, EspeceSerpent espece) {
        super(sexe, nom, anneeNaissance, poids, taille);       
        setEspece(espece);
        setVenimeux(venimeux); 
    }

    @Override
    public String cri() {
        if (espece.equals(EspeceSerpent.Crotale) || espece.equals(EspeceSerpent.A_Sonnette)) {
            return "Bruit de grelot";
        } else if (espece.equals(EspeceSerpent.Cornu) || espece.equals(EspeceSerpent.Echide)) {
            return "Crissement d'avertissement";
        } else {
            return "Sifflement";
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
                return "avale sa proie vivante";
            } else {
                return "etouffe sa proie";}
            }
        }

    @Override
    public String toString() {
        String type = getClass().getSimpleName();
        return 
                "\nNom : '" + nom + '\'' +
                "\nAnnée de Naissance : " + anneeNaissance +
                "\nPoids : " + poids + " " + UM_POIDS +               
                "\nSexe : " + sexe +
                "\nTaille : " + taille + " " + UM_TAILLE +
                "\nAge : " + getAge() + UM_AGE +
                "\nAdulte : " + estAdulte() +
                "\nType : " + type +
                "\nEspèce : " + espece +
                "\nVenimeux : " + getVenimeux() +
                "\nCri : " + cri() +                
                "\n" + nom + " mange "  + proiesPreferees() + " ou équivalents en quantité " + qtteViandeSemaine() + UM_POIDS + " par jour. " + type + " " + espece + " " + tue();
    }    

   

    

}
