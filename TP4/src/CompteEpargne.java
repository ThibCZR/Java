public class CompteEpargne extends Compte {
    private double tauxEpargne;
    private double seuilMax;

    public CompteEpargne() {
        super();
        this.tauxEpargne = 0.0;
        this.seuilMax = 0.0;
    }

    public CompteEpargne(double solde, double tauxEpargne, double max) {
        super(solde);
        this.tauxEpargne = tauxEpargne;
        this.seuilMax = max;
    }

    public double calculInteret(int nbAnnee) {
        // Implémentation du calcul des intérêts
        return 0.0; 
    }

    public double calculFuturMontant(int nbAnnee) {
        // Implémentation du calcul du futur montant
        return 0.0; 
    }

    public int calculNbAnnee(double montantAAtteindre) {
        // Implémentation du calcul du nombre d'années pour atteindre un montant
        return 0;
    }

    @Override
    public String toString() {
        return "Compte Epargne - Numéro: " + this.numCpt + ", Solde: " + this.solde + ", Taux épargne: " + this.tauxEpargne + "%, Seuil maximum: " + this.seuilMax;
    }

   
    @Override
    public boolean crediter(double mt) {
        if (this.solde + mt <= this.seuilMax) {
            this.solde += mt;
            return true;
        } else {
            return false;
        }
    }
}
