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
    
}
