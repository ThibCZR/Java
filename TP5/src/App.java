import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // Création de la liste d'animaux
        ArrayList<Animal> Animaux = new ArrayList<>();

        // Ajout des éléphants
        Elephant elephantAdulteMaleAfrique = new Elephant(SexeAnimal.Masculin, "DJUMBO", 2000, 5000, 3.5, Continent.Afrique);
        Elephant elephantJeuneFemelleAsie = new Elephant(SexeAnimal.Feminin, "ASIII", 2020, 2000, 2.0, Continent.Asie);
        Animaux.add(elephantAdulteMaleAfrique);
        Animaux.add(elephantJeuneFemelleAsie);

        // Ajout des girafes
        Girafe girafeAdulteMale = new Girafe(SexeAnimal.Masculin, "Pascal", 2019, 600, 3.5);
        Girafe girafeJeuneFemelle = new Girafe(SexeAnimal.Feminin, "Sophie", 2022, 300, 2.0);
        Animaux.add(girafeAdulteMale);
        Animaux.add(girafeJeuneFemelle);

        // Ajout des serpents
        Serpent serpentAdulteMale = new Serpent(SexeAnimal.Masculin, "Sonny", 2020, 1.1, 1, EspeceSerpent.A_Sonnette);
        Serpent serpentJeuneFemelle = new Serpent(SexeAnimal.Feminin, "Bois", 2023, 300, 8.5, EspeceSerpent.Boa);
        Animaux.add(serpentAdulteMale);
        Animaux.add(serpentJeuneFemelle);

        // Ajout des ours
        Ours oursAdulteMale = new Ours(SexeAnimal.Masculin, "Teddy", 2014, 500, 3.0, EspeceOurs.Polaire);
        Ours oursJeuneFemelle = new Ours(SexeAnimal.Feminin, "Andromeda", 2022, 80, 8.5, EspeceOurs.Brun);
        Animaux.add(oursAdulteMale);
        Animaux.add(oursJeuneFemelle);

        ZOO zoo = new ZOO();
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("-----------------------------");
            System.out.println("MENU ZOO CPE");
            System.out.println("-----------------------------");
            System.out.println("0. Quitter");
            System.out.println("1. Affichage des animaux");
            System.out.println("2. Cri des animaux");
            System.out.println("3. Repas d'un animal");
            System.out.println("4. Tuerie de carnivore");
            System.out.println("5. Suppression d'un animal");
            System.out.println("6. Trier les animaux par âge");
            System.out.println("-----------------------------");
            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 0:
                    System.out.println("Au revoir !");
                    break;
                case 1:
                    zoo.afficherAnimaux(Animaux);
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 0);
        
        scanner.close();
    } 
    
}