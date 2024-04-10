package fr.cpe.appzoo.exercice2;

import java.util.ArrayList;
import java.util.Scanner;

import fr.cpe.appzoo.common.Animal;
import fr.cpe.appzoo.common.CaMarchePasException;
import fr.cpe.appzoo.common.Continent;
import fr.cpe.appzoo.common.SexeAnimal;
import fr.cpe.appzoo.common.ZOO;
import fr.cpe.appzoo.exercice1.Elephant;
import fr.cpe.appzoo.exercice1.EspeceOurs;
import fr.cpe.appzoo.exercice1.EspeceSerpent;
import fr.cpe.appzoo.exercice1.Girafe;
import fr.cpe.appzoo.exercice1.Ours;
import fr.cpe.appzoo.exercice1.Serpent;

public class AppExo2 {
    
    public static void main(String[] args) throws CaMarchePasException {

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

            try {
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
                    case 9:
                        System.out.println("+------------------------------+");
                        System.out.println("|        AJOUT D'ANIMAL        |");
                        System.out.println("+------------------------------+");
                        System.out.println("|   1. Elephant                |");
                        System.out.println("|   2. Ours                    |");
                        System.out.println("|   3. Girafe                  |");
                        System.out.println("|   4. Serpent                 |");
                        System.out.println("|   5. Humain                  |");
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
                            case 5:
                                System.out.print("humain :\n");
                                break;
                            default:
                                throw new IllegalArgumentException("Animal non pris en charge : " + nouvelAnimal);
                        }
                    
                        System.out.println("Entrez son sexe (f/m):");
                        String inputSexe = scanner.next().toLowerCase();
                        switch (inputSexe) {
                            case "f":
                                sexe = SexeAnimal.Feminin;
                                break;
                            case "m":
                                sexe = SexeAnimal.Masculin;
                                break;
                            default:
                                throw new IllegalArgumentException("Sexe invalide. Veuillez saisir 'feminin' ou 'masculin'.");
                        }
                    
                        System.out.println("Entrez son nom :");
                        scanner.nextLine();
                        nom = scanner.nextLine();
                    
                        System.out.println("Entrez son année de naissance (YYYY) :");
                        dateNaiss = scanner.nextInt();
                    
                        System.out.println("Entrez son poids (en Kg) :");
                        poids = scanner.nextInt();
                    
                        System.out.println("Entrez sa taille :");
                        taille = scanner.nextDouble();
                    
                        Continent continentE = null;
                        EspeceOurs especeO = null;
                        EspeceSerpent especeS = null;
                        Continent continentH = null;
                        switch (nouvelAnimal) {
                            case 1:
                                System.out.println("Entrez son continent 1 ou 2 (1:Afrique/2:Asie) :");
                                String continentElephant = scanner.next().toLowerCase();
                                switch(continentElephant){
                                    case "1":
                                        continentE = Continent.Afrique;
                                        break;
                                    case "2":
                                        continentE = Continent.Asie;
                                    break;
                                }
                                zoo.addAnimal(Animaux, new Elephant(sexe, nom, dateNaiss, poids, taille, continentE));
                                break;
                            case 2:
                                System.out.println("Entrez son espèce 1,2 ou 3 (1:Brun/2:Polaire/3:Noir) :");
                                String especeOursString = scanner.next().toLowerCase();
                                switch(especeOursString){
                                    case "1":
                                        especeO = EspeceOurs.Brun;
                                        break;
                                    case "2":
                                        especeO = EspeceOurs.Polaire;                                    
                                        break;
                                    case "3":
                                        especeO = EspeceOurs.Noir;                                    
                                        break;
                                }
                                zoo.addAnimal(Animaux, new Ours(sexe, nom, dateNaiss, poids, taille, especeO));
                                break;
                            case 3:
                                zoo.addAnimal(Animaux, new Girafe(sexe, nom, dateNaiss, poids, taille));
                                break;
                            case 4:
                                System.out.println("Entrez son espèce (1:Boa/2:Couleuvre/3:Crotale/4:A_Sonnette/5:Cornu/6:Echide");
                                String especeSerpentString = scanner.next().toLowerCase();
                                switch(especeSerpentString){
                                    case "1":
                                        especeS = EspeceSerpent.Boa;
                                        break;
                                    case "2":
                                        especeS = EspeceSerpent.Couleuvre;                                 
                                        break;
                                    case "3":
                                        especeS = EspeceSerpent.Crotale;                                 
                                        break;
                                    case "4":
                                        especeS = EspeceSerpent.A_Sonnette;                                 
                                        break;
                                    case "5":
                                        especeS = EspeceSerpent.Cornu;                                 
                                        break;
                                    case "6":
                                        especeS = EspeceSerpent.Echide;                                 
                                        break;
                                }
                                zoo.addAnimal(Animaux, new Serpent(sexe, nom, dateNaiss, poids, taille, especeS));
                                break;
                            case 5:
                                System.out.println("Entrez son continent (1:Afrique/2:Asie/3:Europe/4:Amerique) :");
                                String continentHumainString = scanner.next().toLowerCase();
                                switch(continentHumainString){
                                    case "1":
                                        continentH = Continent.Afrique;
                                        break;
                                    case "2":
                                        continentH = Continent.Asie;                                 
                                        break;
                                    case "3":
                                        continentH = Continent.Europe;                                 
                                        break;
                                    case "4":
                                        continentH = Continent.Amerique;                                 
                                        break;
                                }
                                zoo.addAnimal(Animaux, new Humain(sexe, nom, dateNaiss, poids, taille, continentH));
                                break;
                        }
                        
                    break;                
                }   
            } catch (Exception e) {
                System.out.println("Une erreur est survenue : " + e.getMessage());
            }
        } while (choix != 0);
        
        scanner.close();
    } 
}
