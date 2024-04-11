package common;

public abstract class Enseignant {
    protected String nom;
    protected String prenom;
    protected Specialite enseigne;
    protected Formation apprend;
    protected int heuresCours;
    protected final double taux = 0.3;


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) throws CaMarchePasException {
        if (nom == null || nom.isEmpty()) {
            throw new CaMarchePasException("Le nom ne peut pas être nul ou vide.");
        }
        this.nom = nom;
    }
    

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) throws CaMarchePasException {
        if (prenom == null || prenom.isEmpty()) {
            throw new CaMarchePasException("Le prénom ne peut pas être nul ou vide.");
        }
        this.prenom = prenom;
    }
    
    public Specialite getEnseigne() {
        return this.enseigne;
    }

    public void setEnseigne(Specialite enseigne) {
        this.enseigne = enseigne;
    }


    public Formation getApprend() {
        return this.apprend;
    }

    public void setApprend(Formation apprend) {
        this.apprend = apprend;
    }



    public int getHeuresCours() {
        return this.heuresCours;
    }

    public void setHeuresCours(int heuresCours) throws CaMarchePasException {
        if (heuresCours < 0) {
            throw new CaMarchePasException("Le nombre d'heures de cours ne peut pas être négatif.");
        }
        this.heuresCours = heuresCours;
    }
    
    public abstract int salaire(); 

  
    public double charge(){
        return salaire() * taux;    }

  
    public double coutEnseignant(){
        return charge() + salaire();
    }


    public Enseignant(String nom, String prenom, Specialite enseigne,Formation apprend, int nbHeureDeCours) throws CaMarchePasException {
        setEnseigne(enseigne);
        setApprend(apprend);
        setHeuresCours(nbHeureDeCours);
        setNom(nom);
        setPrenom(prenom);      
    }

   

    public String toString(){
        return  "\nNom : " + getNom() + 
                "\nPrénom : "+ getPrenom() + 
                "\nMatière : "+ getEnseigne()+
                "\nNombre heures de cours : " + getHeuresCours()+
                "\nSalaire : "+salaire()+ " euros";
    }

}
