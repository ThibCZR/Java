public class Forfait {

    private boolean avecAssurance;
    private char categorie;

    private static final double PX_KM = 0.5;
    private static final char CATEGORIE_ECO = 'E';
    private static final char CATEGORIE_CONFORT = 'C';
    private static final char CATEGORIE_LUXE = 'L';

    // Constructeurs
    public Forfait() {
    }

    public Forfait(boolean avecAssurance) {
        this.avecAssurance = avecAssurance;
    }

    public Forfait(char categorie) {
        this.categorie = categorie;
    }

    public Forfait(boolean avecAssurance, char categorie) {
        this.avecAssurance = avecAssurance;
        this.categorie = categorie;
    }

    // Accesseurs
    public boolean isAvecAssurance() {
        return avecAssurance;
    }

    public void setAvecAssurance(boolean avecAssurance) {
        this.avecAssurance = avecAssurance;
    }

    public char getCategorie() {
        return categorie;
    }

    public void setCategorie(char categorie) {
        this.categorie = categorie;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Forfait{" +
                "avecAssurance=" + avecAssurance +
                ", categorie=" + categorie +
                '}';
    }

    // Méthode montantJournalier
    public double montantJournalier() {
        double prixJournalier = 0.0;
        switch (categorie) {
            case CATEGORIE_ECO:
                prixJournalier = 30.0;
                break;
            case CATEGORIE_CONFORT:
                prixJournalier = 50.0;
                break;
            case CATEGORIE_LUXE:
                prixJournalier = 75.0;
                break;
        }

        if (avecAssurance) {
            prixJournalier += 10.0; // Ajout du coût de l'assurance
        }

        return prixJournalier;
    }

    // Méthode nbKmSup
    public int nbKmSup(int nbKmEffectues, int nbJours) {
        int jours = nbJours % 7;
        int semaine = nbJours / 7;
        int totalSemaine = semaine * 1000;
        int totalJour = jours * 100;
        
        if (nbKmEffectues - totalSemaine - totalJour<0){
            return 0;
        } else {
            return nbKmEffectues - totalSemaine - totalJour;
        }   
        
    }

    // Méthode pxKmSup
    public double pxKmSup(int nbKmEffectues, int nbJours) {
        return nbKmSup(nbKmEffectues, nbJours)* PX_KM;
    }

    // Méthode montantTotal
    public double montantTotal(int nbKmEffectues, int nbJours) {
        if (pxKmSup(nbKmEffectues, nbJours)<0){
            return montantJournalier()*nbJours;
        } else {
            return montantJournalier()*nbJours+pxKmSup(nbKmEffectues, nbJours);
        }        
    } 
}
