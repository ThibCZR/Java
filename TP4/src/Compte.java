public class Compte
{
	//ATTRIBUTS
    protected static final String monnaie="euros";
    protected static int numAuto=0;
    protected int numCpt;
    protected double solde;
    

	//ACCESSEURS
    public double getSolde()
    {     
        return this.solde;  
    }
 
    public int getNumCpt()
    {
        return this.numCpt; 
    }
    
    public static int getNumAutoSuivant() 
    {
        return numAuto + 1;
    }
    
	//CONSTRUCTEURS
	public Compte() {
        this.numCpt = ++numAuto;
    }

    public Compte(double solde) {
        this.solde = solde;
        this.numCpt = ++numAuto;
    }
    

	// Méthodes surchargées
	@Override
    public boolean equals(Object o)
    {
        if (o == null)
            return false ;
        if (o instanceof Compte)
        { 
            Compte c = (Compte) o;
            if (this.numCpt == c.numCpt && Double.compare(this.solde, c.solde) == 0)
            {
                return true; 
            }
            return true;
            
        }
        return false;  
    }
 
	@Override
    public String toString()
    {
        return "\nNuméro de compte : " + this.numCpt + "\nSolde : " + this.solde + " " + Compte.monnaie;  
    }
 
 	//AUTRES METHODES
    public boolean debiter(double montant)
    { 
        this.solde = this.solde - montant;
        return true;
    }
 
    public boolean crediter(double montant)
    { 
        this.solde = this.solde + montant;
        return true;
    }



}