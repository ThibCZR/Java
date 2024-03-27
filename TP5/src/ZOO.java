import java.util.ArrayList;

public class ZOO {      
    
    public void afficherAnimaux(ArrayList<Animal> Animaux) {
        for (Animal animal : Animaux) {
            System.out.println(animal.toString() + "\n");
        }
    }

    public void faitCrierSesAnimaux(ArrayList<Animal> Animaux) {
        for (Animal animal : Animaux) {
            System.out.println(animal.cri() + "\n");
        }
    }

    public String rechercherAnimal(ArrayList<Animal> animaux, String nom) {
        StringBuilder result = new StringBuilder();
        for (Animal animal : animaux) {
            if (animal.getNom().toUpperCase().equals(nom)) {
                if (animal instanceof lHerbivore) {
                    lHerbivore herbivore = (lHerbivore) animal;
                    result.append(animal.getNom() + " mange " + herbivore.plantePreferee() + " en quantité " + herbivore.qttePlanteJour() + " kg par jour.\n");
                }
                if (animal instanceof lCarnivore) {
                    lCarnivore carnivore = (lCarnivore) animal;
                    result.append(animal.getNom() + " mange " + carnivore.proiesPreferees() + " en quantité " + carnivore.qtteViandeSemaine() + " kg par jour et tue par " + carnivore.tue() + ".\n");
                }
            }
        }

        if (result.isEmpty()) {
            return "Aucun animal trouvé avec le nom " + nom;
        } else {
            return result.toString();
        }
    }

    public String tuerieAnimal(ArrayList<Animal> animaux) {
        StringBuilder result = new StringBuilder();
        for (Animal animal : animaux) {        
            if (animal instanceof lCarnivore) {
                lCarnivore carnivore = (lCarnivore) animal;
                result.append(animal.getNom() + " : " + carnivore.proiesPreferees() + "\n");
            }
            
        }
        return result.toString();        
    }

    public String supprimerAnimal(ArrayList<Animal> animaux, String nom) {
        boolean animalTrouve = false;
        for (int i = 0; i < animaux.size(); i++) {
            Animal animal = animaux.get(i);
            if (animal.getNom().equals(nom)) {
                animaux.remove(i);
                animalTrouve = true;
                break; 
            }
        }
        if (animalTrouve) {
            return "Animal supprimé avec succès.";
        } else {
            return "Animal non trouvé.";
        }
    }
    

    
    
    
}
