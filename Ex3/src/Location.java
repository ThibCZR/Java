import java.util.Scanner;

public class Location {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des informations par l'utilisateur
        System.out.print("Avec assurance (true/false) : ");
        boolean avecAssurance;
        while (true) {
            String assuranceInput = scanner.next();
            if (assuranceInput.equalsIgnoreCase("true") || assuranceInput.equalsIgnoreCase("false")) {
                avecAssurance = Boolean.parseBoolean(assuranceInput);
                break;
            } else {
                System.out.print("Veuillez saisir true (oui) ou false (non) : ");
            }
        }

        System.out.print("Catégorie de véhicule (E/C/L) : ");
        char categorie;
        while (true) {
            String categorieInput = scanner.next();
            if (categorieInput.length() == 1 && (categorieInput.charAt(0) == 'E' || categorieInput.charAt(0) == 'C' || categorieInput.charAt(0) == 'L')) {
                categorie = categorieInput.charAt(0);
                break;
            } else {
                System.out.print("Veuillez saisir une des catégories valides (E pour Eco, C pour Confort, L pour Luxe) : ");
            }
        }

        System.out.print("Nombre de kilomètres effectués : ");
        int nbKmEffectues;
        while (true) {
            if (scanner.hasNextInt()) {
                nbKmEffectues = scanner.nextInt();
                break;
            } else {
                System.out.print("Veuillez saisir un nombre de KM valide : ");
                scanner.next(); 
            }
        }

        System.out.print("Nombre de jours : ");
        int nbJours;
        while (true) {
            if (scanner.hasNextInt()) {
                nbJours = scanner.nextInt();
                break;
            } else {
                System.out.print("Veuillez saisir un nombre de jours valide : ");
                scanner.next(); 
            }
        }

        // Création de l'objet Forfait
        Forfait forfait = new Forfait(avecAssurance, categorie);

        // Affichage des montants
        System.out.println("\nMontant journalier : " + forfait.montantJournalier() + " euros");
        System.out.println("Montant lié au nombre de jours : " + forfait.montantJournalier() * nbJours + " euros");
        System.out.println("Nombre de KM supplémetaire : " + forfait.nbKmSup(nbKmEffectues, nbJours) + " km");
        System.out.println("Frais liés au kilomètres supplémentaires : " + forfait.pxKmSup(nbKmEffectues, nbJours) + " euros");
        System.out.println("Montant total : " + forfait.montantTotal(nbKmEffectues, nbJours) + " euros");

        scanner.close();
    }
}
