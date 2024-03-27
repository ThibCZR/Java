import java.util.Calendar;

public abstract class Animal {
    protected int anneeNaissance;
    protected String nom;
    protected double poids;
    protected SexeAnimal sexe;
    protected double taille;
    protected final String UM_AGE = "ans";
    protected final String UM_POIDS = "kg";
    protected final String UM_TAILLE = "m";

    public enum SexeAnimal {
        Feminin,
        Masculin,
        Hermaphrodite
    }

    public Animal(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille) {
        // Vérification de l'année de naissance
        int anneeActuelle = Calendar.getInstance().get(Calendar.YEAR);
        if (anneeNaissance > anneeActuelle)
            throw new IllegalArgumentException("L'année de naissance ne peut pas être dans le futur");
        
        // Vérification du nom
        if (nom == null || nom.isEmpty())
            throw new IllegalArgumentException("Le nom ne peut pas être nul ou vide");
        this.nom = nom.toUpperCase(); // Mettre le nom en majuscule
        
        // Vérification du poids et de la taille
        if (poids < 0 || taille < 0)
            throw new IllegalArgumentException("Le poids et la taille ne peuvent pas être négatifs");

        this.sexe = sexe;
        this.anneeNaissance = anneeNaissance;
        this.poids = poids;
        this.taille = taille;
    }

    
    public abstract String cri();

   
    public int getAge() {
        int anneeActuelle = Calendar.getInstance().get(Calendar.YEAR);
        return anneeActuelle - anneeNaissance;
    }
   
    public abstract boolean estAdulte();

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return nom.equals(animal.nom);
    }

    public String toString() {
        return "Animal{" +
                "anneeNaissance=" + anneeNaissance +
                ", nom='" + nom + '\'' +
                ", poids=" + poids + " " + UM_POIDS +
                ", sexe=" + sexe +
                ", taille=" + taille + " " + UM_TAILLE +
                '}';
    }
}
