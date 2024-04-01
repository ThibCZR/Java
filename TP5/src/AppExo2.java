import java.util.ArrayList;
import java.util.Scanner;

public class AppExo2 {
    
    public static void main(String[] args) {

        ArrayList<Animal> Animaux = new ArrayList<>();
        // Ajout des éléphants
        Animaux.add(new Elephant(SexeAnimal.Masculin, "Djumbo", 1994, 6000, 3.5, Continent.Afrique));
        Animaux.add(new Elephant(SexeAnimal.Feminin, "Asiii", 2018, 1500, 2.0, Continent.Asie));

        // Ajout des girafes
        Animaux.add(new Girafe(SexeAnimal.Masculin, "Pascal", 2004, 1900, 5.5));
        Animaux.add(new Girafe(SexeAnimal.Feminin, "Sophie", 2021, 400, 2.8));

        // Ajout des serpents
        Animaux.add(new Serpent(SexeAnimal.Masculin, "Sonny", 2020, 1.1, 1, EspeceSerpent.A_Sonnette));
        Animaux.add(new Serpent(SexeAnimal.Feminin, "Bois", 2023, 300, 8.5, EspeceSerpent.Boa));

        // Ajout des ours
        Animaux.add(new Ours(SexeAnimal.Masculin, "Teddy", 2014, 500, 3.0, EspeceOurs.Polaire));
        Animaux.add(new Ours(SexeAnimal.Feminin, "Andromeda", 2022, 80, 8.5, EspeceOurs.Brun));

         // Ajout des humains
         Animaux.add(new Humain(SexeAnimal.Masculin, "Vincent", 1999, 80, 1.75, Continent.Europe));
         Animaux.add(new Humain(SexeAnimal.Feminin, "Ying", 2016, 12, 1.10, Continent.Asie));

        ZOO zoo = new ZOO();
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|            MENU ZOO CPE           |");
            System.out.println("+-----------------------------------+");
            System.out.println("|   0. Quitter                      |");
            System.out.println("|   1. Affichage des animaux        |");
            System.out.println("|   2. Cri des animaux              |");
            System.out.println("|   3. Repas d'un animal            |");
            System.out.println("|   4. Tuerie de carnivore          |");
            System.out.println("|   5. Suppression d'un animal      |");
            System.out.println("|   6. Trier les animaux par âge    |");
            System.out.println("|   7. Trier les animaux par poids  |");
            System.out.println("|   8. Trier les animaux par noms   |");
            System.out.println("+-----------------------------------+");
            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 0:
                    System.out.println("Au revoir !");
                    break;
                case 1:
                    System.out.println("+----------------------------------+");
                    System.out.println("|       LES HABITANTS DU ZOO       |");
                    System.out.println("+----------------------------------+");
                    zoo.afficherAnimaux(Animaux);
                    break;
                case 2:
                    System.out.println("+----------------------------------+");
                    System.out.println("|               CRIS               |");
                    System.out.println("+----------------------------------+");
                    zoo.faitCrierSesAnimaux(Animaux);
                    break;
                case 3:
                    System.out.println("+----------------------------------+");
                    System.out.println("|              REPAS               |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez le nom de l'animal : ");
                    String nomAnimal = scanner.next().toUpperCase(); 
                    System.out.println(zoo.rechercherAnimal(Animaux, nomAnimal));
                    break;
                case 4:
                    System.out.println("+----------------------------------+");
                    System.out.println("|        TUERIE DE CARNIVORE       |");
                    System.out.println("+----------------------------------+");
                    System.out.println("Les carnivores du zoo tuent :");
                    System.out.println(zoo.tuerieAnimal(Animaux));
                    break;
                case 5:
                    System.out.println("+----------------------------------+");
                    System.out.println("|            SUPPRESSION           |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez le nom de l'animal à supprimer : ");
                    String nomASupprimer = scanner.next().toUpperCase();
                    String resultatSuppression = zoo.supprimerAnimal(Animaux, nomASupprimer);
                    System.out.println(resultatSuppression);
                    break;
                case 6:
                    System.out.println("+----------------------------------+");
                    System.out.println("|    DU PLUS JEUNE AU PLUS VIEUX   |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez 'C' pour un tri croissant ou 'D' pour un tri décroissant : ");
                    char lettre1 = scanner.next().toUpperCase().charAt(0);
                    zoo.trierAnimauxParDateNaissance(Animaux, lettre1);
                    zoo.afficherAnimaux(Animaux);
                    break;
                case 7:
                    System.out.println("+----------------------------------+");
                    System.out.println("|     TRI PAR POIDS DES ANIMAUX    |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez 'C' pour un tri croissant ou 'D' pour un tri décroissant : ");
                    char choixTriPoids = scanner.next().toUpperCase().charAt(0);
                    zoo.trierAnimauxParPoids(Animaux, choixTriPoids);
                    zoo.afficherAnimaux(Animaux);
                    break;
                case 8:
                    System.out.println("+----------------------------------+");
                    System.out.println("|     TRI PAR NOMS DES ANIMAUX     |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez 'C' pour un tri croissant ou 'D' pour un tri décroissant : ");
                    char choixTriNom = scanner.next().toUpperCase().charAt(0);
                    zoo.trierAnimauxParNom(Animaux, choixTriNom);
                    zoo.afficherAnimaux(Animaux);
                    break;       
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 0);
        
        scanner.close();
    } 
    
}