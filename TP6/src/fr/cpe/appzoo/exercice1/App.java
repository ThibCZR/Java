package fr.cpe.appzoo.exercice1;
import java.util.ArrayList;
import java.util.Scanner;

import fr.cpe.appzoo.common.Animal;
import fr.cpe.appzoo.common.CaMarchePasException;
import fr.cpe.appzoo.common.Continent;
import fr.cpe.appzoo.common.SexeAnimal;
import fr.cpe.appzoo.common.ZOO;

public class App  {
    
    public static void main(String[] args) throws CaMarchePasException {

        ArrayList<Animal> animaux = new ArrayList<>();
        // Ajout des éléphants
        animaux.add(new Elephant(SexeAnimal.Masculin, "Djumbo", 1994, 6000, 3.5, Continent.Afrique));
        animaux.add(new Elephant(SexeAnimal.Feminin, "Asiii", 2018, 1500, 2.0, Continent.Asie));
        // Ajout des girafes
        animaux.add(new Girafe(SexeAnimal.Masculin, "Pascal", 2004, 1900, 5.5));
        animaux.add(new Girafe(SexeAnimal.Feminin, "Sophie", 2021, 400, 2.8));
        // Ajout des serpents
        animaux.add(new Serpent(SexeAnimal.Masculin, "Sonny", 2020, 1.1, 1, EspeceSerpent.A_Sonnette));
        animaux.add(new Serpent(SexeAnimal.Feminin, "Bois", 2023, 300, 8.5, EspeceSerpent.Boa));
        // Ajout des ours
        animaux.add(new Ours(SexeAnimal.Masculin, "Teddy", 2014, 500, 3.0, EspeceOurs.Polaire));
        animaux.add(new Ours(SexeAnimal.Feminin, "Andromeda", 2022, 80, 8.5, EspeceOurs.Brun));

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
            System.out.println("|   9. Ajout d'un animal            |");
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
                    zoo.afficherAnimaux(animaux);
                    break;
                case 2:
                    System.out.println("+----------------------------------+");
                    System.out.println("|               CRIS               |");
                    System.out.println("+----------------------------------+");
                    zoo.faitCrierSesAnimaux(animaux);
                    break;
                case 3:
                    System.out.println("+----------------------------------+");
                    System.out.println("|              REPAS               |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez le nom de l'animal : ");
                    String nomAnimal = scanner.next().toUpperCase(); 
                    System.out.println(zoo.rechercherAnimal(animaux, nomAnimal));
                    break;
                case 4:
                    System.out.println("+----------------------------------+");
                    System.out.println("|        TUERIE DE CARNIVORE       |");
                    System.out.println("+----------------------------------+");
                    System.out.println("Les carnivores du zoo tuent :");
                    System.out.println(zoo.tuerieAnimal(animaux));
                    break;
                case 5:
                    System.out.println("+----------------------------------+");
                    System.out.println("|            SUPPRESSION           |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez le nom de l'animal à supprimer : ");
                    String nomASupprimer = scanner.next().toUpperCase();
                    String resultatSuppression = zoo.supprimerAnimal(animaux, nomASupprimer);
                    System.out.println(resultatSuppression);
                    break;
                case 6:
                    System.out.println("+----------------------------------+");
                    System.out.println("|    DU PLUS JEUNE AU PLUS VIEUX   |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez 'C' pour un tri croissant ou 'D' pour un tri décroissant : ");
                    char lettre = scanner.next().toUpperCase().charAt(0);
                    zoo.trierAnimauxParDateNaissance(animaux, lettre);
                    zoo.afficherAnimaux(animaux);
                    break;
                case 7:
                    System.out.println("+----------------------------------+");
                    System.out.println("|     TRI PAR POIDS DES ANIMAUX    |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez 'C' pour un tri croissant ou 'D' pour un tri décroissant : ");
                    char choixTriPoids = scanner.next().toUpperCase().charAt(0);
                    zoo.trierAnimauxParPoids(animaux, choixTriPoids);
                    zoo.afficherAnimaux(animaux);
                    break;
                case 8:
                    System.out.println("+----------------------------------+");
                    System.out.println("|     TRI PAR NOMS DES ANIMAUX     |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Entrez 'C' pour un tri croissant ou 'D' pour un tri décroissant : ");
                    char choixTriNom = scanner.next().toUpperCase().charAt(0);
                    zoo.trierAnimauxParNom(animaux, choixTriNom);
                    zoo.afficherAnimaux(animaux);
                    break;                
                case 9:
                    System.out.println("+------------------------------+");
                    System.out.println("|        AJOUT D'ANIMAL        |");
                    System.out.println("+------------------------------+");
                    System.out.println("|   1. Elephant                |");
                    System.out.println("|   2. Ours                    |");
                    System.out.println("|   3. Girafe                  |");
                    System.out.println("|   4. Serpent                 |");
                    System.out.println("+------------------------------+");
                    System.out.print("Entrez un nouvel animal : \n");
                    int nouvelAnimal = scanner.nextInt();
                
                    System.out.println("Vous avez choisi d'ajouter un ");
                
                    SexeAnimal sexe;
                    String nom;
                    int dateNaiss;
                    int poids;
                    double taille;
                
                    switch (nouvelAnimal) {
                        case 1:
                            System.out.print("éléphant :\n");
                            break;
                        case 2:
                            System.out.print("ours :\n");
                            break;
                        case 3:
                            System.out.print("girafe :\n");
                            break;
                        case 4:
                            System.out.print("serpent :\n");
                            break;
                        default:
                            throw new IllegalArgumentException("Animal non pris en charge : " + nouvelAnimal);
                    }
                
                    System.out.println("Entrez son sexe (feminin/masculin):");
                    String inputSexe = scanner.next().toLowerCase();
                    switch (inputSexe) {
                        case "feminin":
                            sexe = SexeAnimal.Feminin;
                            break;
                        case "masculin":
                            sexe = SexeAnimal.Masculin;
                            break;
                        default:
                            throw new IllegalArgumentException("Sexe invalide. Veuillez saisir 'feminin' ou 'masculin'.");
                    }
                
                    System.out.println("Entrez son nom :");
                    nom = scanner.next();
                
                    System.out.println("Entrez son année de naissance (YYYY) :");
                    dateNaiss = scanner.nextInt();
                
                    System.out.println("Entrez son poids (en Kg) :");
                    poids = scanner.nextInt();
                
                    System.out.println("Entrez sa taille :");
                    taille = scanner.nextDouble();
                
                    switch (nouvelAnimal) {
                        case 1:
                            System.out.println("Entrez son continent (Afrique/Asie) :");
                            String continentE = scanner.next().toLowerCase();
                            zoo.addAnimal(animaux, new Elephant(sexe, nom, dateNaiss, poids, taille, Continent.valueOf(continentE)));
                            break;
                        case 2:
                            System.out.println("Entrez son espèce (Brun/Polaire/Noir) :");
                            String especeOurs = scanner.next().toLowerCase();
                            zoo.addAnimal(animaux, new Ours(sexe, nom, dateNaiss, poids, taille, EspeceOurs.valueOf(especeOurs)));
                            break;
                        case 3:
                            zoo.addAnimal(animaux, new Girafe(sexe, nom, dateNaiss, poids, taille));
                            break;
                        case 4:
                            System.out.println("Entrez son espèce (Boa/Couleuvre/Crotale/A_Sonnette/Cornu/Echide");
                            String especeSerpent = scanner.next().toLowerCase();
                            zoo.addAnimal(animaux, new Serpent(sexe, nom, dateNaiss, poids, taille, EspeceSerpent.valueOf(especeSerpent)));
                            break;
                    }
                break;                
                
                default:
                System.out.println("Choix invalide !");
            }
        } while (choix != 0);
        
        scanner.close();
    } 
    
}