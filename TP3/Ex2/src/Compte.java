public class Compte {
    private int numCpt;
    private double solde;
    private static int numeroEnCours = 0;
    private double totalDebit;
    private double totalCredit;
    private int nbCredit;
    private int nbDebit;

    // Constructeur sans paramètre
    public Compte() {
        numeroEnCours++;
        this.numCpt = numeroEnCours;
        this.solde = 0;
    }

    // Constructeur avec solde initial
    public Compte(double solde) {
        numeroEnCours++;
        this.numCpt = numeroEnCours;
        this.solde = solde;
    }

    // Méthode pour afficher les détails du compte
    public String toString() {
        return "Compte numéro : " + numCpt + ", Solde : " + solde;
    }

    // Méthode pour créditer le compte
    public void crediter(double montant) {
        solde += montant;
        totalCredit += montant;
        nbCredit++;
    }

    // Méthode pour débiter le compte
    public void debiter(double montant) {
        if (montant <= solde) {
            solde -= montant;
            totalDebit += montant;
            nbDebit++;
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    // Méthode pour comparer deux comptes
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Compte other = (Compte) obj;
        if (numCpt != other.numCpt)
            return false;
        return true;
    }

    // Accesseurs
    public int getNumCpt() {
        return numCpt;
    }

    public double getSolde() {
        return solde;
    }

    public static int getNumeroEnCours() {
        return numeroEnCours;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public double getTotalCredit() {
        return totalCredit;
    }

    public int getNbCredit() {
        return nbCredit;
    }

    public int getNbDebit() {
        return nbDebit;
    }
}