public class Forfait {

    private boolean avecAssurance;
    private char categorie;

    private static final double PX_KM = 0.5;    
    private static final char CATEGORIE_ECO ='E';
    private static final char CATEGORIE_CONFORT = 'C';
    private static final char CATEGORIE_LUXE = 'L';

    // SETTERS
    public void setAvecAssurance(boolean avecAssurance){
        this.avecAssurance = avecAssurance;
    }

    public void setCategorie(char categorie) {
        categorie = Character.toUpperCase(categorie);
        if (categorie == Forfait.CATEGORIE_ECO || categorie == Forfait.CATEGORIE_CONFORT || categorie == Forfait.CATEGORIE_LUXE) {
            this.categorie = categorie;
        }
    }
    

    // GETTERS
    public boolean getAvecAssurance(){
        return this.avecAssurance;
    }

    public char getCategorie(){
        return this.categorie;
    }

    public static double getPX_KM(){
        return Forfait.PX_KM;
    }

    public static double getCATEGORIE_ECO(){
        return Forfait.CATEGORIE_ECO;
    }

    public double getCATEGORIE_CONFORT(){
        return Forfait.CATEGORIE_CONFORT;
    }
    public double getCATEGORIE_LUXE(){
        return Forfait.CATEGORIE_LUXE;
    }


    // CONSTRUCTEURS
    public Forfait(){
    }
    
    public Forfait(boolean avecAssurance){
        this.setAvecAssurance(avecAssurance);
    }

    public Forfait (char categorie){
        this.setCategorie(categorie);
    }

    public Forfait(boolean avecAssurance, char categorie){
        this(avecAssurance);
        this.setCategorie(categorie);
    }

    // METHODE TOSTRING
    @Override
    public String toString(){
        return 
        "Avec Assurance : '" + this.getAvecAssurance() + "' / " +
        "Categorie : '" + this.getCategorie() + "' / ";
    }

    //METHODE MONTANT JOURNALIER
    public double montantJournalier() {
        double prixJournalier;
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
            default:
                prixJournalier = 0.0; 
                break;
        }

        if (avecAssurance == false) {
            prixJournalier += 10.0; 
        }
    
        return prixJournalier;
    }

    //METHODE NB KM SUPPLEMENTAIRE 
    public int nbKmSup(int nbKmEffectues, int nbJours) {
        int jours = nbJours % 7;
        int semaine = nbJours / 7;
        int totalSemaine = semaine * 1000;
        int totalJour = jours * 100;
        return nbKmEffectues - totalSemaine - totalJour;
    }

    //METHODE PRIX KM SUPPLEMENTAIRE
    public double pxKmSup(int nbKmEffectues, int nbJours) {
        return nbKmSup(nbKmEffectues, nbJours)*PX_KM;
    }

    //METHODE MONTANT TOTAL
    public double montantTotal(int nbKmEffectues, int nbJours) {       
        return montantJournalier()+pxKmSup(nbKmEffectues, nbJours);
        
    }   
}  
