import java.util.Scanner;

public class Location {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des informations par l'utilisateur
        System.out.println("Veuillez saisir 'true' si vous souhaitez inclure l'assurance, sinon 'false': ");
        boolean avecAssurance = scanner.nextBoolean();

        System.out.println("Veuillez saisir la catégorie ('E' pour Eco, 'C' pour Confort, 'L' pour Luxe): ");
        char categorie = scanner.next().charAt(0);

        System.out.println("Veuillez saisir le nombre de jours de location: ");
        int nbJours = scanner.nextInt();

        System.out.println("Veuillez saisir le nombre de kilomètres effectués: ");
        int nbKmEffectues = scanner.nextInt();

        // Création de l'objet Forfait
        Forfait forfait = new Forfait(avecAssurance, categorie);

        // Affichage des informations
        
        System.out.println("Montant journalier : " + forfait.montantJournalier());
        System.out.println("Montant lié au nombre de jours : " + forfait.montantJournalier() * nbJours);
        System.out.println("Frais liés aux kilomètres supplémentaires : " + forfait.pxKmSup(nbKmEffectues, nbJours));
        System.out.println("Total pour ce forfait : " + forfait.montantTotal(nbKmEffectues, nbJours));
    }
}
