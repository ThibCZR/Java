import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        int rep;
        Scanner sc = new Scanner(System.in);
        Compte compte = new Compte(1000);
        CompteBloque compteBloque = new CompteBloque(1000, 200);
		CompteEpargne compteEpargne = new CompteEpargne(1000, 0.05, 10000);

        do {
            System.out.println("0.Quitter");
            System.out.println("1.Afficher infos");
            System.out.println("2.Afficher solde");
            System.out.println("3.Crediter");
            System.out.println("4.Debiter\n");
            rep = sc.nextInt();
            switch (rep) {
                case 0:
                    System.out.println("Bye");
                    break;
                case 1:
                    System.out.println(compte.toString() + "\n");
                    break;
                case 2:
                    System.out.println("Solde: " + compte.getSolde() + "\n");
                    break;
                case 3:
                    System.out.println("Entrez le montant à créditer : ");
                    double creditAmount = sc.nextDouble();
                    if (compteEpargne.crediter(creditAmount))
                        System.out.println("Crédit effectué avec succès.\n");
                    else
                        System.out.println("Opération de crédit échouée.\n");
                    break;
                case 4:
                    System.out.println("Entrez le montant à débiter : ");
                    double debitAmount = sc.nextDouble();
                    if (compteBloque.debiter(debitAmount))
                        System.out.println("Débit effectué avec succès.\n");
                    else
                        System.out.println("Opération de débit échouée.\n");
                    break;
                default:
                    System.out.println("Erreur: Option invalide.");
            }
        } while (rep != 0);
        sc.close();
    }
}
