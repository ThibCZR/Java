public class CompteBloque extends Compte{
    private double seuilMin;

    public CompteBloque() {
        super();
        this.seuilMin = 0.0;
    }

    public CompteBloque(double solde, double seuilMin) {
        super(solde);
        this.seuilMin = seuilMin;
    }

    @Override
    public boolean debiter(double montant) {
        if (this.solde - montant >= this.seuilMin) {
            this.solde -= montant;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Compte Bloqué - Numéro: " + this.numCpt + ", Solde: " + this.solde + ", Seuil minimum: " + this.seuilMin;
    }
}
