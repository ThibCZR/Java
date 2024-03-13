public class Ascenseur {
    private int etageMin;
    private int etageMax;
    private int etageCourant;

    private static String avertisseur = "beep";

    public Ascenseur(){
    }

    public Ascenseur(int etageMin){
        this.etageMin = etageMin;
    }

    public Ascenseur (int etageMin, int etageMax){
        this.etageMin = etageMin;
        this.etageMax = etageMax;
    }

    public Ascenseur(int etageMin,int etageMax, int etageCourant){
        this.etageMin = etageMin;
        this.etageMax = etageMax;
        this.etageCourant = 0;
    }

    public int getEtageMin(){
        return etageMin;
    }

    public int getEtageMax(){
        return etageMax;
    }

    public int getEtageCourant(){
        return etageCourant;
    }

    public void setEtageMin(int etageMin){
        this.etageMin = etageMin;
    }

    public void setEtageMax(int etageMax){
        this.etageMax = etageMax;
    }
    public void setEtageCourant(int etageCourant){
        this.etageCourant = etageCourant;
    }

    @Override
    public String toString() {
        return "Carastéristiques de l'ascenseur : " +
        "\nEtage minimum : " + etageMin + 
        ",\nEtage maximum : " + etageMax + 
        ",\nEtage courant : " + etageCourant;
    }

    public void avertit() {
        System.out.println("Avertisseur : " + avertisseur);
    }

    public boolean etageValide(int etageDemande) {
        return etageDemande >= etageMin && etageDemande <= etageMax;
    }

    public void va(int etageDemande) {
        if (etageValide(etageDemande)) {
            if (etageDemande > etageCourant){
                for (int i = etageCourant; etageDemande>i; i++){
                    System.out.println(i);
                } 
                System.out.println(etageDemande);
            } else {
                for (int i = etageCourant; etageDemande<i; i--){
                    System.out.println(i);
                }
                System.out.println(etageDemande);
            } 
            etageCourant = etageDemande;   
            avertit();
        } else {
            System.out.println("L'étage spécifié n'est pas valide.");
        }
    }
}
