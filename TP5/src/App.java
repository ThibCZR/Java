import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        // Instanciation des éléphants
        Elephant elephantAdulteAfrique = new Elephant(SexeAnimal.Masculin, "DJUMBO", 2000, 5000, 3.5,Continent.Afrique);
        Elephant elephantJeuneFemelleAsie = new Elephant(SexeAnimal.Feminin, "ASIII", 2020, 2000, 2.0, Continent.Asie);

        // Ajout des éléphants dans une liste
        ArrayList<Elephant> listeElephants = new ArrayList<>();
        listeElephants.add(elephantAdulteAfrique);
        listeElephants.add(elephantJeuneFemelleAsie);

        // Affichage des informations et des cris des éléphants
        for (Elephant elephant : listeElephants) {
           System.out.println(elephant.toString());
        }

        Girafe girafeAdulteMale = new Girafe(SexeAnimal.Masculin, "Pascal", 2019, 600, 3.5);
        Girafe girafeJeuneFemelle = new Girafe(SexeAnimal.Feminin, "Sophie", 2022, 300, 2.0);

        ArrayList<Girafe> listeGirafes = new ArrayList<>();
        listeGirafes.add(girafeAdulteMale);
        listeGirafes.add(girafeJeuneFemelle);

        // Affichage des informations et des cris des éléphants
        for (Girafe girafe : listeGirafes) {
           System.out.println(girafe.toString());
        }
    }
}
