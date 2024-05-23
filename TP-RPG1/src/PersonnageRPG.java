import java.util.Scanner;

public class PersonnageRPG {
    public static void main(String[] args) {
        // Déclaration de la variable pour stocker le nom du personnage
        String nomPersonnage;
        int force = 0;
        int intelligence = 0;
        int agilite = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de votre personnage : ");
        nomPersonnage = scanner.nextLine();
        System.out.println("Le nom de votre personnage est : " + nomPersonnage);
        
        int pointsRestants = 25;
        while (pointsRestants > 0) {
            try{
                System.out.println("Points restants à répartir : " + pointsRestants);
                System.out.println("1. Augmenter la force");
                System.out.println("2. Augmenter l'agilité");
                System.out.println("3. Augmenter l'intelligence");
                System.out.print("Choisissez une caractéristique à améliorer (1-3) : ");
                
                int choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        System.out.print("Combien de points voulez-vous ajouter à la force : ");
                        int pointsForceAAttribuer = scanner.nextInt();
                        if(pointsForceAAttribuer > pointsRestants){
                            throw new IllegalArgumentException("Le nombre de points attribués est supérieur au nombre de points restants");
                        }
                        int nouveauSoldePointForce = force + pointsForceAAttribuer;
                        if (nouveauSoldePointForce < 3 || nouveauSoldePointForce > 15) {
                            throw new IllegalArgumentException("Le nombre de points n'est pas compris entre 3 et 15");
                        }
                        force = nouveauSoldePointForce;
                        pointsRestants -= pointsForceAAttribuer;
                        break;
                    case 2:
                        System.out.print("Combien de points voulez-vous ajouter à l'agilité : ");
                        int pointsAgiliteAAttribuer = scanner.nextInt();
                        if(pointsAgiliteAAttribuer > pointsRestants){
                            throw new IllegalArgumentException("Le nombre de points attribués est supérieur au nombre de points restants");
                        }
                        int nouveauSoldePointAgilite = agilite + pointsAgiliteAAttribuer;
                        if (nouveauSoldePointAgilite < 3 || nouveauSoldePointAgilite > 15) {
                            throw new IllegalArgumentException("Le nombre de points n'est pas compris entre 3 et 15");
                        }
                        agilite = nouveauSoldePointAgilite;
                        pointsRestants -= pointsAgiliteAAttribuer;
                        break;
                    case 3:
                        System.out.print("Combien de points voulez-vous ajouter à l'intelligence: ");
                        int pointsIntelligenceAAttribuer = scanner.nextInt();
                        if(pointsIntelligenceAAttribuer > pointsRestants){
                            throw new IllegalArgumentException("Le nombre de points attribués est supérieur au nombre de points restants");
                        }
                        int nouveauSoldePointIntelligence = intelligence + pointsIntelligenceAAttribuer;
                        if (nouveauSoldePointIntelligence < 3 || nouveauSoldePointIntelligence > 15) {
                            throw new IllegalArgumentException("Le nombre de points n'est pas compris entre 3 et 15");
                        }
                        intelligence = nouveauSoldePointIntelligence;
                        pointsRestants -= pointsIntelligenceAAttribuer;
                        break;
                    default:
                        throw new IllegalArgumentException("Choix invalide.");
                }
            }  catch (Exception e) {
                System.err.println("\033[0;31m" +e.getMessage()+"\033[0m");
            }
            
        }
        scanner.close();
        System.out.println("Caractéristiques finales du personnage :");
        System.out.println("Force : " + force);
        System.out.println("Agilité : " + agilite);
        System.out.println("Intelligence : " + intelligence);
    }
}