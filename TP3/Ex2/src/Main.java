public class Main {
    public static void main(String[] args) {
        // Création de deux comptes
        Compte compte1 = new Compte(1000);
        Compte compte2 = new Compte();

        // Affichage des comptes
        System.out.println(compte1.toString());
        System.out.println(compte2.toString());

        // Créditer et débiter le compte 1
        compte1.crediter(500);
        compte1.debiter(200);

        // Affichage du solde après opérations
        System.out.println("Solde du compte 1 après opérations : " + compte1.getSolde());

        // Vérification si les comptes sont égaux
        System.out.println("Les comptes sont-ils égaux ? " + compte1.equals(compte2));

        // Accéder aux attributs supplémentaires
        System.out.println("Total crédit du compte 1 : " + compte1.getTotalCredit());
        System.out.println("Total débit du compte 1 : " + compte1.getTotalDebit());
        System.out.println("Nombre de crédits du compte 1 : " + compte1.getNbCredit());
        System.out.println("Nombre de débits du compte 1 : " + compte1.getNbDebit());
    }
}
