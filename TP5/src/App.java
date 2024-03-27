import java.util.ArrayList;
public class App {
    
    public static void main(String[] args) {
        // Instanciation des éléphants
        Elephant adulteAfrique = new Elephant(Animal.SexeAnimal.Masculin, "Eléphant adulte d'Afrique", 2000, 5000, 3.5, Elephant.Continent.AFRIQUE);
        Elephant jeuneFemelleAsie = new Elephant(Animal.SexeAnimal.Feminin, "Jeune éléphant femelle d'Asie", 2020, 2000, 2.0, Elephant.Continent.ASIE);

        // Ajout des éléphants dans une liste
        ArrayList<Elephant> listeElephants = new ArrayList<>();
        listeElephants.add(adulteAfrique);
        listeElephants.add(jeuneFemelleAsie);

        // Affichage des informations et des cris des éléphants
        for (Elephant elephant : listeElephants) {
           elephant.toString();
        }
    }
}


