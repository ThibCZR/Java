package fr.cpe.appzoo.common;
import java.time.LocalDate;
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

    public int getAnneeNaissance() {
        return this.anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) throws CaMarchePasException {
        int anneeActuelle = LocalDate.now().getYear();
        if (anneeNaissance < anneeActuelle) {
            this.anneeNaissance = anneeNaissance;
        } else {
            throw new CaMarchePasException("L'année de naissance doit être inférieure à l'année actuelle.");
        }
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) throws CaMarchePasException {
        if (nom == null || nom.isEmpty() ) {
            throw new CaMarchePasException("Le nom ne doit pas être nul, ni être vide.");
        } else {            
            this.nom = nom;
        }
    }

    public double getPoids() {
        return this.poids;
    }

    public void setPoids(double poids) throws CaMarchePasException {
        if (poids < 0) {
            throw new CaMarchePasException("Le poids ne peut pas être négatif.");
        }
        this.poids = poids;
    }

    public SexeAnimal getSexe() {
        return this.sexe;
    }

    public void setSexe(SexeAnimal sexe) {
        this.sexe = sexe;
    }

    public double getTaille() {
        return this.taille;
    }

    public void setTaille(double taille) throws CaMarchePasException {
        if (taille < 0) {
            throw new CaMarchePasException("Le taille ne peut pas être négatif.");
        }
        this.taille = taille;
    }


    public int getAge() {
        int anneeActuelle = Calendar.getInstance().get(Calendar.YEAR);
        return anneeActuelle - anneeNaissance;
    }

    public Animal(SexeAnimal sexe, String nom, int anneeNaissance, double poids, double taille) throws CaMarchePasException {     
        setNom(nom.toUpperCase());
        setSexe(sexe);
        setAnneeNaissance(anneeNaissance);
        setPoids(poids);
        setTaille(taille);
    }

    
    public abstract String cri();
   
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
        String type = getClass().getSimpleName();
        return "Animal :" +
            "\nNom : " + nom  +
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
