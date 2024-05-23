import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir le nom du personnage (au moins 3 caractères)
        String nomPersonnage = "";
        while (nomPersonnage.length() < 3) {
            System.out.print("Entrez le nom de votre personnage (au moins 3 caractères) : ");
            nomPersonnage = scanner.nextLine();
        }

        // Création d'un objet Personnage
        Personnage personnage = new Personnage(nomPersonnage);

        // Répartition des points de compétence
        int pointsRestants = 25;
        while (pointsRestants > 0) {
            System.out.println("Points restants à répartir : " + pointsRestants);
            System.out.println("Choisissez une compétence à améliorer : ");
            for (int index = 0; index < Competence.values().length; index++) {
                System.out.println(String.format("%d. %s", index + 1, Competence.values()[index]));
            }

            Integer choixCompetence = scanner.nextInt();
            if (choixCompetence < 1 || choixCompetence > Competence.values().length) {
                throw new IllegalArgumentException("Veuillez choisir un nombre entre 1 et " + Competence.values().length);
            }

            Competence competenceAAugmenter = Competence.values()[choixCompetence - 1];
            System.out.print("Combien de points voulez-vous ajouter à " + competenceAAugmenter + " (entre 3 et 15) : ");
            int pointsCompetence = scanner.nextInt();

            try {
                personnage.augmenterCompetence(competenceAAugmenter, pointsCompetence);
                pointsRestants -= pointsCompetence;
            } catch (IllegalArgumentException e) {
                System.err.println("\033[0;31m" +e.getMessage()+"\033[0m");
            }
        }
        scanner.close();
    }
}