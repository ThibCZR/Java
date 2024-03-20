public class Compte
{
	//ATTRIBUTS
    private static final String monnaie="euros";
    private static int numAuto=0;
    private int numCpt;
    private double solde;
    

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
        // A COMPLETER
    }
    
	//CONSTRUCTEURS
	public Compte()
    {
        // A COMPLETER
    }
    
    public Compte(double solde)
    {
        // A COMPLETER
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
            // A COMPLETER
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